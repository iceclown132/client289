package com.jagex;
public class Filter {

	public boolean aBoolean50;
	public int anInt51;
	public int num_pairs[];
	public int pair_phase[][][];
	public int pair_mag[][][];
	public int unity[];
	public static float _coef[][] = new float[2][8];
	public static int coef[][] = new int[2][8];
	public static float _inv_unity;
	public static int inv_unity;

	public float adapt_mag(int dir, int k, float t) {
		float alpha = (float) pair_mag[dir][0][k] + t * (float) (pair_mag[dir][1][k] - pair_mag[dir][0][k]);
		alpha *= 0.001525879F;
		return 1.0F - (float) Math.pow(10D, -alpha / 20F);
	}

	public float normalize(float f) {
		float f1 = 32.7032F * (float) Math.pow(2D, f);
		return (f1 * 3.141593F) / 11025F;
	}

	public float adapt_phase(int dir, int j, float f) {
		float f1 = (float) pair_phase[dir][0][j] + f * (float) (pair_phase[dir][1][j] - pair_phase[dir][0][j]);
		f1 *= 0.0001220703F;
		return normalize(f1);
	}

	public int compute(int dir, float f) {
		if (dir == 0) {
			float f1 = (float) unity[0] + (float) (unity[1] - unity[0]) * f;
			f1 *= 0.003051758F;
			_inv_unity = (float) Math.pow(0.10000000000000001D, f1 / 20F);
			inv_unity = (int) (_inv_unity * 65536F);
		}
		if (num_pairs[dir] == 0) {
			return 0;
		}
		float r = adapt_mag(dir, 0, f);
		_coef[dir][0] = -2F * r * (float) Math.cos(adapt_phase(dir, 0, f));
		_coef[dir][1] = r * r;
		for (int p = 1; p < num_pairs[dir]; p++) {
			float _r = adapt_mag(dir, p, f);
			float f4 = -2F * _r * (float) Math.cos(adapt_phase(dir, p, f));
			float f5 = _r * _r;
			_coef[dir][p * 2 + 1] = _coef[dir][p * 2 - 1] * f5;
			_coef[dir][p * 2] = _coef[dir][p * 2 - 1] * f4
					+ _coef[dir][p * 2 - 2] * f5;
			for (int j1 = p * 2 - 1; j1 >= 2; j1--) {
				_coef[dir][j1] += _coef[dir][j1 - 1] * f4 + _coef[dir][j1 - 2] * f5;
			}
			_coef[dir][1] += _coef[dir][0] * f4 + f5;
			_coef[dir][0] += f4;
		}
		if (dir == 0) {
			for (int l = 0; l < num_pairs[0] * 2; l++) {
				_coef[0][l] *= _inv_unity;
			}
		}
		for (int i1 = 0; i1 < num_pairs[dir] * 2; i1++) {
			coef[dir][i1] = (int) (_coef[dir][i1] * 65536F);
		}
		return num_pairs[dir] * 2;
	}

	public void decode(Envelope envelope, Buffer buffer) {
		int k = buffer.getUnsignedByte();
		num_pairs[0] = k >> 4;
		num_pairs[1] = k & 0xf;
		if (k != 0) {
			unity[0] = buffer.getUnsignedShort();
			unity[1] = buffer.getUnsignedShort();
			int migrated = buffer.getUnsignedByte();
			for (int int_dir = 0; int_dir < 2; int_dir++) {
				for (int int_term = 0; int_term < num_pairs[int_dir]; int_term++) {
					pair_phase[int_dir][0][int_term] = buffer.getUnsignedShort();
					pair_mag[int_dir][0][int_term] = buffer.getUnsignedShort();
				}
			}
			for (int int_dir = 0; int_dir < 2; int_dir++) {
				for (int i = 0; i < num_pairs[int_dir]; i++) {
					if ((migrated & 1 << int_dir * 4 << i) != 0) {
						pair_phase[int_dir][1][i] = buffer.getUnsignedShort();
						pair_mag[int_dir][1][i] = buffer.getUnsignedShort();
					} else {
						pair_phase[int_dir][1][i] = pair_phase[int_dir][0][i];
						pair_mag[int_dir][1][i] = pair_mag[int_dir][0][i];
					}
				}
			}
			if (migrated != 0 || unity[1] != unity[0]) {
				envelope.decode_shape(buffer);
			}
			return;
		} else {
			unity[0] = unity[1] = 0;
		}
	}

	public Filter() {
		aBoolean50 = false;
		anInt51 = 2972;
		num_pairs = new int[2];
		pair_phase = new int[2][2][4];
		pair_mag = new int[2][2][4];
		unity = new int[2];
	}

}