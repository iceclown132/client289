package com.jagex;
public class Instrument {

	public Envelope pitch_env;
	public Envelope vol_env;
	public Envelope pitch_mod_env;
	public Envelope pitch_mod_amp_env;
	public Envelope vol_mod_env;
	public Envelope vol_mod_amp_env;
	public Envelope gating_release_env;
	public Envelope gating_attack_env;
	public int oscillator_volume[];
	public int oscillator_pitch[];
	public int oscillator_delay[];
	public int delay_time;
	public int delay_feedback;
	public Filter filter;
	public Envelope filter_env;
	public int duration;
	public int begin;
	public static int output[];
	public static int noise[];
	public static int sine[];
	public static int phases[] = new int[5];
	public static int delays[] = new int[5];
	public static int volume_step[] = new int[5];
	public static int pitch_step[] = new int[5];
	public static int pitch_base_step[] = new int[5];

	public static void initialize() {
		noise = new int[32768];
		for (int i = 0; i < 32768; i++) {
			if (Math.random() > 0.5D) {
				noise[i] = 1;
			} else {
				noise[i] = -1;
			}
		}
		sine = new int[32768];
		for (int j = 0; j < 32768; j++) {
			sine[j] = (int) (Math.sin((double) j / 5215.1903000000002D) * 16384D);
		}
		output = new int[0x35d54];
	}

	public int[] synthesize(int n_s, int j) {
		for (int i = 0; i < n_s; i++) {
			output[i] = 0;
		}
		if (j < 10) {
			return output;
		}
		double d = (double) n_s / ((double) j + 0.0D);
		pitch_env.reset();
		vol_env.reset();
		int pitch_mod_step = 0;
		int pitch_mod_base_step = 0;
		int pitch_mod_phase = 0;
		if (pitch_mod_env != null) {
			pitch_mod_env.reset();
			pitch_mod_amp_env.reset();
			pitch_mod_step = (int) (((double) (pitch_mod_env.end - pitch_mod_env.start) * 32.768000000000001D) / d);
			pitch_mod_base_step = (int) (((double) pitch_mod_env.start * 32.768000000000001D) / d);
		}
		int vol_mod_step = 0;
		int vol_mod_base_step = 0;
		int vol_mod_phase = 0;
		if (vol_mod_env != null) {
			vol_mod_env.reset();
			vol_mod_amp_env.reset();
			vol_mod_step = (int) (((double) (vol_mod_env.end - vol_mod_env.start) * 32.768000000000001D) / d);
			vol_mod_base_step = (int) (((double) vol_mod_env.start * 32.768000000000001D) / d);
		}
		for (int j2 = 0; j2 < 5; j2++) {
			if (oscillator_volume[j2] != 0) {
				phases[j2] = 0;
				delays[j2] = (int) ((double) oscillator_delay[j2] * d);
				volume_step[j2] = (oscillator_volume[j2] << 14) / 100;
				pitch_step[j2] = (int) (((double) (pitch_env.end - pitch_env.start) * 32.768000000000001D * Math.pow(1.0057929410678534D, oscillator_pitch[j2])) / d);
				pitch_base_step[j2] = (int) (((double) pitch_env.start * 32.768000000000001D) / d);
			}
		}
		for (int k2 = 0; k2 < n_s; k2++) {
			int pitch_change = pitch_env.step(0, n_s);
			int vol_change = vol_env.step(0, n_s);
			if (pitch_mod_env != null) {
				int mod = pitch_mod_env.step(0, n_s);
				int mod_amp = pitch_mod_amp_env.step(0, n_s);
				pitch_change += evaluate_wave(pitch_mod_env.form, pitch_mod_phase, mod_amp) >> 1;
				pitch_mod_phase += (mod * pitch_mod_step >> 16) + pitch_mod_base_step;
			}
			if (vol_mod_env != null) {
				int mod = vol_mod_env.step(0, n_s);
				int mod_amp = vol_mod_amp_env.step(0, n_s);
				vol_change = vol_change * ((evaluate_wave(vol_mod_env.form, vol_mod_phase, mod_amp) >> 1) + 32768) >> 15;
				vol_mod_phase += (mod * vol_mod_step >> 16) + vol_mod_base_step;
			}
			for (int l5 = 0; l5 < 5; l5++) {
				if (oscillator_volume[l5] != 0) {
					int l6 = k2 + delays[l5];
					if (l6 < n_s) {
						output[l6] += evaluate_wave(pitch_env.form, phases[l5],
								vol_change * volume_step[l5] >> 15);
						phases[l5] += (pitch_change * pitch_step[l5] >> 16)
								+ pitch_base_step[l5];
					}
				}
			}
		}
		if (gating_release_env != null) {
			gating_release_env.reset();
			gating_attack_env.reset();
			int counter = 0;
			boolean muted = true;
			for (int i = 0; i < n_s; i++) {
				int on_step = gating_release_env.step(0, n_s);
				int off_step = gating_attack_env.step(0, n_s);
				int threshold;
				if (muted) {
					threshold = gating_release_env.start + ((gating_release_env.end - gating_release_env.start) * on_step >> 8);
				} else {
					threshold = gating_release_env.start + ((gating_release_env.end - gating_release_env.start) * off_step >> 8);
				}
				if ((counter += 256) >= threshold) {
					counter = 0;
					muted = !muted;
				}
				if (muted) {
					output[i] = 0;
				}
			}
		}
		if (delay_time > 0 && delay_feedback > 0) {
			int delay = (int) ((double) delay_time * d);
			for (int i = delay; i < n_s; i++) {
				output[i] += (output[i - delay] * delay_feedback) / 100;
			}
		}
		if (filter.num_pairs[0] > 0 || filter.num_pairs[1] > 0) {
			filter_env.reset();
			int t = filter_env.step(0, n_s + 1);
			int M = filter.compute(0, (float) t / 65536F);
			int N = filter.compute(1, (float) t / 65536F);
			if (n_s >= M + N) {
				int n = 0;
				int delay = N;
				if (delay > n_s - M) {
					delay = n_s - M;
				}
				for (; n < delay; n++) {
					int y = (int) ((long) output[n + M] * (long) Filter.inv_unity >> 16);
					for (int i = 0; i < M; i++) {
						y += (int) ((long) output[(n + M) - 1 - i] * (long) Filter.coef[0][i] >> 16);
					}
					for (int i = 0; i < n; i++) {
						y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
					}
					output[n] = y;
					t = filter_env.step(0, n_s + 1);
				}
				char c = '\200';
				delay = c;
				do {
					if (delay > n_s - M) {
						delay = n_s - M;
					}
					for (; n < delay; n++) {
						int y = (int) ((long) output[n + M] * (long) Filter.inv_unity >> 16);
						for (int i = 0; i < M; i++) {
							y += (int) ((long) output[(n + M) - 1 - i] * (long) Filter.coef[0][i] >> 16);
						}
						for (int i = 0; i < N; i++) {
							y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
						}
						output[n] = y;
						t = filter_env.step(0, n_s + 1);
					}
					if (n >= n_s - M) {
						break;
					}
					M = filter.compute(0, (float) t / 65536F);
					N = filter.compute(1, (float) t / 65536F);
					delay += c;
				} while (true);
				for (; n < n_s; n++) {
					int y = 0;
					for (int i = (n + M) - n_s; i < M; i++) {
						y += (int) ((long) output[(n + M) - 1 - i] * (long) Filter.coef[0][i] >> 16);
					}
					for (int i = 0; i < N; i++) {
						y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
					}
					output[n] = y;
				}
			}
		}
		for (int i = 0; i < n_s; i++) {
			if (output[i] < -32768) {
				output[i] = -32768;
			}
			if (output[i] > 32767) {
				output[i] = 32767;
			}
		}
		return output;
	}

