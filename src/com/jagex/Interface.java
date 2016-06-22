package com.jagex;
import java.util.ArrayList;
import java.util.List;

import sign.signlink;

public class Interface {

	public byte aByte98;
	public int anInt99;
	public static Interface interfaces[];
	public int item_id[];
	public int item_count[];
	public int anInt103;
	public int anInt104;
	public int id;
	public int parentId;
	public int type;
	public int anInt108;
	public int anInt109;
	public int anInt110;
	public int anInt111;
	public byte aByte112;
	public int offset_x;
	public int offset_y;
	public int anIntArrayArray115[][];
	public int anIntArray116[];
	public int anIntArray117[];
	public int anInt118;
	public int anInt119;
	public int anInt120;
	public boolean aBoolean121;
	public int children[];
	public int child_x[];
	public int child_y[];
	public int anInt125;
	public boolean aBoolean126;
	public boolean aBoolean127;
	public boolean aBoolean128;
	public boolean aBoolean129;
	public boolean aBoolean130;
	public int anInt131;
	public int anInt132;
	public Sprite aClass44_Sub3_Sub1_Sub2Array133[];
	public int anIntArray134[];
	public int anIntArray135[];
	public String options[];
	public boolean aBoolean137;
	public boolean aBoolean138;
	public boolean aBoolean139;
	public RSFont aClass44_Sub3_Sub1_Sub4_140;
	public String message;
	public String aString142;
	public int textColor;
	public int anInt144;
	public int anInt145;
	public int anInt146;
	public Sprite aClass44_Sub3_Sub1_Sub2_147;
	public Sprite aClass44_Sub3_Sub1_Sub2_148;
	public int sprite_type;
	public int sprite_id;
	public int anInt151;
	public int anInt152;
	public int anInt153;
	public int anInt154;
	public int anInt155;
	public int anInt156;
	public int anInt157;
	public String aString158;
	public String aString159;
	public int anInt160;
	public String option;
	public static LinkedList aClass39_162 = new LinkedList(30);
	public static LinkedList aClass39_163;

