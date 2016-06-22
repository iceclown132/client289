package com.jagex;

public class NPCDefinition
{

    public boolean aBoolean273;
    public int anInt274;
    public byte aByte275;
    public static int definition_count;
    public static int file_pointers[];
    public static Buffer cached_buffer;
    public static NPCDefinition definition_cache[];
    public static int cache_index;
    public long aLong281;
    public String name;
    public byte description[];
    public byte size;
    public int model_ids[];
    public int additional_models[];
    public int idle_animation;
    public int walk_animation;
    public int rotate_animation;
    public int counter_clockwise_animation;
    public int clockwise_animation;
    public int modified_colors[];
    public int original_colors[];
    public String menu_options[];
    public int anInt295;
    public int anInt296;
    public int anInt297;
    public boolean detectable;
    public int combat_level;
    public int scale_x;
    public int scale_y;
    public boolean hidden;
    public int brightness;
    public int contrast;
    public int head_icon;
    public int degrees_to_turn;
    public static LinkedList list = new LinkedList(30);

    /**
     * Loads the file pointers from the archive and prepares the definition cache
     * 
     * @param archive
     */
	public static void initialize(Archive archive) {
		cached_buffer = new Buffer(archive.entry("npc.dat", null));
		Buffer index_buffer = new Buffer(archive.entry("npc.idx", null));
		definition_count = index_buffer.getUnsignedShort();
		file_pointers = new int[definition_count];
		int file_pointer = 2;
		for (int npc_index = 0; npc_index < definition_count; npc_index++) {
			file_pointers[npc_index] = file_pointer;
			file_pointer += index_buffer.getUnsignedShort();
		}
		definition_cache = new NPCDefinition[20];
		for (int index = 0; index < 20; index++) {
			definition_cache[index] = new NPCDefinition();
		}
	}

	public static void destroy() {
		list = null;
		file_pointers = null;
		definition_cache = null;
		cached_buffer = null;
	}

	public static NPCDefinition forId(int npc_id) {
		for (int index = 0; index < 20; index++) {
			if (definition_cache[index].aLong281 == (long) npc_id) {
				return definition_cache[index];
			}
		}
		cache_index = (cache_index + 1) % 20;
		NPCDefinition definition = definition_cache[cache_index] = new NPCDefinition();
		cached_buffer.pointer = file_pointers[npc_id];
		definition.aLong281 = npc_id;
		definition.read(cached_buffer);
		return definition;
	}

	public void read(Buffer buffer) {
		do {
			int attribute = buffer.getUnsignedByte();
			if (attribute == 0) {
				return;
			}
			if (attribute == 1) {
				int model_count = buffer.getUnsignedByte();
				model_ids = new int[model_count];
				for (int j1 = 0; j1 < model_count; j1++) {
					model_ids[j1] = buffer.getUnsignedShort();
				}
			} else if (attribute == 2) {
				name = buffer.getRSString();
			} else if (attribute == 3) {
				description = buffer.getRawString();
			} else if (attribute == 12) {
				size = buffer.getSignedByte();
			} else if (attribute == 13) {
				idle_animation = buffer.getUnsignedShort();
			} else if (attribute == 14) {
				walk_animation = buffer.getUnsignedShort();
			} else if (attribute == 17) {
				walk_animation = buffer.getUnsignedShort();
				rotate_animation = buffer.getUnsignedShort();
				counter_clockwise_animation = buffer.getUnsignedShort();
				clockwise_animation = buffer.getUnsignedShort();
			} else if (attribute >= 30 && attribute < 40) {
				if (menu_options == null) {
					menu_options = new String[5];
				}
				menu_options[attribute - 30] = buffer.getRSString();
				if (menu_options[attribute - 30].equalsIgnoreCase("hidden")) {
					menu_options[attribute - 30] = null;
				}
			} else if (attribute == 40) {
				int modified_color_count = buffer.getUnsignedByte();
				modified_colors = new int[modified_color_count];
				original_colors = new int[modified_color_count];
				for (int k1 = 0; k1 < modified_color_count; k1++) {
					modified_colors[k1] = buffer.getUnsignedShort();
					original_colors[k1] = buffer.getUnsignedShort();
				}
			} else if (attribute == 60) {
				int model_count = buffer.getUnsignedByte();
				additional_models = new int[model_count];
				for (int l1 = 0; l1 < model_count; l1++) {
					additional_models[l1] = buffer.getUnsignedShort();
				}
			} else if (attribute == 90) {
				anInt295 = buffer.getUnsignedShort();
			} else if (attribute == 91) {
				anInt296 = buffer.getUnsignedShort();
			} else if (attribute == 92) {
				anInt297 = buffer.getUnsignedShort();
			} else if (attribute == 93) {
				detectable = false;
			} else if (attribute == 95) {
				combat_level = buffer.getUnsignedShort();
			} else if (attribute == 97) {
				scale_x = buffer.getUnsignedShort();
			} else if (attribute == 98) {
				scale_y = buffer.getUnsignedShort();
			} else if (attribute == 99) {
				hidden = true;
			} else if (attribute == 100) {
				brightness = buffer.getSignedByte();
			} else if (attribute == 101) {
				contrast = buffer.getSignedByte() * 5;
			} else if (attribute == 102) {
				head_icon = buffer.getUnsignedShort();
			} else if (attribute == 103) {
				degrees_to_turn = buffer.getUnsignedShort();
			}
		} while (true);
	}

