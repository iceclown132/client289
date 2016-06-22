package com.jagex;
public class ItemDefinition {

	/**
	 * The size of the item cache
	 */
	private static final int CACHE_SIZE = 10;

	/**
	 * Indicates the world is configured as a premium world
	 */
	public static boolean premiumEnabled = true;

	/**
	 * The amount of item definitions available
	 */
	public static int count;

	/**
	 * The definition index
	 */
	public static int definition_index[];

	/**
	 * The data archive
	 */
	public static Buffer data_archive;

	/**
	 * The item definitions currently loaded in memory
	 */
	public static ItemDefinition cache[];

	/**
	 * The index of the item definition in the cache that was last inserted
	 */
	public static int previousEntry;

	/**
	 * the id of the item
	 */
	public int id;
	
	/**
	 * The model used
	 */
	public int model_id;

	/**
	 * The item's name
	 */
	public String name;

	/**
	 * The description or examine text of the item
	 */
	public byte description[];
	
	/**
	 * The collection of colors that will be changed
	 */
	public int modified_color[];

	/**
	 * The collection of colors present on the item that will be changed
	 */
	public int original_color[];

	/**
	 * The model's zoom in the inventory sprite
	 */
	public int model_zoom;

	/**
	 * The model's x rotation in the inventory sprite
	 */
	public int model_rotation_x;

	/**
	 * The model's y rotation in the inventory sprite
	 */
	public int model_rotation_y;
	
	/**
	 * The model's z rotation in the inventory sprite
	 */
	public int model_rotation_z;
	
	/**
	 * Model offset X in the inventory icon
	 */
	public int model_offset_x;
	
	/**
	 * Model offset Y in the inventory icon
	 */
	public int model_offset_y;
	
	/**
	 * This is never ever used, but it is a value being read from the data buffer. Possibly
	 * a dummy value.
	 */
	public int junk_value;

	/**
	 * Indicates the item is stackable or not
	 */
	public boolean stackable;

	/**
	 * The value of the item. This is usually the high alch value of the item.
	 * This is used to sort a pile of items from least to most valuable.
	 */
	public int value;

	/**
	 * Indicates the item is a premium item. This will make it lose its options
	 * when the client is configured as non-premium
	 */
	public boolean premium;

	/**
	 * The actions the item has when it is on the ground
	 */
	public String menu_actions_ground[];

	/**
	 * The right click options of the item
	 */
	public String menu_actions_inventory[];

	/**
	 * The primary model displayed when the item has been equiped by a male character
	 */
	public int maleEquipModel;
	
	/**
	 * The secondary model displayed when the item has been equiped by a male character
	 */
	public int maleEquipModelAddOn;

	/**
	 * Male equip model translation
	 */
	public byte maleEquipModelTranslation;
	
	/**
	 * The primary model displayed when the item has been equiped by a female character
	 */
	public int femaleEquipModel;
	
	/**
	 * The secondary model when then item has been equiped by a female character
	 */
	public int femaleEquipModelAddOn;
	
	/**
	 * Female equip model translation
	 */
	public byte femaleEquipModelTranslation;

	/**
	 * The displayed emblem on the worn item when the character is male
	 */
	public int maleEquipEmblem;
	
	/**
	 * The displayed emblem on the worn item when the character is female
	 */
	public int femaleEquipEmblem;
	
	/**
	 * The male dialogue model
	 */
	public int maleDialogueModel;

	/**
	 * An added headpiece worn when the character is male
	 */
	public int maleDialogueModelHeadpiece;
	
	/**
	 * The model of the item the player is wearing when the character is female
	 */
	public int femaleDialogueModel;

	/**
	 * An added headpiece worn when the character is female
	 */
	public int femaleDialogueModelHeadpiece;
	
	/**
	 * The id of the definition that contains information about the item's appearance
	 * when it meets certain amount thresholds
	 */
	public int stackable_definitions[];
	
	/**
	 * the item thresholds that the item amount needs to exceed in order for
	 * it to change appearance (arrows 1-5; coins 1-5, 10, 100, 1000, 10000...)
	 */
	public int stackable_threshold[];
	
	/**
	 * The id of the item when it is noted
	 */
	public int noteId;

	/**
	 * The id of the item definition that represents the item in its noted form
	 */
	public int notedTemplateId;
	
