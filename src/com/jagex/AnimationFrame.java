package com.jagex;
public class AnimationFrame {

	/**
	 * The index of the buffer containing the delay
	 */
	private static final int DELAY_BUFFER = 3;

	public static int anInt262;
	public static int anInt263 = 2;
	public static AnimationFrame cache[];
	public int delay;
	public Skins joints;
	public int size;
	public int anIntArray268[];
	public int anIntArray269[];
	public int anIntArray270[];
	public int anIntArray271[];
	public static boolean aBooleanArray272[];

	/**
	 * Checks to see if the frame is invalid
	 * 
	 * @param frame
	 * @return
	 */
	public static boolean invalid(int frame) {
		return frame == -1;
	}

	/**
	 * Releases the allocated resources inside the frame cache
	 */
	public static void destroy() {
		cache = null;
	}

	/**
	 * Gets the given animation frame
	 * @param index
	 * @return
	 */
	public static AnimationFrame get(int index) {
		return cache == null ? null : cache[index];
	}

	/**
	 * Creates a new frame with the given sive
	 * @param size
	 */
	public static void create(int size) {
		cache = new AnimationFrame[size + 1];
		aBooleanArray272 = new boolean[size + 1];
		for (int j = 0; j < size + 1; j++) {
			aBooleanArray272[j] = true;
		}
	}

	/**
	 * Loads the animation frame with the given animation file
	 * 
	 * @param file
	 */
	public static void load(byte file[]) {
		Buffer[] buffers = new Buffer[5];

		Buffer file_buffer = new Buffer(file);
		file_buffer.pointer = file.length - 8;
		int j = file_buffer.getUnsignedShort(); // Header
		int k = file_buffer.getUnsignedShort(); // transformation_1
		int l = file_buffer.getUnsignedShort(); // transformation_2
		int i1 = file_buffer.getUnsignedShort(); // delay

		int current_offset = 0;
		buffers[0] = new Buffer(file);
		buffers[0].pointer = current_offset;

		current_offset += j + 2;
		buffers[1] = new Buffer(file);
		buffers[1].pointer = current_offset;

		current_offset += k;
		buffers[2] = new Buffer(file);
		buffers[2].pointer = current_offset;

		current_offset += l;
		buffers[DELAY_BUFFER] = new Buffer(file);
		buffers[DELAY_BUFFER].pointer = current_offset;

		current_offset += i1;
		buffers[4] = new Buffer(file);
		buffers[4].pointer = current_offset;

		Skins joints = new Skins(buffers[4]);
		int frame_count = buffers[0].getUnsignedShort();
		int ai[] = new int[500];
		int ai1[] = new int[500];
		int ai2[] = new int[500];
		int ai3[] = new int[500];
		for (int frame_index = 0; frame_index < frame_count; frame_index++) {
			int id = buffers[0].getUnsignedShort();
			AnimationFrame frame = cache[id] = new AnimationFrame();
			frame.delay = buffers[DELAY_BUFFER].getUnsignedByte();
			frame.joints = joints;
			int j2 = buffers[0].getUnsignedByte();
			int k2 = -1;
			int size = 0;
			for (int i3 = 0; i3 < j2; i3++) {
				int j3 = buffers[1].getUnsignedByte();
				if (j3 > 0) {
					if (joints.anIntArray254[i3] != 0) {
						for (int l3 = i3 - 1; l3 > k2; l3--) {
							if (joints.anIntArray254[l3] != 0) {
								continue;
							}
							ai[size] = l3;
							ai1[size] = 0;
							ai2[size] = 0;
							ai3[size] = 0;
							size++;
							break;
						}
					}
					ai[size] = i3;
					char c = '\0';
					if (joints.anIntArray254[i3] == 3) {
						c = '\200';
					}
					if ((j3 & 1) != 0) {
						ai1[size] = buffers[2].getUnsigedSmart();
					} else {
						ai1[size] = c;
					}
					if ((j3 & 2) != 0) {
						ai2[size] = buffers[2].getUnsigedSmart();
					} else {
						ai2[size] = c;
					}
					if ((j3 & 4) != 0) {
						ai3[size] = buffers[2].getUnsigedSmart();
					} else {
						ai3[size] = c;
					}
					k2 = i3;
					size++;
					if (joints.anIntArray254[i3] == 5) {
						aBooleanArray272[id] = false;
					}
				}
			}
			frame.size = size;
			frame.anIntArray268 = new int[size];
			frame.anIntArray269 = new int[size];
			frame.anIntArray270 = new int[size];
			frame.anIntArray271 = new int[size];
			for (int k3 = 0; k3 < size; k3++) {
				frame.anIntArray268[k3] = ai[k3];
				frame.anIntArray269[k3] = ai1[k3];
				frame.anIntArray270[k3] = ai2[k3];
				frame.anIntArray271[k3] = ai3[k3];
			}
		}
	}

}