	public static void load(RSFont[] fonts, Archive class47, Archive archive) {
		aClass39_163 = new LinkedList(50000);
		Buffer data = new Buffer(archive.entry("data", null));
        int parent_id = -1;
        interfaces = new Interface[data.getUnsignedShort()];
        
        while(data.pointer < data.payload.length) {
			int id = data.getUnsignedShort();
			if (id == 65535) {
				parent_id = data.getUnsignedShort();
				id = data.getUnsignedShort();
			}
            Interface iface = interfaces[id] = new Interface();
            iface.id = id;
            iface.parentId = parent_id;
            iface.type = data.getUnsignedByte();
            iface.anInt108 = data.getUnsignedByte();
            iface.anInt109 = data.getUnsignedShort();
            iface.anInt110 = data.getUnsignedShort();
            iface.anInt111 = data.getUnsignedShort();
            iface.aByte112 = (byte)data.getUnsignedByte();
            iface.anInt118 = data.getUnsignedByte();
			if (iface.anInt118 != 0) {
				iface.anInt118 = (iface.anInt118 - 1 << 8) + data.getUnsignedByte();
			} else {
				iface.anInt118 = -1;
			}
			int j1 = data.getUnsignedByte();
			if (j1 > 0) {
				iface.anIntArray116 = new int[j1];
				iface.anIntArray117 = new int[j1];
				for (int k1 = 0; k1 < j1; k1++) {
					iface.anIntArray116[k1] = data.getUnsignedByte();
					iface.anIntArray117[k1] = data.getUnsignedShort();
				}
			}
			int l1 = data.getUnsignedByte();
			if (l1 > 0) {
				iface.anIntArrayArray115 = new int[l1][];
				for (int i2 = 0; i2 < l1; i2++) {
					int j3 = data.getUnsignedShort();
					iface.anIntArrayArray115[i2] = new int[j3];
					for (int i5 = 0; i5 < j3; i5++) {
						iface.anIntArrayArray115[i2][i5] = data.getUnsignedShort();
					}
				}
			}
			if (iface.type == 0) {
				iface.anInt119 = data.getUnsignedShort();
				iface.aBoolean121 = data.getUnsignedByte() == 1;
				int j2 = data.getUnsignedShort();
				iface.children = new int[j2];
				iface.child_x = new int[j2];
				iface.child_y = new int[j2];
				for (int k3 = 0; k3 < j2; k3++) {
					iface.children[k3] = data.getUnsignedShort();
					iface.child_x[k3] = data.getSignedShort();
					iface.child_y[k3] = data.getSignedShort();
				}
			}
			if (iface.type == 1) {
				iface.anInt125 = data.getUnsignedShort();
				iface.aBoolean126 = data.getUnsignedByte() == 1;
			}
			if (iface.type == 2) {
				iface.item_id = new int[iface.anInt110 * iface.anInt111];
				iface.item_count = new int[iface.anInt110 * iface.anInt111];
				iface.aBoolean127 = data.getUnsignedByte() == 1;
				iface.aBoolean128 = data.getUnsignedByte() == 1;
				iface.aBoolean129 = data.getUnsignedByte() == 1;
				iface.aBoolean130 = data.getUnsignedByte() == 1;
				iface.anInt131 = data.getUnsignedByte();
				iface.anInt132 = data.getUnsignedByte();
				iface.anIntArray134 = new int[20];
				iface.anIntArray135 = new int[20];
				iface.aClass44_Sub3_Sub1_Sub2Array133 = new Sprite[20];
				for (int k2 = 0; k2 < 20; k2++) {
					int l3 = data.getUnsignedByte();
					if (l3 == 1) {
						iface.anIntArray134[k2] = data.getSignedShort();
						iface.anIntArray135[k2] = data.getSignedShort();
						String s1 = data.getRSString();
						if (class47 != null && s1.length() > 0) {
							int j5 = s1.lastIndexOf(",");
							iface.aClass44_Sub3_Sub1_Sub2Array133[k2] = method186(false, Integer.parseInt(s1.substring(j5 + 1)), class47, s1.substring(0, j5));
						}
					}
				}
				iface.options = new String[5];
				for (int i4 = 0; i4 < 5; i4++) {
					iface.options[i4] = data.getRSString();
					if (iface.options[i4].length() == 0) {
						iface.options[i4] = null;
					}
				}
			}
			if (iface.type == 3) {
				iface.aBoolean137 = data.getUnsignedByte() == 1;
			}
			if (iface.type == 4 || iface.type == 1) {
				iface.aBoolean138 = data.getUnsignedByte() == 1;
				int l2 = data.getUnsignedByte();
				if (fonts != null) {
					iface.aClass44_Sub3_Sub1_Sub4_140 = fonts[l2];
				}
				iface.aBoolean139 = data.getUnsignedByte() == 1;
			}
			if (iface.type == 4) {
				iface.message = data.getRSString();
				iface.aString142 = data.getRSString();
			}
			if (iface.type == 1 || iface.type == 3 || iface.type == 4) {
				iface.textColor = data.getUnsignedInt();
			}
			if (iface.type == 3 || iface.type == 4) {
				iface.anInt144 = data.getUnsignedInt();
				iface.anInt145 = data.getUnsignedInt();
				iface.anInt146 = data.getUnsignedInt();
			}
			if (iface.type == 5) {
				String s =  data.getRSString();
				if (class47 != null && s.length() > 0) {
                    int j4 = s.lastIndexOf(",");
                    iface.aClass44_Sub3_Sub1_Sub2_147 = method186(false, Integer.parseInt(s.substring(j4 + 1)), class47, s.substring(0, j4));
                }
				s = data.getRSString();
				if (class47 != null && s.length() > 0) {
					int k4 = s.lastIndexOf(",");
					iface.aClass44_Sub3_Sub1_Sub2_148 = method186(false, Integer.parseInt(s.substring(k4 + 1)), class47, s.substring(0, k4));
				}
			}
			if (iface.type == 6) {
				int i1 = data.getUnsignedByte();
				if (i1 != 0) {
					iface.sprite_type = 1;
					iface.sprite_id = (i1 - 1 << 8)
							+ data.getUnsignedByte();
				}
				i1 = data.getUnsignedByte();
				if (i1 != 0) {
					iface.anInt151 = 1;
					iface.anInt152 = (i1 - 1 << 8) + data.getUnsignedByte();
				}
				i1 = data.getUnsignedByte();
				if (i1 != 0) {
					iface.anInt153 = (i1 - 1 << 8) + data.getUnsignedByte();
				} else {
					iface.anInt153 = -1;
				}
				i1 = data.getUnsignedByte();
				if (i1 != 0) {
					iface.anInt154 = (i1 - 1 << 8) + data.getUnsignedByte();
				} else {
					iface.anInt154 = -1;
				}
				iface.anInt155 = data.getUnsignedShort();
				iface.anInt156 = data.getUnsignedShort();
				iface.anInt157 = data.getUnsignedShort();
			}
			if (iface.type == 7) {
				iface.item_id = new int[iface.anInt110 * iface.anInt111];
				iface.item_count = new int[iface.anInt110 * iface.anInt111];
				iface.aBoolean138 = data.getUnsignedByte() == 1;
				int i3 = data.getUnsignedByte();
				if (fonts != null) {
                    iface.aClass44_Sub3_Sub1_Sub4_140 = fonts[i3];
                }
                iface.aBoolean139 = data.getUnsignedByte() == 1;
				iface.textColor = data.getUnsignedInt();
				iface.anInt131 = data.getSignedShort();
				iface.anInt132 = data.getSignedShort();
				iface.aBoolean128 = data.getUnsignedByte() == 1;
				iface.options = new String[5];
				for (int l4 = 0; l4 < 5; l4++) {
					iface.options[l4] = data.getRSString();
					if (iface.options[l4].length() == 0) {
						iface.options[l4] = null;
					}
				}
			}
			if (iface.anInt108 == 2 || iface.type == 2) {
				iface.aString158 = data.getRSString();
				iface.aString159 = data.getRSString();
				iface.anInt160 = data.getUnsignedShort();

			}
			if (iface.anInt108 == 1 || iface.anInt108 == 4 || iface.anInt108 == 5 || iface.anInt108 == 6) {
				iface.option = data.getRSString();
				if (iface.option.length() == 0) {
					if (iface.anInt108 == 1) {
						iface.option = "Ok";
					}
					if (iface.anInt108 == 4) {
						iface.option = "Select";
					}
					if (iface.anInt108 == 5) {
						iface.option = "Select";
					}
					if (iface.anInt108 == 6) {
						iface.option = "Continue";
					}
				}
			}
//			if (iface.message != null && iface.message.equalsIgnoreCase("line1")) {
//				System.out.println("----------------------------------------");
//				System.out.println("id: " + iface.id);
//				System.out.println("parentId: " + iface.parentId);
//				System.out.println("message: " + iface.message);
//			}
		}
		aClass39_163 = null;
		return;
	}
   