	/**
	 * The scale of the model along the x-axis
	 */
	public int model_scale_x;
	
	/**
	 * The scale of the model along the y-axis
	 */
	public int model_scale_y;
	
	/**
	 * The scale of the model along the z-axis
	 */
	public int model_scale_z;
	
	/**
	 * The light modifier
	 */
	public int light_modifier;
	
	/**
	 * The shadow modifier
	 */
	public int shadow_modifier;
	
	/**
	 * The team id. People wearing items with the same team id will appear
	 * as orange on the minimap
	 */
	public int team;

	/**
	 * The model cache
	 */
	public static LinkedList model_cache = new LinkedList(50);

	/**
	 * The sprite cache
	 */
	public static LinkedList sprite_cache = new LinkedList(100);

	/**
	 * 
	 * @param itemId
	 * @param type
	 * @param amount
	 * @return
	 */
	public static Sprite getSprite(int itemId, int type, int amount) {
		if (type == 0) {
			Sprite sprite = (Sprite) sprite_cache.get(itemId);
			if (sprite != null && sprite.max_height != amount && sprite.max_height != -1) {
				sprite.destroy();
				sprite = null;
			}
			if (sprite != null) {
				return sprite;
			}
		}
		ItemDefinition definition = get(itemId);
		if (definition.stackable_definitions == null) {
			amount = -1;
		}
		if (amount > 1) {
			int stackable_id = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= definition.stackable_threshold[index] && definition.stackable_threshold[index] != 0) {
					stackable_id = definition.stackable_definitions[index];
				}
			}
			if (stackable_id != -1) {
				definition = get(stackable_id);
			}
		}
		Model model = definition.forAmount(1);
		if (model == null) {
			return null;
		}
		Sprite noted_sprite = null;
		if (definition.notedTemplateId != -1) {
			noted_sprite = getSprite(definition.noteId, -1, 10);
			if (noted_sprite == null) {
				return null;
			}
		}
		Sprite item_sprite = new Sprite(32, 32);
		int k1 = Rasterizer.anInt1423;
		int l1 = Rasterizer.anInt1424;
		int ai[] = Rasterizer.anIntArray1429;
		int ai1[] = DrawingArea.anIntArray1369;
		int i2 = DrawingArea.anInt1370;
		int j2 = DrawingArea.anInt1371;
		int k2 = DrawingArea.anInt1374;
		int l2 = DrawingArea.anInt1375;
		int i3 = DrawingArea.anInt1372;
		int j3 = DrawingArea.anInt1373;
		Rasterizer.textured = false;
		DrawingArea.method406(-78, item_sprite.pixel_array, 32, 32);
		DrawingArea.method411(0, 210, 0, 32, 0, 32);
		Rasterizer.method419((byte) 3);
		int zoom = definition.model_zoom;
		if (type == -1) {
			zoom = (int) ((double) zoom * 1.5D);
		}
		if (type > 0) {
			zoom = (int) ((double) zoom * 1.04D);
		}
		int l3 = Rasterizer.anIntArray1427[definition.model_rotation_x] * zoom >> 16;
		int i4 = Rasterizer.anIntArray1428[definition.model_rotation_x] * zoom >> 16;
		model.method526(0, definition.model_rotation_y, definition.model_rotation_z,
				definition.model_rotation_x, definition.model_offset_x,
				l3 + ((Class44_Sub3_Sub4) (model)).anInt1412 / 2 + definition.model_offset_y,
				i4 + definition.model_offset_y);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--) {
				if (item_sprite.pixel_array[i5 + j4 * 32] == 0) {
					if (i5 > 0 && item_sprite.pixel_array[(i5 - 1) + j4 * 32] > 1) {
						item_sprite.pixel_array[i5 + j4 * 32] = 1;
					} else if (j4 > 0 && item_sprite.pixel_array[i5 + (j4 - 1) * 32] > 1) {
						item_sprite.pixel_array[i5 + j4 * 32] = 1;
					} else if (i5 < 31 && item_sprite.pixel_array[i5 + 1 + j4 * 32] > 1) {
						item_sprite.pixel_array[i5 + j4 * 32] = 1;
					} else if (j4 < 31 && item_sprite.pixel_array[i5 + (j4 + 1) * 32] > 1) {
						item_sprite.pixel_array[i5 + j4 * 32] = 1;
					}
				}
			}
		}
		if (type > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--) {
					if (item_sprite.pixel_array[j5 + k4 * 32] == 0) {
						if (j5 > 0 && item_sprite.pixel_array[(j5 - 1) + k4 * 32] == 1) {
							item_sprite.pixel_array[j5 + k4 * 32] = type;
						} else if (k4 > 0 && item_sprite.pixel_array[j5 + (k4 - 1) * 32] == 1) {
							item_sprite.pixel_array[j5 + k4 * 32] = type;
						} else if (j5 < 31 && item_sprite.pixel_array[j5 + 1 + k4 * 32] == 1) {
							item_sprite.pixel_array[j5 + k4 * 32] = type;
						} else if (k4 < 31 && item_sprite.pixel_array[j5 + (k4 + 1) * 32] == 1) {
							item_sprite.pixel_array[j5 + k4 * 32] = type;
						}
					}
				}
			}
		} else if (type == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--) {
					if (item_sprite.pixel_array[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0
							&& item_sprite.pixel_array[(k5 - 1) + (l4 - 1) * 32] > 0) {
						item_sprite.pixel_array[k5 + l4 * 32] = 0x302020;
					}
				}
			}
		}
		if (definition.notedTemplateId != -1) {
			int width = noted_sprite.max_width;
			int height = noted_sprite.max_height;
			noted_sprite.max_width = 32;
			noted_sprite.max_height = 32;
			noted_sprite.drawImage(0, 0);
			noted_sprite.max_width = width;
			noted_sprite.max_height = height;
		}
		if (type == 0) {
			sprite_cache.put(itemId, item_sprite);
		}
		DrawingArea.method406(-78, ai1, i2, j2);
		DrawingArea.method408(j3, l2, i3, k2);
		Rasterizer.anInt1423 = k1;
		Rasterizer.anInt1424 = l1;
		Rasterizer.anIntArray1429 = ai;
		Rasterizer.textured = true;
		if (definition.stackable) {
			item_sprite.max_width = 33;
		} else {
			item_sprite.max_width = 32;
		}
		item_sprite.max_height = amount;
		return item_sprite;
	}

	/**
	 * Initializes the item definitions
	 * 
	 * @param archive
	 */
	public static void initialize(Archive archive) {
		data_archive = new Buffer(archive.entry("obj.dat", null));
		Buffer index_file = new Buffer(archive.entry("obj.idx", null));
		count = index_file.getUnsignedShort();
		definition_index = new int[count];
		int reader_offset = 2;
		for (int id = 0; id < count; id++) {
			definition_index[id] = reader_offset;
			reader_offset += index_file.getUnsignedShort();
		}
		cache = new ItemDefinition[CACHE_SIZE];
		for (int id = 0; id < CACHE_SIZE; id++) {
			cache[id] = new ItemDefinition();
		}
	}

	/**
	 * Gets the item definition for the given id
	 * 
	 * @param id
	 * @return
	 */
	public static ItemDefinition get(int id) {
		for (int cache_index = 0; cache_index < CACHE_SIZE; cache_index++) {
			if (cache[cache_index].id == id) {
				return cache[cache_index];
			}
		}
		previousEntry = (previousEntry + 1) % CACHE_SIZE;
		ItemDefinition definition = cache[previousEntry];
		data_archive.pointer = definition_index[id];
		definition.id = id;
		definition.reset();
		definition.unpack(data_archive);
		if (definition.notedTemplateId != -1) {
			definition.note();
		}
		if (!premiumEnabled && definition.premium) {
			definition.name = "Members Object";
			definition.description = "Login to a members' server to use this object.".getBytes();
			definition.menu_actions_ground = null;
			definition.menu_actions_inventory = null;
		}
		return definition;
	}

	/**
	 * Releases the allocated resources
	 */
	public static void destroy() {
		model_cache = null;
		sprite_cache = null;
		definition_index = null;
		cache = null;
		data_archive = null;
	}

	/**
	 * Constructor initializing the item's id as -1
	 */
	public ItemDefinition() {
		id = -1;
	}

	/**
	 * Takes a definition and resets its values to default values
	 */
	public void reset() {
		model_id = 0;
		name = null;
		description = null;
		modified_color = null;
		original_color = null;
		model_zoom = 2000;
		model_rotation_x = 0;
		model_rotation_y = 0;
		model_rotation_z = 0;
		model_offset_x = 0;
		model_offset_y = 0;
		junk_value = -1;
		stackable = false;
		value = 1;
		premium = false;
		menu_actions_ground = null;
		menu_actions_inventory = null;
		maleEquipModel = -1;
		maleEquipModelAddOn = -1;
		maleEquipModelTranslation = 0;
		femaleEquipModel = -1;
		femaleEquipModelAddOn = -1;
		femaleEquipModelTranslation = 0;
		maleEquipEmblem = -1;
		femaleEquipEmblem = -1;
		maleDialogueModel = -1;
		maleDialogueModelHeadpiece = -1;
		femaleDialogueModel = -1;
		femaleDialogueModelHeadpiece = -1;
		stackable_definitions = null;
		stackable_threshold = null;
		noteId = -1;
		notedTemplateId = -1;
		model_scale_x = 128;
		model_scale_y = 128;
		model_scale_z = 128;
		light_modifier = 0;
		shadow_modifier = 0;
		team = 0;
	}

	/**
	 * Reads the values out of the definition configuration file
	 * 
	 * @param buffer
	 */
	public void unpack(Buffer buffer) {
		do {
			int attribute = buffer.getUnsignedByte();
			if (attribute == 0) {
				return;
			}
			if (attribute == 1) {
				model_id = buffer.getUnsignedShort();
			} else if (attribute == 2) {
				name = buffer.getRSString();
			} else if (attribute == 3) {
				description = buffer.getRawString();
			} else if (attribute == 4) {
				model_zoom = buffer.getUnsignedShort();
			} else if (attribute == 5) {
				model_rotation_x = buffer.getUnsignedShort();
			} else if (attribute == 6) {
				model_rotation_y = buffer.getUnsignedShort();
			} else if (attribute == 7) {
				model_offset_x = buffer.getUnsignedShort();
				if (model_offset_x > 32767) {
					model_offset_x -= 0x10000;
				}
			} else if (attribute == 8) {
				model_offset_y = buffer.getUnsignedShort();
				if (model_offset_y > 32767) {
					model_offset_y -= 0x10000;
				}
			} else if (attribute == 10) {
				junk_value = buffer.getUnsignedShort();
			} else if (attribute == 11) {
				stackable = true;
			} else if (attribute == 12) {
				value = buffer.getUnsignedInt();
			} else if (attribute == 16) {
				premium = true;
			} else if (attribute == 23) {
				maleEquipModel = buffer.getUnsignedShort();
				maleEquipModelTranslation = buffer.getSignedByte();
			} else if (attribute == 24) {
				maleEquipModelAddOn = buffer.getUnsignedShort();
			} else if (attribute == 25) {
				femaleEquipModel = buffer.getUnsignedShort();
				femaleEquipModelTranslation = buffer.getSignedByte();
			} else if (attribute == 26) {
				femaleEquipModelAddOn = buffer.getUnsignedShort();
			} else if (attribute >= 30 && attribute < 35) {
				if (menu_actions_ground == null) {
					menu_actions_ground = new String[5];
				}
				menu_actions_ground[attribute - 30] = buffer.getRSString();
				if (menu_actions_ground[attribute - 30].equalsIgnoreCase("hidden")) {
					menu_actions_ground[attribute - 30] = null;
				}
			} else if (attribute >= 35 && attribute < 40) {
				if (menu_actions_inventory == null) {
					menu_actions_inventory = new String[5];
				}
				menu_actions_inventory[attribute - 35] = buffer.getRSString();
			} else if (attribute == 40) {
				int count = buffer.getUnsignedByte();
				modified_color = new int[count];
				original_color = new int[count];
				for (int k = 0; k < count; k++) {
					modified_color[k] = buffer.getUnsignedShort();
					original_color[k] = buffer.getUnsignedShort();
				}
			} else if (attribute == 78) {
				maleEquipEmblem = buffer.getUnsignedShort();
			} else if (attribute == 79) {
				femaleEquipEmblem = buffer.getUnsignedShort();
			} else if (attribute == 90) {
				maleDialogueModel = buffer.getUnsignedShort();
			} else if (attribute == 91) {
				femaleDialogueModel = buffer.getUnsignedShort();
			} else if (attribute == 92) {
				maleDialogueModelHeadpiece = buffer.getUnsignedShort();
			} else if (attribute == 93) {
				femaleDialogueModelHeadpiece = buffer.getUnsignedShort();
			} else if (attribute == 95) {
				model_rotation_z = buffer.getUnsignedShort();
			} else if (attribute == 97) {
				noteId = buffer.getUnsignedShort();
			} else if (attribute == 98) {
				notedTemplateId = buffer.getUnsignedShort();
			} else if (attribute >= 100 && attribute < 110) {
				if (stackable_definitions == null) {
					stackable_definitions = new int[10];
					stackable_threshold = new int[10];
				}
				stackable_definitions[attribute - 100] = buffer.getUnsignedShort();
				stackable_threshold[attribute - 100] = buffer.getUnsignedShort();
			} else if (attribute == 110) {
				model_scale_x = buffer.getUnsignedShort();
			} else if (attribute == 111) {
				model_scale_y = buffer.getUnsignedShort();
			} else if (attribute == 112) {
				model_scale_z = buffer.getUnsignedShort();
			} else if (attribute == 113) {
				light_modifier = buffer.getSignedByte();
			} else if (attribute == 114) {
				shadow_modifier = buffer.getSignedByte() * 5;
			} else if (attribute == 115) {
				team = buffer.getUnsignedByte();
			}
		} while (true);
	}

	/**
	 * Notes the item
	 * @return
	 */
	public ItemDefinition note() {
		ItemDefinition noted_definition = get(notedTemplateId);
		model_id = noted_definition.model_id;
		model_zoom = noted_definition.model_zoom;
		model_rotation_x = noted_definition.model_rotation_x;
		model_rotation_y = noted_definition.model_rotation_y;
		model_rotation_z = noted_definition.model_rotation_z;
		model_offset_x = noted_definition.model_offset_x;
		model_offset_y = noted_definition.model_offset_y;
		modified_color = noted_definition.modified_color;
		original_color = noted_definition.original_color;
		ItemDefinition definition = get(noteId);
		name = definition.name;
		premium = definition.premium;
		value = definition.value;
		String article = "a";
		char c = definition.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			article = "an";
		}
		description = ("Swap this note at any bank for " + article + " " + definition.name + ".").getBytes();
		stackable = true;
		return noted_definition;
	}

	/**
	 * Gets the correct model for the item for the given amount
	 * 
	 * @param amount
	 * @return
	 */
	public Model forAmount(int amount) {
		if (stackable_definitions != null && amount > 1) {
			int stackable_id = -1;
			for (int stackable_index = 0; stackable_index < 10; stackable_index++) {
				if (amount >= stackable_threshold[stackable_index] && stackable_threshold[stackable_index] != 0) {
					stackable_id = stackable_definitions[stackable_index];
				}
			}
			if (stackable_id != -1) {
				return get(stackable_id).forAmount(1);
			}
		}
		Model model = (Model) model_cache.get(id);
		if (model != null) {
			return model;
		}
		model = Model.getModel(model_id);
		if (model == null) {
			return null;
		}
		if (model_scale_x != 128 || model_scale_y != 128 || model_scale_z != 128) {
			model.scale(model_scale_x, model_scale_z, model_scale_y, (byte) 31);
		}
		if (modified_color != null) {
			for (int color_index = 0; color_index < modified_color.length; color_index++) {
				model.recolor(modified_color[color_index], original_color[color_index]);
			}
		}
		model.applyLighting(64 + light_modifier, 768 + shadow_modifier, -50, -10, -50, true);
		model.single_tile = true;
		model_cache.put(id, model);
		return model;
	}

	/**
	 * Gets the item to be displayed in the inventory
	 * 
	 * @param amount
	 * @return
	 */
	public Model getInventoryModel(int amount) {
		if (stackable_definitions != null && amount > 1) {
			int stackable_id = -1;
			for (int stackable_index = 0; stackable_index < 10; stackable_index++) {
				if (amount >= stackable_threshold[stackable_index] && stackable_threshold[stackable_index] != 0) {
					stackable_id = stackable_definitions[stackable_index];
				}
			}
			if (stackable_id != -1) {
				return get(stackable_id).getInventoryModel(1);
			}
		}
		Model model = Model.getModel(model_id);
		if (model == null) {
			return null;
		}
		if (modified_color != null) {
			for (int color_index = 0; color_index < modified_color.length; color_index++) {
				model.recolor(modified_color[color_index], original_color[color_index]);
			}
		}
		return model;
	}

	/**
	 * Checks to see if the model for the given gender is cached or not
	 * 
	 * @param gender
	 * @return
	 */
	public boolean isEquippedModelCached(int gender) {
		int equip_model = maleEquipModel;
		int equip_model_addon = maleEquipModelAddOn;
		int equip_model_emblem = maleEquipEmblem;
		if (gender == 1) {
			equip_model = femaleEquipModel;
			equip_model_addon = femaleEquipModelAddOn;
			equip_model_emblem = femaleEquipEmblem;
		}
		if (equip_model == -1) {
			return true;
		}
		boolean cached = true;
		if (!Model.isCached(equip_model)) {
			cached = false;
		}
		if (equip_model_addon != -1 && !Model.isCached(equip_model_addon)) {
			cached = false;
		}
		if (equip_model_emblem != -1 && !Model.isCached(equip_model_emblem)) {
			cached = false;
		}
		return cached;
	}

	/**
	 * Grabs the model for the equipped item
	 * 
	 * @param gender
	 * @return
	 */
	public Model getEquippedModel(int gender) {
		int equip_model = maleEquipModel;
		int equip_model_addon = maleEquipModelAddOn;
		int equip_model_emblem = maleEquipEmblem;
		if (gender == 1) {
			equip_model = femaleEquipModel;
			equip_model_addon = femaleEquipModelAddOn;
			equip_model_emblem = femaleEquipEmblem;
		}
		if (equip_model == -1) {
			return null;
		}
		Model model = Model.getModel(equip_model);
		if (equip_model_addon != -1) {
			if (equip_model_emblem != -1) {
				Model addon_model = Model.getModel(equip_model_addon);
				Model emblem_model = Model.getModel(equip_model_emblem);
				Model models[] = { model, addon_model, emblem_model };
				model = new Model(models, 3);
			} else {
				Model addon_model = Model.getModel(equip_model_addon);
				Model model_parts[] = { model, addon_model };
				model = new Model(model_parts, 2);
			}
		}
		if (gender == 0 && maleEquipModelTranslation != 0) {
			model.translate(maleEquipModelTranslation, 0, 0);
		}
		if (gender == 1 && femaleEquipModelTranslation != 0) {
			model.translate(femaleEquipModelTranslation, 0, 0);
		}
		if (modified_color != null) {
			for (int color_index = 0; color_index < modified_color.length; color_index++) {
				model.recolor(modified_color[color_index], original_color[color_index]);
			}
		}
		return model;
	}

	/**
	 * Checks to see if the model for the dialogue sprite is cached or not
	 * 
	 * @param gender
	 * @return
	 */
	public boolean isDialogueModelCached(int gender) {
		int dialogue_model = maleDialogueModel;
		int dialogue_model_addon = maleDialogueModelHeadpiece;
		if (gender == 1) {
			dialogue_model = femaleDialogueModel;
			dialogue_model_addon = femaleDialogueModelHeadpiece;
		}
		if (dialogue_model == -1) {
			return true;
		}
		boolean cached = true;
		if (!Model.isCached(dialogue_model)) {
			cached = false;
		}
		if (dialogue_model_addon != -1 && !Model.isCached(dialogue_model_addon)) {
			cached = false;
		}
		return cached;
	}

	/**
	 * Gets the model for the dialogue
	 * 
	 * @param gender
	 * @return
	 */
	public Model getDialogueModel(int gender) {
		int dialogue_model = maleDialogueModel;
		int dialogue_model_addon = maleDialogueModelHeadpiece;
		if (gender == 1) {
			dialogue_model = femaleDialogueModel;
			dialogue_model_addon = femaleDialogueModelHeadpiece;
		}
		if (dialogue_model == -1) {
			return null;
		}
		Model model = Model.getModel(dialogue_model);
		if (dialogue_model_addon != -1) {
			Model addon_model = Model.getModel(dialogue_model_addon);
			Model model_parts[] = { model, addon_model };
			model = new Model(model_parts, 2);
		}
		if (modified_color != null) {
			for (int color_index = 0; color_index < modified_color.length; color_index++) {
				model.recolor(modified_color[color_index], original_color[color_index]);
			}
		}
		return model;
	}

}
