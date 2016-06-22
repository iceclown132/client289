package com.jagex;
public class AnimationSequence {

	/**
	 * The amount of animations
	 */
	public static int count;

	/**
	 * the animations currently in memory
	 */
	public static AnimationSequence cache[];
	
	/**
	 * The amount of frames in the sequence
	 */
	public int frame_count;
	
	/**
	 * The index of the frame
	 */
	public int frame_index[];
	
	/**
	 * The index of the frame that overrides the frame
	 */
	public int frame_alt_index[];
	
	/**
	 * The length of a single frame
	 */
	public int frame_length[];
	
	/**
	 * Time in between frames
	 */
	public int frame_step;
	
	/**
	 * Flow control
	 */
	public int flowControl[];
	
	/**
	 * Indicates the animation is dynamics
	 */
	public boolean dynamic;
	
	/**
	 * The priority of the animation, higher priority animations cancel out
	 * lower priority animations
	 */
	public int priority;
	
	/**
	 * The id of the item that replaces the player's shield
	 */
	public int playerReplacementShield;
	
	/**
	 * The id of the item that replaces the player's weapon
	 */
	public int playerReplacementWeapon;
	
	/**
	 * The maximum amount of times the animation gets looped
	 */
	public int maximumLoops;
	

	/**
	 * Indicates how the animation blends with other movement animations (???)
	 * 
	 * 0: play animation and block the character from moving until the end
	 * 1: do not play the animation if the character is moving
	 * 2: perform the movement animation during the current animation (i.e. eating and moving)
	 */
	public int precedenceAnimating;
	
	/**
	 * Indicates how the animation blends with the character moving
	 * 
	 * 0: play animation and block the character from moving until the end
	 * 1: do not play the animation if the character is moving
	 * 2: perform the movement animation during the current animation (i.e. eating and moving)
	 */
	public int walking_blend_mode;
	
	/**
	 * Indicates the animation is repeated
	 */
	public int replay_mode;
	
	/**
	 * A dummy value. Gets read, but is never used
	 */
	public int dummy_value;

	/**
	 * Initializes the sequence cache and configures all sequences
	 * 
	 * @param archive
	 */
	public static void initialize(Archive archive) {
		Buffer buffer = new Buffer(archive.entry("seq.dat", null));
		count = buffer.getUnsignedShort();
		if (cache == null) {
			cache = new AnimationSequence[count];
		}
		for (int i = 0; i < count; i++) {
			if (cache[i] == null) {
				cache[i] = new AnimationSequence();
			}
			cache[i].configure(buffer);
		}
	}

	/**
	 * Constructor
	 */
	public AnimationSequence() {
		frame_step = -1;
		dynamic = false;
		priority = 5;
		playerReplacementShield = -1;
		playerReplacementWeapon = -1;
		maximumLoops = 99;
		precedenceAnimating = -1;
		walking_blend_mode = -1;
	}

	/**
	 * Configures a single sequence
	 * 
	 * @param buffer
	 */
	public void configure(Buffer buffer) {
		do {
			int attribute = buffer.getUnsignedByte();
			if (attribute == 0) {
				break;
			}
			if (attribute == 1) {
				frame_count = buffer.getUnsignedByte();
				frame_index = new int[frame_count];
				frame_alt_index = new int[frame_count];
				frame_length = new int[frame_count];
				for (int j = 0; j < frame_count; j++) {
					frame_index[j] = buffer.getUnsignedShort();
					frame_alt_index[j] = buffer.getUnsignedShort();
					if (frame_alt_index[j] == 65535) {
						frame_alt_index[j] = -1;
					}
					frame_length[j] = buffer.getUnsignedShort();
				}
			} else if (attribute == 2) {
				frame_step = buffer.getUnsignedShort();
			} else if (attribute == 3) {
				int k = buffer.getUnsignedByte();
				flowControl = new int[k + 1];
				for (int l = 0; l < k; l++) {
					flowControl[l] = buffer.getUnsignedByte();
				}
				flowControl[k] = 0x98967f;
			} else if (attribute == 4) {
				dynamic = true;
			} else if (attribute == 5) {
				priority = buffer.getUnsignedByte();
			} else if (attribute == 6) {
				playerReplacementShield = buffer.getUnsignedShort();
			} else if (attribute == 7) {
				playerReplacementWeapon = buffer.getUnsignedShort();
			} else if (attribute == 8) {
				maximumLoops = buffer.getUnsignedByte();
			} else if (attribute == 9) {
				precedenceAnimating = buffer.getUnsignedByte();
			} else if (attribute == 10) {
				walking_blend_mode = buffer.getUnsignedByte();
			} else if (attribute == 11) {
				replay_mode = buffer.getUnsignedByte();
			} else if (attribute == 12) {
				dummy_value = buffer.getUnsignedInt();
			} else {
				System.out.println("Error unrecognised seq config code: " + attribute);
			}
		} while (true);
		if (frame_count == 0) {
			frame_count = 1;
			frame_index = new int[1];
			frame_index[0] = -1;
			frame_alt_index = new int[1];
			frame_alt_index[0] = -1;
			frame_length = new int[1];
			frame_length[0] = -1;
		}
		if (precedenceAnimating == -1) {
			if (flowControl != null) {
				precedenceAnimating = 2;
			} else {
				precedenceAnimating = 0;
			}
		}
		if (walking_blend_mode == -1) {
			if (flowControl != null) {
				walking_blend_mode = 2;
				return;
			} else {
				walking_blend_mode = 0;
				return;
			}
		}
	}

	/**
	 * Gets the length of a frame in the sequence
	 * @param index
	 * @return
	 */
	public int getLength(int index) {
		int length = frame_length[index];
		if (length == 0) {
			AnimationFrame frame = AnimationFrame.get(frame_index[index]);
			if (frame != null) {
				length = frame_length[index] = frame.delay;
			}
		}
		return length == 0 ? 1 : length;
	}

}
