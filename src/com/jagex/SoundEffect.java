package com.jagex;
public class SoundEffect {

	public static SoundEffect effects[] = new SoundEffect[1000];
	public static int delays[] = new int[1000];
	public static byte _output[];
	public static Buffer output;
	public Instrument instruments[];
	public int loop_begin;
	public int loop_end;

	public SoundEffect() {
		instruments = new Instrument[10];
	}

	public static void initialize(Buffer buffer) {
		_output = new byte[0x6baa8];
		output = new Buffer(_output);
		Instrument.initialize();
		while (true) {
			int i = buffer.getUnsignedShort();
			if (i == 65535) {
				return;
			}
			effects[i] = new SoundEffect();
			effects[i].decode(buffer);
			delays[i] = effects[i].method178();
		}
	}

	public static Buffer data(int id, int i) {
		if (effects[id] != null) {
			SoundEffect effect = effects[id];
			return effect.encode(i);
		}
		return null;
	}

	public void decode(Buffer buffer) {
		for (int i = 0; i < 10; i++) {
			int active = buffer.getUnsignedByte();
			if (active != 0) {
				buffer.pointer--;
				instruments[i] = new Instrument();
				instruments[i].decode(buffer);
			}
		}
		loop_begin = buffer.getUnsignedShort();
		loop_end = buffer.getUnsignedShort();
	}

	public int method178() {
		int offset = 0x98967f;
		for (int k = 0; k < 10; k++) {
			if (instruments[k] != null && instruments[k].begin / 20 < offset) {
				offset = instruments[k].begin / 20;
			}
		}
		if (loop_begin < loop_end && loop_begin / 20 < offset) {
			offset = loop_begin / 20;
		}
		if (offset == 0x98967f || offset == 0) {
			return 0;
		}
		for (int l = 0; l < 10; l++) {
			if (instruments[l] != null) {
				instruments[l].begin -= offset * 20;
			}
		}
		if (loop_begin < loop_end) {
			loop_begin -= offset * 20;
			loop_end -= offset * 20;
		}
		return offset;
	}

	public Buffer encode(int loops) {
		int size = mix(loops);
		output.pointer = 0;
		output.putInt(0x52494646);
		output.putLEInt(36 + size);
		output.putInt(0x57415645);
		output.putInt(0x666d7420);
		output.putLEInt(16);
		output.putLEShort(1);
		output.putLEShort(1);
		output.putLEInt(22050);
		output.putLEInt(22050);
		output.putLEShort(1);
		output.putLEShort(8);
		output.putInt(0x64617461);
		output.putLEInt(size);
		output.pointer += size;
		return output;
	}

	public int mix(int loop_count) {
		int _dur = 0;
		for (int i = 0; i < 10; i++) {
			if (instruments[i] != null
					&& instruments[i].duration + instruments[i].begin > _dur) {
				_dur = instruments[i].duration + instruments[i].begin;
			}
		}
		if (_dur == 0) {
			return 0;
		}
		int n_s = (22050 * _dur) / 1000;
		int begin = (22050 * loop_begin) / 1000;
		int end = (22050 * loop_end) / 1000;
		if (begin < 0 || begin > n_s || end < 0 || end > n_s || begin >= end) {
			loop_count = 0;
		}
		int len = n_s + (end - begin) * (loop_count - 1);
		for (int i = 44; i < len + 44; i++) {
			_output[i] = -128;
		}
		for (int i = 0; i < 10; i++) {
			if (instruments[i] != null) {
				int dur = (instruments[i].duration * 22050) / 1000;
				int offset = (instruments[i].begin * 22050) / 1000;
				int samples[] = instruments[i].synthesize(dur, instruments[i].duration);
				for (int j = 0; j < dur; j++) {
					_output[j + offset + 44] += (byte) (samples[j] >> 8);
				}
			}
		}
		if (loop_count > 1) {
			begin += 44;
			end += 44;
			n_s += 44;
			int k2 = (len += 44) - n_s;
			for (int i = n_s - 1; i >= end; i--) {
				_output[i + k2] = _output[i];
			}
			for (int i = 1; i < loop_count; i++) {
				int l2 = (end - begin) * i;
				for (int j = begin; j < end; j++) {
					_output[j + l2] = _output[j];
				}
			}
			len -= 44;
		}
		return len;
	}

}