	public Model method216(int i, int j, int k, int ai[]) {
		Model model = (Model) list.get(aLong281);

		if (model == null) {
			boolean flag = false;
			for (int i1 = 0; i1 < model_ids.length; i1++) {
				if (!Model.isCached(model_ids[i1])) {
					flag = true;
				}
			}
			if (flag) {
				return null;
			}
			Model aclass44_sub3_sub4_sub4[] = new Model[model_ids.length];
			for (int j1 = 0; j1 < model_ids.length; j1++) {
				aclass44_sub3_sub4_sub4[j1] = Model.getModel(model_ids[j1]);
			}
			if (aclass44_sub3_sub4_sub4.length == 1) {
				model = aclass44_sub3_sub4_sub4[0];
			} else {
				model = new Model(aclass44_sub3_sub4_sub4, aclass44_sub3_sub4_sub4.length);
			}
			if (modified_colors != null) {
				for (int k1 = 0; k1 < modified_colors.length; k1++) {
					model.recolor(modified_colors[k1], original_colors[k1]);
				}
			}
			model.method513((byte) 3);
			model.applyLighting(64 + brightness, 850 + contrast, -30, -50, -30, true);
			list.put(aLong281, model);
		}
		Model assembled_model = Model.aClass44_Sub3_Sub4_Sub4_1530;
		assembled_model.method508(AnimationFrame.invalid(k) & AnimationFrame.invalid(j), model, 0);
		if (k != -1 && j != -1) {
			assembled_model.method515(k, true, j, ai);
		} else if (k != -1) {
			assembled_model.method514(k, 188);
		}
		if (scale_x != 128 || scale_y != 128) {
			assembled_model.scale(scale_x, scale_x, scale_y, (byte) 31);
		}
		assembled_model.method510();
		assembled_model.anIntArrayArray1567 = null;
		assembled_model.anIntArrayArray1566 = null;
		if (size == 1) {
			assembled_model.single_tile = true;
		}
		return assembled_model;
	}

	public Model method217() {
		if (additional_models == null) {
			return null;
		}
		boolean flag = false;
		for (int i = 0; i < additional_models.length; i++) {
			if (!Model.isCached(additional_models[i])) {
				flag = true;
			}
		}
		if (flag) {
			return null;
		}
		Model models[] = new Model[additional_models.length];
		for (int j = 0; j < additional_models.length; j++) {
			models[j] = Model.getModel(additional_models[j]);
		}
		Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models, models.length);
		}
		if (modified_colors != null) {
			for (int k = 0; k < modified_colors.length; k++) {
				model.recolor(modified_colors[k], original_colors[k]);
			}
		}
		return model;
	}

	public NPCDefinition() {
		aBoolean273 = false;
		anInt274 = 44692;
		aByte275 = 4;
		aLong281 = -1L;
		size = 1;
		idle_animation = -1;
		walk_animation = -1;
		rotate_animation = -1;
		counter_clockwise_animation = -1;
		clockwise_animation = -1;
		anInt295 = -1;
		anInt296 = -1;
		anInt297 = -1;
		detectable = true;
		combat_level = -1;
		scale_x = 128;
		scale_y = 128;
		hidden = false;
		head_icon = -1;
		degrees_to_turn = 32;
	}

}