	public int evaluate_wave(int table, int phase, int amplitude) {
		if (table == 1) {
			if ((phase & 0x7fff) < 16384) {
				return amplitude;
			} else {
				return -amplitude;
			}
		}
		if (table == 2) {
			return sine[phase & 0x7fff] * amplitude >> 14;
		}
		if (table == 3) {
			return ((phase & 0x7fff) * amplitude >> 14) - amplitude;
		}
		if (table == 4) {
			return noise[phase / 2607 & 0x7fff] * amplitude;
		} else {
			return 0;
		}
	}

	public void decode(Buffer buffer) {
		pitch_env = new Envelope();
		pitch_env.decode(buffer);
		vol_env = new Envelope();
		vol_env.decode(buffer);
		int option = buffer.getUnsignedByte();
		if (option != 0) {
			buffer.pointer--;
			pitch_mod_env = new Envelope();
			pitch_mod_env.decode(buffer);
			pitch_mod_amp_env = new Envelope();
			pitch_mod_amp_env.decode(buffer);
		}
		option = buffer.getUnsignedByte();
		if (option != 0) {
			buffer.pointer--;
			vol_mod_env = new Envelope();
			vol_mod_env.decode(buffer);
			vol_mod_amp_env = new Envelope();
			vol_mod_amp_env.decode(buffer);
		}
		option = buffer.getUnsignedByte();
		if (option != 0) {
			buffer.pointer--;
			gating_release_env = new Envelope();
			gating_release_env.decode(buffer);
			gating_attack_env = new Envelope();
			gating_attack_env.decode(buffer);
		}
		for (int j = 0; j < 10; j++) {
			int volume = buffer.getSmart();
			if (volume == 0) {
				break;
			}
			oscillator_volume[j] = volume;
			oscillator_pitch[j] = buffer.getUnsigedSmart();
			oscillator_delay[j] = buffer.getSmart();
		}
		delay_time = buffer.getSmart();
		delay_feedback = buffer.getSmart();
		duration = buffer.getUnsignedShort();
		begin = buffer.getUnsignedShort();
		filter = new Filter();
		filter_env = new Envelope();
		filter.decode(filter_env, buffer);
    }

	public Instrument() {
		oscillator_volume = new int[5];
		oscillator_pitch = new int[5];
		oscillator_delay = new int[5];
		delay_feedback = 100;
		duration = 500;
	}

}