	public static void createSingleProductionInterface() {
		Interface iface = interfaces[8938];

		if (iface.id == 8938) {
			List<Integer> children = new ArrayList<>();
			List<Integer> child_x = new ArrayList<>();
			List<Integer> child_y = new ArrayList<>();

			for (int i = 0; i < iface.children.length; i++) {
				if (iface.child_x[i] != 1 && iface.child_x[i] != 98 && iface.child_x[i] != 292 && iface.child_x[i] != 389) {
					children.add(iface.children[i]);
					child_x.add(iface.child_x[i]);
					child_y.add(iface.child_y[i]);
				}
			}

			iface.children = toArray(children);
			iface.child_x = toArray(child_x);
			iface.child_y = toArray(child_y);
		}
	}

	private static int[] toArray(List<Integer> list) {
		int[] output = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			output[i] = list.get(i);
		}
		return output;
	}

    public void method182(int i, int j, int k)
    {
        try
        {
            int l = item_id[k];
            item_id[k] = item_id[j];
            if(i < 0 || i > 0)
            {
                return;
            } else
            {
                item_id[j] = l;
                l = item_count[k];
                item_count[k] = item_count[j];
                item_count[j] = l;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("35687, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method183(int i, int j, int k, boolean flag)
    {
        try
        {
            if(i != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            Model class44_sub3_sub4_sub4;
            if(flag)
            {
                class44_sub3_sub4_sub4 = method184(anInt151, anInt152);
            } else
            {
                class44_sub3_sub4_sub4 = method184(sprite_type, sprite_id);
            }
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            if(k == -1 && j == -1 && class44_sub3_sub4_sub4.palette == null)
            {
                return class44_sub3_sub4_sub4;
            }
            Model class44_sub3_sub4_sub4_1 = new Model(class44_sub3_sub4_sub4, AnimationFrame.invalid(k) & AnimationFrame.invalid(j), false, anInt99, true);
            if(k != -1 || j != -1)
            {
                class44_sub3_sub4_sub4_1.method513((byte)3);
            }
            if(k != -1)
            {
                class44_sub3_sub4_sub4_1.method514(k, 188);
            }
            if(j != -1)
            {
                class44_sub3_sub4_sub4_1.method514(j, 188);
            }
            class44_sub3_sub4_sub4_1.applyLighting(64, 768, -50, -10, -50, true);
            return class44_sub3_sub4_sub4_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("4323, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method184(int i, int j)
    {
        Model class44_sub3_sub4_sub4 = (Model)aClass39_162.get((i << 16) + j);
        if(class44_sub3_sub4_sub4 != null)
        {
            return class44_sub3_sub4_sub4;
        }
        if(i == 1)
        {
            class44_sub3_sub4_sub4 = Model.getModel(j);
        }
        if(i == 2)
        {
            class44_sub3_sub4_sub4 = NPCDefinition.forId(j).method217();
        }
        if(i == 3)
        {
            class44_sub3_sub4_sub4 = client.player_appearance.method539(false);
        }
        if(i == 4)
        {
            class44_sub3_sub4_sub4 = ItemDefinition.get(j).getInventoryModel(50);
        }
        if(i == 5)
        {
            class44_sub3_sub4_sub4 = null;
        }
        if(class44_sub3_sub4_sub4 != null)
        {
            aClass39_162.put((i << 16) + j, class44_sub3_sub4_sub4);
        }
        return class44_sub3_sub4_sub4;
    }

    public static void method185(int i, Model class44_sub3_sub4_sub4, int j, int k)
    {
        try
        {
            aClass39_162.method341();
            if(j != 9)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            if(class44_sub3_sub4_sub4 != null && i != 4)
            {
                aClass39_162.put((i << 16) + k, class44_sub3_sub4_sub4);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("27428, " + i + ", " + class44_sub3_sub4_sub4 + ", " + j + ", " + k + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static Sprite method186(boolean flag, int i, Archive class47, String s)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            long l = (StringUtil.method552(-5562, s) << 8) + (long)i;
            Sprite class44_sub3_sub1_sub2 = (Sprite)aClass39_163.get(l);
            if(class44_sub3_sub1_sub2 != null)
            {
                return class44_sub3_sub1_sub2;
            }
            try
            {
                class44_sub3_sub1_sub2 = new Sprite(class47, s, i);
                aClass39_163.put(l, class44_sub3_sub1_sub2);
            }
            catch(Exception _ex)
            {
                return null;
            }
            return class44_sub3_sub1_sub2;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("90047, " + flag + ", " + i + ", " + class47 + ", " + s + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Interface()
    {
        aByte98 = 4;
    }

}
