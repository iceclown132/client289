package com.jagex;


import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import java.util.zip.CRC32;

import com.jagex.Constants;

import sign.signlink;

@SuppressWarnings("serial")
public class client extends RSApplet
{

    public boolean aBoolean812;
    public long aLong813;
    public Cache cache;
    public int anInt815;
    public int anInt816;
    public int anInt817;
    public int anInt818;
    public int anInt819;
    public boolean aBoolean820;
    public static int anInt821;
    public Buffer loginbuffer;
    public String aString823;
    public int anInt824;
    public int anInt825;
    public int anInt826;
    public int anIntArray827[];
    public int anIntArray828[];
    public boolean aBoolean829;
    public byte aByte830;
    public int anInt831;
    public int anInt832;
    public int anInt833;
    public int anInt834;
    public int anInt835;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array836[];
    public int anIntArray837[];
    public int anIntArray838[];
    public int anIntArray839[];
    public int anIntArray840[];
    public int region_x;
    public int region_y;
    public int chat_settings;
    public int anInt844;
    public static int anInt845;
    public int anIntArray846[];
    public boolean aBoolean847;
    public int anInt848;
    public int anIntArray849[];
    public Buffer buffer;
    public int experience[];
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_852;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_853;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_854;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_855;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_856;
    public int anInt857;
    public Class34 aClass34_858;
    public Class34 aClass34_859;
    public Class34 aClass34_860;
    public int anInt861;
    public int anInt862;
    public boolean aBoolean863;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array864[];
    public int anIntArrayArrayArray865[][][];
    public MouseThread aClass10_866;
    public Sprite aClass44_Sub3_Sub1_Sub2Array867[];
    public int anIntArray868[];
    public int anInt869;
    public static int anInt870;
    public byte aByteArrayArrayArray871[][][];
    public Sprite aClass44_Sub3_Sub1_Sub2Array872[];
    public static int anInt873;
    public int anInt874;
    public int camera_x;
    public int anInt876;
    public int camera_y;
    public int anInt878;
    public int anInt879;
    public int anInt880;
    public int anIntArray881[];
    public int game_state;
    public byte aByte883;
    public byte aByte884;
    public int anIntArrayArray885[][];
    public boolean aBoolean886;
    public int anInt887;
    public int anInt888;
    public int active_inventory_interface;
    public int anInt890;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_891;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_892;
    public boolean aBoolean893;
    public int anIntArray894[];
    public int pm_settings;
    public static boolean aBoolean896;
    public String aStringArray897[];
    public boolean redrawTabArea;
    public int anInt899;
    public int anInt900;
    public int anInt901;
    public int anInt902;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_903;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_904;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_905;
    public boolean aBoolean906;
    public int anInt907;
    public boolean aBoolean908;
    public int anInt909;
    public int anIntArray910[];
    public int absolute_x;
    public int absolute_y;
    public Sprite aClass44_Sub3_Sub1_Sub2_913;
    public int anIntArray914[];
    public int anIntArray915[];
    public int anIntArray916[];
    public int anInt917;
    public Deque aClass28_918;
    public String aStringArray919[];
    public boolean aBooleanArray920[];
    public int anInt921;
    public boolean aBoolean922;
    public static int anInt923;
    public int anInt924;
    public byte aByte925;
    public String aString926;
    public ISAACCipher cipher;
    public int anInt928;
    public int anInt929;
    public int anInt930;
    public int anInt931;
    public int anInt932;
    public int anInt933;
    public boolean aBoolean934;
    public boolean aBoolean935;
    public int anInt936;
    public static boolean macro_flag;
    public int anIntArray938[];
    public String aString939;
    public int anInt940;
    public int local_entity_index[];
    public int anInt942;
    public int anIntArray943[];
    public static int anInt944;
    public int anInt945;
    public boolean aBoolean946;
    public int anInt947;
    public int anInt948;
    public static byte aByte949 = -48;
    public boolean aBoolean950;
    public CRC32 aCRC32_951;
    public int anInt952;
    public int anInt953;
    public int anInt954;
    public int anInt955;
    public String selected_item_id;
    public int anInt957;
    public static int anInt958 = 1;
    public int anInt959;
    public int anInt960;
    public int anIntArray961[];
    public int anInt962;
    public int anInt963;
    public int anInt964;
    public int dialog_id;
    public static String aString966 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public long aLong967;
    public int anInt968;
    public int anInt969;
    public int anInt970;
    public int anInt971;
    public int anInt972;
    public byte landscape_files[][];
    public int anInt974;
    public int anIntArrayArray975[][];
    public int anIntArray976[];
    public byte aByte977;
    public int anInt978;
    public long aLongArray979[];
    public boolean user_amount_prompt;
    public byte map_files[][];
    public int anInt982;
    public int anInt983;
    public static int experienceTable[];
    public boolean aBoolean985;
    public static int anInt986;
    public boolean aBoolean987;
    public Sprite aClass44_Sub3_Sub1_Sub2_988;
    public int anInt989;
    public int anInt990;
    public int anInt991;
    public int anInt992;
    public int anInt993;
    public int anInt994;
    public int anInt995;
    public int anInt996;
    public String aString997;
    public int anInt998;
    public int anInt999;
    public int anInt1000;
    public int anIntArray1001[];
    public int chat_entry_type[];
    public String chat_entry_username[];
    public String chat_entry_text[];
    public int anInt1005;
    public int anIntArray1006[];
    public String aString1007;
    public NPC local_npcs[];
    public int expected_npc_count;
    public int local_npc_indices[];
    public int anInt1011;
    public int anInt1012;
    public Socket aSocket1013;
    public int anInt1014;
    public int anInt1015 = 100;
    public int anIntArray1016[];
    public int anInt1017;
    public int anIntArray1018[];
    public int anInt1019;
    public int walk_queue_x[];
    public int walk_queue_y[];
    public CollisionMap planes[];
    public int anInt1023;
    public int anIntArray1024[];
    public Sprite aClass44_Sub3_Sub1_Sub2_1025;
    public Sprite aClass44_Sub3_Sub1_Sub2_1026;
    public int anInt1027;
    public int anInt1028;
    public static int anInt1029;
    public int anInt1030;
    public int anInt1031;
    public int anInt1032;
    public int anInt1033;
    public int anInt1034;
    public int levels[];
    public boolean aBoolean1036;
    public int local_x;
    public int local_y;
    public int region_identifiers[];
    public int anIntArray1040[];
    public int anIntArray1041[];
    public byte aByte1042;
    public static int anIntArray1043[] = {
        9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145,
        58654, 5027, 1457, 16565, 34991, 25486
    };
    public String aStringArray1044[];
    public static BigInteger RSA_PRIVATE_KEY = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    public static int anInt1046;
    public static PlayerModel player_appearance;
    public long aLong1048;
    public boolean inputTaken;
    public boolean aBoolean1050;
    public int anIntArray1051[];
    public Sprite aClass44_Sub3_Sub1_Sub2Array1052[];
    public byte aByte1053;
    public Deque aClass28_1054;
    public boolean aBoolean1055;
    public int anInt1056;
    public boolean aBoolean1057;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1058;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1059;
    public int sidebarInterfaces[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
        -1, -1, -1, -1, -1
    };
    public static boolean aBoolean1061;
    public boolean aBoolean1062;
    public int anInt1063;
    public int anInt1064;
    public int anInt1065;
    public int anInt1066;
    public int debugOpcode1;
    public int debugOpcode2;
    public int debugOpcode3;
    public long aLong1070;
    public String aString1071;
    public String aString1072;
    public static int anIntArrayArray1073[][] = {
        {
            6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
            2983, 54193
        }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
            56621, 4783, 1341, 16578, 35003, 25239
        }, {
            25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
            10153, 56621, 4783, 1341, 16578, 35003
        }, {
            4626, 11146, 6439, 12, 4758, 10270
        }, {
            4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
        }
    };
    public int anInt1074;
    public int anInt1075;
    public int anInt1076;
    public Sprite aClass44_Sub3_Sub1_Sub2_1077;
    public Sprite aClass44_Sub3_Sub1_Sub2_1078;
    public Sprite aClass44_Sub3_Sub1_Sub2_1079;
    public Sprite aClass44_Sub3_Sub1_Sub2_1080;
    public int anInt1081;
    public int anInt1082;
    public int anInt1083;
    public boolean aBoolean1084;
    public int anInt1085;
    public byte aByte1086;
    public static int anInt1087;
    public static int anIntArray1088[];
    public int anInt1089;
    public int absoluteLevel[];
    public int anInt1091;
    public String aString1092;
    public int anInt1093;
    public int anInt1094;
    public int anInt1095;
    public int anInt1096;
    public int anInt1097;
    public byte aByte1098;
    public Channel channel;
    public static int anInt1100;
    public byte aByte1101;
    public String aString1102;
    public int anInt1103;
    public int anInt1104;
    public int anInt1105;
    public int anInt1106;
    public int anInt1107;
    public Sprite aClass44_Sub3_Sub1_Sub2Array1108[];
    public byte aByteArray1109[];
    public String login_label_top;
    public String login_label_bottom;
    public int anInt1112;
    public int anIntArrayArray1113[][];
    public static int anInt1114;
    public int anInt1115;
    public Deque deque;
    public Archive aClass47_1117;
    public int anInt1118;
    public int anInt1119;
    public int anInt1120;
    public int anInt1121;
    public int anInt1122;
    public Class34 aClass34_1123;
    public Class34 aClass34_1124;
    public Class34 aClass34_1125;
    public Class34 aClass34_1126;
    public Class34 aClass34_1127;
    public Class34 aClass34_1128;
    public Class34 aClass34_1129;
    public Class34 aClass34_1130;
    public Class34 aClass34_1131;
    public Buffer incoming_buffer;
    public int anIntArray1133[];
    public int anIntArray1134[];
    public static BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1136;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1137;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1138;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1139;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1140;
    public String chat_text;
    public int anIntArray1142[] = {
        0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        2, 2, 3
    };
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1143;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1144;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1145;
    public Deque groundItems[][][];
    public boolean aBoolean1147;
    public int anInt1148;
    public int anInt1149;
    public int anInt1150;
    public int anInt1151;
    public int anInt1152;
    public int anInt1153;
    public boolean aBoolean1154;
    public int height_level;
    public boolean aBoolean1156;
    public int anInt1157;
    public int anInt1158;
    public int anIntArray1159[];
    public int anIntArray1160[];
    public int anIntArray1161[];
    public int anIntArray1162[];
    public int anIntArray1163[];
    public int anIntArray1164[];
    public int anIntArray1165[];
    public String aStringArray1166[];
    public static int anInt1167;
    public int trade_settings;
    public int packet_size;
    public int packet_opcode;
    public int anInt1171;
    public int anInt1172;
    public int anInt1173;
    public boolean aBoolean1174;
    public static int anInt1175;
    public int anInt1176;
    public int anInt1177;
    public boolean aBoolean1178;
    public boolean aBoolean1179;
    public static int anInt1180;
    public long aLong1181;
    public byte aByte1182;
    public Sprite aClass44_Sub3_Sub1_Sub2Array1183[];
    public int base_x;
    public int base_y;
    public int last_base_x;
    public int last_base_y;
    public int user_privilege;
    public int anInt1189;
    public int anInt1190;
    public boolean aBoolean1191;
    public Class36 aClass36_1192;
    public int anIntArray1193[];
    public static byte aByte1194 = 102;
    public Class34 aClass34_1195;
    public Class34 aClass34_1196;
    public Class34 aClass34_1197;
    public Class34 aClass34_1198;
    public int active_game_interface;
    public int anInt1200;
    public Interface aClass5_1201;
    public int anInt1202;
    public int anIntArray1203[] = {
        0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    public static int anInt1204;
    public int anInt1205;
    public int anIntArray1206[];
    public static int anInt1207;
    public Class45 aClass45Array1208[];
    public boolean aBooleanArray1209[];
    public Sprite aClass44_Sub3_Sub1_Sub2_1210;
    public Sprite aClass44_Sub3_Sub1_Sub2_1211;
    public int anInt1212;
    public byte aByte1213;
    public int settings[];
    public int anInt1215;
    public int anInt1216;
    public int anInt1217;
    public int anIntArray1218[];
    public int anIntArray1219[];
    public int anIntArray1220[];
    public int anIntArray1221[];
    public boolean aBoolean1222;
    public int anInt1223;
    public int player_processed_flag;
    public PlayerModel player_models[];
    public int expected_player_count;
    public int local_players[];
    public int local_player_count;
    public int local_entities[];
    public Buffer render_buffer[];
    public int anInt1231;
    public static int anInt1232 = 10;
    public static int port_offset;
    public static boolean aBoolean1234 = true;
    public static boolean highmem;
    public boolean aBoolean1236;
    public boolean aBoolean1237;
    public static int anInt1238;
    public int anInt1239;
    public static int anInt1240;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array1241[];
    public int anInt1242;
    public int anInt1243;
    public int anInt1244;
    public int anInt1245;
    public static int anInt1246 = 604;
    public int anInt1247;
    public int anInt1248;
    public int anInt1249;
    public int anInt1250;
    public int anInt1251;
    public int anInt1252;
    public int active_chat_interface;
    public long aLongArray1254[];
    public RSFont aClass44_Sub3_Sub1_Sub4_1255;
    public RSFont plain_font;
    public RSFont chat_area_graphics;
    public RSFont aClass44_Sub3_Sub1_Sub4_1258;
    public int anInt1259;
    public int anInt1260;
    public Sprite aClass44_Sub3_Sub1_Sub2_1261;
    public boolean aBoolean1262;
    public Class34 aClass34_1263;
    public Class34 aClass34_1264;
    public Class34 aClass34_1265;
    public Class34 aClass34_1266;
    public Class34 aClass34_1267;
    public Class34 aClass34_1268;
    public Class34 aClass34_1269;
    public Class34 aClass34_1270;
    public Class34 aClass34_1271;
    public int anIntArray1272[];
    public int anIntArray1273[];
    public static int anInt1274;
    public boolean aBoolean1275;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array1276[];
    public Sprite aClass44_Sub3_Sub1_Sub2_1277;
    public Sprite aClass44_Sub3_Sub1_Sub2_1278;
    public static boolean aBoolean1279;
    
    public static final Color[] colors = new Color[256];
    
    static {
    	Random random = new Random();
    	for (int i = 0; i < colors.length; i++) {
    		colors[i] = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    	}
    }

    public void init()
    {
        anInt1232 = Integer.parseInt(getParameter("nodeid"));
        port_offset = Integer.parseInt(getParameter("portoff"));
        String s = getParameter("lowmem");
        if(s != null && s.equals("1"))
        {
            method131();
        } else
        {
            method64(true);
        }
        String s1 = getParameter("free");
        if(s1 != null && s1.equals("1"))
        {
            aBoolean1234 = false;
        } else
        {
            aBoolean1234 = true;
        }
        method2(true, 765, 503);
    }

	public void method7(int i) {
		try {
			if (i != 9) {
				packet_opcode = incoming_buffer.getUnsignedByte();
			}
			if (aBoolean1236 || aBoolean1055 || aBoolean820) {
				return;
			}
			anInt1240++;
			if (!aBoolean863) {
				method97((byte) 122);
			} else {
				method56(anInt1056);
			}
			method93(false);
			return;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

    public AppletContext getAppletContext()
    {
        if(signlink.mainapp != null)
        {
            return signlink.mainapp.getAppletContext();
        } else
        {
            return super.getAppletContext();
        }
    }

    public void method14(byte byte0)
    {
        try
        {
            if(byte0 != 1)
            {
                anInt1246 = 98;
            }
            if(anInt1095 != 0)
            {
                return;
            }
            int i = super.anInt27;
            if(anInt994 == 1 && super.anInt28 >= 516 && super.anInt29 >= 160 && super.anInt28 <= 765 && super.anInt29 <= 205)
            {
                i = 0;
            }
            if(aBoolean946)
            {
                if(i != 1)
                {
                    int j = super.mouse_x;
                    int i1 = super.mouse_y;
                    if(anInt1030 == 0)
                    {
                        j -= 4;
                        i1 -= 4;
                    }
                    if(anInt1030 == 1)
                    {
                        j -= 553;
                        i1 -= 205;
                    }
                    if(anInt1030 == 2)
                    {
                        j -= 17;
                        i1 -= 357;
                    }
                    if(j < anInt1031 - 10 || j > anInt1031 + anInt1033 + 10 || i1 < anInt1032 - 10 || i1 > anInt1032 + anInt1034 + 10)
                    {
                        aBoolean946 = false;
                        if(anInt1030 == 1)
                        {
                            redrawTabArea = true;
                        }
                        if(anInt1030 == 2)
                        {
                            inputTaken = true;
                        }
                    }
                }
                if(i == 1)
                {
                    int k = anInt1031;
                    int j1 = anInt1032;
                    int l1 = anInt1033;
                    int j2 = super.anInt28;
                    int k2 = super.anInt29;
                    if(anInt1030 == 0)
                    {
                        j2 -= 4;
                        k2 -= 4;
                    }
                    if(anInt1030 == 1)
                    {
                        j2 -= 553;
                        k2 -= 205;
                    }
                    if(anInt1030 == 2)
                    {
                        j2 -= 17;
                        k2 -= 357;
                    }
                    int l2 = -1;
                    for(int i3 = 0; i3 < anInt971; i3++)
                    {
                        int j3 = j1 + 31 + (anInt971 - 1 - i3) * 15;
                        if(j2 > k && j2 < k + l1 && k2 > j3 - 13 && k2 < j3 + 3)
                        {
                            l2 = i3;
                        }
                    }
                    if(l2 != -1)
                    {
                        method134(l2, 725);
                    }
                    aBoolean946 = false;
                    if(anInt1030 == 1)
                    {
                        redrawTabArea = true;
                    }
                    if(anInt1030 == 2)
                    {
                        inputTaken = true;
                        return;
                    }
                }
            } else
            {
                if(i == 1 && anInt971 > 0)
                {
                    int l = anIntArray839[anInt971 - 1];
                    if(l == 582 || l == 113 || l == 555 || l == 331 || l == 354 || l == 694 || l == 962 || l == 795 || l == 681 || l == 100 || l == 102 || l == 1328)
                    {
                        int k1 = anIntArray837[anInt971 - 1];
                        int i2 = anIntArray838[anInt971 - 1];
                        Interface class5 = Interface.interfaces[i2];
                        if(class5.aBoolean127 || class5.aBoolean130)
                        {
                            aBoolean847 = false;
                            anInt978 = 0;
                            anInt1093 = i2;
                            anInt1094 = k1;
                            anInt1095 = 2;
                            anInt1096 = super.anInt28;
                            anInt1097 = super.anInt29;
                            if(Interface.interfaces[i2].parentId == active_game_interface)
                            {
                                anInt1095 = 1;
                            }
                            if(Interface.interfaces[i2].parentId == active_chat_interface)
                            {
                                anInt1095 = 3;
                            }
                            return;
                        }
                    }
                }
                if(i == 1 && (anInt862 == 1 || method26(anInt971 - 1, -40)) && anInt971 > 2)
                {
                    i = 2;
                }
                if(i == 1 && anInt971 > 0)
                {
                    method134(anInt971 - 1, 725);
                }
                if(i == 2 && anInt971 > 0)
                {
                    method89(anInt899);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("43374, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method15(int i, Sprite class44_sub3_sub1_sub2, int j, int k)
    {
        try
        {
            int l = i * i + j * j;
            if(k != 0)
            {
                buffer.putByte(121);
            }
            if(l > 4225 && l < 0x15f90)
            {
                int i1 = anInt930 + anInt959 & 0x7ff;
                int j1 = Model.anIntArray1598[i1];
                int k1 = Model.anIntArray1599[i1];
                j1 = (j1 * 256) / (anInt1075 + 256);
                k1 = (k1 * 256) / (anInt1075 + 256);
                int l1 = j * j1 + i * k1 >> 16;
                int i2 = j * k1 - i * j1 >> 16;
                double d = Math.atan2(l1, i2);
                int j2 = (int)(Math.sin(d) * 63D);
                int k2 = (int)(Math.cos(d) * 57D);
                aClass44_Sub3_Sub1_Sub2_1261.method445(15, d, 20, 256, 15, (94 + j2 + 4) - 10, (byte)8, 20, 83 - k2 - 20);
                return;
            } else
            {
                method141(i, class44_sub3_sub1_sub2, 139, j);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("6403, " + i + ", " + class44_sub3_sub1_sub2 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method16(int i)
    {
        try
        {
            method63(-411);
            if(anInt818 == 1)
            {
                aClass44_Sub3_Sub1_Sub2Array867[anInt817 / 100].drawImage(anInt816 - 8 - 4, anInt815 - 8 - 4);
            }
            if(anInt818 == 2)
            {
                aClass44_Sub3_Sub1_Sub2Array867[4 + anInt817 / 100].drawImage(anInt816 - 8 - 4, anInt815 - 8 - 4);
                anInt923++;
                if(anInt923 > 57)
                {
                    anInt923 = 0;
                    buffer.putOpcode(85);
                }
            }
            if(anInt924 != -1)
            {
                method65(anInt824, anInt924, (byte)-103);
                method37(6, 0, 0, Interface.interfaces[anInt924], 0);
            }
            if(active_game_interface != -1)
            {
                method65(anInt824, active_game_interface, (byte)-103);
                method37(6, 0, 0, Interface.interfaces[active_game_interface], 0);
            }
            method24((byte)-128);
            if(i != anInt969)
            {
                buffer.putByte(186);
            }
            if(!aBoolean946)
            {
                method54((byte)6);
                method52(521);
            } else
            if(anInt1030 == 0)
            {
                method115(393);
            }
            if(anInt1112 == 1)
            {
                aClass44_Sub3_Sub1_Sub2Array1183[1].drawImage(296, 472);
            }
            if(anInt998 != 0)
            {
                int j = anInt998 / 50;
                int k = j / 60;
                j %= 60;
                if(j < 10)
                {
                    plain_font.method459((byte)-104, 0xffff00, "System update in: " + k + ":0" + j, 4, 329);
                    return;
                } else
                {
                    plain_font.method459((byte)-104, 0xffff00, "System update in: " + k + ":" + j, 4, 329);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("39313, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void message(int message_type, String text, String username) {
		if (message_type == 0 && dialog_id != -1) {
			aString823 = text;
			super.anInt27 = 0;
		}
		if (active_chat_interface == -1) {
			inputTaken = true;
		}
		for (int j = 99; j > 0; j--) {
			chat_entry_type[j] = chat_entry_type[j - 1];
			chat_entry_username[j] = chat_entry_username[j - 1];
			chat_entry_text[j] = chat_entry_text[j - 1];
		}
		chat_entry_type[0] = message_type;
		chat_entry_username[0] = username;
		chat_entry_text[0] = text;
		return;
	}

	public void clear(int i) {
		packet_size += i;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

    public boolean prompt_user(byte byte0, Interface class5)
    {
        try
        {
            if(byte0 != -16)
            {
                groundItems = null;
            }
            int i = class5.anInt109;
            if(anInt1105 == 2)
            {
                if(i == 201)
                {
                    inputTaken = true;
                    user_amount_prompt = false;
                    aBoolean1222 = true;
                    aString1007 = "";
                    anInt880 = 1;
                    aString1102 = "Enter name of friend to add to list";
                }
                if(i == 202)
                {
                    inputTaken = true;
                    user_amount_prompt = false;
                    aBoolean1222 = true;
                    aString1007 = "";
                    anInt880 = 2;
                    aString1102 = "Enter name of friend to delete from list";
                }
            }
            if(i == 205)
            {
                anInt1173 = 250;
                return true;
            }
            if(i == 501)
            {
                inputTaken = true;
                user_amount_prompt = false;
                aBoolean1222 = true;
                aString1007 = "";
                anInt880 = 4;
                aString1102 = "Enter name of player to add to list";
            }
            if(i == 502)
            {
                inputTaken = true;
                user_amount_prompt = false;
                aBoolean1222 = true;
                aString1007 = "";
                anInt880 = 5;
                aString1102 = "Enter name of player to delete from list";
            }
            if(i >= 300 && i <= 313)
            {
                int j = (i - 300) / 2;
                int i1 = i & 1;
                int l1 = anIntArray849[j];
                if(l1 != -1)
                {
                    do
                    {
                        if(i1 == 0 && --l1 < 0)
                        {
                            l1 = Class22.anInt463 - 1;
                        }
                        if(i1 == 1 && ++l1 >= Class22.anInt463)
                        {
                            l1 = 0;
                        }
                    } while(Class22.aClass22Array464[l1].aBoolean470 || Class22.aClass22Array464[l1].anInt465 != j + (aBoolean1179 ? 0 : 7));
                    anIntArray849[j] = l1;
                    aBoolean812 = true;
                }
            }
            if(i >= 314 && i <= 323)
            {
                int k = (i - 314) / 2;
                int j1 = i & 1;
                int i2 = anIntArray938[k];
                if(j1 == 0 && --i2 < 0)
                {
                    i2 = anIntArrayArray1073[k].length - 1;
                }
                if(j1 == 1 && ++i2 >= anIntArrayArray1073[k].length)
                {
                    i2 = 0;
                }
                anIntArray938[k] = i2;
                aBoolean812 = true;
            }
            if(i == 324 && !aBoolean1179)
            {
                aBoolean1179 = true;
                method70(aByte883);
            }
            if(i == 325 && aBoolean1179)
            {
                aBoolean1179 = false;
                method70(aByte883);
            }
            if(i == 326)
            {
                buffer.putOpcode(27);
                buffer.putByte(aBoolean1179 ? 0 : 1);
                for(int l = 0; l < 7; l++)
                {
                    buffer.putByte(anIntArray849[l]);
                }
                for(int k1 = 0; k1 < 5; k1++)
                {
                    buffer.putByte(anIntArray938[k1]);
                }
                return true;
            }
            if(i == 613)
            {
                aBoolean987 = !aBoolean987;
            }
            if(i >= 601 && i <= 612)
            {
                method28(3);
                if(aString939.length() > 0)
                {
                    buffer.putOpcode(94);
                    buffer.putLong(StringUtil.hash(aString939));
                    buffer.putByte(i - 601);
                    buffer.putByte(aBoolean987 ? 1 : 0);
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("38005, " + byte0 + ", " + class5 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method20(int i)
    {
        try
        {
            for(int j = -1; j < expected_player_count; j++)
            {
                int k;
                if(j == -1)
                {
                    k = player_processed_flag;
                } else
                {
                    k = local_players[j];
                }
                PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[k];
                if(class44_sub3_sub4_sub6_sub1 != null && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1628 > 0)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1628--;
                    if(((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1628 == 0)
                    {
                        class44_sub3_sub4_sub6_sub1.floating_text = null;
                    }
                }
            }
            for(int l = 0; l < expected_npc_count; l++)
            {
                int i1 = local_npc_indices[l];
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[i1];
                if(class44_sub3_sub4_sub6_sub2 != null && ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1628 > 0)
                {
                    class44_sub3_sub4_sub6_sub2.anInt1628--;
                    if(((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1628 == 0)
                    {
                        class44_sub3_sub4_sub6_sub2.floating_text = null;
                    }
                }
            }
            if(i != 0)
            {
                buffer.putByte(252);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("41421, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method21(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            aClass44_Sub3_Sub1_Sub3_1058.method453(i, aByte1213, j);
            aClass44_Sub3_Sub1_Sub3_1059.method453((i + i1) - 16, aByte1213, j);
            DrawingArea.method411(anInt1000, 210, i + 16, i1 - 32, j, 16);
            int k1 = ((i1 - 32) * i1) / l;
            if(k1 < 8)
            {
                k1 = 8;
            }
            int l1 = ((i1 - 32 - k1) * k) / (l - i1);
            DrawingArea.method411(anInt1200, 210, i + 16 + l1, k1, j, 16);
            DrawingArea.method416(i + 16 + l1, j, anInt1085, k1, 0);
            DrawingArea.method416(i + 16 + l1, j + 1, anInt1085, k1, 0);
            DrawingArea.method414(16, j, anInt1085, true, i + 16 + l1);
            DrawingArea.method414(16, j, anInt1085, true, i + 17 + l1);
            DrawingArea.method416(i + 16 + l1, j + 15, anInt844, k1, 0);
            DrawingArea.method416(i + 17 + l1, j + 14, anInt844, k1 - 1, 0);
            DrawingArea.method414(16, j, anInt844, true, i + 15 + l1 + k1);
            DrawingArea.method414(15, j + 1, anInt844, true, i + 14 + l1 + k1);
            if(j1 != 3)
            {
                groundItems = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("34190, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void logout()
    {
        try
        {
            try
            {
                if(channel != null)
                {
                    channel.close();
                }
            }
            catch(Exception _ex)
            {
            }
            channel = null;
            aBoolean863 = false;
            anInt1014 = 0;
            aString1071 = "";
            aString1072 = "";
            method76(aByte1042);
            aClass36_1192.method278(true);
            for(int i = 0; i < 4; i++)
            {
                planes[i].method231();
            }
            System.gc();
            clear(0);
            anInt963 = -1;
            anInt1190 = -1;
            anInt942 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("79964, " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method23(int i)
    {
        try
        {
            if(i <= 0)
            {
                anInt962 = -451;
            }
            if(game_state == 2)
            {
                for(Class44_Sub1 class44_sub1 = (Class44_Sub1)deque.peek(); class44_sub1 != null; class44_sub1 = (Class44_Sub1)deque.next())
                {
                    if(class44_sub1.anInt1334 > 0)
                    {
                        class44_sub1.anInt1334--;
                    }
                    if(class44_sub1.anInt1334 == 0)
                    {
                        if(class44_sub1.anInt1327 < 0 || LandscapeParser.method173(class44_sub1.anInt1327, class44_sub1.anInt1329, 677))
                        {
                            method73(class44_sub1.anInt1328, 0, class44_sub1.anInt1329, class44_sub1.anInt1323, class44_sub1.anInt1327, class44_sub1.anInt1325, class44_sub1.anInt1324, class44_sub1.anInt1326);
                            class44_sub1.destroy();
                        }
                    } else
                    {
                        if(class44_sub1.anInt1333 > 0)
                        {
                            class44_sub1.anInt1333--;
                        }
                        if(class44_sub1.anInt1333 == 0 && class44_sub1.anInt1325 >= 1 && class44_sub1.anInt1326 >= 1 && class44_sub1.anInt1325 <= 102 && class44_sub1.anInt1326 <= 102 && (class44_sub1.anInt1330 < 0 || LandscapeParser.method173(class44_sub1.anInt1330, class44_sub1.anInt1332, 677)))
                        {
                            method73(class44_sub1.anInt1331, 0, class44_sub1.anInt1332, class44_sub1.anInt1323, class44_sub1.anInt1330, class44_sub1.anInt1325, class44_sub1.anInt1324, class44_sub1.anInt1326);
                            class44_sub1.anInt1333 = -1;
                            if(class44_sub1.anInt1330 == class44_sub1.anInt1327 && class44_sub1.anInt1327 == -1)
                            {
                                class44_sub1.destroy();
                            } else
                            if(class44_sub1.anInt1330 == class44_sub1.anInt1327 && class44_sub1.anInt1331 == class44_sub1.anInt1328 && class44_sub1.anInt1332 == class44_sub1.anInt1329)
                            {
                                class44_sub1.destroy();
                            }
                        }
                    }
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("56217, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method24(byte byte0)
    {
        try
        {
            if(byte0 != -128)
            {
                //anInt1247 = aClass46_927.method545();
            }
            anInt1245 = 0;
            int i = (((RenderingHints) (player_appearance)).anInt1615 >> 7) + base_x;
            int j = (((RenderingHints) (player_appearance)).anInt1616 >> 7) + base_y;
            if(i >= 3053 && i <= 3156 && j >= 3056 && j <= 3136)
            {
                anInt1245 = 1;
            }
            if(i >= 3072 && i <= 3118 && j >= 9492 && j <= 9535)
            {
                anInt1245 = 1;
            }
            if(anInt1245 == 1 && i >= 3139 && i <= 3199 && j >= 3008 && j <= 3062)
            {
                anInt1245 = 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("82905, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method25(int i)
    {
        try
        {
            char c = '\u0100';
            for(int j = 10; j < 117; j++)
            {
                int k = (int)(Math.random() * 100D);
                if(k < 50)
                {
                    anIntArray1272[j + (c - 2 << 7)] = 255;
                }
            }
            for(int l = 0; l < 100; l++)
            {
                int i1 = (int)(Math.random() * 124D) + 2;
                int k1 = (int)(Math.random() * 128D) + 128;
                int k2 = i1 + (k1 << 7);
                anIntArray1272[k2] = 192;
            }
            for(int j1 = 1; j1 < c - 1; j1++)
            {
                for(int l1 = 1; l1 < 127; l1++)
                {
                    int l2 = l1 + (j1 << 7);
                    anIntArray1273[l2] = (anIntArray1272[l2 - 1] + anIntArray1272[l2 + 1] + anIntArray1272[l2 - 128] + anIntArray1272[l2 + 128]) / 4;
                }
            }
            anInt890 += 128;
            i = 27 / i;
            if(anInt890 > anIntArray1133.length)
            {
                anInt890 -= anIntArray1133.length;
                int i2 = (int)(Math.random() * 12D);
                method109(aClass44_Sub3_Sub1_Sub3Array864[i2], 34809);
            }
            for(int j2 = 1; j2 < c - 1; j2++)
            {
                for(int i3 = 1; i3 < 127; i3++)
                {
                    int k3 = i3 + (j2 << 7);
                    int i4 = anIntArray1273[k3 + 128] - anIntArray1133[k3 + anInt890 & anIntArray1133.length - 1] / 5;
                    if(i4 < 0)
                    {
                        i4 = 0;
                    }
                    anIntArray1272[k3] = i4;
                }
            }
            for(int j3 = 0; j3 < c - 1; j3++)
            {
                anIntArray1018[j3] = anIntArray1018[j3 + 1];
            }
            anIntArray1018[c - 1] = (int)(Math.sin((double)anInt1240 / 14D) * 16D + Math.sin((double)anInt1240 / 15D) * 14D + Math.sin((double)anInt1240 / 16D) * 12D);
            if(anInt1259 > 0)
            {
                anInt1259 -= 4;
            }
            if(anInt1260 > 0)
            {
                anInt1260 -= 4;
            }
            if(anInt1259 == 0 && anInt1260 == 0)
            {
                int l3 = (int)(Math.random() * 2000D);
                if(l3 == 0)
                {
                    anInt1259 = 1024;
                }
                if(l3 == 1)
                {
                    anInt1260 = 1024;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("53446, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method26(int i, int j)
    {
        try
        {
            if(i < 0)
            {
                return false;
            }
            int k = anIntArray839[i];
            if(j >= 0)
            {
                //anInt1242 = aClass46_927.method545();
            }
            if(k >= 2000)
            {
                k -= 2000;
            }
            return k == 605;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("17125, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method27(byte byte0)
    {
        /*try
        {
            int i = 5;
            anIntArray1051[8] = 0;
            if(byte0 != -48)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.getUnsignedByte();
            }
            int j = 0;
            while(anIntArray1051[8] == 0)
            {
                String s = "Unknown problem";
                method13(false, 20, "Connecting to web server");
                try
                {
                    DataInputStream datainputstream = method77("crc" + (int)(Math.random() * 99999999D) + "-" + 289);
                    Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(new byte[40], 15787);
                    datainputstream.readFully(class44_sub3_sub2.aByteArray1391, 0, 40);
                    datainputstream.close();
                    for(int l = 0; l < 9; l++)
                    {
                        anIntArray1051[l] = class44_sub3_sub2.getUnsignedInt();
                    }
                    int i1 = class44_sub3_sub2.getUnsignedInt();
                    int j1 = 1234;
                    for(int k1 = 0; k1 < 9; k1++)
                    {
                        j1 = (j1 << 1) + anIntArray1051[k1];
                    }
                    if(i1 != j1)
                    {
                        s = "checksum problem";
                        anIntArray1051[8] = 0;
                    }
                }
                catch(EOFException _ex)
                {
                    s = "EOF problem";
                    anIntArray1051[8] = 0;
                }
                catch(IOException _ex)
                {
                    s = "connection problem";
                    anIntArray1051[8] = 0;
                }
                catch(Exception _ex)
                {
                    s = "logic problem";
                    anIntArray1051[8] = 0;
                    if(!signlink.reporterror)
                    {
                        return;
                    }
                }
                if(anIntArray1051[8] == 0)
                {
                    j++;
                    for(int k = i; k > 0; k--)
                    {
                        if(j >= 10)
                        {
                            method13(false, 10, "Game updated - please reload page");
                            k = 10;
                        } else
                        {
                            method13(false, 10, s + " - Will retry in " + k + " secs.");
                        }
                        try
                        {
                            Thread.sleep(1000L);
                        }
                        catch(Exception _ex)
                        {
                        }
                    }
                    i *= 2;
                    if(i > 60)
                    {
                        i = 60;
                    }
                    aBoolean922 = !aBoolean922;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("95813, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();*/
    }

    public void method28(int i)
    {
        try
        {
            if(i < 3 || i > 3)
            {
                groundItems = null;
            }
            buffer.putOpcode(93);
            if(active_inventory_interface != -1)
            {
                active_inventory_interface = -1;
                redrawTabArea = true;
                aBoolean935 = false;
                aBoolean1154 = true;
            }
            if(active_chat_interface != -1)
            {
                active_chat_interface = -1;
                inputTaken = true;
                aBoolean935 = false;
            }
            active_game_interface = -1;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("99207, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void print_network_debug() {
		System.out.println("============");
		System.out.println("flame-cycle:" + anInt945);
		if (cache != null) {
			System.out.println("Od-cycle:" + cache.anInt1322);
		}
		System.out.println("loop-cycle:" + anInt1240);
		System.out.println("draw-cycle:" + anInt1175);
		System.out.println("ptype:" + packet_opcode);
		System.out.println("psize:" + packet_size);
		if (channel != null) {
			channel.debug();
		}
		super.aBoolean10 = true;
	}

    public Component method11(int i)
    {
        try
        {
            if(i < 7 || i > 7)
            {
                aBoolean1178 = !aBoolean1178;
            }
            if(signlink.mainapp != null)
            {
                return signlink.mainapp;
            }
            if(super.aFrame_Sub1_16 != null)
            {
                return super.aFrame_Sub1_16;
            } else
            {
                return this;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("75072, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method30(int i, int j, int k, Interface class5, int l, int i1, int j1)
    {
        try
        {
            if(class5.type != 0 || class5.children == null || class5.aBoolean121)
            {
                return;
            }
            if(k < i || i1 < l || k > i + class5.anInt110 || i1 > l + class5.anInt111)
            {
                return;
            }
            int k1 = class5.children.length;
            if(j1 <= 0)
            {
                return;
            }
            for(int l1 = 0; l1 < k1; l1++)
            {
                int i2 = class5.child_x[l1] + i;
                int j2 = (class5.child_y[l1] + l) - j;
                Interface class5_1 = Interface.interfaces[class5.children[l1]];
                i2 += class5_1.offset_x;
                j2 += class5_1.offset_y;
                if((class5_1.anInt118 >= 0 || class5_1.anInt145 != 0) && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                {
                    if(class5_1.anInt118 >= 0)
                    {
                        anInt825 = class5_1.anInt118;
                    } else
                    {
                        anInt825 = class5_1.id;
                    }
                }
                if(class5_1.type == 0)
                {
                    method30(i2, class5_1.anInt120, k, class5_1, j2, i1, 792);
                    if(class5_1.anInt119 > class5_1.anInt111)
                    {
                        method81(j2, k, class5_1, i2 + class5_1.anInt110, true, class5_1.anInt111, aByte830, i1, class5_1.anInt119);
                    }
                } else
                {
                    if(class5_1.anInt108 == 1 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        boolean flag = false;
                        if(class5_1.anInt109 != 0)
                        {
                            flag = method107(class5_1, true);
                        }
                        if(!flag)
                        {
                            aStringArray897[anInt971] = class5_1.option;
                            anIntArray839[anInt971] = 231;
                            anIntArray838[anInt971] = class5_1.id;
                            anInt971++;
                        }
                    }
                    if(class5_1.anInt108 == 2 && anInt994 == 0 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        String s = class5_1.aString158;
                        if(s.indexOf(" ") != -1)
                        {
                            s = s.substring(0, s.indexOf(" "));
                        }
                        aStringArray897[anInt971] = s + " @gre@" + class5_1.aString159;
                        anIntArray839[anInt971] = 274;
                        anIntArray838[anInt971] = class5_1.id;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 3 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = "Close";
                        anIntArray839[anInt971] = 737;
                        anIntArray838[anInt971] = class5_1.id;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 4 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.option;
                        anIntArray839[anInt971] = 435;
                        anIntArray838[anInt971] = class5_1.id;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 5 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.option;
                        anIntArray839[anInt971] = 225;
                        anIntArray838[anInt971] = class5_1.id;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 6 && !aBoolean935 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.option;
                        anIntArray839[anInt971] = 997;
                        anIntArray838[anInt971] = class5_1.id;
                        anInt971++;
                    }
                    if(class5_1.type == 2)
                    {
                        int k2 = 0;
                        for(int l2 = 0; l2 < class5_1.anInt111; l2++)
                        {
                            for(int i3 = 0; i3 < class5_1.anInt110; i3++)
                            {
                                int j3 = i2 + i3 * (32 + class5_1.anInt131);
                                int k3 = j2 + l2 * (32 + class5_1.anInt132);
                                if(k2 < 20)
                                {
                                    j3 += class5_1.anIntArray134[k2];
                                    k3 += class5_1.anIntArray135[k2];
                                }
                                if(k >= j3 && i1 >= k3 && k < j3 + 32 && i1 < k3 + 32)
                                {
                                    anInt982 = k2;
                                    anInt983 = class5_1.id;
                                    if(class5_1.item_id[k2] > 0)
                                    {
                                        ItemDefinition class14 = ItemDefinition.get(class5_1.item_id[k2] - 1);
                                        if(anInt952 == 1 && class5_1.aBoolean128)
                                        {
                                            if(class5_1.id != anInt954 || k2 != anInt953)
                                            {
                                                aStringArray897[anInt971] = "Use " + selected_item_id + " with @lre@" + class14.name;
                                                anIntArray839[anInt971] = 398;
                                                anIntArray840[anInt971] = class14.id;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.id;
                                                anInt971++;
                                            }
                                        } else
                                        if(anInt994 == 1 && class5_1.aBoolean128)
                                        {
                                            if((anInt996 & 0x10) == 16)
                                            {
                                                aStringArray897[anInt971] = aString997 + " @lre@" + class14.name;
                                                anIntArray839[anInt971] = 563;
                                                anIntArray840[anInt971] = class14.id;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.id;
                                                anInt971++;
                                            }
                                        } else
                                        {
                                            if(class5_1.aBoolean128)
                                            {
                                                for(int l3 = 4; l3 >= 3; l3--)
                                                {
                                                    if(class14.menu_actions_inventory != null && class14.menu_actions_inventory[l3] != null)
                                                    {
                                                        aStringArray897[anInt971] = class14.menu_actions_inventory[l3] + " @lre@" + class14.name;
                                                        if(l3 == 3)
                                                        {
                                                            anIntArray839[anInt971] = 681;
                                                        }
                                                        if(l3 == 4)
                                                        {
                                                            anIntArray839[anInt971] = 100;
                                                        }
                                                        anIntArray840[anInt971] = class14.id;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.id;
                                                        anInt971++;
                                                    } else
                                                    if(l3 == 4)
                                                    {
                                                        aStringArray897[anInt971] = "Drop @lre@" + class14.name;
                                                        anIntArray839[anInt971] = 100;
                                                        anIntArray840[anInt971] = class14.id;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.id;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            if(class5_1.aBoolean129)
                                            {
                                                aStringArray897[anInt971] = "Use @lre@" + class14.name;
                                                anIntArray839[anInt971] = 102;
                                                anIntArray840[anInt971] = class14.id;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.id;
                                                anInt971++;
                                            }
                                            if(class5_1.aBoolean128 && class14.menu_actions_inventory != null)
                                            {
                                                for(int i4 = 2; i4 >= 0; i4--)
                                                {
                                                    if(class14.menu_actions_inventory[i4] != null)
                                                    {
                                                        aStringArray897[anInt971] = class14.menu_actions_inventory[i4] + " @lre@" + class14.name;
                                                        if(i4 == 0)
                                                        {
                                                            anIntArray839[anInt971] = 694;
                                                        }
                                                        if(i4 == 1)
                                                        {
                                                            anIntArray839[anInt971] = 962;
                                                        }
                                                        if(i4 == 2)
                                                        {
                                                            anIntArray839[anInt971] = 795;
                                                        }
                                                        anIntArray840[anInt971] = class14.id;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.id;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            if(class5_1.options != null)
                                            {
                                                for(int j4 = 4; j4 >= 0; j4--)
                                                {
                                                    if(class5_1.options[j4] != null)
                                                    {
                                                        aStringArray897[anInt971] = class5_1.options[j4] + " @lre@" + class14.name;
                                                        if(j4 == 0)
                                                        {
                                                            anIntArray839[anInt971] = 582;
                                                        }
                                                        if(j4 == 1)
                                                        {
                                                            anIntArray839[anInt971] = 113;
                                                        }
                                                        if(j4 == 2)
                                                        {
                                                            anIntArray839[anInt971] = 555;
                                                        }
                                                        if(j4 == 3)
                                                        {
                                                            anIntArray839[anInt971] = 331;
                                                        }
                                                        if(j4 == 4)
                                                        {
                                                            anIntArray839[anInt971] = 354;
                                                        }
                                                        anIntArray840[anInt971] = class14.id;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.id;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            aStringArray897[anInt971] = "Examine @lre@" + class14.name;
                                            anIntArray839[anInt971] = 1328;
                                            anIntArray840[anInt971] = class14.id;
                                            anIntArray837[anInt971] = k2;
                                            anIntArray838[anInt971] = class5_1.id;
                                            anInt971++;
                                        }
                                    }
                                }
                                k2++;
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12590, " + i + ", " + j + ", " + k + ", " + class5 + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public boolean method31(boolean flag) {
		try {
			aBoolean863 &= flag;
			if (channel == null) {
				return false;
			}
			try {
				int available = channel.available();
				if (available == 0) {
					return false;
				}
				if (packet_opcode == -1) {
					channel.read(incoming_buffer.payload, 0, 1);
					packet_opcode = incoming_buffer.payload[0] & 0xff;
					if (cipher != null) {
						// anInt1170 = anInt1170 + cipher.method545();
					}
					packet_size = Class16.anIntArray398[packet_opcode];
					available--;
				}
				if (packet_size == -1) {
					if (available > 0) {
						channel.read(incoming_buffer.payload, 0, 1);
						packet_size = incoming_buffer.payload[0] & 0xff;
						available--;
					} else {
						return false;
					}
				}
				if (packet_size == -2)
                {
                    if(available > 1)
                    {
                        channel.read(incoming_buffer.payload, 0, 2);
                        incoming_buffer.pointer = 0;
                        packet_size = incoming_buffer.getUnsignedShort();
                        available -= 2;
                    } else
                    {
                        return false;
                    }
                }
                if(available < packet_size)
                {
                    return false;
                }
                incoming_buffer.pointer = 0;
                channel.read(incoming_buffer.payload, 0, packet_size);
                anInt1171 = 0;
                debugOpcode3 = debugOpcode2;
                debugOpcode2 = debugOpcode1;
                debugOpcode1 = packet_opcode;
				if (packet_opcode == Constants.INTERFACE_INVENTORY) {
					int interfaceId = incoming_buffer.getUnsignedShort();
					int inventoryId = incoming_buffer.getUnsignedShort();
					if (active_chat_interface != -1) {
						active_chat_interface = -1;
						inputTaken = true;
					}
					if (user_amount_prompt) {
						user_amount_prompt = false;
						inputTaken = true;
					}
					active_game_interface = interfaceId;
					active_inventory_interface = inventoryId;
					redrawTabArea = true;
					aBoolean1154 = true;
					aBoolean935 = false;
					packet_opcode = -1;
					return true;
				}
				if (packet_opcode == 13) // public statuses
				{
					chat_settings = incoming_buffer.getUnsignedByte();
					pm_settings = incoming_buffer.getUnsignedByte();
					trade_settings = incoming_buffer.getUnsignedByte();
					aBoolean1062 = true;
					inputTaken = true;
					packet_opcode = -1;
					return true;
				}
				if (packet_opcode == 195) // unknown
				{
					if (anInt1027 == 12) {
						redrawTabArea = true;
					}
					anInt936 = incoming_buffer.getUnsignedByte();
					packet_opcode = -1;
					return true;
				}
				if (packet_opcode == 46) // unknown
				{
					if (anInt1027 == 12) {
						redrawTabArea = true;
					}
					anInt1205 = incoming_buffer.getSignedShort();
					packet_opcode = -1;
					return true;
				}
                if(packet_opcode == 59) // label
                {
                    int interfaceId = incoming_buffer.getUnsignedShort();
                    String text = incoming_buffer.getRSString();
                    Interface.interfaces[interfaceId].message = text;
                    if(Interface.interfaces[interfaceId].parentId == sidebarInterfaces[anInt1027])
                    {
                        redrawTabArea = true;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 120) // unknown
                {
                    anInt1115 = incoming_buffer.getUnsignedShort();
                    anInt1089 = incoming_buffer.getUnsignedByte();
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 79) // set interface offset
                {
                    int interfaceId = incoming_buffer.getUnsignedShort();
                    int x = incoming_buffer.getSignedShort();
                    int y = incoming_buffer.getSignedShort();
                    Interface iface = Interface.interfaces[interfaceId];
                    iface.offset_x = x;
                    iface.offset_y = y;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.OPEN_TAB) // forceTab
                {
                    int tabIndex = incoming_buffer.getUnsignedShort();
                    openTab(tabIndex);
                    if(active_chat_interface != -1)
                    {
                        active_chat_interface = -1;
                        inputTaken = true;
                    }
                    if(user_amount_prompt)
                    {
                        user_amount_prompt = false;
                        inputTaken = true;
                    }
                    active_inventory_interface = tabIndex;
                    redrawTabArea = true;
                    aBoolean1154 = true;
                    active_game_interface = -1;
                    aBoolean935 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 115) // unknown (even in 317)
                {
                    anInt1005 = incoming_buffer.getUnsignedByte();
                    if(anInt1005 == 1)
                    {
                        anInt901 = incoming_buffer.getUnsignedShort();
                    }
                    if(anInt1005 >= 2 && anInt1005 <= 6)
                    {
                        if(anInt1005 == 2)
                        {
                            anInt1251 = 64;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 3)
                        {
                            anInt1251 = 0;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 4)
                        {
                            anInt1251 = 128;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 5)
                        {
                            anInt1251 = 64;
                            anInt1252 = 0;
                        }
                        if(anInt1005 == 6)
                        {
                            anInt1251 = 64;
                            anInt1252 = 128;
                        }
                        anInt1005 = 2;
                        anInt1248 = incoming_buffer.getUnsignedShort();
                        anInt1249 = incoming_buffer.getUnsignedShort();
                        anInt1250 = incoming_buffer.getUnsignedByte();
                    }
                    if(anInt1005 == 10)
                    {
                        anInt909 = incoming_buffer.getUnsignedShort();
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 211) // 
                {
                    int interface_id = incoming_buffer.getUnsignedShort();
                    int j10 = incoming_buffer.getSignedShort();
                    Interface rsinterface = Interface.interfaces[interface_id];
                    rsinterface.anInt153 = j10;
                    if(j10 == -1)
                    {
                        rsinterface.anInt103 = 0;
                        rsinterface.anInt104 = 0;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 136)
                {
                    anInt848 = incoming_buffer.getUnsignedByte();
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 91 || packet_opcode == 117 || packet_opcode == 83 || packet_opcode == 176 || packet_opcode == 233 || packet_opcode == 87 || packet_opcode == 71 || packet_opcode == 60 || packet_opcode == 106 || packet_opcode == 194 || packet_opcode == 90)
                {
                    method67(incoming_buffer, -6563, packet_opcode);
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 28)
                {
                    int k1 = incoming_buffer.getUnsignedShort();
                    Interface class5 = Interface.interfaces[k1];
                    for(int j15 = 0; j15 < class5.item_id.length; j15++)
                    {
                        class5.item_id[j15] = -1;
                        class5.item_id[j15] = 0;
                    }
                    packet_opcode = -1;
                    return true;
                }
                
                // AOE ground item update
				if (packet_opcode == 144) {
					local_x = incoming_buffer.getUnsignedByte();
					local_y = incoming_buffer.getUnsignedByte();

					for (int x = local_x; x < local_x + 8; x++) {
						for (int y = local_y; y < local_y + 8; y++) {
							if (groundItems[height_level][x][y] != null) {
								groundItems[height_level][x][y] = null;
								updateGroundItems(x, y);
							}
						}
					}
					for (Class44_Sub1 class44_sub1 = (Class44_Sub1) deque.peek(); class44_sub1 != null; class44_sub1 = (Class44_Sub1) deque.next()) {
						if (class44_sub1.anInt1325 >= local_x && class44_sub1.anInt1325 < local_x + 8 && class44_sub1.anInt1326 >= local_y && class44_sub1.anInt1326 < local_y + 8 && class44_sub1.anInt1323 == height_level) {
							class44_sub1.anInt1334 = 0;
						}
					}
					packet_opcode = -1;
					return true;
				}
				if (packet_opcode == 154) {
					redrawTabArea = true;
					int skill = incoming_buffer.getUnsignedByte();
					int xp = incoming_buffer.getUnsignedInt();
					int level = incoming_buffer.getUnsignedByte();
					experience[skill] = xp;
					levels[skill] = level;
					absoluteLevel[skill] = 1;
					for (int index = 0; index < 98; index++) {
						if (xp >= experienceTable[index]) {
							absoluteLevel[skill] = index + 2;
						}
					}
					packet_opcode = -1;
					return true;
				}
                if(packet_opcode == 181)
                {
                    anInt833 = incoming_buffer.getUnsignedByte();
                    if(anInt833 == anInt1027)
                    {
                        if(anInt833 == 3)
                        {
                            anInt1027 = 1;
                        } else
                        {
                            anInt1027 = 3;
                        }
                        redrawTabArea = true;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 73)
                {
                    aBoolean829 = true;
                    anInt1118 = incoming_buffer.getUnsignedByte();
                    anInt1119 = incoming_buffer.getUnsignedByte();
                    anInt1120 = incoming_buffer.getUnsignedShort();
                    anInt1121 = incoming_buffer.getUnsignedByte();
                    anInt1122 = incoming_buffer.getUnsignedByte();
                    if(anInt1122 >= 100)
                    {
                        camera_x = anInt1118 * 128 + 64;
                        camera_y = anInt1119 * 128 + 64;
                        anInt876 = method51(false, camera_y, camera_x, height_level) - anInt1120;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.PLAYER_SYNCHRONIZATION)
                {
                    synchronize_players(packet_size, incoming_buffer);
                    aBoolean1275 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.NPC_CHAT_MODEL)
                {
                    int interface_id = incoming_buffer.getUnsignedShort();
                    int type = incoming_buffer.getUnsignedShort();
                    
                    Interface.interfaces[interface_id].sprite_type = 2;
                    Interface.interfaces[interface_id].sprite_id = type;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.LOGOUT)
                {
                    logout();
                    packet_opcode = -1;
                    return false;
                }
                if(packet_opcode == Constants.INTERFACE_OPEN_GAME)
                {
                    int interface_id = incoming_buffer.getUnsignedShort();
                    openTab(interface_id);
                    if(active_inventory_interface != -1)
                    {
                        active_inventory_interface = -1;
                        redrawTabArea = true;
                        aBoolean1154 = true;
                    }
                    if(active_chat_interface != -1)
                    {
                        active_chat_interface = -1;
                        inputTaken = true;
                    }
                    if(user_amount_prompt)
                    {
                        user_amount_prompt = false;
                        inputTaken = true;
                    }
                    active_game_interface = interface_id;
                    aBoolean935 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 168) // friends list
                {
                    long l2 = incoming_buffer.getLong();
                    int l15 = incoming_buffer.getUnsignedByte();
                    String s7 = StringUtil.format(StringUtil.from_hash(l2, true), true);
                    for(int i21 = 0; i21 < anInt1104; i21++)
                    {
                        if(l2 != aLongArray979[i21])
                        {
                            continue;
                        }
                        if(anIntArray894[i21] != l15)
                        {
                            anIntArray894[i21] = l15;
                            redrawTabArea = true;
                            if(l15 > 0)
                            {
                                message(5, s7 + " has logged in.", "");
                            }
                            if(l15 == 0)
                            {
                                message(5, s7 + " has logged out.", "");
                            }
                        }
                        s7 = null;
                        break;
                    }
                    if(s7 != null && anInt1104 < 200)
                    {
                        aLongArray979[anInt1104] = l2;
                        aStringArray1044[anInt1104] = s7;
                        anIntArray894[anInt1104] = l15;
                        anInt1104++;
                        redrawTabArea = true;
                    }
                    for(boolean flag6 = false; !flag6;)
                    {
                        flag6 = true;
                        for(int l24 = 0; l24 < anInt1104 - 1; l24++)
                        {
                            if(anIntArray894[l24] != anInt1232 && anIntArray894[l24 + 1] == anInt1232 || anIntArray894[l24] == 0 && anIntArray894[l24 + 1] != 0)
                            {
                                int i26 = anIntArray894[l24];
                                anIntArray894[l24] = anIntArray894[l24 + 1];
                                anIntArray894[l24 + 1] = i26;
                                String s10 = aStringArray1044[l24];
                                aStringArray1044[l24] = aStringArray1044[l24 + 1];
                                aStringArray1044[l24 + 1] = s10;
                                long l27 = aLongArray979[l24];
                                aLongArray979[l24] = aLongArray979[l24 + 1];
                                aLongArray979[l24 + 1] = l27;
                                redrawTabArea = true;
                                flag6 = false;
                            }
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 164)
                {
                    absolute_x = 0;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 243)
                {
                    long l3 = incoming_buffer.getLong();
                    int i16 = incoming_buffer.getUnsignedInt();
                    int i19 = incoming_buffer.getUnsignedByte();
                    boolean flag2 = false;
                    for(int i23 = 0; i23 < 100; i23++)
                    {
                        if(anIntArray1016[i23] != i16)
                        {
                            continue;
                        }
                        flag2 = true;
                        break;
                    }
                    if(i19 <= 1)
                    {
                        for(int i25 = 0; i25 < anInt957; i25++)
                        {
                            if(aLongArray1254[i25] != l3)
                            {
                                continue;
                            }
                            flag2 = true;
                            break;
                        }
                    }
                    if(!flag2 && anInt1245 == 0)
                    {
                        try
                        {
                            anIntArray1016[anInt928] = i16;
                            anInt928 = (anInt928 + 1) % 100;
                            String s8 = RS2BufferUtils.method556((byte)-94, incoming_buffer, packet_size - 13);
                            s8 = Class41.method352(s8, anInt1242);
                            if(i19 == 2 || i19 == 3)
                            {
                                message(7, s8, "@cr2@" + StringUtil.format(StringUtil.from_hash(l3, true), true));
                            } else
                            if(i19 == 1)
                            {
                                message(7, s8, "@cr1@" + StringUtil.format(StringUtil.from_hash(l3, true), true));
                            } else
                            {
                                message(3, s8, StringUtil.format(StringUtil.from_hash(l3, true), true));
                            }
                        }
                        catch(Exception exception1)
                        {
                            signlink.reporterror("cde1");
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 208)
                {
                    int i3 = incoming_buffer.getUnsignedByte();
                    int j11 = incoming_buffer.getUnsignedByte();
                    int j16 = incoming_buffer.getUnsignedByte();
                    int j19 = incoming_buffer.getUnsignedByte();
                    aBooleanArray1209[i3] = true;
                    anIntArray976[i3] = j11;
                    anIntArray1206[i3] = j16;
                    anIntArray943[i3] = j19;
                    anIntArray1001[i3] = 0;
                    packet_opcode = -1;
                    return true;
                }
				if (packet_opcode == 107) { //invstack item on interface
					redrawTabArea = true;
					int interface_id = incoming_buffer.getUnsignedShort();
					Interface rs_interface = Interface.interfaces[interface_id];
					int length = incoming_buffer.getUnsignedShort();
					for (int index = 0; index < length; index++) {
						rs_interface.item_id[index] = incoming_buffer.getUnsignedShort();
						int stack_size = incoming_buffer.getUnsignedByte();
						if (stack_size == 255) {
							stack_size = incoming_buffer.getUnsignedInt();
						}
						rs_interface.item_count[index] = stack_size;
					}
					for (int index = length; index < rs_interface.item_id.length; index++) {
						rs_interface.item_id[index] = 0;
						rs_interface.item_count[index] = 0;
					}
					packet_opcode = -1;
					return true;
				}
                if(packet_opcode == 12)
                {
                    int k3 = incoming_buffer.getSignedShort();
                    dialog_id = k3;
                    inputTaken = true;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.MAP_REGION)
                {
                    int x = incoming_buffer.getUnsignedShort();
                    int y = incoming_buffer.getUnsignedShort();
                    if(region_x == x && region_y == y && game_state == 2)
                    {
                        packet_opcode = -1;
                        return true;
                    }
                    region_x = x;
                    region_y = y;
                    
                    base_x = (region_x - 6) * 8;
                    base_y = (region_y - 6) * 8;
                    
                    aBoolean906 = false;
                    if((region_x / 8 == 48 || region_x / 8 == 49) && region_y / 8 == 48)
                    {
                        aBoolean906 = true;
                    }
                    if(region_x / 8 == 48 && region_y / 8 == 148)
                    {
                        aBoolean906 = true;
                    }
                    
                    game_state = 1;
                    aLong1070 = System.currentTimeMillis();
                    aClass34_1197.method272((byte)5);
                    plain_font.draw_centered_string("Loading - please wait.", 151, 257, 0);
                    plain_font.draw_centered_string("Loading - please wait.", 150, 256, 0xffffff);
                    aClass34_1197.method273(-781, 4, 4, super.graphics);
                    int region = 0;
                    for(int tile_x = (region_x - 6) / 8; tile_x <= (region_x + 6) / 8; tile_x++)
                    {
                        for(int tile_y = (region_y - 6) / 8; tile_y <= (region_y + 6) / 8; tile_y++)
                        {
                            region++;
                        }
                    }
                    map_files = new byte[region][];
                    landscape_files = new byte[region][];
                    region_identifiers = new int[region];
                    anIntArray1040 = new int[region];
                    anIntArray1041 = new int[region];
                    region = 0;
                    for(int tile_x = (region_x - 6) / 8; tile_x <= (region_x + 6) / 8; tile_x++)
                    {
                        for(int tile_y = (region_y - 6) / 8; tile_y <= (region_y + 6) / 8; tile_y++)
                        {
                            region_identifiers[region] = (tile_x << 8) + tile_y;
                            if(aBoolean906 && (tile_y == 49 || tile_y == 149 || tile_y == 147 || tile_x == 50 || tile_x == 49 && tile_y == 47))
                            {
                                anIntArray1040[region] = -1;
                                anIntArray1041[region] = -1;
                                region++;
                            } else
                            {
                                int map_id = anIntArray1040[region] = cache.getRegionFile(0, tile_x, tile_y);
                                if(map_id != -1)
                                {
                                    cache.load(3, map_id);
                                }
                                
                                int landscape_id = anIntArray1041[region] = cache.getRegionFile(1, tile_x, tile_y);
                                if(landscape_id != -1)
                                {
                                    cache.load(3, landscape_id);
                                }
                                region++;
                            }
                        }
                    }
                    int x_offset = base_x - last_base_x;
                    int y_offset = base_y - last_base_y;
                    last_base_x = base_x;
                    last_base_y = base_y;
                    for(int k26 = 0; k26 < 16384; k26++)
                    {
                        NPC npc = local_npcs[k26];
                        if(npc != null)
                        {
                            for(int i27 = 0; i27 < 10; i27++)
                            {
                                npc.walking_queue_x[i27] -= x_offset;
                                npc.walking_queue_y[i27] -= y_offset;
                            }
                            npc.anInt1615 -= x_offset * 128;
                            npc.anInt1616 -= y_offset * 128;
                        }
                    }
                    for(int l26 = 0; l26 < anInt1223; l26++)
                    {
                        PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[l26];
                        if(class44_sub3_sub4_sub6_sub1 != null)
                        {
                            for(int j27 = 0; j27 < 10; j27++)
                            {
                                ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).walking_queue_x[j27] -= x_offset;
                                ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).walking_queue_y[j27] -= y_offset;
                            }
                            class44_sub3_sub4_sub6_sub1.anInt1615 -= x_offset * 128;
                            class44_sub3_sub4_sub6_sub1.anInt1616 -= y_offset * 128;
                        }
                    }
                    aBoolean1275 = true;
                    byte byte1 = 0;
                    byte byte2 = 104;
                    byte byte3 = 1;
                    if(x_offset < 0)
                    {
                        byte1 = 103;
                        byte2 = -1;
                        byte3 = -1;
                    }
                    byte byte4 = 0;
                    byte byte5 = 104;
                    byte byte6 = 1;
                    if(y_offset < 0)
                    {
                        byte4 = 103;
                        byte5 = -1;
                        byte6 = -1;
                    }
                    for(int k27 = byte1; k27 != byte2; k27 += byte3)
                    {
                        for(int i28 = byte4; i28 != byte5; i28 += byte6)
                        {
                            int j28 = k27 + x_offset;
                            int k28 = i28 + y_offset;
                            for(int l28 = 0; l28 < 4; l28++)
                            {
                                if(j28 >= 0 && k28 >= 0 && j28 < 104 && k28 < 104)
                                {
                                    groundItems[l28][k27][i28] = groundItems[l28][j28][k28];
                                } else
                                {
                                    groundItems[l28][k27][i28] = null;
                                }
                            }
                        }
                    }
                    for(Class44_Sub1 class44_sub1_1 = (Class44_Sub1)deque.peek(); class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1)deque.next())
                    {
                        class44_sub1_1.anInt1325 -= x_offset;
                        class44_sub1_1.anInt1326 -= y_offset;
                        if(class44_sub1_1.anInt1325 < 0 || class44_sub1_1.anInt1326 < 0 || class44_sub1_1.anInt1325 >= 104 || class44_sub1_1.anInt1326 >= 104)
                        {
                            class44_sub1_1.destroy();
                        }
                    }
                    if(absolute_x != 0)
                    {
                        absolute_x -= x_offset;
                        absolute_y -= y_offset;
                    }
                    aBoolean829 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.SET_TAB)
                {
                    int interfaceId = incoming_buffer.getUnsignedShort();
                    int index = incoming_buffer.getUnsignedByte();
                    if(interfaceId == 65535)
                    {
                        interfaceId = -1;
                    }
                    sidebarInterfaces[index] = interfaceId;
                    redrawTabArea = true;
                    aBoolean1154 = true;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 184)
                {
                    int k4 = incoming_buffer.getUnsignedShort();
                    int i12 = incoming_buffer.getUnsignedShort();
                    Interface class5_4 = Interface.interfaces[k4];
                    if(class5_4 != null && class5_4.type == 0)
                    {
                        if(i12 < 0)
                        {
                            i12 = 0;
                        }
                        if(i12 > class5_4.anInt119 - class5_4.anInt111)
                        {
                            i12 = class5_4.anInt119 - class5_4.anInt111;
                        }
                        class5_4.anInt120 = i12;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 204)
                {
                    anInt998 = incoming_buffer.getUnsignedShort() * 30;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 253)
                {
                    anInt1231 = incoming_buffer.getUnsignedInt();
                    anInt947 = incoming_buffer.getUnsignedShort();
                    anInt869 = incoming_buffer.getUnsignedByte();
                    anInt1023 = incoming_buffer.getUnsignedShort();
                    anInt917 = incoming_buffer.getUnsignedByte();
                    if(anInt1231 != 0 && active_game_interface == -1)
                    {
                        signlink.dnslookup(StringUtil.method553(anInt1231, (byte)1));
                        method28(3);
                        char c = '\u028A';
                        if(anInt869 != 201 || anInt917 == 1)
                        {
                            c = '\u028F';
                        }
                        aString939 = "";
                        aBoolean987 = false;
                        for(int j12 = 0; j12 < Interface.interfaces.length; j12++)
                        {
                            if(Interface.interfaces[j12] == null || Interface.interfaces[j12].anInt109 != c)
                            {
                                continue;
                            }
                            active_game_interface = Interface.interfaces[j12].parentId;
                            break;
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 30)
                {
                    int l4 = incoming_buffer.getUnsignedShort();
                    Interface.interfaces[l4].sprite_type = 3;
                    if(player_appearance.mob_definition == null)
                    {
                        Interface.interfaces[l4].sprite_id = (player_appearance.anIntArray1677[0] << 24) + (player_appearance.anIntArray1677[4] << 18) + (player_appearance.anIntArray1676[0] << 12) + (player_appearance.anIntArray1676[8] << 6) + player_appearance.anIntArray1676[11];
                    } else
                    {
                        Interface.interfaces[l4].sprite_id = (int)(0x12345678L + player_appearance.mob_definition.aLong281);
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 23)
                {
                    if(active_inventory_interface != -1)
                    {
                        active_inventory_interface = -1;
                        redrawTabArea = true;
                        aBoolean1154 = true;
                    }
                    if(active_chat_interface != -1)
                    {
                        active_chat_interface = -1;
                        inputTaken = true;
                    }
                    if(user_amount_prompt)
                    {
                        user_amount_prompt = false;
                        inputTaken = true;
                    }
                    active_game_interface = -1;
                    aBoolean935 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 21)
                {
                    int i5 = incoming_buffer.getUnsignedByte();
                    int k12 = incoming_buffer.getUnsignedByte();
                    String s6 = incoming_buffer.getRSString();
                    if(i5 >= 1 && i5 <= 5)
                    {
                        if(s6.equalsIgnoreCase("null"))
                        {
                            s6 = null;
                        }
                        aStringArray919[i5 - 1] = s6;
                        aBooleanArray920[i5 - 1] = k12 == 0;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 189)
                {
                    anInt1027 = incoming_buffer.getUnsignedByte();
                    redrawTabArea = true;
                    aBoolean1154 = true;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 196)
                {
                    String s = incoming_buffer.getRSString();
                    if(s.endsWith(":tradereq:"))
                    {
                        String s3 = s.substring(0, s.indexOf(":"));
                        long l17 = StringUtil.hash(s3);
                        boolean flag3 = false;
                        for(int l23 = 0; l23 < anInt957; l23++)
                        {
                            if(aLongArray1254[l23] != l17)
                            {
                                continue;
                            }
                            flag3 = true;
                            break;
                        }
                        if(!flag3 && anInt1245 == 0)
                        {
                            message(4, "wishes to trade with you.", s3);
                        }
                    } else
                    if(s.endsWith(":duelreq:"))
                    {
                        String s4 = s.substring(0, s.indexOf(":"));
                        long l18 = StringUtil.hash(s4);
                        boolean flag4 = false;
                        for(int i24 = 0; i24 < anInt957; i24++)
                        {
                            if(aLongArray1254[i24] != l18)
                            {
                                continue;
                            }
                            flag4 = true;
                            break;
                        }
                        if(!flag4 && anInt1245 == 0)
                        {
                            message(8, "wishes to duel with you.", s4);
                        }
                    } else
                    if(s.endsWith(":chalreq:"))
                    {
                        String s5 = s.substring(0, s.indexOf(":"));
                        long l19 = StringUtil.hash(s5);
                        boolean flag5 = false;
                        for(int j24 = 0; j24 < anInt957; j24++)
                        {
                            if(aLongArray1254[j24] != l19)
                            {
                                continue;
                            }
                            flag5 = true;
                            break;
                        }
                        if(!flag5 && anInt1245 == 0)
                        {
                            String s9 = s.substring(s.indexOf(":") + 1, s.length() - 9);
                            message(8, s9, s5);
                        }
                    } else
                    {
                        message(0, s, "");
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 18)
                {
                    int interfaceId = incoming_buffer.getUnsignedShort();
                    int itemId = incoming_buffer.getUnsignedShort();
                    int zoom = incoming_buffer.getUnsignedShort();
                    if(itemId == 65535)
                    {
                        Interface.interfaces[interfaceId].sprite_type = 0;
                        packet_opcode = -1;
                        return true;
                    } else
                    {
                        ItemDefinition definition = ItemDefinition.get(itemId);
                        Interface.interfaces[interfaceId].sprite_type = 4;
                        Interface.interfaces[interfaceId].sprite_id = itemId;
                        Interface.interfaces[interfaceId].anInt156 = definition.model_rotation_x;
                        Interface.interfaces[interfaceId].anInt157 = definition.model_rotation_y;
                        Interface.interfaces[interfaceId].anInt155 = (definition.model_zoom * 100) / zoom;
                        packet_opcode = -1;
                        return true;
                    }
                }
                if(packet_opcode == 187)
                {
                    int k5 = incoming_buffer.getUnsignedShort();
                    if(k5 == 65535)
                    {
                        k5 = -1;
                    }
                    if(k5 != anInt963 && aBoolean1057 && !highmem && anInt942 == 0)
                    {
                        anInt1190 = k5;
                        aBoolean1191 = true;
                        cache.load(2, anInt1190);
                    }
                    anInt963 = k5;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 29)
                {
                    int l5 = incoming_buffer.getUnsignedShort();
                    int i13 = incoming_buffer.getUnsignedShort();
                    if(aBoolean1057 && !highmem)
                    {
                        anInt1190 = l5;
                        aBoolean1191 = false;
                        cache.load(2, anInt1190);
                        anInt942 = i13;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 177)
                {
                    int i6 = incoming_buffer.getUnsignedShort();
                    int j13 = incoming_buffer.getUnsignedByte();
                    int j17 = incoming_buffer.getUnsignedShort();
                    if(aBoolean1050 && !highmem && anInt968 < 50)
                    {
                        anIntArray846[anInt968] = i6;
                        anIntArray1006[anInt968] = j13;
                        anIntArray1193[anInt968] = j17 + SoundEffect.delays[i6];
                        anInt968++;
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 112)
                {
                    local_x = incoming_buffer.getUnsignedByte();
                    local_y = incoming_buffer.getUnsignedByte();
                    while(incoming_buffer.pointer < packet_size)
                    {
                        int j6 = incoming_buffer.getUnsignedByte();
                        method67(incoming_buffer, -6563, j6);
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 172)
                {
                    for(int k6 = 0; k6 < settings.length; k6++)
                    {
                        if(settings[k6] != anIntArray1024[k6])
                        {
                            settings[k6] = anIntArray1024[k6];
                            setConfigurationValue(true, k6);
                            redrawTabArea = true;
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 160)
                {
                    int l6 = incoming_buffer.getUnsignedShort();
                    int k13 = incoming_buffer.getUnsignedShort();
                    int k17 = k13 >> 10 & 0x1f;
                    int j20 = k13 >> 5 & 0x1f;
                    int j22 = k13 & 0x1f;
                    Interface.interfaces[l6].textColor = (k17 << 19) + (j20 << 11) + (j22 << 3);
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 47)
                {
                    anInt957 = packet_size / 8;
                    for(int i7 = 0; i7 < anInt957; i7++)
                    {
                        aLongArray1254[i7] = incoming_buffer.getLong();
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 65)
                {
                    synchronize_npcs(packet_size, incoming_buffer);
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 222)
                {
                    int j7 = incoming_buffer.getUnsignedShort();
                    int l13 = incoming_buffer.getUnsignedShort();
                    Interface.interfaces[j7].sprite_type = 1;
                    Interface.interfaces[j7].sprite_id = l13;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 127)
                {
                    int k7 = incoming_buffer.getSignedShort();
                    if(k7 >= 0)
                    {
                        openTab(k7);
                    }
                    anInt924 = k7;
                    packet_opcode = -1;
                    return true;
                }
				if (packet_opcode == 75) { // "sendConfig"
					int key = incoming_buffer.getUnsignedShort();
					byte value = incoming_buffer.getSignedByte();
					anIntArray1024[key] = value;
					if (settings[key] != value) {
						settings[key] = value;
						setConfigurationValue(true, key);
						redrawTabArea = true;
						if (dialog_id != -1) {
							inputTaken = true;
						}
					}
					packet_opcode = -1;
					return true;
				}
                if(packet_opcode == 82)
                {
                    aBoolean829 = true;
                    anInt989 = incoming_buffer.getUnsignedByte();
                    anInt990 = incoming_buffer.getUnsignedByte();
                    anInt991 = incoming_buffer.getUnsignedShort();
                    anInt992 = incoming_buffer.getUnsignedByte();
                    anInt993 = incoming_buffer.getUnsignedByte();
                    if(anInt993 >= 100)
                    {
                        int i8 = anInt989 * 128 + 64;
                        int i14 = anInt990 * 128 + 64;
                        int i18 = method51(false, i14, i8, height_level) - anInt991;
                        int k20 = i8 - camera_x;
                        int k22 = i18 - anInt876;
                        int k24 = i14 - camera_y;
                        int l25 = (int)Math.sqrt(k20 * k20 + k24 * k24);
                        anInt878 = (int)(Math.atan2(k22, l25) * 325.94900000000001D) & 0x7ff;
                        anInt879 = (int)(Math.atan2(k20, k24) * -325.94900000000001D) & 0x7ff;
                        if(anInt878 < 128)
                        {
                            anInt878 = 128;
                        }
                        if(anInt878 > 383)
                        {
                            anInt878 = 383;
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 81)
                {
                    int interfaceId = incoming_buffer.getUnsignedShort();
                    openTab(interfaceId);
                    if(active_inventory_interface != -1)
                    {
                        active_inventory_interface = -1;
                        redrawTabArea = true;
                        aBoolean1154 = true;
                    }
                    active_chat_interface = interfaceId;
                    inputTaken = true;
                    active_game_interface = -1;
                    aBoolean935 = false;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 138)
                {
                    int k8 = incoming_buffer.getUnsignedShort();
                    boolean flag1 = incoming_buffer.getUnsignedByte() == 1;
                    Interface.interfaces[k8].aBoolean121 = flag1;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 247)
                {
                    anInt1112 = incoming_buffer.getUnsignedByte();
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 235)
                {
                    anInt1105 = incoming_buffer.getUnsignedByte();
                    redrawTabArea = true;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 76)
                {
                    redrawTabArea = true;
                    int l8 = incoming_buffer.getUnsignedShort();
                    Interface class5_2 = Interface.interfaces[l8];
                    while(incoming_buffer.pointer < packet_size)
                    {
                        int j18 = incoming_buffer.getUnsignedShort();
                        int l20 = incoming_buffer.getUnsignedShort();
                        int l22 = incoming_buffer.getUnsignedByte();
                        if(l22 == 255)
                        {
                            l22 = incoming_buffer.getUnsignedInt();
                        }
                        if(j18 >= 0 && j18 < class5_2.item_id.length)
                        {
                            class5_2.item_id[j18] = l20;
                            class5_2.item_count[j18] = l22;
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 201)
                {
                    for(int i9 = 0; i9 < player_models.length; i9++)
                    {
                        if(player_models[i9] != null)
                        {
                            player_models[i9].animation_id = -1;
                        }
                    }
                    for(int j14 = 0; j14 < local_npcs.length; j14++)
                    {
                        if(local_npcs[j14] != null)
                        {
                            local_npcs[j14].animation_id = -1;
                        }
                    }
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == 35)
                {
                    aBoolean1222 = false;
                    user_amount_prompt = true;
                    aString1092 = "";
                    inputTaken = true;
                    packet_opcode = -1;
                    return true;
                }
                if(packet_opcode == Constants.INITIALIZE)
                {
                    aBoolean829 = false;
                    for(int j9 = 0; j9 < 5; j9++)
                    {
                        aBooleanArray1209[j9] = false;
                    }
                    packet_opcode = -1;
                    return true;
                }
				if (packet_opcode == 97) // "sendconfig"
				{
					int key = incoming_buffer.getUnsignedShort();
					int value = incoming_buffer.getUnsignedInt();
					anIntArray1024[key] = value;
					if (settings[key] != value) {
						settings[key] = value;
						setConfigurationValue(true, key);
						redrawTabArea = true;
						if (dialog_id != -1) {
							inputTaken = true;
						}
					}
					packet_opcode = -1;
					return true;
				}
                if(packet_opcode == 155)
                {
                    local_x = incoming_buffer.getUnsignedByte();
                    local_y = incoming_buffer.getUnsignedByte();
                    packet_opcode = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + packet_opcode + "," + packet_size + " - " + debugOpcode2 + "," + debugOpcode3);
                logout();
            }
            catch(IOException _ex)
            {
                draw_disconnection_text((byte)7);
            }
            catch(Exception exception)
            {
                String s1 = "T2 - " + packet_opcode + "," + debugOpcode2 + "," + debugOpcode3 + " - " + packet_size + "," + (base_x + ((RenderingHints) (player_appearance)).walking_queue_x[0]) + "," + (base_y + ((RenderingHints) (player_appearance)).walking_queue_y[0]) + " - ";
                for(int l14 = 0; l14 < packet_size && l14 < 50; l14++)
                {
                    s1 = s1 + incoming_buffer.payload[l14] + ",";
                }
                signlink.reporterror(s1);
                logout();
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("74182, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method32(String s)
    {
        System.out.println(s);
        try
        {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        do
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex)
            {
            }
        } while(true);
    }

    public void method33(byte byte0, byte abyte0[], boolean flag)
    {
        try
        {
            if(byte0 != 27)
            {
                packet_opcode = -1;
            }
            signlink.midifade = flag ? 1 : 0;
            signlink.midisave(abyte0, abyte0.length);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89004, " + byte0 + ", " + abyte0 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Socket connect(int i)
        throws IOException
    {
        if(signlink.mainapp != null)
        {
            return signlink.opensocket(i);
        } else
        {
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
        }
    }

    public void method6()
    {
        method13(false, 20, "Starting up");
        if(signlink.sunjava)
        {
            super.anInt7 = 5;
        }
        if(aBoolean896)
        {
            aBoolean1236 = true;
            return;
        }
        aBoolean896 = true;
        boolean flag = false;
        String s = method102(974);
        if(s.endsWith("jagex.com"))
        {
            flag = true;
        }
        if(s.endsWith("runescape.com"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.2"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.246"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.247"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.249"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.253"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.254"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.242"))
        {
            flag = true;
        }
        if(s.endsWith("127.0.0.1"))
        {
            flag = true;
        }
        if(!flag)
        {
            aBoolean820 = true;
            return;
        }
        if(signlink.cache_dat != null)
        {
            for(int i = 0; i < 5; i++)
            {
                aClass45Array1208[i] = new Class45(signlink.cache_dat, 0x7a120, signlink.cache_idx[i], i + 1, (byte)4);
            }
        }
        try
        {
            method27(aByte949);
            aClass47_1117 = method125((byte)-9, "title screen", 1, "title", 25, anIntArray1051[1]);
            aClass44_Sub3_Sub1_Sub4_1255 = new RSFont(9, "p11_full", false, aClass47_1117);
            plain_font = new RSFont(9, "p12_full", false, aClass47_1117);
            chat_area_graphics = new RSFont(9, "b12_full", false, aClass47_1117);
            aClass44_Sub3_Sub1_Sub4_1258 = new RSFont(9, "q8_full", true, aClass47_1117);
            method68(0);
            method48(-532);
            Archive class47 = method125((byte)-9, "config", 2, "config", 30, anIntArray1051[2]);
            Archive class47_1 = method125((byte)-9, "interface", 3, "interface", 35, anIntArray1051[3]);
            Archive class47_2 = method125((byte)-9, "2d graphics", 4, "media", 40, anIntArray1051[4]);
            Archive class47_3 = method125((byte)-9, "textures", 6, "textures", 45, anIntArray1051[6]);
            Archive class47_4 = method125((byte)-9, "chat system", 7, "wordenc", 50, anIntArray1051[7]);
            Archive class47_5 = method125((byte)-9, "sound effects", 8, "sounds", 55, anIntArray1051[8]);
            aByteArrayArrayArray871 = new byte[4][104][104];
            anIntArrayArrayArray865 = new int[4][105][105];
            aClass36_1192 = new Class36(104, 4, anIntArrayArrayArray865, 104, anInt1246);
            for(int j = 0; j < 4; j++)
            {
                planes[j] = new CollisionMap(104, 104);
            }
            aClass44_Sub3_Sub1_Sub2_913 = new Sprite(512, 512);
            Archive class47_6 = method125((byte)-9, "update list", 5, "versionlist", 60, anIntArray1051[5]);
            method13(false, 60, "Connecting to update server");
            cache = new Cache();
            cache.method383(class47_6, this);
            AnimationFrame.create(cache.method386(7));
            Model.method503(cache.method385(0, (byte)7), cache);
            /*if(!aBoolean1235)
            {
                anInt1190 = 0;
                try
                {
                    anInt1190 = Integer.parseInt(getParameter("music"));
                }
                catch(Exception _ex)
                {
                }
                aBoolean1191 = true;
                aClass43_Sub1_814.method392(2, anInt1190);
                while(aClass43_Sub1_814.method393() > 0)
                {
                    method93(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex)
                    {
                    }
                    if(aClass43_Sub1_814.anInt1313 > 3)
                    {
                        method32("ondemand");
                        return;
                    }
                }
            }*/
            method13(false, 65, "Requesting animations");
            int k = cache.method385(1, (byte)7);
            for(int i1 = 0; i1 < k; i1++)
            {
                cache.load(1, i1);
            }
            while(cache.size() > 0)
            {
                int j1 = k - cache.size();
                if(j1 > 0)
                {
                    method13(false, 65, "Loading animations - " + (j1 * 100) / k + "%");
                }
                method93(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex)
                {
                }
                if(cache.anInt1313 > 3)
                {
                    method32("ondemand");
                    return;
                }
            }
            method13(false, 70, "Requesting models");
            k = cache.method385(0, (byte)7);
            for(int k1 = 0; k1 < k; k1++)
            {
                int l1 = cache.method390(k1, -600);
                if((l1 & 1) != 0)
                {
                    cache.load(0, k1);
                }
            }
            k = cache.size();
            while(cache.size() > 0)
            {
                int i2 = k - cache.size();
                if(i2 > 0)
                {
                    method13(false, 70, "Loading models - " + (i2 * 100) / k + "%");
                }
                method93(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex)
                {
                }
            }
            if(aClass45Array1208[0] != null)
            {
                method13(false, 75, "Requesting maps");
                cache.load(3, cache.getRegionFile(0, 47, 48));
                cache.load(3, cache.getRegionFile(1, 47, 48));
                cache.load(3, cache.getRegionFile(0, 48, 48));
                cache.load(3, cache.getRegionFile(1, 48, 48));
                cache.load(3, cache.getRegionFile(0, 49, 48));
                cache.load(3, cache.getRegionFile(1, 49, 48));
                cache.load(3, cache.getRegionFile(0, 47, 47));
                cache.load(3, cache.getRegionFile(1, 47, 47));
                cache.load(3, cache.getRegionFile(0, 48, 47));
                cache.load(3, cache.getRegionFile(1, 48, 47));
                cache.load(3, cache.getRegionFile(0, 48, 148));
                cache.load(3, cache.getRegionFile(1, 48, 148));
                k = cache.size();
                while(cache.size() > 0)
                {
                    int j2 = k - cache.size();
                    if(j2 > 0)
                    {
                        method13(false, 75, "Loading maps - " + (j2 * 100) / k + "%");
                    }
                    method93(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex)
                    {
                    }
                }
            }
            k = cache.method385(0, (byte)7);
            for(int k2 = 0; k2 < k; k2++)
            {
                int l2 = cache.method390(k2, -600);
                byte byte0 = 0;
                if((l2 & 8) != 0)
                {
                    byte0 = 10;
                } else
                if((l2 & 0x20) != 0)
                {
                    byte0 = 9;
                } else
                if((l2 & 0x10) != 0)
                {
                    byte0 = 8;
                } else
                if((l2 & 0x40) != 0)
                {
                    byte0 = 7;
                } else
                if((l2 & 0x80) != 0)
                {
                    byte0 = 6;
                } else
                if((l2 & 2) != 0)
                {
                    byte0 = 5;
                } else
                if((l2 & 4) != 0)
                {
                    byte0 = 4;
                }
                if((l2 & 1) != 0)
                {
                    byte0 = 3;
                }
                if(byte0 != 0)
                {
                    cache.method395(7, 0, byte0, k2);
                }
            }
            cache.method388(false, aBoolean1234);
            if(!highmem)
            {
                int l = cache.method385(2, (byte)7);
                for(int i3 = 1; i3 < l; i3++)
                {
                    if(cache.method391(i3, 324))
                    {
                        cache.method395(7, 2, (byte)1, i3);
                    }
                }
            }
            method13(false, 80, "Unpacking media");
            aClass44_Sub3_Sub1_Sub3_1143 = new Class44_Sub3_Sub1_Sub3(class47_2, "invback", 0);
            aClass44_Sub3_Sub1_Sub3_1145 = new Class44_Sub3_Sub1_Sub3(class47_2, "chatback", 0);
            aClass44_Sub3_Sub1_Sub3_1144 = new Class44_Sub3_Sub1_Sub3(class47_2, "mapback", 0);
            aClass44_Sub3_Sub1_Sub3_903 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase1", 0);
            aClass44_Sub3_Sub1_Sub3_904 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase2", 0);
            aClass44_Sub3_Sub1_Sub3_905 = new Class44_Sub3_Sub1_Sub3(class47_2, "backhmid1", 0);
            for(int j3 = 0; j3 < 13; j3++)
            {
                aClass44_Sub3_Sub1_Sub3Array1276[j3] = new Class44_Sub3_Sub1_Sub3(class47_2, "sideicons", j3);
            }
            aClass44_Sub3_Sub1_Sub2_988 = new Sprite(class47_2, "compass", 0);
            aClass44_Sub3_Sub1_Sub2_1261 = new Sprite(class47_2, "mapedge", 0);
            aClass44_Sub3_Sub1_Sub2_1261.method437(-15744);
            try
            {
                for(int k3 = 0; k3 < 100; k3++)
                {
                    aClass44_Sub3_Sub1_Sub3Array1241[k3] = new Class44_Sub3_Sub1_Sub3(class47_2, "mapscene", k3);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int l3 = 0; l3 < 100; l3++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1052[l3] = new Sprite(class47_2, "mapfunction", l3);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int i4 = 0; i4 < 20; i4++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1108[i4] = new Sprite(class47_2, "hitmarks", i4);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int j4 = 0; j4 < 20; j4++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1183[j4] = new Sprite(class47_2, "headicons", j4);
                }
            }
            catch(Exception _ex)
            {
            }
            aClass44_Sub3_Sub1_Sub2_1210 = new Sprite(class47_2, "mapmarker", 0);
            aClass44_Sub3_Sub1_Sub2_1211 = new Sprite(class47_2, "mapmarker", 1);
            for(int k4 = 0; k4 < 8; k4++)
            {
                aClass44_Sub3_Sub1_Sub2Array867[k4] = new Sprite(class47_2, "cross", k4);
            }
            aClass44_Sub3_Sub1_Sub2_1077 = new Sprite(class47_2, "mapdots", 0);
            aClass44_Sub3_Sub1_Sub2_1078 = new Sprite(class47_2, "mapdots", 1);
            aClass44_Sub3_Sub1_Sub2_1079 = new Sprite(class47_2, "mapdots", 2);
            aClass44_Sub3_Sub1_Sub2_1080 = new Sprite(class47_2, "mapdots", 3);
            aClass44_Sub3_Sub1_Sub3_1058 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 0);
            aClass44_Sub3_Sub1_Sub3_1059 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 1);
            aClass44_Sub3_Sub1_Sub3_1136 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1137 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1138 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_1139 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1139.method450(6);
            aClass44_Sub3_Sub1_Sub3_1140 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1140.method450(6);
            aClass44_Sub3_Sub1_Sub3_852 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_852.method451(35509);
            aClass44_Sub3_Sub1_Sub3_853 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_853.method451(35509);
            aClass44_Sub3_Sub1_Sub3_854 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_854.method451(35509);
            aClass44_Sub3_Sub1_Sub3_855 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_855.method450(6);
            aClass44_Sub3_Sub1_Sub3_855.method451(35509);
            aClass44_Sub3_Sub1_Sub3_856 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_856.method450(6);
            aClass44_Sub3_Sub1_Sub3_856.method451(35509);
            for(int l4 = 0; l4 < 2; l4++)
            {
                aClass44_Sub3_Sub1_Sub3Array836[l4] = new Class44_Sub3_Sub1_Sub3(class47_2, "mod_icons", l4);
            }
            Sprite class44_sub3_sub1_sub2 = new Sprite(class47_2, "backleft1", 0);
            aClass34_1123 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backleft2", 0);
            aClass34_1124 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backright1", 0);
            aClass34_1125 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backright2", 0);
            aClass34_1126 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backtop1", 0);
            aClass34_1127 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backvmid1", 0);
            aClass34_1128 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backvmid2", 0);
            aClass34_1129 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backvmid3", 0);
            aClass34_1130 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Sprite(class47_2, "backhmid2", 0);
            aClass34_1131 = new Class34(method11(7), class44_sub3_sub1_sub2.width, class44_sub3_sub1_sub2.height, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            int i5 = (int)(Math.random() * 21D) - 10;
            int j5 = (int)(Math.random() * 21D) - 10;
            int k5 = (int)(Math.random() * 21D) - 10;
            int l5 = (int)(Math.random() * 41D) - 20;
            for(int i6 = 0; i6 < 100; i6++)
            {
                if(aClass44_Sub3_Sub1_Sub2Array1052[i6] != null)
                {
                    aClass44_Sub3_Sub1_Sub2Array1052[i6].method436(i5 + l5, (byte)3, j5 + l5, k5 + l5);
                }
                if(aClass44_Sub3_Sub1_Sub3Array1241[i6] != null)
                {
                    aClass44_Sub3_Sub1_Sub3Array1241[i6].method452(i5 + l5, (byte)3, j5 + l5, k5 + l5);
                }
            }
            method13(false, 83, "Unpacking textures");
            Rasterizer.method423(class47_3, aBoolean1061);
            Rasterizer.setBrightness(0.80000000000000004D, 0);
            Rasterizer.method422(1, 20);
            method13(false, 86, "Unpacking config");
            AnimationSequence.initialize(class47);
            Class8.method197(class47);
            Tile.method243(class47);
            ItemDefinition.initialize(class47);
            NPCDefinition.initialize(class47);
            Class22.method247(true, class47);
            Class32.method269(true, class47);
            Class38.method337(true, class47);
            Class35.method275(true, class47);
            ItemDefinition.premiumEnabled = aBoolean1234;
            if(!highmem)
            {
                method13(false, 90, "Unpacking sounds");
                byte sound_file[] = class47_5.entry("sounds.dat", null);
                Buffer sound_buffer = new Buffer(sound_file);
                SoundEffect.initialize(sound_buffer);
            }
            method13(false, 95, "Unpacking interfaces");
            RSFont aclass44_sub3_sub1_sub4[] = {
                aClass44_Sub3_Sub1_Sub4_1255, plain_font, chat_area_graphics, aClass44_Sub3_Sub1_Sub4_1258
            };
            Interface.load(aclass44_sub3_sub1_sub4, class47_2, class47_1);
            Interface.createSingleProductionInterface();
            method13(false, 100, "Preparing game engine");
            for(int j6 = 0; j6 < 33; j6++)
            {
                int k6 = 999;
                int i7 = 0;
                for(int k7 = 0; k7 < 34; k7++)
                {
                    if(aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458[k7 + j6 * aClass44_Sub3_Sub1_Sub3_1144.anInt1460] == 0)
                    {
                        if(k6 == 999)
                        {
                            k6 = k7;
                        }
                        continue;
                    }
                    if(k6 == 999)
                    {
                        continue;
                    }
                    i7 = k7;
                    break;
                }
                anIntArray961[j6] = k6;
                anIntArray910[j6] = i7 - k6;
            }
            for(int l6 = 5; l6 < 156; l6++)
            {
                int j7 = 999;
                int l7 = 0;
                for(int j8 = 25; j8 < 172; j8++)
                {
                    if(aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458[j8 + l6 * aClass44_Sub3_Sub1_Sub3_1144.anInt1460] == 0 && (j8 > 34 || l6 > 34))
                    {
                        if(j7 == 999)
                        {
                            j7 = j8;
                        }
                        continue;
                    }
                    if(j7 == 999)
                    {
                        continue;
                    }
                    l7 = j8;
                    break;
                }
                anIntArray881[l6 - 5] = j7 - 25;
                anIntArray868[l6 - 5] = l7 - j7;
            }
            Rasterizer.method420(96, 479, 8);
            anIntArray914 = Rasterizer.anIntArray1429;
            Rasterizer.method420(261, 190, 8);
            anIntArray915 = Rasterizer.anIntArray1429;
            Rasterizer.method420(334, 512, 8);
            anIntArray916 = Rasterizer.anIntArray1429;
            int ai[] = new int[9];
            for(int i8 = 0; i8 < 9; i8++)
            {
                int k8 = 128 + i8 * 32 + 15;
                int l8 = 600 + k8 * 3;
                int i9 = Rasterizer.anIntArray1427[k8];
                ai[i8] = l8 * i9 >> 16;
            }
            Class36.method314(ai, 500, 334, 3, 800, 512);
            Class41.method342(class47_4);
            aClass10_866 = new MouseThread(this);
            submit(aClass10_866, 10);
            Class44_Sub3_Sub4_Sub1.aClient1481 = this;
            return;
        }
        catch(Exception exception)
        {
            signlink.reporterror("loaderror " + aString926 + " " + anInt1176);
        }
        aBoolean1055 = true;
    }

    public void method35(boolean flag)
    {
        try
        {
            aBoolean893 = true;
            try
            {
                long l = System.currentTimeMillis();
                int i = 0;
                int j = 20;
                while(aBoolean1174)
                {
                    anInt945++;
                    method25(699);
                    method25(699);
                    method84(0);
                    if(++i > 10)
                    {
                        long l1 = System.currentTimeMillis();
                        int k = (int)(l1 - l) / 10 - j;
                        j = 40 - k;
                        if(j < 5)
                        {
                            j = 5;
                        }
                        i = 0;
                        l = l1;
                    }
                    try
                    {
                        Thread.sleep(j);
                    }
                    catch(Exception _ex)
                    {
                    }
                }
            }
            catch(Exception _ex)
            {
            }
            aBoolean893 = false;
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("21026, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method36(int i)
    {
        try
        {
            aClass34_1196.method272((byte)5);
            if(anInt848 == 2)
            {
                byte abyte0[] = aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458;
                int ai[] = DrawingArea.anIntArray1369;
                int l2 = abyte0.length;
                for(int j5 = 0; j5 < l2; j5++)
                {
                    if(abyte0[j5] == 0)
                    {
                        ai[j5] = 0;
                    }
                }
                aClass44_Sub3_Sub1_Sub2_988.method444(anIntArray961, 0, 25, 256, anInt930, 33, anIntArray910, 33, -687, 25, 0);
                aClass34_1197.method272((byte)5);
                return;
            }
            int j = anInt930 + anInt959 & 0x7ff;
            int k = 48 + ((RenderingHints) (player_appearance)).anInt1615 / 32;
            int i3 = 464 - ((RenderingHints) (player_appearance)).anInt1616 / 32;
            aClass44_Sub3_Sub1_Sub2_913.method444(anIntArray881, 5, i3, 256 + anInt1075, j, 151, anIntArray868, 146, -687, k, 25);
            aClass44_Sub3_Sub1_Sub2_988.method444(anIntArray961, 0, 25, 256, anInt930, 33, anIntArray910, 33, -687, 25, 0);
            for(int k5 = 0; k5 < anInt826; k5++)
            {
                int l = (anIntArray827[k5] * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                int j3 = (anIntArray828[k5] * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                method141(l, aClass44_Sub3_Sub1_Sub2Array872[k5], 139, j3);
            }
            for(int l5 = 0; l5 < 104; l5++)
            {
                for(int i6 = 0; i6 < 104; i6++)
                {
                    Deque class28 = groundItems[height_level][l5][i6];
                    if(class28 != null)
                    {
                        int i1 = (l5 * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                        int k3 = (i6 * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                        method141(i1, aClass44_Sub3_Sub1_Sub2_1077, 139, k3);
                    }
                }
            }
            packet_size += i;
            for(int j6 = 0; j6 < expected_npc_count; j6++)
            {
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[local_npc_indices[j6]];
                if(class44_sub3_sub4_sub6_sub2 != null && class44_sub3_sub4_sub6_sub2.method535(true) && class44_sub3_sub4_sub6_sub2.definition.detectable)
                {
                    int j1 = ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 / 32 - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                    int l3 = ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 / 32 - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                    method141(j1, aClass44_Sub3_Sub1_Sub2_1078, 139, l3);
                }
            }
            for(int k6 = 0; k6 < expected_player_count; k6++)
            {
                PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[local_players[k6]];
                if(class44_sub3_sub4_sub6_sub1 != null && class44_sub3_sub4_sub6_sub1.method535(true))
                {
                    int k1 = ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 / 32 - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                    int i4 = ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 / 32 - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                    boolean flag = false;
                    long l6 = StringUtil.hash(class44_sub3_sub4_sub6_sub1.username);
                    for(int i7 = 0; i7 < anInt1104; i7++)
                    {
                        if(l6 != aLongArray979[i7] || anIntArray894[i7] == 0)
                        {
                            continue;
                        }
                        flag = true;
                        break;
                    }
                    if(player_appearance.anInt1695 != 0 && class44_sub3_sub4_sub6_sub1.anInt1695 != 0)
                    {
                        if(player_appearance.anInt1695 == class44_sub3_sub4_sub6_sub1.anInt1695)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                    if(flag)
                    {
                        method141(k1, aClass44_Sub3_Sub1_Sub2_1080, 139, i4);
                    } else
                    {
                        method141(k1, aClass44_Sub3_Sub1_Sub2_1079, 139, i4);
                    }
                }
            }
            if(anInt1005 != 0 && anInt1240 % 20 < 10)
            {
                if(anInt1005 == 1 && anInt901 >= 0 && anInt901 < local_npcs.length)
                {
                    NPC class44_sub3_sub4_sub6_sub2_1 = local_npcs[anInt901];
                    if(class44_sub3_sub4_sub6_sub2_1 != null)
                    {
                        int l1 = ((RenderingHints) (class44_sub3_sub4_sub6_sub2_1)).anInt1615 / 32 - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                        int j4 = ((RenderingHints) (class44_sub3_sub4_sub6_sub2_1)).anInt1616 / 32 - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                        method15(l1, aClass44_Sub3_Sub1_Sub2_1211, j4, anInt834);
                    }
                }
                if(anInt1005 == 2)
                {
                    int i2 = ((anInt1248 - base_x) * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                    int k4 = ((anInt1249 - base_y) * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                    method15(i2, aClass44_Sub3_Sub1_Sub2_1211, k4, anInt834);
                }
                if(anInt1005 == 10 && anInt909 >= 0 && anInt909 < player_models.length)
                {
                    PlayerModel class44_sub3_sub4_sub6_sub1_1 = player_models[anInt909];
                    if(class44_sub3_sub4_sub6_sub1_1 != null)
                    {
                        int j2 = ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).anInt1615 / 32 - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                        int l4 = ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).anInt1616 / 32 - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                        method15(j2, aClass44_Sub3_Sub1_Sub2_1211, l4, anInt834);
                    }
                }
            }
            if(absolute_x != 0)
            {
                int k2 = (absolute_x * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1615 / 32;
                int i5 = (absolute_y * 4 + 2) - ((RenderingHints) (player_appearance)).anInt1616 / 32;
                method141(k2, aClass44_Sub3_Sub1_Sub2_1210, 139, i5);
            }
            DrawingArea.method411(0xffffff, 210, 78, 3, 97, 3);
            aClass34_1197.method272((byte)5);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("47037, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method37(int i, int j, int k, Interface class5, int l)
    {
        try
        {
            if(class5.type != 0 || class5.children == null)
            {
                return;
            }
            if(class5.aBoolean121 && anInt999 != class5.id && anInt933 != class5.id && anInt1212 != class5.id)
            {
                return;
            }
            int i1 = DrawingArea.anInt1374;
            int j1 = DrawingArea.anInt1372;
            int k1 = DrawingArea.anInt1375;
            int l1 = DrawingArea.anInt1373;
            DrawingArea.method408(l + class5.anInt111, k + class5.anInt110, l, k);
            int i2 = class5.children.length;
            for(int child_id = 0; child_id < i2; child_id++)
            {
                int x = class5.child_x[child_id] + k;
                int y = (class5.child_y[child_id] + l) - j;
                Interface class5_1 = Interface.interfaces[class5.children[child_id]];
                x += class5_1.offset_x;
                y += class5_1.offset_y;
                if(class5_1.anInt109 > 0)
                {
                    method41(-338, class5_1);
                }
                if(class5_1.type == 0)
                {
                    if(class5_1.anInt120 > class5_1.anInt119 - class5_1.anInt111)
                    {
                        class5_1.anInt120 = class5_1.anInt119 - class5_1.anInt111;
                    }
                    if(class5_1.anInt120 < 0)
                    {
                        class5_1.anInt120 = 0;
                    }
                    method37(6, class5_1.anInt120, x, class5_1, y);
                    if(class5_1.anInt119 > class5_1.anInt111)
                    {
                        method21(y, x + class5_1.anInt110, class5_1.anInt120, class5_1.anInt119, class5_1.anInt111, 3);
                    }
                } else
                if(class5_1.type != 1)
                {
                    if(class5_1.type == 2)
                    {
                        int i3 = 0;
                        for(int l3 = 0; l3 < class5_1.anInt111; l3++)
                        {
                            for(int l4 = 0; l4 < class5_1.anInt110; l4++)
                            {
                                int k5 = x + l4 * (32 + class5_1.anInt131);
                                int j6 = y + l3 * (32 + class5_1.anInt132);
                                if(i3 < 20)
                                {
                                    k5 += class5_1.anIntArray134[i3];
                                    j6 += class5_1.anIntArray135[i3];
                                }
                                if(class5_1.item_id[i3] > 0)
                                {
                                    int k6 = 0;
                                    int j7 = 0;
                                    int j9 = class5_1.item_id[i3] - 1;
                                    if(k5 > DrawingArea.anInt1374 - 32 && k5 < DrawingArea.anInt1375 && j6 > DrawingArea.anInt1372 - 32 && j6 < DrawingArea.anInt1373 || anInt1095 != 0 && anInt1094 == i3)
                                    {
                                        int l9 = 0;
                                        if(anInt952 == 1 && anInt953 == i3 && anInt954 == class5_1.id)
                                        {
                                            l9 = 0xffffff;
                                        }
                                        Sprite class44_sub3_sub1_sub2_2 = ItemDefinition.getSprite(j9, l9, class5_1.item_count[i3]);
                                        if(class44_sub3_sub1_sub2_2 != null)
                                        {
                                            if(anInt1095 != 0 && anInt1094 == i3 && anInt1093 == class5_1.id)
                                            {
                                                k6 = super.mouse_x - anInt1096;
                                                j7 = super.mouse_y - anInt1097;
                                                if(k6 < 5 && k6 > -5)
                                                {
                                                    k6 = 0;
                                                }
                                                if(j7 < 5 && j7 > -5)
                                                {
                                                    j7 = 0;
                                                }
                                                if(anInt978 < 5)
                                                {
                                                    k6 = 0;
                                                    j7 = 0;
                                                }
                                                class44_sub3_sub1_sub2_2.method442(128, anInt902, j6 + j7, k5 + k6);
                                                if(j6 + j7 < DrawingArea.anInt1372 && class5.anInt120 > 0)
                                                {
                                                    int i10 = (anInt824 * (DrawingArea.anInt1372 - j6 - j7)) / 3;
                                                    if(i10 > anInt824 * 10)
                                                    {
                                                        i10 = anInt824 * 10;
                                                    }
                                                    if(i10 > class5.anInt120)
                                                    {
                                                        i10 = class5.anInt120;
                                                    }
                                                    class5.anInt120 -= i10;
                                                    anInt1097 += i10;
                                                }
                                                if(j6 + j7 + 32 > DrawingArea.anInt1373 && class5.anInt120 < class5.anInt119 - class5.anInt111)
                                                {
                                                    int j10 = (anInt824 * ((j6 + j7 + 32) - DrawingArea.anInt1373)) / 3;
                                                    if(j10 > anInt824 * 10)
                                                    {
                                                        j10 = anInt824 * 10;
                                                    }
                                                    if(j10 > class5.anInt119 - class5.anInt111 - class5.anInt120)
                                                    {
                                                        j10 = class5.anInt119 - class5.anInt111 - class5.anInt120;
                                                    }
                                                    class5.anInt120 += j10;
                                                    anInt1097 -= j10;
                                                }
                                            } else
                                            if(anInt1151 != 0 && anInt1150 == i3 && anInt1149 == class5_1.id)
                                            {
                                                class44_sub3_sub1_sub2_2.method442(128, anInt902, j6, k5);
                                            } else
                                            {
                                                class44_sub3_sub1_sub2_2.drawImage(j6, k5);
                                            }
                                            if(class44_sub3_sub1_sub2_2.max_width == 33 || class5_1.item_count[i3] != 1)
                                            {
                                                int k10 = class5_1.item_count[i3];
                                                aClass44_Sub3_Sub1_Sub4_1255.method459((byte)-104, 0, amount_suffix(k10), k5 + 1 + k6, j6 + 10 + j7);
                                                aClass44_Sub3_Sub1_Sub4_1255.method459((byte)-104, 0xffff00, amount_suffix(k10), k5 + k6, j6 + 9 + j7);
                                            }
                                        }
                                    }
                                } else
                                if(class5_1.aClass44_Sub3_Sub1_Sub2Array133 != null && i3 < 20)
                                {
                                    Sprite class44_sub3_sub1_sub2_1 = class5_1.aClass44_Sub3_Sub1_Sub2Array133[i3];
                                    if(class44_sub3_sub1_sub2_1 != null)
                                    {
                                        class44_sub3_sub1_sub2_1.drawImage(j6, k5);
                                    }
                                }
                                i3++;
                            }
                        }
                    } else
                    if(class5_1.type == 3)
                    {
                        boolean flag = false;
                        if(anInt1212 == class5_1.id || anInt933 == class5_1.id || anInt999 == class5_1.id)
                        {
                            flag = true;
                        }
                        int j3;
                        if(method88(class5_1, 0))
                        {
                            j3 = class5_1.anInt144;
                            if(flag && class5_1.anInt146 != 0)
                            {
                                j3 = class5_1.anInt146;
                            }
                        } else
                        {
                            j3 = class5_1.textColor;
                            if(flag && class5_1.anInt145 != 0)
                            {
                                j3 = class5_1.anInt145;
                            }
                        }
                        if(class5_1.aByte112 == 0)
                        {
                            if(class5_1.aBoolean137)
                            {
                                DrawingArea.method411(j3, 210, y, class5_1.anInt111, x, class5_1.anInt110);
                            } else
                            {
                                DrawingArea.method412(1, x, class5_1.anInt110, j3, y, class5_1.anInt111);
                            }
                        } else
                        if(class5_1.aBoolean137)
                        {
                            DrawingArea.method410(y, class5_1.anInt111, 256 - (class5_1.aByte112 & 0xff), j3, class5_1.anInt110, x, false);
                        } else
                        {
                            DrawingArea.method413(class5_1.anInt111, j3, x, class5_1.anInt110, 256 - (class5_1.aByte112 & 0xff), y, 0);
                        }
                    } else
                    if(class5_1.type == 4)
                    {
                        RSFont class44_sub3_sub1_sub4 = class5_1.aClass44_Sub3_Sub1_Sub4_140;
                        String s = class5_1.message;
                        boolean flag1 = false;
                        if(anInt1212 == class5_1.id || anInt933 == class5_1.id || anInt999 == class5_1.id)
                        {
                            flag1 = true;
                        }
                        int i4;
                        if(method88(class5_1, 0))
                        {
                            i4 = class5_1.anInt144;
                            if(flag1 && class5_1.anInt146 != 0)
                            {
                                i4 = class5_1.anInt146;
                            }
                            if(class5_1.aString142.length() > 0)
                            {
                                s = class5_1.aString142;
                            }
                        } else
                        {
                            i4 = class5_1.textColor;
                            if(flag1 && class5_1.anInt145 != 0)
                            {
                                i4 = class5_1.anInt145;
                            }
                        }
                        if(class5_1.anInt108 == 6 && aBoolean935)
                        {
                            s = "Please wait...";
                            i4 = class5_1.textColor;
                        }
                        if(DrawingArea.anInt1370 == 479)
                        {
                            if(i4 == 0xffff00)
                            {
                                i4 = 255;
                            }
                            if(i4 == 49152)
                            {
                                i4 = 0xffffff;
                            }
                        }
                        for(int l6 = y + class44_sub3_sub1_sub4.anInt1478; s.length() > 0; l6 += class44_sub3_sub1_sub4.anInt1478)
                        {
                            if(s.indexOf("%") != -1)
                            {
                                do
                                {
                                    int k7 = s.indexOf("%1");
                                    if(k7 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, k7) + method72(method94(0, aByte1086, class5_1), false) + s.substring(k7 + 2);
                                } while(true);
                                do
                                {
                                    int l7 = s.indexOf("%2");
                                    if(l7 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, l7) + method72(method94(1, aByte1086, class5_1), false) + s.substring(l7 + 2);
                                } while(true);
                                do
                                {
                                    int i8 = s.indexOf("%3");
                                    if(i8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, i8) + method72(method94(2, aByte1086, class5_1), false) + s.substring(i8 + 2);
                                } while(true);
                                do
                                {
                                    int j8 = s.indexOf("%4");
                                    if(j8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, j8) + method72(method94(3, aByte1086, class5_1), false) + s.substring(j8 + 2);
                                } while(true);
                                do
                                {
                                    int k8 = s.indexOf("%5");
                                    if(k8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, k8) + method72(method94(4, aByte1086, class5_1), false) + s.substring(k8 + 2);
                                } while(true);
                            }
                            int l8 = s.indexOf("\\n");
                            String s1;
                            if(l8 != -1)
                            {
                                s1 = s.substring(0, l8);
                                s = s.substring(l8 + 2);
                            } else
                            {
                                s1 = s;
                                s = "";
                            }
                            if(class5_1.aBoolean138)
                            {
                                class44_sub3_sub1_sub4.method456(class5_1.aBoolean139, i4, x + class5_1.anInt110 / 2, s1, l6);
                            } else
                            {
                                class44_sub3_sub1_sub4.method463(i4, 2, l6, class5_1.aBoolean139, x, s1);
                            }
                        }

                    } else
                    if(class5_1.type == 5)
                    {
                        Sprite class44_sub3_sub1_sub2;
                        if(method88(class5_1, 0))
                        {
                            class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_148;
                        } else
                        {
                            class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_147;
                        }
                        if(class44_sub3_sub1_sub2 != null)
                        {
                            class44_sub3_sub1_sub2.drawImage(y, x);
                        }
                    } else
                    if(class5_1.type == 6)
                    {
                        int k3 = Rasterizer.anInt1423;
                        int j4 = Rasterizer.anInt1424;
                        Rasterizer.anInt1423 = x + class5_1.anInt110 / 2;
                        Rasterizer.anInt1424 = y + class5_1.anInt111 / 2;
                        int i5 = Rasterizer.anIntArray1427[class5_1.anInt156] * class5_1.anInt155 >> 16;
                        int l5 = Rasterizer.anIntArray1428[class5_1.anInt156] * class5_1.anInt155 >> 16;
                        boolean flag2 = method88(class5_1, 0);
                        int i7;
                        if(flag2)
                        {
                            i7 = class5_1.anInt154;
                        } else
                        {
                            i7 = class5_1.anInt153;
                        }
                        Model class44_sub3_sub4_sub4;
                        if(i7 == -1)
                        {
                            class44_sub3_sub4_sub4 = class5_1.method183(0, -1, -1, flag2);
                        } else
                        {
                            AnimationSequence class26 = AnimationSequence.cache[i7];
                            class44_sub3_sub4_sub4 = class5_1.method183(0, class26.frame_alt_index[class5_1.anInt103], class26.frame_index[class5_1.anInt103], flag2);
                        }
                        if(class44_sub3_sub4_sub4 != null)
                        {
                            class44_sub3_sub4_sub4.method526(0, class5_1.anInt157, 0, class5_1.anInt156, 0, i5, l5);
                        }
                        Rasterizer.anInt1423 = k3;
                        Rasterizer.anInt1424 = j4;
                    } else
                    if(class5_1.type == 7)
                    {
                        RSFont class44_sub3_sub1_sub4_1 = class5_1.aClass44_Sub3_Sub1_Sub4_140;
                        int k4 = 0;
                        for(int j5 = 0; j5 < class5_1.anInt111; j5++)
                        {
                            for(int i6 = 0; i6 < class5_1.anInt110; i6++)
                            {
                                if(class5_1.item_id[k4] > 0)
                                {
                                    ItemDefinition class14 = ItemDefinition.get(class5_1.item_id[k4] - 1);
                                    String s2 = class14.name;
                                    if(class14.stackable || class5_1.item_count[k4] != 1)
                                    {
                                        s2 = s2 + " x" + method98(class5_1.item_count[k4], (byte)5);
                                    }
                                    int i9 = x + i6 * (115 + class5_1.anInt131);
                                    int k9 = y + j5 * (12 + class5_1.anInt132);
                                    if(class5_1.aBoolean138)
                                    {
                                        class44_sub3_sub1_sub4_1.method456(class5_1.aBoolean139, class5_1.textColor, i9 + class5_1.anInt110 / 2, s2, k9);
                                    } else
                                    {
                                        class44_sub3_sub1_sub4_1.method463(class5_1.textColor, 2, k9, class5_1.aBoolean139, i9, s2);
                                    }
                                }
                                k4++;
                            }
                        }
                    }
                }
            }

            if(i < 6 || i > 6)
            {
                aBoolean1061 = !aBoolean1061;
            }
            DrawingArea.method408(l1, k1, j1, i1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("32464, " + i + ", " + j + ", " + k + ", " + class5 + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
    public void method38(byte byte0)
    {
        try
        {
            if(byte0 != 6)
            {
                return;
            }
            if(highmem && game_state == 2 && LandscapeParser.anInt65 != height_level)
            {
                aClass34_1197.method272((byte)5);
                plain_font.draw_centered_string("Loading - please wait.", 151, 257, 0);
                plain_font.draw_centered_string("Loading - please wait.", 150, 256, 0xffffff);
                aClass34_1197.method273(-781, 4, 4, super.graphics);
                game_state = 1;
                aLong1070 = System.currentTimeMillis();
            }
            if(game_state == 1)
            {
                int i = method39(aByte1182);
                if(i != 0 && System.currentTimeMillis() - aLong1070 > 0x57e40L)
                {
                    signlink.reporterror(aString1071 + " glcfb " + aLong813 + "," + i + "," + highmem + "," + aClass45Array1208[0] + "," + cache.size() + "," + height_level + "," + region_x + "," + region_y);
                    aLong1070 = System.currentTimeMillis();
                }
            }
            if(game_state == 2 && height_level != anInt1063)
            {
                anInt1063 = height_level;
                method40((byte)-89, height_level);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("64388, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method39(byte byte0)
    {
        try
        {
            for(int i = 0; i < map_files.length; i++)
            {
                if(map_files[i] == null && anIntArray1040[i] != -1)
                {
                    return -1;
                }
                if(landscape_files[i] == null && anIntArray1041[i] != -1)
                {
                    return -2;
                }
            }
            boolean flag = true;
            for(int j = 0; j < map_files.length; j++)
            {
                byte abyte0[] = landscape_files[j];
                if(abyte0 != null)
                {
                    int k = (region_identifiers[j] >> 8) * 64 - base_x;
                    int l = (region_identifiers[j] & 0xff) * 64 - base_y;
                    flag &= LandscapeParser.method159(576, l, k, abyte0);
                }
            }
            if(!flag)
            {
                return -3;
            }
            if(aBoolean1275)
            {
                return -4;
            }
            game_state = 2;
            LandscapeParser.anInt65 = height_level;
            method129(-17416);
            buffer.putOpcode(214);
            if(byte0 == 2)
            {
                byte0 = 0;
            } else
            {
                anInt1029 = 384;
            }
            return 0;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("76031, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method40(byte byte0, int i)
    {
        try
        {
            int ai[] = aClass44_Sub3_Sub1_Sub2_913.pixel_array;
            int j = ai.length;
            for(int k = 0; k < j; k++)
            {
                ai[k] = 0;
            }
            for(int l = 1; l < 103; l++)
            {
                int i1 = 24628 + (103 - l) * 512 * 4;
                for(int k1 = 1; k1 < 103; k1++)
                {
                    if((aByteArrayArrayArray871[i][k1][l] & 0x18) == 0)
                    {
                        aClass36_1192.method313(ai, i1, 512, i, k1, l);
                    }
                    if(i < 3 && (aByteArrayArrayArray871[i + 1][k1][l] & 8) != 0)
                    {
                        aClass36_1192.method313(ai, i1, 512, i + 1, k1, l);
                    }
                    i1 += 4;
                }
            }
            int j1 = ((238 + (int)(Math.random() * 20D)) - 10 << 16) + ((238 + (int)(Math.random() * 20D)) - 10 << 8) + ((238 + (int)(Math.random() * 20D)) - 10);
            int l1 = (238 + (int)(Math.random() * 20D)) - 10 << 16;
            aClass44_Sub3_Sub1_Sub2_913.method435((byte)5);
            for(int i2 = 1; i2 < 103; i2++)
            {
                for(int j2 = 1; j2 < 103; j2++)
                {
                    if((aByteArrayArrayArray871[i][j2][i2] & 0x18) == 0)
                    {
                        method86(j2, i2, j1, (byte)5, i, l1);
                    }
                    if(i < 3 && (aByteArrayArrayArray871[i + 1][j2][i2] & 8) != 0)
                    {
                        method86(j2, i2, j1, (byte)5, i + 1, l1);
                    }
                }
            }
            aClass34_1197.method272((byte)5);
            anInt826 = 0;
            if(byte0 != -89)
            {
                anInt1029 = cipher.method545();
            }
            for(int k2 = 0; k2 < 104; k2++)
            {
                for(int l2 = 0; l2 < 104; l2++)
                {
                    int i3 = aClass36_1192.method307(height_level, k2, l2);
                    if(i3 != 0)
                    {
                        i3 = i3 >> 14 & 0x7fff;
                        int j3 = Class8.method199(i3).anInt235;
                        if(j3 >= 0)
                        {
                            int k3 = k2;
                            int l3 = l2;
                            if(j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48)
                            {
                                byte byte1 = 104;
                                byte byte2 = 104;
                                int ai1[][] = planes[height_level].collision_flags;
                                for(int i4 = 0; i4 < 10; i4++)
                                {
                                    int j4 = (int)(Math.random() * 4D);
                                    if(j4 == 0 && k3 > 0 && k3 > k2 - 3 && (ai1[k3 - 1][l3] & 0x280108) == 0)
                                    {
                                        k3--;
                                    }
                                    if(j4 == 1 && k3 < byte1 - 1 && k3 < k2 + 3 && (ai1[k3 + 1][l3] & 0x280180) == 0)
                                    {
                                        k3++;
                                    }
                                    if(j4 == 2 && l3 > 0 && l3 > l2 - 3 && (ai1[k3][l3 - 1] & 0x280102) == 0)
                                    {
                                        l3--;
                                    }
                                    if(j4 == 3 && l3 < byte2 - 1 && l3 < l2 + 3 && (ai1[k3][l3 + 1] & 0x280120) == 0)
                                    {
                                        l3++;
                                    }
                                }
                            }
                            aClass44_Sub3_Sub1_Sub2Array872[anInt826] = aClass44_Sub3_Sub1_Sub2Array1052[j3];
                            anIntArray827[anInt826] = k3;
                            anIntArray828[anInt826] = l3;
                            anInt826++;
                        }
                    }
                }
            }
            anInt1204++;
            if(anInt1204 > 112)
            {
                anInt1204 = 0;
                buffer.putOpcode(125);
                buffer.putByte(50);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89876, " + byte0 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method41(int i, Interface class5)
    {
        try
        {
            if(i >= 0)
            {
                anInt1152 = cipher.method545();
            }
            int j = class5.anInt109;
            if(j >= 1 && j <= 100 || j >= 701 && j <= 800)
            {
                if(j == 1 && anInt1105 == 0)
                {
                    class5.message = "Loading friend list";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 1 && anInt1105 == 1)
                {
                    class5.message = "Connecting to friendserver";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 2 && anInt1105 != 2)
                {
                    class5.message = "Please wait...";
                    class5.anInt108 = 0;
                    return;
                }
                int k = anInt1104;
                if(anInt1105 != 2)
                {
                    k = 0;
                }
                if(j > 700)
                {
                    j -= 601;
                } else
                {
                    j--;
                }
                if(j >= k)
                {
                    class5.message = "";
                    class5.anInt108 = 0;
                    return;
                } else
                {
                    class5.message = aStringArray1044[j];
                    class5.anInt108 = 1;
                    return;
                }
            }
            if(j >= 101 && j <= 200 || j >= 801 && j <= 900)
            {
                int l = anInt1104;
                if(anInt1105 != 2)
                {
                    l = 0;
                }
                if(j > 800)
                {
                    j -= 701;
                } else
                {
                    j -= 101;
                }
                if(j >= l)
                {
                    class5.message = "";
                    class5.anInt108 = 0;
                    return;
                }
                if(anIntArray894[j] == 0)
                {
                    class5.message = "@red@Offline";
                } else
                if(anIntArray894[j] == anInt1232)
                {
                    class5.message = "@gre@World-" + (anIntArray894[j] - 9);
                } else
                {
                    class5.message = "@yel@World-" + (anIntArray894[j] - 9);
                }
                class5.anInt108 = 1;
                return;
            }
            if(j == 203)
            {
                int i1 = anInt1104;
                if(anInt1105 != 2)
                {
                    i1 = 0;
                }
                class5.anInt119 = i1 * 15 + 20;
                if(class5.anInt119 <= class5.anInt111)
                {
                    class5.anInt119 = class5.anInt111 + 1;
                }
                return;
            }
            if(j >= 401 && j <= 500)
            {
                if((j -= 401) == 0 && anInt1105 == 0)
                {
                    class5.message = "Loading ignore list";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 1 && anInt1105 == 0)
                {
                    class5.message = "Please wait...";
                    class5.anInt108 = 0;
                    return;
                }
                int j1 = anInt957;
                if(anInt1105 == 0)
                {
                    j1 = 0;
                }
                if(j >= j1)
                {
                    class5.message = "";
                    class5.anInt108 = 0;
                    return;
                } else
                {
                    class5.message = StringUtil.format(StringUtil.from_hash(aLongArray1254[j], true), true);
                    class5.anInt108 = 1;
                    return;
                }
            }
            if(j == 503)
            {
                class5.anInt119 = anInt957 * 15 + 20;
                if(class5.anInt119 <= class5.anInt111)
                {
                    class5.anInt119 = class5.anInt111 + 1;
                }
                return;
            }
            if(j == 327)
            {
                class5.anInt156 = 150;
                class5.anInt157 = (int)(Math.sin((double)anInt1240 / 40D) * 256D) & 0x7ff;
                if(aBoolean812)
                {
                    for(int k1 = 0; k1 < 7; k1++)
                    {
                        int l1 = anIntArray849[k1];
                        if(l1 >= 0 && !Class22.aClass22Array464[l1].method249(9))
                        {
                            return;
                        }
                    }
                    aBoolean812 = false;
                    Model aclass44_sub3_sub4_sub4[] = new Model[7];
                    int i2 = 0;
                    for(int j2 = 0; j2 < 7; j2++)
                    {
                        int k2 = anIntArray849[j2];
                        if(k2 >= 0)
                        {
                            aclass44_sub3_sub4_sub4[i2++] = Class22.aClass22Array464[k2].method250(0);
                        }
                    }
                    Model class44_sub3_sub4_sub4 = new Model(aclass44_sub3_sub4_sub4, i2);
                    for(int l2 = 0; l2 < 5; l2++)
                    {
                        if(anIntArray938[l2] != 0)
                        {
                            class44_sub3_sub4_sub4.recolor(anIntArrayArray1073[l2][0], anIntArrayArray1073[l2][anIntArray938[l2]]);
                            if(l2 == 1)
                            {
                                class44_sub3_sub4_sub4.recolor(anIntArray1043[0], anIntArray1043[anIntArray938[l2]]);
                            }
                        }
                    }
                    class44_sub3_sub4_sub4.method513((byte)3);
                    class44_sub3_sub4_sub4.method514(AnimationSequence.cache[((RenderingHints) (player_appearance)).idle_animation].frame_index[0], 188);
                    class44_sub3_sub4_sub4.applyLighting(64, 850, -30, -50, -30, true);
                    class5.sprite_type = 5;
                    class5.sprite_id = 0;
                    Interface.method185(5, class44_sub3_sub4_sub4, 9, 0);
                }
                return;
            }
            if(j == 324)
            {
                if(aClass44_Sub3_Sub1_Sub2_1025 == null)
                {
                    aClass44_Sub3_Sub1_Sub2_1025 = class5.aClass44_Sub3_Sub1_Sub2_147;
                    aClass44_Sub3_Sub1_Sub2_1026 = class5.aClass44_Sub3_Sub1_Sub2_148;
                }
                if(aBoolean1179)
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1026;
                    return;
                } else
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1025;
                    return;
                }
            }
            if(j == 325)
            {
                if(aClass44_Sub3_Sub1_Sub2_1025 == null)
                {
                    aClass44_Sub3_Sub1_Sub2_1025 = class5.aClass44_Sub3_Sub1_Sub2_147;
                    aClass44_Sub3_Sub1_Sub2_1026 = class5.aClass44_Sub3_Sub1_Sub2_148;
                }
                if(aBoolean1179)
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1025;
                    return;
                } else
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1026;
                    return;
                }
            }
            if(j == 600)
            {
                class5.message = aString939;
                if(anInt1240 % 20 < 10)
                {
                    class5.message += "|";
                    return;
                } else
                {
                    class5.message += " ";
                    return;
                }
            }
            if(j == 613)
            {
                if(user_privilege >= 1)
                {
                    if(aBoolean987)
                    {
                        class5.textColor = 0xff0000;
                        class5.message = "Moderator option: Mute player for 48 hours: <ON>";
                    } else
                    {
                        class5.textColor = 0xffffff;
                        class5.message = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else
                {
                    class5.message = "";
                }
            }
            if(j == 650 || j == 655)
            {
                if(anInt1231 != 0)
                {
                    String s;
                    if(anInt947 == 0)
                    {
                        s = "earlier today";
                    } else
                    if(anInt947 == 1)
                    {
                        s = "yesterday";
                    } else
                    {
                        s = anInt947 + " days ago";
                    }
                    class5.message = "You last logged in " + s + " from: " + signlink.dns;
                } else
                {
                    class5.message = "";
                }
            }
            if(j == 651)
            {
                if(anInt1023 == 0)
                {
                    class5.message = "0 unread messages";
                    class5.textColor = 0xffff00;
                }
                if(anInt1023 == 1)
                {
                    class5.message = "1 unread message";
                    class5.textColor = 65280;
                }
                if(anInt1023 > 1)
                {
                    class5.message = anInt1023 + " unread messages";
                    class5.textColor = 65280;
                }
            }
            if(j == 652)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.message = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else
                    {
                        class5.message = "";
                    }
                } else
                if(anInt869 == 200)
                {
                    class5.message = "You have not yet set any password recovery questions.";
                } else
                {
                    String s1;
                    if(anInt869 == 0)
                    {
                        s1 = "Earlier today";
                    } else
                    if(anInt869 == 1)
                    {
                        s1 = "Yesterday";
                    } else
                    {
                        s1 = anInt869 + " days ago";
                    }
                    class5.message = s1 + " you changed your recovery questions";
                }
            }
            if(j == 653)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.message = "@whi@recommend you use a members world instead. You may use";
                    } else
                    {
                        class5.message = "";
                    }
                } else
                if(anInt869 == 200)
                {
                    class5.message = "We strongly recommend you do so now to secure your account.";
                } else
                {
                    class5.message = "If you do not remember making this change then cancel it immediately";
                }
            }
            if(j == 654)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.message = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                    } else
                    {
                        class5.message = "";
                        return;
                    }
                }
                if(anInt869 == 200)
                {
                    class5.message = "Do this from the 'account management' area on our front webpage";
                    return;
                } else
                {
                    class5.message = "Do this from the 'account management' area on our front webpage";
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89305, " + i + ", " + class5 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void add_new_npc(int i, Buffer buffer) {
		while (true) {
			if (buffer.bitOffset + 21 >= i * 8) {
				break;
			}
			int index = buffer.getBits(14);
			if (index == 16383) {
				break;
			}
			if (local_npcs[index] == null) {
				local_npcs[index] = new NPC();
			}
            NPC npc = local_npcs[index];
            local_npc_indices[expected_npc_count++] = index;
            npc.anInt1660 = anInt1240;
            npc.definition = NPCDefinition.forId(buffer.getBits(11));
            npc.size = npc.definition.size;
            npc.degrees_to_turn = npc.definition.degrees_to_turn;
            npc.walk_animation = npc.definition.walk_animation;
            npc.rotate_animation = npc.definition.rotate_animation;
            npc.counter_clockwise_animation = npc.definition.counter_clockwise_animation;
            npc.clockwise_animation = npc.definition.clockwise_animation;
            npc.idle_animation = npc.definition.idle_animation;
			int local_x = buffer.getBits(5);
			int local_y = buffer.getBits(5);
			
			if (local_x > 15) {
				local_x -= 32;
			}
			if (local_y > 15) {
				local_y -= 32;
			}
			int teleporting = buffer.getBits(1);
			int update_required = buffer.getBits(1);
			npc.teleport(((RenderingHints) (player_appearance)).walking_queue_x[0] + local_x, ((RenderingHints) (player_appearance)).walking_queue_y[0] + local_y, teleporting == 1);
			if (update_required == 1) {
				local_entities[local_player_count++] = index;
			}
        }
        buffer.endBitAccess();
    }

    public void method13(boolean flag, int i, String s)
    {
        try
        {
            anInt1176 = i;
            aString926 = s;
            method87(831);
            if(flag)
            {
                aBoolean1061 = !aBoolean1061;
            }
            if(aClass47_1117 == null)
            {
                super.method13(false, i, s);
                return;
            }
            aClass34_1265.method272((byte)5);
            char c = '\u0168';
            char c1 = '\310';
            byte byte0 = 20;
            chat_area_graphics.draw_centered_string("RuneScape is loading - please wait...", c1 / 2 - 26 - byte0, c / 2, 0xffffff);
            int j = c1 / 2 - 18 - byte0;
            DrawingArea.method412(1, c / 2 - 152, 304, 0x8c1111, j, 34);
            DrawingArea.method412(1, c / 2 - 151, 302, 0, j + 1, 32);
            DrawingArea.method411(0x8c1111, 210, j + 2, 30, c / 2 - 150, i * 3);
            DrawingArea.method411(0, 210, j + 2, 30, (c / 2 - 150) + i * 3, 300 - i * 3);
            chat_area_graphics.draw_centered_string(s, (c1 / 2 + 5) - byte0, c / 2, 0xffffff);
            aClass34_1265.method273(-781, 202, 171, super.graphics);
            if(aBoolean908)
            {
                aBoolean908 = false;
                if(!aBoolean1174)
                {
                    aClass34_1266.method273(-781, 0, 0, super.graphics);
                    aClass34_1267.method273(-781, 637, 0, super.graphics);
                }
                aClass34_1263.method273(-781, 128, 0, super.graphics);
                aClass34_1264.method273(-781, 202, 371, super.graphics);
                aClass34_1268.method273(-781, 0, 265, super.graphics);
                aClass34_1269.method273(-781, 562, 265, super.graphics);
                aClass34_1270.method273(-781, 128, 171, super.graphics);
                aClass34_1271.method273(-781, 562, 171, super.graphics);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10134, " + flag + ", " + i + ", " + s + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method43(int i)
    {
        try
        {
            anInt1189++;
            method110(true, true);
            method50(false, true);
            method110(true, false);
            method50(false, false);
            method69(aByte1098);
            method114(-249);
            if(!aBoolean829)
            {
                int j = anInt929;
                if(anInt1239 / 256 > j)
                {
                    j = anInt1239 / 256;
                }
                if(aBooleanArray1209[4] && anIntArray1206[4] + 128 > j)
                {
                    j = anIntArray1206[4] + 128;
                }
                int l = anInt930 + anInt1106 & 0x7ff;
                positionCamera(600 + j * 3, (byte)6, l, method51(false, ((RenderingHints) (player_appearance)).anInt1616, ((RenderingHints) (player_appearance)).anInt1615, height_level) - 50, anInt1082, anInt1081, j);
            }
            int k;
            if(!aBoolean829)
            {
                k = method126((byte)2);
            } else
            {
                k = method127((byte)7);
            }
            int i1 = camera_x;
            int j1 = anInt876;
            int k1 = camera_y;
            int l1 = anInt878;
            int i2 = anInt879;
            for(int j2 = 0; j2 < 5; j2++)
            {
                if(aBooleanArray1209[j2])
                {
                    int k2 = (int)((Math.random() * (double)(anIntArray976[j2] * 2 + 1) - (double)anIntArray976[j2]) + Math.sin((double)anIntArray1001[j2] * ((double)anIntArray943[j2] / 100D)) * (double)anIntArray1206[j2]);
                    if(j2 == 0)
                    {
                        camera_x += k2;
                    }
                    if(j2 == 1)
                    {
                        anInt876 += k2;
                    }
                    if(j2 == 2)
                    {
                        camera_y += k2;
                    }
                    if(j2 == 3)
                    {
                        anInt879 = anInt879 + k2 & 0x7ff;
                    }
                    if(j2 == 4)
                    {
                        anInt878 += k2;
                        if(anInt878 < 128)
                        {
                            anInt878 = 128;
                        }
                        if(anInt878 > 383)
                        {
                            anInt878 = 383;
                        }
                    }
                }
            }
            int l2 = Rasterizer.anInt1438;
            Model.aBoolean1593 = true;
            Model.anInt1596 = 0;
            if(i != 0)
            {
                return;
            } else
            {
                Model.anInt1594 = super.mouse_x - 4;
                Model.anInt1595 = super.mouse_y - 4;
                DrawingArea.method409((byte)127);
                aClass36_1192.method317(camera_x, 7, anInt878, camera_y, k, anInt876, anInt879);
                aClass36_1192.method292(true);
                method61(1);
                method136(anInt1019);
                method62(l2, (byte)-12);
                method16(-8033);
                aClass34_1197.method273(-781, 4, 4, super.graphics);
                camera_x = i1;
                anInt876 = j1;
                camera_y = k1;
                anInt878 = l1;
                anInt879 = i2;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("19860, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method44(long l, int i)
    {
        try
        {
            if(i != 37517)
            {
                groundItems = null;
            }
            if(l == 0L)
            {
                return;
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    anInt1104--;
                    redrawTabArea = true;
                    for(int k = j; k < anInt1104; k++)
                    {
                        aStringArray1044[k] = aStringArray1044[k + 1];
                        anIntArray894[k] = anIntArray894[k + 1];
                        aLongArray979[k] = aLongArray979[k + 1];
                    }
                    buffer.putOpcode(203);
                    buffer.putLong(l);
                    return;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("67342, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method45(int i)
    {
        try
        {
            while(i >= 0)
            {
                buffer.putByte(139);
            }
            if(anInt1017 == 0)
            {
                return;
            }
            int j = 0;
            if(anInt998 != 0)
            {
                j = 1;
            }
            for(int k = 0; k < 100; k++)
            {
                if(chat_entry_text[k] != null)
                {
                    int l = chat_entry_type[k];
                    String s = chat_entry_username[k];
                    if(s != null && s.startsWith("@cr1@"))
                    {
                        s = s.substring(5);
                    }
                    if(s != null && s.startsWith("@cr2@"))
                    {
                        s = s.substring(5);
                    }
                    if((l == 3 || l == 7) && (l == 7 || pm_settings == 0 || pm_settings == 1 && method80(s, 3)))
                    {
                        int i1 = 329 - j * 13;
                        if(super.mouse_x > 4 && super.mouse_y - 4 > i1 - 10 && super.mouse_y - 4 <= i1 + 3)
                        {
                            int j1 = plain_font.method457("From:  " + s + chat_entry_text[k], true) + 25;
                            if(j1 > 450)
                            {
                                j1 = 450;
                            }
                            if(super.mouse_x < 4 + j1)
                            {
                                if(user_privilege >= 1)
                                {
                                    aStringArray897[anInt971] = "Report abuse @whi@" + s;
                                    anIntArray839[anInt971] = 2524;
                                    anInt971++;
                                }
                                aStringArray897[anInt971] = "Add ignore @whi@" + s;
                                anIntArray839[anInt971] = 2047;
                                anInt971++;
                                aStringArray897[anInt971] = "Add friend @whi@" + s;
                                anIntArray839[anInt971] = 2605;
                                anInt971++;
                            }
                        }
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if((l == 5 || l == 6) && pm_settings < 2 && ++j >= 5)
                    {
                        return;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("41007, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String getParameter(String s)
    {
        if(signlink.mainapp != null)
        {
            return signlink.mainapp.getParameter(s);
        } else
        {
            return super.getParameter(s);
        }
    }

	public void get_player_update_flags(int rendering_hints, Buffer buffer, int j, PlayerModel appearance) {
		
		/*
		 * Appearance
		 */
		if ((rendering_hints & 1) == 1) {
			int size = buffer.getUnsignedByte();
			byte data[] = new byte[size];
			Buffer buffer_ = new Buffer(data);
			buffer.read(data, 0, size);
			render_buffer[j] = buffer_;
			appearance.render(false, buffer_);
		}
		
		/*
		 * Animation
		 */
		if ((rendering_hints & 2) == 2) {
			int animation_id = buffer.getUnsignedShort();
			if (animation_id == 65535) {
				animation_id = -1;
			}
			if (animation_id == ((RenderingHints) (appearance)).animation_id) {
				appearance.anInt1647 = 0;
			}
			int animation_delay = buffer.getUnsignedByte();
			if (animation_id == ((RenderingHints) (appearance)).animation_id && animation_id != -1) {
				int j3 = AnimationSequence.cache[animation_id].replay_mode;
				if (j3 == 1) {
					appearance.anInt1644 = 0;
					appearance.anInt1645 = 0;
					appearance.animation_delay = animation_delay;
					appearance.anInt1647 = 0;
				}
				if (j3 == 2) {
					appearance.anInt1647 = 0;
				}
			} else if (animation_id == -1 || ((RenderingHints) (appearance)).animation_id == -1 || AnimationSequence.cache[animation_id].priority >= AnimationSequence.cache[((RenderingHints) (appearance)).animation_id].priority) {
				appearance.animation_id = animation_id;
				appearance.anInt1644 = 0;
				appearance.anInt1645 = 0;
				appearance.animation_delay = animation_delay;
				appearance.anInt1647 = 0;
				appearance.anInt1669 = ((RenderingHints) (appearance)).current_step;
			}
		}
		
		/*
		 * Face entity
		 */
		if ((rendering_hints & 4) == 4) {
			appearance.interacting_entity = buffer.getUnsignedShort();
			if (((RenderingHints) (appearance)).interacting_entity == 65535) {
				appearance.interacting_entity = -1;
			}
		}
		
		/*
		 * Forced chat
		 */
		if ((rendering_hints & 8) == 8) {
			appearance.floating_text = buffer.getRSString();
			if (((RenderingHints) (appearance)).floating_text.charAt(0) == '~') {
				appearance.floating_text = ((RenderingHints) (appearance)).floating_text.substring(1);
				message(2, ((RenderingHints) (appearance)).floating_text, appearance.username);
			} else if (appearance == player_appearance) {
				message(2, ((RenderingHints) (appearance)).floating_text, appearance.username);
			}
			appearance.textColor = 0;
			appearance.textEffects = 0;
			appearance.anInt1628 = 150;
		}

		/*
		 * Primary hit
		 */
		if ((rendering_hints & 0x10) == 16) {
			int j1 = buffer.getUnsignedByte();
			int k2 = buffer.getUnsignedByte();
			appearance.method536(k2, anInt1240, j1, false);
			appearance.anInt1634 = anInt1240 + 300;
			appearance.anInt1635 = buffer.getUnsignedByte();
			appearance.anInt1636 = buffer.getUnsignedByte();
		}

		/*
		 * facing coordinate
		 */
		if ((rendering_hints & 0x20) == 32) {
			appearance.view_x = buffer.getUnsignedShort();
			appearance.view_y = buffer.getUnsignedShort();
		}
        
        /*
         * Chat
         */
		if ((rendering_hints & 0x40) == 64) {
			int size = buffer.getUnsignedShort();
			int color = buffer.getUnsignedByte();
			int effects = buffer.getUnsignedByte();
			int l3 = buffer.pointer;
			if (appearance.username != null && appearance.aBoolean1673) {
				long l4 = StringUtil.hash(appearance.username);
				boolean flag = false;
				if (color <= 1) {
					for (int i4 = 0; i4 < anInt957; i4++) {
						if (aLongArray1254[i4] != l4) {
							continue;
						}
						flag = true;
						break;
					}
				}
				if (!flag && anInt1245 == 0) {
					try {
						String s = RS2BufferUtils.method556((byte) -94, buffer, effects);
						s = Class41.method352(s, anInt1242);
						appearance.floating_text = s;
						appearance.textColor = size >> 8;
						appearance.textEffects = size & 0xff;
						appearance.anInt1628 = 150;
						if (color == 2 || color == 3) {
							message(1, s, "@cr2@" + appearance.username);
						} else if (color == 1) {
							message(1, s, "@cr1@" + appearance.username);
						} else {
							message(2, s, appearance.username);
						}
					} catch (Exception exception) {
						signlink.reporterror("cde2");
					}
				}
			}
			buffer.pointer = l3 + effects;
		}
		
		/*
		 * Graphic
		 */
		if ((rendering_hints & 0x100) == 256) {
			appearance.spotanim_id = buffer.getUnsignedShort();
			int modifier = buffer.getUnsignedInt();
			appearance.spotanim_height = modifier >> 16;
			appearance.anspotanim_delay = anInt1240 + (modifier & 0xffff);
			appearance.anInt1649 = 0;
			appearance.anInt1650 = 0;
			if (((RenderingHints) (appearance)).anspotanim_delay > anInt1240) {
				appearance.anInt1649 = -1;
			}
			if (((RenderingHints) (appearance)).spotanim_id == 65535) {
				appearance.spotanim_id = -1;
			}
		}
		
		/*
		 * Force walk
		 */
        if((rendering_hints & 0x200) == 512)
        {
            appearance.anInt1653 = buffer.getUnsignedByte();
            appearance.anInt1655 = buffer.getUnsignedByte();
            appearance.anInt1654 = buffer.getUnsignedByte();
            appearance.anInt1656 = buffer.getUnsignedByte();
            appearance.anInt1657 = buffer.getUnsignedShort() + anInt1240;
            appearance.anInt1658 = buffer.getUnsignedShort() + anInt1240;
            appearance.anInt1659 = buffer.getUnsignedByte();
            appearance.reset_movement();
        }
        
        /*
         * Secondary hit
         */
        if((rendering_hints & 0x400) == 1024)
        {
            int i2 = buffer.getUnsignedByte();
            int i3 = buffer.getUnsignedByte();
            appearance.method536(i3, anInt1240, i2, false);
            appearance.anInt1634 = anInt1240 + 300;
            appearance.anInt1635 = buffer.getUnsignedByte();
            appearance.anInt1636 = buffer.getUnsignedByte();
            return;
        }
    }

    public void method47(int i) {
        if(i <= 0) {
            packet_opcode = -1;
        }
        aClass34_1198.method272((byte)5);
        Rasterizer.anIntArray1429 = anIntArray914;
        aClass44_Sub3_Sub1_Sub3_1145.method453(0, aByte1213, 0);
        if(aBoolean1222) {
            chat_area_graphics.draw_centered_string(aString1102, 40, 239, 0);
            chat_area_graphics.draw_centered_string(aString1007 + "*", 60, 239, 128);
        } else if(user_amount_prompt) {
            chat_area_graphics.draw_centered_string("Enter amount:", 40, 239, 0);
            chat_area_graphics.draw_centered_string(aString1092 + "*", 60, 239, 128);
        } else if(aString823 != null) {
            chat_area_graphics.draw_centered_string(aString823, 40, 239, 0);
            chat_area_graphics.draw_centered_string("Click to continue", 60, 239, 128);
        } else if (active_chat_interface != -1) {
			method37(6, 0, 0, Interface.interfaces[active_chat_interface], 0);
		} else if (dialog_id != -1) {
			method37(6, 0, 0, Interface.interfaces[dialog_id], 0);
		} else {
			RSFont font = plain_font;
			int j = 0;
			DrawingArea.method408(77, 463, 0, 0);
			for (int k = 0; k < 100; k++) {
				if (chat_entry_text[k] != null) {
					int l = chat_entry_type[k];
					int i1 = (70 - j * 14) + anInt1103;
					String s1 = chat_entry_username[k];
					byte byte0 = 0;
					if (s1 != null && s1.startsWith("@cr1@")) {
						s1 = s1.substring(5);
						byte0 = 1;
					}
					if (s1 != null && s1.startsWith("@cr2@")) {
						s1 = s1.substring(5);
						byte0 = 2;
					}
					if (l == 0) {
						if (i1 > 0 && i1 < 110) {
							font.method459((byte) -104, 0, chat_entry_text[k], 4, i1);
						}
						j++;
					}
                    if((l == 1 || l == 2) && (l == 1 || chat_settings == 0 || chat_settings == 1 && method80(s1, 3)))
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            int j1 = 4;
                            if(byte0 == 1)
                            {
                                aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, j1);
                                j1 += 14;
                            }
                            if(byte0 == 2)
                            {
                                aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, j1);
                                j1 += 14;
                            }
                            font.method459((byte)-104, 0, s1 + ":", j1, i1);
                            j1 += font.method457(s1, true) + 8;
                            font.method459((byte)-104, 255, chat_entry_text[k], j1, i1);
                        }
                        j++;
                    }
                    if((l == 3 || l == 7) && anInt1017 == 0 && (l == 7 || pm_settings == 0 || pm_settings == 1 && method80(s1, 3)))
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            int k1 = 4;
                            font.method459((byte)-104, 0, "From", k1, i1);
                            k1 += font.method457("From ", true);
                            if(byte0 == 1)
                            {
                                aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, k1);
                                k1 += 14;
                            }
                            if(byte0 == 2)
                            {
                                aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, k1);
                                k1 += 14;
                            }
                            font.method459((byte)-104, 0, s1 + ":", k1, i1);
                            k1 += font.method457(s1, true) + 8;
                            font.method459((byte)-104, 0x800000, chat_entry_text[k], k1, i1);
                        }
                        j++;
                    }
                    if(l == 4 && (trade_settings == 0 || trade_settings == 1 && method80(s1, 3)))
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            font.method459((byte)-104, 0x800080, s1 + " " + chat_entry_text[k], 4, i1);
                        }
                        j++;
                    }
                    if(l == 5 && anInt1017 == 0 && pm_settings < 2)
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            font.method459((byte)-104, 0x800000, chat_entry_text[k], 4, i1);
                        }
                        j++;
                    }
                    if(l == 6 && anInt1017 == 0 && pm_settings < 2)
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            font.method459((byte)-104, 0, "To " + s1 + ":", 4, i1);
                            font.method459((byte)-104, 0x800000, chat_entry_text[k], 12 + font.method457("To " + s1, true), i1);
                        }
                        j++;
                    }
                    if(l == 8 && (trade_settings == 0 || trade_settings == 1 && method80(s1, 3)))
                    {
                        if(i1 > 0 && i1 < 110)
                        {
                            font.method459((byte)-104, 0x7e3200, s1 + " " + chat_entry_text[k], 4, i1);
                        }
                        j++;
                    }
                }
            }
            DrawingArea.method407((byte)-92);
            anInt874 = j * 14 + 7;
            if(anInt874 < 78)
            {
                anInt874 = 78;
            }
            method21(0, 463, anInt874 - anInt1103 - 77, anInt874, 77, 3);
            String s;
            if(player_appearance != null && player_appearance.username != null)
            {
                s = player_appearance.username;
            } else
            {
                s = StringUtil.format(aString1071, true);
            }
            font.method459((byte)-104, 0, s + ":", 4, 90);
            font.method459((byte)-104, 255, chat_text + "*", 6 + font.method457(s + ": ", true), 90);
            DrawingArea.method414(479, 0, 0, true, 77);
        }
        if(aBoolean946 && anInt1030 == 2)
        {
            method115(393);
        }
        aClass34_1198.method273(-781, 17, 357, super.graphics);
        aClass34_1197.method272((byte)5);
        Rasterizer.anIntArray1429 = anIntArray916;
    }

    public void method48(int i)
    {
        try
        {
            aClass44_Sub3_Sub1_Sub3_891 = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "titlebox", 0);
            aClass44_Sub3_Sub1_Sub3_892 = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "titlebutton", 0);
            aClass44_Sub3_Sub1_Sub3Array864 = new Class44_Sub3_Sub1_Sub3[12];
            int j = 0;
            try
            {
                j = Integer.parseInt(getParameter("fl_icon"));
            }
            catch(Exception _ex)
            {
            }
            if(j == 0)
            {
                for(int k = 0; k < 12; k++)
                {
                    aClass44_Sub3_Sub1_Sub3Array864[k] = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "runes", k);
                }
            } else
            {
                for(int l = 0; l < 12; l++)
                {
                    aClass44_Sub3_Sub1_Sub3Array864[l] = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "runes", 12 + (l & 3));
                }
            }
            aClass44_Sub3_Sub1_Sub2_1277 = new Sprite(128, 265);
            if(i >= 0)
            {
                return;
            }
            aClass44_Sub3_Sub1_Sub2_1278 = new Sprite(128, 265);
            for(int i1 = 0; i1 < 33920; i1++)
            {
                aClass44_Sub3_Sub1_Sub2_1277.pixel_array[i1] = aClass34_1266.anIntArray582[i1];
            }
            for(int j1 = 0; j1 < 33920; j1++)
            {
                aClass44_Sub3_Sub1_Sub2_1278.pixel_array[j1] = aClass34_1267.anIntArray582[j1];
            }
            anIntArray1219 = new int[256];
            for(int k1 = 0; k1 < 64; k1++)
            {
                anIntArray1219[k1] = k1 * 0x40000;
            }
            for(int l1 = 0; l1 < 64; l1++)
            {
                anIntArray1219[l1 + 64] = 0xff0000 + 1024 * l1;
            }
            for(int i2 = 0; i2 < 64; i2++)
            {
                anIntArray1219[i2 + 128] = 0xffff00 + 4 * i2;
            }
            for(int j2 = 0; j2 < 64; j2++)
            {
                anIntArray1219[j2 + 192] = 0xffffff;
            }
            anIntArray1220 = new int[256];
            for(int k2 = 0; k2 < 64; k2++)
            {
                anIntArray1220[k2] = k2 * 1024;
            }
            for(int l2 = 0; l2 < 64; l2++)
            {
                anIntArray1220[l2 + 64] = 65280 + 4 * l2;
            }
            for(int i3 = 0; i3 < 64; i3++)
            {
                anIntArray1220[i3 + 128] = 65535 + 0x40000 * i3;
            }
            for(int j3 = 0; j3 < 64; j3++)
            {
                anIntArray1220[j3 + 192] = 0xffffff;
            }
            anIntArray1221 = new int[256];
            for(int k3 = 0; k3 < 64; k3++)
            {
                anIntArray1221[k3] = k3 * 4;
            }
            for(int l3 = 0; l3 < 64; l3++)
            {
                anIntArray1221[l3 + 64] = 255 + 0x40000 * l3;
            }
            for(int i4 = 0; i4 < 64; i4++)
            {
                anIntArray1221[i4 + 128] = 0xff00ff + 1024 * i4;
            }
            for(int j4 = 0; j4 < 64; j4++)
            {
                anIntArray1221[j4 + 192] = 0xffffff;
            }
            anIntArray1218 = new int[256];
            anIntArray1133 = new int[32768];
            anIntArray1134 = new int[32768];
            method109(null, 34809);
            anIntArray1272 = new int[32768];
            anIntArray1273 = new int[32768];
            method13(false, 10, "Connecting to fileserver");
            if(!aBoolean1174)
            {
                aBoolean886 = true;
                aBoolean1174 = true;
                submit(this, 2);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("92179, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method49(byte byte0)
    {
        try
        {
            if(byte0 != aByte1101)
            {
                aBoolean1178 = !aBoolean1178;
            }
            try
            {
                int i = ((RenderingHints) (player_appearance)).anInt1615 + anInt1011;
                int j = ((RenderingHints) (player_appearance)).anInt1616 + anInt1215;
                if(anInt1081 - i < -500 || anInt1081 - i > 500 || anInt1082 - j < -500 || anInt1082 - j > 500)
                {
                    anInt1081 = i;
                    anInt1082 = j;
                }
                if(anInt1081 != i)
                {
                    anInt1081 += (i - anInt1081) / 16;
                }
                if(anInt1082 != j)
                {
                    anInt1082 += (j - anInt1082) / 16;
                }
                if(super.player_configuration[1] == 1)
                {
                    anInt931 += (-24 - anInt931) / 2;
                } else
                if(super.player_configuration[2] == 1)
                {
                    anInt931 += (24 - anInt931) / 2;
                } else
                {
                    anInt931 /= 2;
                }
                if(super.player_configuration[3] == 1)
                {
                    anInt932 += (12 - anInt932) / 2;
                } else
                if(super.player_configuration[4] == 1)
                {
                    anInt932 += (-12 - anInt932) / 2;
                } else
                {
                    anInt932 /= 2;
                }
                anInt930 = anInt930 + anInt931 / 2 & 0x7ff;
                anInt929 += anInt932 / 2;
                if(anInt929 < 128)
                {
                    anInt929 = 128;
                }
                if(anInt929 > 383)
                {
                    anInt929 = 383;
                }
                int k = anInt1081 >> 7;
                int l = anInt1082 >> 7;
                int i1 = method51(false, anInt1082, anInt1081, height_level);
                int j1 = 0;
                if(k > 3 && l > 3 && k < 100 && l < 100)
                {
                    for(int k1 = k - 4; k1 <= k + 4; k1++)
                    {
                        for(int i2 = l - 4; i2 <= l + 4; i2++)
                        {
                            int j2 = height_level;
                            if(j2 < 3 && (aByteArrayArrayArray871[1][k1][i2] & 2) == 2)
                            {
                                j2++;
                            }
                            int k2 = i1 - anIntArrayArrayArray865[j2][k1][i2];
                            if(k2 > j1)
                            {
                                j1 = k2;
                            }
                        }
                    }
                }
                int l1 = j1 * 192;
                if(l1 > 0x17f00)
                {
                    l1 = 0x17f00;
                }
                if(l1 < 32768)
                {
                    l1 = 32768;
                }
                if(l1 > anInt1239)
                {
                    anInt1239 += (l1 - anInt1239) / 24;
                    return;
                }
                if(l1 < anInt1239)
                {
                    anInt1239 += (l1 - anInt1239) / 80;
                    return;
                }
            }
            catch(Exception _ex)
            {
                signlink.reporterror("glfc_ex " + ((RenderingHints) (player_appearance)).anInt1615 + "," + ((RenderingHints) (player_appearance)).anInt1616 + "," + anInt1081 + "," + anInt1082 + "," + region_x + "," + region_y + "," + base_x + "," + base_y);
                throw new RuntimeException("eek");
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96812, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method50(boolean flag, boolean flag1)
    {
        try
        {
            for(int i = 0; i < expected_npc_count; i++)
            {
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[local_npc_indices[i]];
                int j = 0x20000000 + (local_npc_indices[i] << 14);
                if(class44_sub3_sub4_sub6_sub2 == null || !class44_sub3_sub4_sub6_sub2.method535(true) || class44_sub3_sub4_sub6_sub2.definition.hidden != flag1)
                {
                    continue;
                }
                int k = ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 >> 7;
                int l = ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 >> 7;
                if(k < 0 || k >= 104 || l < 0 || l >= 104)
                {
                    continue;
                }
                if(((RenderingHints) (class44_sub3_sub4_sub6_sub2)).size == 1 && (((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 & 0x7f) == 64 && (((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 & 0x7f) == 64)
                {
                    if(anIntArrayArray885[k][l] == anInt1189)
                    {
                        continue;
                    }
                    anIntArrayArray885[k][l] = anInt1189;
                }
                aClass36_1192.method289((((RenderingHints) (class44_sub3_sub4_sub6_sub2)).size - 1) * 64 + 60, j, method51(false, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615, height_level), ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615, 384, class44_sub3_sub4_sub6_sub2, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1617, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).aBoolean1618, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616, height_level);
            }
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10709, " + flag + ", " + flag1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method51(boolean flag, int i, int j, int k)
    {
        try
        {
            int l = j >> 7;
            int i1 = i >> 7;
            if(l < 0 || i1 < 0 || l > 103 || i1 > 103)
            {
                return 0;
            }
            int j1 = k;
            if(j1 < 3 && (aByteArrayArrayArray871[1][l][i1] & 2) == 2)
            {
                j1++;
            }
            int k1 = j & 0x7f;
            int l1 = i & 0x7f;
            int i2 = anIntArrayArrayArray865[j1][l][i1] * (128 - k1) + anIntArrayArrayArray865[j1][l + 1][i1] * k1 >> 7;
            if(flag)
            {
                return 3;
            } else
            {
                int j2 = anIntArrayArrayArray865[j1][l][i1 + 1] * (128 - k1) + anIntArrayArrayArray865[j1][l + 1][i1 + 1] * k1 >> 7;
                return i2 * (128 - l1) + j2 * l1 >> 7;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("38676, " + flag + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method52(int i)
    {
        try
        {
            if(i <= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            if(anInt971 < 2 && anInt952 == 0 && anInt994 == 0)
            {
                return;
            }
            String s;
            if(anInt952 == 1 && anInt971 < 2)
            {
                s = "Use " + selected_item_id + " with...";
            } else
            if(anInt994 == 1 && anInt971 < 2)
            {
                s = aString997 + "...";
            } else
            {
                s = aStringArray897[anInt971 - 1];
            }
            if(anInt971 > 2)
            {
                s = s + "@whi@ / " + (anInt971 - 2) + " more options";
            }
            chat_area_graphics.method464(s, true, 0xffffff, 26617, 4, anInt1240 / 1000, 15);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20355, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method53(int i)
    {
        try
        {
            if(i < 9 || i > 9)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            Graphics g = method11(7).getGraphics();
            g.setColor(Color.black);
            g.fillRect(0, 0, 765, 503);
            method4(1, 711);
            if(aBoolean1055)
            {
                aBoolean1174 = false;
                g.setFont(new Font("Helvetica", 1, 16));
                g.setColor(Color.yellow);
                int k = 35;
                g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, k);
                k += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, k);
                k += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, k);
                k += 30;
                g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, k);
                k += 30;
                g.drawString("3: Try using a different game-world", 30, k);
                k += 30;
                g.drawString("4: Try rebooting your computer", 30, k);
                k += 30;
                g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, k);
            }
            if(aBoolean820)
            {
                aBoolean1174 = false;
                g.setFont(new Font("Helvetica", 1, 20));
                g.setColor(Color.white);
                g.drawString("Error - unable to load game!", 50, 50);
                g.drawString("To play RuneScape make sure you play from", 50, 100);
                g.drawString("http://www.runescape.com", 50, 150);
            }
            if(aBoolean1236)
            {
                aBoolean1174 = false;
                g.setColor(Color.yellow);
                int l = 35;
                g.drawString("Error a copy of RuneScape already appears to be loaded", 30, l);
                l += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, l);
                l += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, l);
                l += 30;
                g.drawString("2: Try rebooting your computer, and reloading", 30, l);
                l += 30;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("39122, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method54(byte byte0)
    {
        try
        {
            if(anInt1095 != 0)
            {
                return;
            }
            aStringArray897[0] = "Cancel";
            anIntArray839[0] = 1106;
            if(byte0 == 6)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            anInt971 = 1;
            method45(-113);
            anInt825 = 0;
            if(super.mouse_x > 4 && super.mouse_y > 4 && super.mouse_x < 516 && super.mouse_y < 338)
            {
                if(active_game_interface != -1)
                {
                    method30(4, 0, super.mouse_x, Interface.interfaces[active_game_interface], 4, super.mouse_y, 792);
                } else
                {
                    method135(true);
                }
            }
            if(anInt825 != anInt999)
            {
                anInt999 = anInt825;
            }
            anInt825 = 0;
            if(super.mouse_x > 553 && super.mouse_y > 205 && super.mouse_x < 743 && super.mouse_y < 466)
            {
                if(active_inventory_interface != -1)
                {
                    method30(553, 0, super.mouse_x, Interface.interfaces[active_inventory_interface], 205, super.mouse_y, 792);
                } else
                if(sidebarInterfaces[anInt1027] != -1)
                {
                    method30(553, 0, super.mouse_x, Interface.interfaces[sidebarInterfaces[anInt1027]], 205, super.mouse_y, 792);
                }
            }
            if(anInt825 != anInt933)
            {
                redrawTabArea = true;
                anInt933 = anInt825;
            }
            anInt825 = 0;
            if(super.mouse_x > 17 && super.mouse_y > 357 && super.mouse_x < 496 && super.mouse_y < 453)
            {
                if(active_chat_interface != -1)
                {
                    method30(17, 0, super.mouse_x, Interface.interfaces[active_chat_interface], 357, super.mouse_y, 792);
                } else
                if(super.mouse_y < 434 && super.mouse_x < 426)
                {
                    method111(super.mouse_x - 17, (byte)7, super.mouse_y - 357);
                }
            }
            if(active_chat_interface != -1 && anInt825 != anInt1212)
            {
                inputTaken = true;
                anInt1212 = anInt825;
            }
            for(boolean flag = false; !flag;)
            {
                flag = true;
                for(int i = 0; i < anInt971 - 1; i++)
                {
                    if(anIntArray839[i] < 1000 && anIntArray839[i + 1] > 1000)
                    {
                        String s = aStringArray897[i];
                        aStringArray897[i] = aStringArray897[i + 1];
                        aStringArray897[i + 1] = s;
                        int j = anIntArray839[i];
                        anIntArray839[i] = anIntArray839[i + 1];
                        anIntArray839[i + 1] = j;
                        j = anIntArray837[i];
                        anIntArray837[i] = anIntArray837[i + 1];
                        anIntArray837[i + 1] = j;
                        j = anIntArray838[i];
                        anIntArray838[i] = anIntArray838[i + 1];
                        anIntArray838[i + 1] = j;
                        j = anIntArray840[i];
                        anIntArray840[i] = anIntArray840[i + 1];
                        anIntArray840[i + 1] = j;
                        flag = false;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("40244, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method55(byte byte0, long l)
    {
        try
        {
            if(l == 0L)
            {
                return;
            }
            if(anInt957 >= 100)
            {
                message(0, "Your ignore list is full. Max of 100 hit", "");
                return;
            }
            String s = StringUtil.format(StringUtil.from_hash(l, true), true);
            for(int i = 0; i < anInt957; i++)
            {
                if(aLongArray1254[i] == l)
                {
                    message(0, s + " is already on your ignore list", "");
                    return;
                }
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    message(0, "Please remove " + s + " from your friend list first", "");
                    return;
                }
            }
            aLongArray1254[anInt957++] = l;
            if(byte0 != -37)
            {
                buffer.putByte(42);
            }
            redrawTabArea = true;
            buffer.putOpcode(192);
            buffer.putLong(l);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("6582, " + byte0 + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void main(String args[])
    {
        try
        {
            System.out.println("RS2 user client - release #" + 289);
            args = new String[] {
            		"10", "0", "highmem", "members", "32"
            };
            if(args.length != 5)
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            anInt1232 = Integer.parseInt(args[0]);
            port_offset = Integer.parseInt(args[1]);
            if(args[2].equals("lowmem"))
            {
                method131();
            } else
            if(args[2].equals("highmem"))
            {
                method64(true);
            } else
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            if(args[3].equals("free"))
            {
                aBoolean1234 = false;
            } else
            if(args[3].equals("members"))
            {
                aBoolean1234 = true;
            } else
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            signlink.storeid = Integer.parseInt(args[4]);
            signlink.startpriv(InetAddress.getLocalHost());
            client client1 = new client();
            client1.method1(503, 765, 0);
            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    public void method56(int i)
    {
        try
        {
            if(anInt998 > 1)
            {
                anInt998--;
            }
            if(anInt1173 > 0)
            {
                anInt1173--;
            }
            for(int j = 0; j < 5; j++)
            {
                if(!method31(true))
                {
                    break;
                }
            }
            if(!aBoolean863)
            {
                return;
            }
            synchronized(aClass10_866.objectLock)
            {
                if(macro_flag)
                {
                    if(super.anInt27 != 0 || aClass10_866.index >= 40)
                    {
                        buffer.putOpcode(229);
                        buffer.putByte(0);
                        int j2 = buffer.pointer;
                        int j3 = 0;
                        for(int j4 = 0; j4 < aClass10_866.index; j4++)
                        {
                            if(j2 - buffer.pointer >= 240)
                            {
                                break;
                            }
                            j3++;
                            int l4 = aClass10_866.mouse_y[j4];
                            if(l4 < 0)
                            {
                                l4 = 0;
                            } else
                            if(l4 > 502)
                            {
                                l4 = 502;
                            }
                            int k5 = aClass10_866.mouse_x[j4];
                            if(k5 < 0)
                            {
                                k5 = 0;
                            } else
                            if(k5 > 764)
                            {
                                k5 = 764;
                            }
                            int i6 = l4 * 765 + k5;
                            if(aClass10_866.mouse_y[j4] == -1 && aClass10_866.mouse_x[j4] == -1)
                            {
                                k5 = -1;
                                l4 = -1;
                                i6 = 0x7ffff;
                            }
                            if(k5 == anInt887 && l4 == anInt888)
                            {
                                if(anInt819 < 2047)
                                {
                                    anInt819++;
                                }
                            } else
                            {
                                int j6 = k5 - anInt887;
                                anInt887 = k5;
                                int k6 = l4 - anInt888;
                                anInt888 = l4;
                                if(anInt819 < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31)
                                {
                                    j6 += 32;
                                    k6 += 32;
                                    buffer.putShort((anInt819 << 12) + (j6 << 6) + k6);
                                    anInt819 = 0;
                                } else
                                if(anInt819 < 8)
                                {
                                    buffer.putTriByte(0x800000 + (anInt819 << 19) + i6);
                                    anInt819 = 0;
                                } else
                                {
                                    buffer.putInt(0xc0000000 + (anInt819 << 19) + i6);
                                    anInt819 = 0;
                                }
                            }
                        }
                        buffer.writeSizeByte(buffer.pointer - j2);
                        if(j3 >= aClass10_866.index)
                        {
                            aClass10_866.index = 0;
                        } else
                        {
                            aClass10_866.index -= j3;
                            for(int i5 = 0; i5 < aClass10_866.index; i5++)
                            {
                                aClass10_866.mouse_x[i5] = aClass10_866.mouse_x[i5 + j3];
                                aClass10_866.mouse_y[i5] = aClass10_866.mouse_y[i5 + j3];
                            }
                        }
                    }
                } else
                {
                    aClass10_866.index = 0;
                }
            }
            if(super.anInt27 != 0)
            {
                long l = (super.aLong30 - aLong1181) / 50L;
                if(l > 4095L)
                {
                    l = 4095L;
                }
                aLong1181 = super.aLong30;
                int k2 = super.anInt29;
                if(k2 < 0)
                {
                    k2 = 0;
                } else
                if(k2 > 502)
                {
                    k2 = 502;
                }
                int k3 = super.anInt28;
                if(k3 < 0)
                {
                    k3 = 0;
                } else
                if(k3 > 764)
                {
                    k3 = 764;
                }
                int k4 = k2 * 765 + k3;
                int j5 = 0;
                if(super.anInt27 == 2)
                {
                    j5 = 1;
                }
                int l5 = (int)l;
                buffer.putOpcode(224);
                buffer.putInt((l5 << 20) + (j5 << 19) + k4);
            }
            if(anInt1083 > 0)
            {
                anInt1083--;
            }
            if(super.player_configuration[1] == 1 || super.player_configuration[2] == 1 || super.player_configuration[3] == 1 || super.player_configuration[4] == 1)
            {
                aBoolean1084 = true;
            }
            if(aBoolean1084 && anInt1083 <= 0)
            {
                anInt1083 = 20;
                aBoolean1084 = false;
                buffer.putOpcode(193);
                buffer.putShort(anInt929);
                buffer.putShort(anInt930);
            }
            if(super.aBoolean18 && !aBoolean934)
            {
                aBoolean934 = true;
                buffer.putOpcode(149);
                buffer.putByte(1);
            }
            if(!super.aBoolean18 && aBoolean934)
            {
                aBoolean934 = false;
                buffer.putOpcode(149);
                buffer.putByte(0);
            }
            method38((byte)6);
            method23(845);
            method108(948);
            anInt1171++;
            if(anInt1171 > 750)
            {
                draw_disconnection_text((byte)7);
            }
            method83((byte)5);
            method116(905);
            method20(0);
            anInt824++;
            if(anInt818 != 0)
            {
                anInt817 += 20;
                if(anInt817 >= 400)
                {
                    anInt818 = 0;
                }
            }
            if(anInt1151 != 0)
            {
                anInt1148++;
                if(anInt1148 >= 15)
                {
                    if(anInt1151 == 2)
                    {
                        redrawTabArea = true;
                    }
                    if(anInt1151 == 3)
                    {
                        inputTaken = true;
                    }
                    anInt1151 = 0;
                }
            }
            if(anInt1095 != 0)
            {
                anInt978++;
                if(super.mouse_x > anInt1096 + 5 || super.mouse_x < anInt1096 - 5 || super.mouse_y > anInt1097 + 5 || super.mouse_y < anInt1097 - 5)
                {
                    aBoolean847 = true;
                }
                if(super.anInt20 == 0)
                {
                    if(anInt1095 == 2)
                    {
                        redrawTabArea = true;
                    }
                    if(anInt1095 == 3)
                    {
                        inputTaken = true;
                    }
                    anInt1095 = 0;
                    if(aBoolean847 && anInt978 >= 5)
                    {
                        anInt983 = -1;
                        method54((byte)6);
                        if(anInt983 == anInt1093 && anInt982 != anInt1094)
                        {
                            Interface class5 = Interface.interfaces[anInt1093];
                            int j1 = 0;
                            if(anInt835 == 1 && class5.anInt109 == 206)
                            {
                                j1 = 1;
                            }
                            if(class5.item_id[anInt982] <= 0)
                            {
                                j1 = 0;
                            }
                            if(class5.aBoolean130)
                            {
                                int l2 = anInt1094;
                                int l3 = anInt982;
                                class5.item_id[l3] = class5.item_id[l2];
                                class5.item_count[l3] = class5.item_count[l2];
                                class5.item_id[l2] = -1;
                                class5.item_count[l2] = 0;
                            } else
                            if(j1 == 1)
                            {
                                int i3 = anInt1094;
                                for(int i4 = anInt982; i3 != i4;)
                                {
                                    if(i3 > i4)
                                    {
                                        class5.method182(0, i3 - 1, i3);
                                        i3--;
                                    } else
                                    if(i3 < i4)
                                    {
                                        class5.method182(0, i3 + 1, i3);
                                        i3++;
                                    }
                                }
                            } else
                            {
                                class5.method182(0, anInt982, anInt1094);
                            }
                            buffer.putOpcode(253);
                            buffer.putShort(anInt1093);
                            buffer.putShort(anInt1094);
                            buffer.putShort(anInt982);
                            buffer.putByte(j1);
                        }
                    } else
                    if((anInt862 == 1 || method26(anInt971 - 1, -40)) && anInt971 > 2)
                    {
                        method89(anInt899);
                    } else
                    if(anInt971 > 0)
                    {
                        method134(anInt971 - 1, 725);
                    }
                    anInt1148 = 10;
                    super.anInt27 = 0;
                }
            }
            anInt873++;
            if(anInt873 > 62)
            {
                anInt873 = 0;
                buffer.putOpcode(232);
            }
            if(Class36.anInt640 != -1)
            {
                int k = Class36.anInt640;
                int k1 = Class36.anInt641;
                boolean flag = walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, k1, 0, 0, true, 0, 124, 0, k, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                Class36.anInt640 = -1;
                if(flag)
                {
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 1;
                    anInt817 = 0;
                }
            }
            if(super.anInt27 == 1 && aString823 != null)
            {
                aString823 = null;
                inputTaken = true;
                super.anInt27 = 0;
            }
            method14((byte)1);
            method143(176);
            method106(-293);
            if(i <= 0)
            {
                buffer.putByte(98);
            }
            method145((byte)9);
            if(super.anInt20 == 1 || super.anInt27 == 1)
            {
                anInt1066++;
            }
            if(game_state == 2)
            {
                method49((byte)6);
            }
            if(game_state == 2 && aBoolean829)
            {
                method132(0);
            }
            for(int i1 = 0; i1 < 5; i1++)
            {
                anIntArray1001[i1]++;
            }
            method133(anInt1074);
            super.anInt19++;
            if(super.anInt19 > 4500)
            {
                anInt1173 = 250;
                super.anInt19 -= 500;
                buffer.putOpcode(145);
            }
            anInt921++;
            if(anInt921 > 500)
            {
                anInt921 = 0;
                int l1 = (int)(Math.random() * 8D);
                if((l1 & 1) == 1)
                {
                    anInt1011 += anInt1012;
                }
                if((l1 & 2) == 2)
                {
                    anInt1215 += anInt1216;
                }
                if((l1 & 4) == 4)
                {
                    anInt1106 += anInt1107;
                }
            }
            if(anInt1011 < -50)
            {
                anInt1012 = 2;
            }
            if(anInt1011 > 50)
            {
                anInt1012 = -2;
            }
            if(anInt1215 < -55)
            {
                anInt1216 = 2;
            }
            if(anInt1215 > 55)
            {
                anInt1216 = -2;
            }
            if(anInt1106 < -40)
            {
                anInt1107 = 1;
            }
            if(anInt1106 > 40)
            {
                anInt1107 = -1;
            }
            anInt907++;
            if(anInt907 > 500)
            {
                anInt907 = 0;
                int i2 = (int)(Math.random() * 8D);
                if((i2 & 1) == 1)
                {
                    anInt959 += anInt960;
                }
                if((i2 & 2) == 2)
                {
                    anInt1075 += anInt1076;
                }
            }
            if(anInt959 < -60)
            {
                anInt960 = 2;
            }
            if(anInt959 > 60)
            {
                anInt960 = -2;
            }
            if(anInt1075 < -20)
            {
                anInt1076 = 1;
            }
            if(anInt1075 > 10)
            {
                anInt1076 = -1;
            }
            anInt1172++;
            if(anInt1172 > 50)
            {
                buffer.putOpcode(181);
            }
            try
            {
                if(channel != null && buffer.pointer > 0)
                {
                    channel.write(buffer.payload, 0, buffer.pointer);
                    buffer.pointer = 0;
                    anInt1172 = 0;
                    return;
                }
            }
            catch(IOException _ex)
            {
                draw_disconnection_text((byte)7);
                return;
            }
            catch(Exception exception)
            {
                logout();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("87308, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void synchronize_players(int packet_size, Buffer buffer) {
		anInt940 = 0;
		local_player_count = 0;
		update_self(packet_size, buffer);
		update_other(buffer, packet_size);
		update_new(packet_size, buffer);
		prepare_render(buffer);
		for (int player_index = 0; player_index < anInt940; player_index++) {
			int local_index = local_entity_index[player_index];
			if (((RenderingHints) (player_models[local_index])).anInt1660 != anInt1240) {
				player_models[local_index] = null;
			}
		}
		if (buffer.pointer != packet_size)
			throw new RuntimeException("player packet size mismatch: " + buffer.pointer + "," + packet_size);
		for (int player_index = 0; player_index < expected_player_count; player_index++) {
			if (player_models[local_players[player_index]] == null)
				throw new NullPointerException("invalid player model - id:" + player_index + ", expected: " + expected_player_count);
		}
	}

	public void method58(int i, NPCDefinition definition, int j, int k, int l) {
		k = 43 / k;
		if (anInt971 >= 400) {
			return;
		}
		String npc_name = definition.name;
		if (definition.combat_level != 0) {
			npc_name = npc_name + getColorForLevelDifference(definition.combat_level, player_appearance.combat_level) + " (level-" + definition.combat_level + ")";
		}
		if (anInt952 == 1) {
			aStringArray897[anInt971] = "Use " + selected_item_id + " with @yel@" + npc_name;
			anIntArray839[anInt971] = 829;
			anIntArray840[anInt971] = i;
			anIntArray837[anInt971] = j;
			anIntArray838[anInt971] = l;
			anInt971++;
			return;
		}
		if (anInt994 == 1) {
			if ((anInt996 & 2) == 2) {
				aStringArray897[anInt971] = aString997 + " @yel@" + npc_name;
				anIntArray839[anInt971] = 240;
				anIntArray840[anInt971] = i;
				anIntArray837[anInt971] = j;
				anIntArray838[anInt971] = l;
				anInt971++;
				return;
			}
		} else {
			if (definition.menu_options != null) {
				for (int i1 = 4; i1 >= 0; i1--) {
					if (definition.menu_options[i1] != null
							&& !definition.menu_options[i1].equalsIgnoreCase("attack")) {
						aStringArray897[anInt971] = definition.menu_options[i1] + " @yel@" + npc_name;
						if (i1 == 0) {
							anIntArray839[anInt971] = 242;
						}
						if (i1 == 1) {
							anIntArray839[anInt971] = 209;
						}
						if (i1 == 2) {
							anIntArray839[anInt971] = 309;
						}
						if (i1 == 3) {
							anIntArray839[anInt971] = 852;
						}
						if (i1 == 4) {
							anIntArray839[anInt971] = 793;
						}
						anIntArray840[anInt971] = i;
						anIntArray837[anInt971] = j;
						anIntArray838[anInt971] = l;
						anInt971++;
					}
				}
			}
			if (definition.menu_options != null) {
				for (int j1 = 4; j1 >= 0; j1--) {
					if (definition.menu_options[j1] != null && definition.menu_options[j1].equalsIgnoreCase("attack")) {
						char c = '\0';
						if (definition.combat_level > player_appearance.combat_level) {
							c = '\u07D0';
						}
						aStringArray897[anInt971] = definition.menu_options[j1] + " @yel@" + npc_name;
						if (j1 == 0) {
							anIntArray839[anInt971] = 242 + c;
						}
						if (j1 == 1) {
							anIntArray839[anInt971] = 209 + c;
						}
						if (j1 == 2) {
							anIntArray839[anInt971] = 309 + c;
						}
						if (j1 == 3) {
							anIntArray839[anInt971] = 852 + c;
						}
						if (j1 == 4) {
							anIntArray839[anInt971] = 793 + c;
						}
						anIntArray840[anInt971] = i;
						anIntArray837[anInt971] = j;
						anIntArray838[anInt971] = l;
						anInt971++;
					}
				}
			}
			aStringArray897[anInt971] = "Examine @yel@" + npc_name;
			anIntArray839[anInt971] = 1714;
			anIntArray840[anInt971] = i;
			anIntArray837[anInt971] = j;
			anIntArray838[anInt971] = l;
			anInt971++;
		}
	}

	public void setMusicVolume(boolean flag, int i, boolean flag1) {
		aBoolean863 &= flag;
		signlink.midivol = i;
		if (flag1) {
			signlink.midi = "voladjust";
			return;
		}
	}

    public void method60(int i)
    {
        try
        {
            if(aClass34_1198 != null)
            {
                return;
            }
            method128(false);
            super.aClass34_14 = null;
            aClass34_1263 = null;
            aClass34_1264 = null;
            aClass34_1265 = null;
            aClass34_1266 = null;
            aClass34_1267 = null;
            aClass34_1268 = null;
            aClass34_1269 = null;
            aClass34_1270 = null;
            aClass34_1271 = null;
            aClass34_1198 = new Class34(method11(7), 479, 96, 2);
            aClass34_1196 = new Class34(method11(7), 172, 156, 2);
            DrawingArea.method409((byte)127);
            aClass44_Sub3_Sub1_Sub3_1144.method453(0, aByte1213, 0);
            aClass34_1195 = new Class34(method11(7), 190, 261, 2);
            aClass34_1197 = new Class34(method11(7), 512, 334, 2);
            DrawingArea.method409((byte)127);
            aClass34_858 = new Class34(method11(7), 496, 50, 2);
            aClass34_859 = new Class34(method11(7), 269, 37, 2);
            aClass34_860 = new Class34(method11(7), 249, 45, 2);
            aBoolean908 = true;
            if(i <= 0)
            {
                anInt962 = 175;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("97189, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method61(int i)
    {
        try
        {
            anInt1157 = 0;
            if(i < 1 || i > 1)
            {
                return;
            }
            for(int j = -1; j < expected_player_count + expected_npc_count; j++)
            {
                Object obj;
                if(j == -1)
                {
                    obj = player_appearance;
                } else
                if(j < expected_player_count)
                {
                    obj = player_models[local_players[j]];
                } else
                {
                    obj = local_npcs[local_npc_indices[j - expected_player_count]];
                }
                if(obj != null && ((RenderingHints) (obj)).method535(true))
                {
                    if(j < expected_player_count)
                    {
                        int l = 30;
                        PlayerModel class44_sub3_sub4_sub6_sub1 = (PlayerModel)obj;
                        if(class44_sub3_sub4_sub6_sub1.head_icon != 0)
                        {
                            method74(((RenderingHints) (obj)).anInt1661 + 15, ((RenderingHints) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                for(int i2 = 0; i2 < 8; i2++)
                                {
                                    if((class44_sub3_sub4_sub6_sub1.head_icon & 1 << i2) != 0)
                                    {
                                        aClass44_Sub3_Sub1_Sub2Array1183[i2].drawImage(anInt1065 - l, anInt1064 - 12);
                                        l += 25;
                                    }
                                }
                            }
                        }
                        if(j >= 0 && anInt1005 == 10 && anInt909 == local_players[j])
                        {
                            method74(((RenderingHints) (obj)).anInt1661 + 15, ((RenderingHints) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[7].drawImage(anInt1065 - l, anInt1064 - 12);
                            }
                        }
                    } else
                    {
                        NPCDefinition class12 = ((NPC)obj).definition;
                        if(class12.head_icon >= 0 && class12.head_icon < aClass44_Sub3_Sub1_Sub2Array1183.length)
                        {
                            method74(((RenderingHints) (obj)).anInt1661 + 15, ((RenderingHints) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[class12.head_icon].drawImage(anInt1065 - 30, anInt1064 - 12);
                            }
                        }
                        if(anInt1005 == 1 && anInt901 == local_npc_indices[j - expected_player_count] && anInt1240 % 20 < 10)
                        {
                            method74(((RenderingHints) (obj)).anInt1661 + 15, ((RenderingHints) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[2].drawImage(anInt1065 - 28, anInt1064 - 12);
                            }
                        }
                    }
                    if(((RenderingHints) (obj)).floating_text != null && (j >= expected_player_count || chat_settings == 0 || chat_settings == 3 || chat_settings == 1 && method80(((PlayerModel)obj).username, 3)))
                    {
                        method74(((RenderingHints) (obj)).anInt1661, ((RenderingHints) (obj)), 0);
                        if(anInt1064 > -1 && anInt1157 < anInt1158)
                        {
                            anIntArray1162[anInt1157] = chat_area_graphics.method458(((RenderingHints) (obj)).floating_text, -725) / 2;
                            anIntArray1161[anInt1157] = chat_area_graphics.anInt1478;
                            anIntArray1159[anInt1157] = anInt1064;
                            anIntArray1160[anInt1157] = anInt1065;
                            anIntArray1163[anInt1157] = ((RenderingHints) (obj)).textColor;
                            anIntArray1164[anInt1157] = ((RenderingHints) (obj)).textEffects;
                            anIntArray1165[anInt1157] = ((RenderingHints) (obj)).anInt1628;
                            aStringArray1166[anInt1157++] = ((RenderingHints) (obj)).floating_text;
                            if(anInt970 == 0 && ((RenderingHints) (obj)).textEffects >= 1 && ((RenderingHints) (obj)).textEffects <= 3)
                            {
                                anIntArray1161[anInt1157] += 10;
                                anIntArray1160[anInt1157] += 5;
                            }
                            if(anInt970 == 0 && ((RenderingHints) (obj)).textEffects == 4)
                            {
                                anIntArray1162[anInt1157] = 60;
                            }
                            if(anInt970 == 0 && ((RenderingHints) (obj)).textEffects == 5)
                            {
                                anIntArray1161[anInt1157] += 5;
                            }
                        }
                    }
                    if(((RenderingHints) (obj)).anInt1634 > anInt1240)
                    {
                        method74(((RenderingHints) (obj)).anInt1661 + 15, ((RenderingHints) (obj)), 0);
                        if(anInt1064 > -1)
                        {
                            int i1 = (((RenderingHints) (obj)).anInt1635 * 30) / ((RenderingHints) (obj)).anInt1636;
                            if(i1 > 30)
                            {
                                i1 = 30;
                            }
                            DrawingArea.method411(65280, 210, anInt1065 - 3, 5, anInt1064 - 15, i1);
                            DrawingArea.method411(0xff0000, 210, anInt1065 - 3, 5, (anInt1064 - 15) + i1, 30 - i1);
                        }
                    }
                    for(int j1 = 0; j1 < 4; j1++)
                    {
                        if(((RenderingHints) (obj)).anIntArray1633[j1] > anInt1240)
                        {
                            method74(((RenderingHints) (obj)).anInt1661 / 2, ((RenderingHints) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                if(j1 == 1)
                                {
                                    anInt1065 -= 20;
                                }
                                if(j1 == 2)
                                {
                                    anInt1064 -= 15;
                                    anInt1065 -= 10;
                                }
                                if(j1 == 3)
                                {
                                    anInt1064 += 15;
                                    anInt1065 -= 10;
                                }
                                aClass44_Sub3_Sub1_Sub2Array1108[((RenderingHints) (obj)).anIntArray1632[j1]].drawImage(anInt1065 - 12, anInt1064 - 12);
                                aClass44_Sub3_Sub1_Sub4_1255.draw_centered_string(String.valueOf(((RenderingHints) (obj)).anIntArray1631[j1]), anInt1065 + 4, anInt1064, 0);
                                aClass44_Sub3_Sub1_Sub4_1255.draw_centered_string(String.valueOf(((RenderingHints) (obj)).anIntArray1631[j1]), anInt1065 + 3, anInt1064 - 1, 0xffffff);
                            }
                        }
                    }
                }
            }
            for(int k = 0; k < anInt1157; k++)
            {
                int k1 = anIntArray1159[k];
                int l1 = anIntArray1160[k];
                int j2 = anIntArray1162[k];
                int k2 = anIntArray1161[k];
                boolean flag = true;
                while(flag)
                {
                    flag = false;
                    for(int l2 = 0; l2 < k; l2++)
                    {
                        if(l1 + 2 > anIntArray1160[l2] - anIntArray1161[l2] && l1 - k2 < anIntArray1160[l2] + 2 && k1 - j2 < anIntArray1159[l2] + anIntArray1162[l2] && k1 + j2 > anIntArray1159[l2] - anIntArray1162[l2] && anIntArray1160[l2] - anIntArray1161[l2] < l1)
                        {
                            l1 = anIntArray1160[l2] - anIntArray1161[l2];
                            flag = true;
                        }
                    }
                }
                anInt1064 = anIntArray1159[k];
                anInt1065 = anIntArray1160[k] = l1;
                String s = aStringArray1166[k];
                if(anInt970 == 0)
                {
                    int i3 = 0xffff00;
                    if(anIntArray1163[k] < 6)
                    {
                        i3 = anIntArray1203[anIntArray1163[k]];
                    }
                    if(anIntArray1163[k] == 6)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 0xffff00 : 0xff0000;
                    }
                    if(anIntArray1163[k] == 7)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 65535 : 255;
                    }
                    if(anIntArray1163[k] == 8)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 0x80ff80 : 45056;
                    }
                    if(anIntArray1163[k] == 9)
                    {
                        int j3 = 150 - anIntArray1165[k];
                        if(j3 < 50)
                        {
                            i3 = 0xff0000 + 1280 * j3;
                        } else
                        if(j3 < 100)
                        {
                            i3 = 0xffff00 - 0x50000 * (j3 - 50);
                        } else
                        if(j3 < 150)
                        {
                            i3 = 65280 + 5 * (j3 - 100);
                        }
                    }
                    if(anIntArray1163[k] == 10)
                    {
                        int k3 = 150 - anIntArray1165[k];
                        if(k3 < 50)
                        {
                            i3 = 0xff0000 + 5 * k3;
                        } else
                        if(k3 < 100)
                        {
                            i3 = 0xff00ff - 0x50000 * (k3 - 50);
                        } else
                        if(k3 < 150)
                        {
                            i3 = (255 + 0x50000 * (k3 - 100)) - 5 * (k3 - 100);
                        }
                    }
                    if(anIntArray1163[k] == 11)
                    {
                        int l3 = 150 - anIntArray1165[k];
                        if(l3 < 50)
                        {
                            i3 = 0xffffff - 0x50005 * l3;
                        } else
                        if(l3 < 100)
                        {
                            i3 = 65280 + 0x50005 * (l3 - 50);
                        } else
                        if(l3 < 150)
                        {
                            i3 = 0xffffff - 0x50000 * (l3 - 100);
                        }
                    }
                    if(anIntArray1164[k] == 0)
                    {
                        chat_area_graphics.draw_centered_string(s, anInt1065 + 1, anInt1064, 0);
                        chat_area_graphics.draw_centered_string(s, anInt1065, anInt1064, i3);
                    }
                    if(anIntArray1164[k] == 1)
                    {
                        chat_area_graphics.method460(anInt1064, anInt1189, (byte)5, 0, anInt1065 + 1, s);
                        chat_area_graphics.method460(anInt1064, anInt1189, (byte)5, i3, anInt1065, s);
                    }
                    if(anIntArray1164[k] == 2)
                    {
                        chat_area_graphics.method461(0, s, (byte)3, anInt1064, anInt1065 + 1, anInt1189);
                        chat_area_graphics.method461(i3, s, (byte)3, anInt1064, anInt1065, anInt1189);
                    }
                    if(anIntArray1164[k] == 3)
                    {
                        chat_area_graphics.method462(s, anInt1064, anInt1189, anInt1065 + 1, 0, anInt974, 150 - anIntArray1165[k]);
                        chat_area_graphics.method462(s, anInt1064, anInt1189, anInt1065, i3, anInt974, 150 - anIntArray1165[k]);
                    }
                    if(anIntArray1164[k] == 4)
                    {
                        int i4 = chat_area_graphics.method458(s, -725);
                        int k4 = ((150 - anIntArray1165[k]) * (i4 + 100)) / 150;
                        DrawingArea.method408(334, anInt1064 + 50, 0, anInt1064 - 50);
                        chat_area_graphics.method459((byte)-104, 0, s, (anInt1064 + 50) - k4, anInt1065 + 1);
                        chat_area_graphics.method459((byte)-104, i3, s, (anInt1064 + 50) - k4, anInt1065);
                        DrawingArea.method407((byte)-92);
                    }
                    if(anIntArray1164[k] == 5)
                    {
                        int j4 = 150 - anIntArray1165[k];
                        int l4 = 0;
                        if(j4 < 25)
                        {
                            l4 = j4 - 25;
                        } else
                        if(j4 > 125)
                        {
                            l4 = j4 - 125;
                        }
                        DrawingArea.method408(anInt1065 + 5, 512, anInt1065 - chat_area_graphics.anInt1478 - 1, 0);
                        chat_area_graphics.draw_centered_string(s, anInt1065 + 1 + l4, anInt1064, 0);
                        chat_area_graphics.draw_centered_string(s, anInt1065 + l4, anInt1064, i3);
                        DrawingArea.method407((byte)-92);
                    }
                } else
                {
                    chat_area_graphics.draw_centered_string(s, anInt1065 + 1, anInt1064, 0);
                    chat_area_graphics.draw_centered_string(s, anInt1065, anInt1064, 0xffff00);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("28791, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method62(int i, byte byte0)
    {
        try
        {
            if(byte0 != -12)
            {
                method6();
            }
            if(!highmem)
            {
                if(Rasterizer.anIntArray1437[17] >= i)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = Rasterizer.aClass44_Sub3_Sub1_Sub3Array1431[17];
                    int j = class44_sub3_sub1_sub3.anInt1460 * class44_sub3_sub1_sub3.anInt1461 - 1;
                    int l = class44_sub3_sub1_sub3.anInt1460 * anInt824 * 2;
                    byte abyte0[] = class44_sub3_sub1_sub3.aByteArray1458;
                    byte abyte2[] = aByteArray1109;
                    for(int j1 = 0; j1 <= j; j1++)
                    {
                        abyte2[j1] = abyte0[j1 - l & j];
                    }
                    class44_sub3_sub1_sub3.aByteArray1458 = abyte2;
                    aByteArray1109 = abyte0;
                    Rasterizer.method425(9, 17);
                }
                if(Rasterizer.anIntArray1437[24] >= i)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = Rasterizer.aClass44_Sub3_Sub1_Sub3Array1431[24];
                    int k = class44_sub3_sub1_sub3_1.anInt1460 * class44_sub3_sub1_sub3_1.anInt1461 - 1;
                    int i1 = class44_sub3_sub1_sub3_1.anInt1460 * anInt824 * 2;
                    byte abyte1[] = class44_sub3_sub1_sub3_1.aByteArray1458;
                    byte abyte3[] = aByteArray1109;
                    for(int k1 = 0; k1 <= k; k1++)
                    {
                        abyte3[k1] = abyte1[k1 - i1 & k];
                    }
                    class44_sub3_sub1_sub3_1.aByteArray1458 = abyte3;
                    aByteArray1109 = abyte1;
                    Rasterizer.method425(9, 24);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("9303, " + i + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method63(int i)
    {
        try
        {
            if(anInt1017 == 0)
            {
                return;
            }
            RSFont font = plain_font;
            int j = 0;
            while(i >= 0)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            if(anInt998 != 0)
            {
                j = 1;
            }
            for(int k = 0; k < 100; k++)
            {
                if(chat_entry_text[k] != null)
                {
                    int l = chat_entry_type[k];
                    String s = chat_entry_username[k];
                    byte byte0 = 0;
                    if(s != null && s.startsWith("@cr1@"))
                    {
                        s = s.substring(5);
                        byte0 = 1;
                    }
                    if(s != null && s.startsWith("@cr2@"))
                    {
                        s = s.substring(5);
                        byte0 = 2;
                    }
                    if((l == 3 || l == 7) && (l == 7 || pm_settings == 0 || pm_settings == 1 && method80(s, 3)))
                    {
                        int i1 = 329 - j * 13;
                        int l1 = 4;
                        font.method459((byte)-104, 0, "From", l1, i1);
                        font.method459((byte)-104, 65535, "From", l1, i1 - 1);
                        l1 += font.method457("From ", true);
                        if(byte0 == 1)
                        {
                            aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, l1);
                            l1 += 14;
                        }
                        if(byte0 == 2)
                        {
                            aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, l1);
                            l1 += 14;
                        }
                        font.method459((byte)-104, 0, s + ": " + chat_entry_text[k], l1, i1);
                        font.method459((byte)-104, 65535, s + ": " + chat_entry_text[k], l1, i1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if(l == 5 && pm_settings < 2)
                    {
                        int j1 = 329 - j * 13;
                        font.method459((byte)-104, 0, chat_entry_text[k], 4, j1);
                        font.method459((byte)-104, 65535, chat_entry_text[k], 4, j1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if(l == 6 && pm_settings < 2)
                    {
                        int k1 = 329 - j * 13;
                        font.method459((byte)-104, 0, "To " + s + ": " + chat_entry_text[k], 4, k1);
                        font.method459((byte)-104, 65535, "To " + s + ": " + chat_entry_text[k], 4, k1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("54582, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public static void method64(boolean highmem) {
		Class36.aBoolean606 = false;
		Rasterizer.aBoolean1418 = false;
		highmem = false;
		if (!highmem) {
			anInt1029 = -15;
		}
		LandscapeParser.aBoolean64 = false;
	}

    public void submit(Runnable runnable, int i)
    {
        if(i > 10)
        {
            i = 10;
        }
        if(signlink.mainapp != null)
        {
            signlink.startthread(runnable, i);
            return;
        } else
        {
            super.submit(runnable, i);
            return;
        }
    }

    public boolean method65(int i, int j, byte byte0)
    {
        try
        {
            if(byte0 != -103)
            {
                groundItems = null;
            }
            boolean flag = false;
            Interface class5 = Interface.interfaces[j];
            for(int k = 0; k < class5.children.length; k++)
            {
                if(class5.children[k] == -1)
                {
                    break;
                }
                Interface class5_1 = Interface.interfaces[class5.children[k]];
                if(class5_1.type == 1)
                {
                    flag |= method65(i, class5_1.id, (byte)-103);
                }
                if(class5_1.type == 6 && (class5_1.anInt153 != -1 || class5_1.anInt154 != -1))
                {
                    boolean flag1 = method88(class5_1, 0);
                    int l;
                    if(flag1)
                    {
                        l = class5_1.anInt154;
                    } else
                    {
                        l = class5_1.anInt153;
                    }
                    if(l != -1)
                    {
                        AnimationSequence class26 = AnimationSequence.cache[l];
                        for(class5_1.anInt104 += i; class5_1.anInt104 > class26.getLength(class5_1.anInt103);)
                        {
                            class5_1.anInt104 -= class26.getLength(class5_1.anInt103) + 1;
                            class5_1.anInt103++;
                            if(class5_1.anInt103 >= class26.frame_count)
                            {
                                class5_1.anInt103 -= class26.frame_step;
                                if(class5_1.anInt103 < 0 || class5_1.anInt103 >= class26.frame_count)
                                {
                                    class5_1.anInt103 = 0;
                                }
                            }
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("91123, " + i + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void method66(boolean flag) {
		method87(831);
		aClass34_1265.method272((byte) 5);
		aClass44_Sub3_Sub1_Sub3_891.method453(0, aByte1213, 0);
		char c = '\u0168';
		char c1 = '\310';
		if (anInt1014 == 0) {
			int i = c1 / 2 + 80;
			aClass44_Sub3_Sub1_Sub4_1255.method456(true, 0x75a9a9, c / 2, cache.aString1307, i);
			i = c1 / 2 - 20;
			chat_area_graphics.method456(true, 0xffff00, c / 2, "Welcome to RuneScape", i);
			i += 30;
			int l = c / 2 - 80;
			int k1 = c1 / 2 + 20;
			aClass44_Sub3_Sub1_Sub3_892.method453(k1 - 20, aByte1213, l - 73);
			chat_area_graphics.method456(true, 0xffffff, l, "New User", k1 + 5);
			l = c / 2 + 80;
			aClass44_Sub3_Sub1_Sub3_892.method453(k1 - 20, aByte1213, l - 73);
			chat_area_graphics.method456(true, 0xffffff, l, "Existing User", k1 + 5);
		}
		if (anInt1014 == 2) {
			int j = c1 / 2 - 40;
			if (login_label_top.length() > 0) {
				chat_area_graphics.method456(true, 0xffff00, c / 2, login_label_top, j - 15);
				chat_area_graphics.method456(true, 0xffff00, c / 2, login_label_bottom, j);
				j += 30;
			} else {
				chat_area_graphics.method456(true, 0xffff00, c / 2, login_label_bottom, j - 7);
				j += 30;
			}
			chat_area_graphics.method463(0xffffff, 2, j, true, c / 2 - 90,
					"Username: " + aString1071 + ((anInt831 == 0) & (anInt1240 % 40 < 20) ? "@yel@|" : ""));
			j += 15;
			chat_area_graphics.method463(0xffffff, 2, j, true, c / 2 - 88, "Password: "
					+ StringUtil.method555(0, aString1072) + ((anInt831 == 1) & (anInt1240 % 40 < 20) ? "@yel@|" : ""));
			j += 15;
			if (!flag) {
				int i1 = c / 2 - 80;
				int l1 = c1 / 2 + 50;
				aClass44_Sub3_Sub1_Sub3_892.method453(l1 - 20, aByte1213, i1 - 73);
				chat_area_graphics.method456(true, 0xffffff, i1, "Login", l1 + 5);
				i1 = c / 2 + 80;
				aClass44_Sub3_Sub1_Sub3_892.method453(l1 - 20, aByte1213, i1 - 73);
				chat_area_graphics.method456(true, 0xffffff, i1, "Cancel", l1 + 5);
			}
		}
		if (anInt1014 == 3) {
			chat_area_graphics.method456(true, 0xffff00, c / 2, "Create a free account", c1 / 2 - 60);
			int k = c1 / 2 - 35;
			chat_area_graphics.method456(true, 0xffffff, c / 2, "To create a new account you need to", k);
			k += 15;
			chat_area_graphics.method456(true, 0xffffff, c / 2, "go back to the main RuneScape webpage", k);
			k += 15;
			chat_area_graphics.method456(true, 0xffffff, c / 2, "and choose the red 'create account'", k);
			k += 15;
			chat_area_graphics.method456(true, 0xffffff, c / 2, "button at the top right of that page.", k);
			k += 15;
			int j1 = c / 2;
			int i2 = c1 / 2 + 50;
			aClass44_Sub3_Sub1_Sub3_892.method453(i2 - 20, aByte1213, j1 - 73);
			chat_area_graphics.method456(true, 0xffffff, j1, "Cancel", i2 + 5);
		}
		aClass34_1265.method273(-781, 202, 171, super.graphics);
		if (aBoolean908) {
			aBoolean908 = false;
			aClass34_1263.method273(-781, 128, 0, super.graphics);
			aClass34_1264.method273(-781, 202, 371, super.graphics);
			aClass34_1268.method273(-781, 0, 265, super.graphics);
			aClass34_1269.method273(-781, 562, 265, super.graphics);
			aClass34_1270.method273(-781, 128, 171, super.graphics);
			aClass34_1271.method273(-781, 562, 171, super.graphics);
			return;
		}
	}

    public void method67(Buffer buffer, int i, int opcode)
    {
        try
        {
            if(i != -6563)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
			if (opcode == 90 || opcode == 194) {
				int location = buffer.getUnsignedByte();
				int x = local_x + (location >> 4 & 7);
				int y = local_y + (location & 7);
				int appearance = buffer.getUnsignedByte();
				int type = appearance >> 2;
				int rotation = appearance & 3;
				int i15 = anIntArray1142[type];
				int object_id;
				if (opcode == 194) {
					object_id = -1;
				} else {
					object_id = buffer.getUnsignedShort();
				}
				if (x >= 0 && y >= 0 && x < 104 && y < 104) {
					method82(-23081, 0, height_level, object_id, type, y, rotation, -1, i15, x);
				}
				return;
			}
            if(opcode == 106)
            {
                int location = buffer.getUnsignedByte();
                int x = local_x + (location >> 4 & 7);
                int y = local_y + (location & 7);
                int k8 = buffer.getUnsignedByte();
                int i11 = k8 >> 2;
                int j13 = k8 & 3;
                int j15 = anIntArray1142[i11];
                int k16 = buffer.getUnsignedShort();
                if(x >= 0 && y >= 0 && x < 103 && y < 103)
                {
                    int j17 = anIntArrayArrayArray865[height_level][x][y];
                    int i18 = anIntArrayArrayArray865[height_level][x + 1][y];
                    int l18 = anIntArrayArrayArray865[height_level][x + 1][y + 1];
                    int k19 = anIntArrayArrayArray865[height_level][x][y + 1];
                    if(j15 == 0)
                    {
                        Class33 class33 = aClass36_1192.method300(height_level, false, x, y);
                        if(class33 != null)
                        {
                            int j20 = class33.anInt579 >> 14 & 0x7fff;
                            if(i11 == 2)
                            {
                                class33.aClass44_Sub3_Sub4_577 = new Class44_Sub3_Sub4_Sub1(4 + j13, j20, 2, k19, l18, false, j17, k16, false, i18);
                                class33.aClass44_Sub3_Sub4_578 = new Class44_Sub3_Sub4_Sub1(j13 + 1 & 3, j20, 2, k19, l18, false, j17, k16, false, i18);
                            } else
                            {
                                class33.aClass44_Sub3_Sub4_577 = new Class44_Sub3_Sub4_Sub1(j13, j20, i11, k19, l18, false, j17, k16, false, i18);
                            }
                        }
                    }
                    if(j15 == 1)
                    {
                        Class13 class13 = aClass36_1192.method301(y, 0, height_level, x);
                        if(class13 != null)
                        {
                            class13.aClass44_Sub3_Sub4_313 = new Class44_Sub3_Sub4_Sub1(0, class13.anInt314 >> 14 & 0x7fff, 4, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                    if(j15 == 2)
                    {
                        Class30 class30 = aClass36_1192.method302(x, 0, y, height_level);
                        if(i11 == 11)
                        {
                            i11 = 10;
                        }
                        if(class30 != null)
                        {
                            class30.aClass44_Sub3_Sub4_543 = new Class44_Sub3_Sub4_Sub1(j13, class30.anInt551 >> 14 & 0x7fff, i11, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                    if(j15 == 3)
                    {
                        Class17 class17 = aClass36_1192.method303(height_level, 0, y, x);
                        if(class17 != null)
                        {
                            class17.aClass44_Sub3_Sub4_402 = new Class44_Sub3_Sub4_Sub1(j13, class17.anInt403 >> 14 & 0x7fff, 22, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                }
                return;
            }
            
            // add ground items
            if(opcode == 60) {
				int location = buffer.getUnsignedByte();
				int x = local_x + (location >> 4 & 7);
				int y = local_y + (location & 7);
				int id = buffer.getUnsignedShort();
				int amount = buffer.getUnsignedShort();
				
				if (x >= 0 && y >= 0 && x < 104 && y < 104) {
					GroundItem ground_item = new GroundItem();
					ground_item.id = id;
					ground_item.amount = amount;
					if (groundItems[height_level][x][y] == null) {
						groundItems[height_level][x][y] = new Deque(-199);
					}
					groundItems[height_level][x][y].addLast(ground_item);
					updateGroundItems(x, y);
				}
                return;
            }
            
            // remove ground items
			if (opcode == 71) {
				int location = buffer.getUnsignedByte();
				int x = local_x + (location >> 4 & 7);
				int y = local_y + (location & 7);
				int id = buffer.getUnsignedShort();
				if (x >= 0 && y >= 0 && x < 104 && y < 104) {
					Deque deque = groundItems[height_level][x][y];
					if (deque != null) {
						for (GroundItem item = (GroundItem) deque.peek(); item != null; item = (GroundItem) deque.next()) {
							if (item.id != (id & 0x7fff)) {
								continue;
							}
							item.destroy();
							break;
						}
						if (deque.peek() == null) {
							groundItems[height_level][x][y] = null;
						}
						updateGroundItems(x, y);
					}
				}
				return;
			}
            if(opcode == 87)
            {
                int l1 = buffer.getUnsignedByte();
                int j4 = local_x + (l1 >> 4 & 7);
                int l6 = local_y + (l1 & 7);
                int j9 = j4 + buffer.getSignedByte();
                int k11 = l6 + buffer.getSignedByte();
                int k13 = buffer.getSignedShort();
                int k15 = buffer.getUnsignedShort();
                int l16 = buffer.getUnsignedByte() * 4;
                int k17 = buffer.getUnsignedByte() * 4;
                int j18 = buffer.getUnsignedShort();
                int i19 = buffer.getUnsignedShort();
                int l19 = buffer.getUnsignedByte();
                int i20 = buffer.getUnsignedByte();
                if(j4 >= 0 && l6 >= 0 && j4 < 104 && l6 < 104 && j9 >= 0 && k11 >= 0 && j9 < 104 && k11 < 104)
                {
                    j4 = j4 * 128 + 64;
                    l6 = l6 * 128 + 64;
                    j9 = j9 * 128 + 64;
                    k11 = k11 * 128 + 64;
                    Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = new Class44_Sub3_Sub4_Sub3(i20, method51(false, l6, j4, height_level) - l16, j18 + anInt1240, k15, j4, k13, height_level, l6, i19 + anInt1240, l19, false, k17);
                    class44_sub3_sub4_sub3.method500(method51(false, k11, j9, height_level) - k17, true, k11, j18 + anInt1240, j9);
                    aClass28_918.addLast(class44_sub3_sub4_sub3);
                }
                return;
            }
            if(opcode == 233)
            {
                int i2 = buffer.getUnsignedByte();
                int k4 = local_x + (i2 >> 4 & 7);
                int i7 = local_y + (i2 & 7);
                int k9 = buffer.getUnsignedShort();
                int l11 = buffer.getUnsignedByte();
                int l13 = buffer.getUnsignedShort();
                if(k4 >= 0 && i7 >= 0 && k4 < 104 && i7 < 104)
                {
                    k4 = k4 * 128 + 64;
                    i7 = i7 * 128 + 64;
                    Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = new Class44_Sub3_Sub4_Sub5(k4, height_level, method51(false, i7, k4, height_level) - l11, l13, true, i7, k9, anInt1240);
                    aClass28_1054.addLast(class44_sub3_sub4_sub5);
                }
                return;
            }
            if(opcode == 176)
            {
                int j2 = buffer.getUnsignedByte();
                int l4 = local_x + (j2 >> 4 & 7);
                int j7 = local_y + (j2 & 7);
                int l9 = buffer.getUnsignedShort();
                int i12 = buffer.getUnsignedShort();
                int i14 = buffer.getUnsignedShort();
                if(l4 >= 0 && j7 >= 0 && l4 < 104 && j7 < 104 && i14 != anInt1115)
                {
                    GroundItem class44_sub3_sub4_sub2_2 = new GroundItem();
                    class44_sub3_sub4_sub2_2.id = l9;
                    class44_sub3_sub4_sub2_2.amount = i12;
                    if(groundItems[height_level][l4][j7] == null)
                    {
                        groundItems[height_level][l4][j7] = new Deque(-199);
                    }
                    groundItems[height_level][l4][j7].addLast(class44_sub3_sub4_sub2_2);
                    updateGroundItems(l4, j7);
                }
                return;
            }
            if(opcode == 83)
            {
                int k2 = buffer.getUnsignedByte();
                int i5 = local_x + (k2 >> 4 & 7);
                int k7 = local_y + (k2 & 7);
                int i10 = buffer.getUnsignedByte();
                int j12 = i10 >> 2;
                int j14 = i10 & 3;
                int l15 = anIntArray1142[j12];
                int i17 = buffer.getUnsignedShort();
                int l17 = buffer.getUnsignedShort();
                int k18 = buffer.getUnsignedShort();
                int j19 = buffer.getUnsignedShort();
                byte byte0 = buffer.getSignedByte();
                byte byte1 = buffer.getSignedByte();
                byte byte2 = buffer.getSignedByte();
                byte byte3 = buffer.getSignedByte();
                PlayerModel class44_sub3_sub4_sub6_sub1;
                if(j19 == anInt1115)
                {
                    class44_sub3_sub4_sub6_sub1 = player_appearance;
                } else
                {
                    class44_sub3_sub4_sub6_sub1 = player_models[j19];
                }
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    Class8 class8 = Class8.method199(i17);
                    int k20 = anIntArrayArrayArray865[height_level][i5][k7];
                    int l20 = anIntArrayArrayArray865[height_level][i5 + 1][k7];
                    int i21 = anIntArrayArrayArray865[height_level][i5 + 1][k7 + 1];
                    int j21 = anIntArrayArrayArray865[height_level][i5][k7 + 1];
                    Model class44_sub3_sub4_sub4 = class8.method205(j12, j14, k20, l20, i21, j21, -1);
                    if(class44_sub3_sub4_sub4 != null)
                    {
                        method82(-23081, l17 + 1, height_level, -1, 0, k7, 0, k18 + 1, l15, i5);
                        class44_sub3_sub4_sub6_sub1.anInt1682 = l17 + anInt1240;
                        class44_sub3_sub4_sub6_sub1.anInt1683 = k18 + anInt1240;
                        class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1687 = class44_sub3_sub4_sub4;
                        int k21 = class8.anInt222;
                        int l21 = class8.anInt223;
                        if(j14 == 1 || j14 == 3)
                        {
                            k21 = class8.anInt223;
                            l21 = class8.anInt222;
                        }
                        class44_sub3_sub4_sub6_sub1.anInt1684 = i5 * 128 + k21 * 64;
                        class44_sub3_sub4_sub6_sub1.anInt1686 = k7 * 128 + l21 * 64;
                        class44_sub3_sub4_sub6_sub1.anInt1685 = method51(false, class44_sub3_sub4_sub6_sub1.anInt1686, class44_sub3_sub4_sub6_sub1.anInt1684, height_level);
                        if(byte0 > byte2)
                        {
                            byte byte4 = byte0;
                            byte0 = byte2;
                            byte2 = byte4;
                        }
                        if(byte1 > byte3)
                        {
                            byte byte5 = byte1;
                            byte1 = byte3;
                            byte3 = byte5;
                        }
                        class44_sub3_sub4_sub6_sub1.anInt1688 = i5 + byte0;
                        class44_sub3_sub4_sub6_sub1.anInt1690 = i5 + byte2;
                        class44_sub3_sub4_sub6_sub1.anInt1689 = k7 + byte1;
                        class44_sub3_sub4_sub6_sub1.anInt1691 = k7 + byte3;
                    }
                }
            }
            if(opcode == 117)
            {
                int l2 = buffer.getUnsignedByte();
                int j5 = local_x + (l2 >> 4 & 7);
                int l7 = local_y + (l2 & 7);
                int j10 = buffer.getUnsignedShort();
                int k12 = buffer.getUnsignedShort();
                int k14 = buffer.getUnsignedShort();
                if(j5 >= 0 && l7 >= 0 && j5 < 104 && l7 < 104)
                {
                    Deque class28_1 = groundItems[height_level][j5][l7];
                    if(class28_1 != null)
                    {
                        for(GroundItem class44_sub3_sub4_sub2_3 = (GroundItem)class28_1.peek(); class44_sub3_sub4_sub2_3 != null; class44_sub3_sub4_sub2_3 = (GroundItem)class28_1.next())
                        {
                            if(class44_sub3_sub4_sub2_3.id != (j10 & 0x7fff) || class44_sub3_sub4_sub2_3.amount != k12)
                            {
                                continue;
                            }
                            class44_sub3_sub4_sub2_3.amount = k14;
                            break;
                        }
                        updateGroundItems(j5, l7);
                    }
                }
                return;
            }
            if(opcode == 91)
            {
                int i3 = buffer.getUnsignedByte();
                int k5 = local_x + (i3 >> 4 & 7);
                int i8 = local_y + (i3 & 7);
                int k10 = buffer.getUnsignedShort();
                int l12 = buffer.getUnsignedByte();
                int l14 = l12 >> 4 & 0xf;
                int i16 = l12 & 7;
                if(((RenderingHints) (player_appearance)).walking_queue_x[0] >= k5 - l14 && ((RenderingHints) (player_appearance)).walking_queue_x[0] <= k5 + l14 && ((RenderingHints) (player_appearance)).walking_queue_y[0] >= i8 - l14 && ((RenderingHints) (player_appearance)).walking_queue_y[0] <= i8 + l14 && aBoolean1050 && !highmem && anInt968 < 50)
                {
                    anIntArray846[anInt968] = k10;
                    anIntArray1006[anInt968] = i16;
                    anIntArray1193[anInt968] = SoundEffect.delays[k10];
                    anInt968++;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("80608, " + buffer + ", " + i + ", " + opcode + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method68(int i)
    {
        try
        {
            byte abyte0[] = aClass47_1117.entry("title.dat", null);
            Sprite class44_sub3_sub1_sub2 = new Sprite(abyte0, this);
            aClass34_1266.method272((byte)5);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            aClass34_1267.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-637, 0, 8);
            aClass34_1263.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-128, 0, 8);
            aClass34_1264.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-202, -371, 8);
            aClass34_1265.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-202, -171, 8);
            aClass34_1268.method272((byte)5);
            class44_sub3_sub1_sub2.method438(0, -265, 8);
            aClass34_1269.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-562, -265, 8);
            aClass34_1270.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-128, -171, 8);
            aClass34_1271.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-562, -171, 8);
            int ai[] = new int[class44_sub3_sub1_sub2.width];
            for(int j = 0; j < class44_sub3_sub1_sub2.height; j++)
            {
                for(int k = 0; k < class44_sub3_sub1_sub2.width; k++)
                {
                    ai[k] = class44_sub3_sub1_sub2.pixel_array[(class44_sub3_sub1_sub2.width - k - 1) + class44_sub3_sub1_sub2.width * j];
                }
                for(int l = 0; l < class44_sub3_sub1_sub2.width; l++)
                {
                    class44_sub3_sub1_sub2.pixel_array[l + class44_sub3_sub1_sub2.width * j] = ai[l];
                }
            }
            aClass34_1266.method272((byte)5);
            class44_sub3_sub1_sub2.method438(382, 0, 8);
            aClass34_1267.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-255, 0, 8);
            aClass34_1263.method272((byte)5);
            if(i != 0)
            {
                return;
            } else
            {
                class44_sub3_sub1_sub2.method438(254, 0, 8);
                aClass34_1264.method272((byte)5);
                class44_sub3_sub1_sub2.method438(180, -371, 8);
                aClass34_1265.method272((byte)5);
                class44_sub3_sub1_sub2.method438(180, -171, 8);
                aClass34_1268.method272((byte)5);
                class44_sub3_sub1_sub2.method438(382, -265, 8);
                aClass34_1269.method272((byte)5);
                class44_sub3_sub1_sub2.method438(-180, -265, 8);
                aClass34_1270.method272((byte)5);
                class44_sub3_sub1_sub2.method438(254, -171, 8);
                aClass34_1271.method272((byte)5);
                class44_sub3_sub1_sub2.method438(-180, -171, 8);
                class44_sub3_sub1_sub2 = new Sprite(aClass47_1117, "logo", 0);
                aClass34_1263.method272((byte)5);
                class44_sub3_sub1_sub2.drawImage(18, 382 - class44_sub3_sub1_sub2.width / 2 - 128);
                class44_sub3_sub1_sub2 = null;
                System.gc();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12680, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method69(byte byte0)
    {
        try
        {
            for(Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3)aClass28_918.peek(); class44_sub3_sub4_sub3 != null; class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3)aClass28_918.next())
            {
                if(class44_sub3_sub4_sub3.anInt1500 != height_level || anInt1240 > class44_sub3_sub4_sub3.anInt1506)
                {
                    class44_sub3_sub4_sub3.destroy();
                } else
                if(anInt1240 >= class44_sub3_sub4_sub3.anInt1505)
                {
                    if(class44_sub3_sub4_sub3.anInt1509 > 0)
                    {
                        NPC class44_sub3_sub4_sub6_sub2 = local_npcs[class44_sub3_sub4_sub3.anInt1509 - 1];
                        if(class44_sub3_sub4_sub6_sub2 != null && ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 >= 0 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 < 13312 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 >= 0 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 < 13312)
                        {
                            class44_sub3_sub4_sub3.method500(method51(false, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615, class44_sub3_sub4_sub3.anInt1500) - class44_sub3_sub4_sub3.anInt1504, true, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616, anInt1240, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615);
                        }
                    }
                    if(class44_sub3_sub4_sub3.anInt1509 < 0)
                    {
                        int j = -class44_sub3_sub4_sub3.anInt1509 - 1;
                        PlayerModel class44_sub3_sub4_sub6_sub1;
                        if(j == anInt1115)
                        {
                            class44_sub3_sub4_sub6_sub1 = player_appearance;
                        } else
                        {
                            class44_sub3_sub4_sub6_sub1 = player_models[j];
                        }
                        if(class44_sub3_sub4_sub6_sub1 != null && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 >= 0 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 < 13312 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 >= 0 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 < 13312)
                        {
                            class44_sub3_sub4_sub3.method500(method51(false, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615, class44_sub3_sub4_sub3.anInt1500) - class44_sub3_sub4_sub3.anInt1504, true, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, anInt1240, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615);
                        }
                    }
                    class44_sub3_sub4_sub3.method501(anInt824, -816);
                    aClass36_1192.method289(60, -1, (int)class44_sub3_sub4_sub3.aDouble1513, (int)class44_sub3_sub4_sub3.aDouble1511, 384, class44_sub3_sub4_sub3, class44_sub3_sub4_sub3.anInt1519, false, (int)class44_sub3_sub4_sub3.aDouble1512, height_level);
                }
            }
            anInt1167++;
            if(byte0 != aByte1053)
            {
                aBoolean1262 = !aBoolean1262;
            }
            if(anInt1167 > 1174)
            {
                anInt1167 = 0;
                buffer.putOpcode(130);
                buffer.putByte(0);
                int i = buffer.pointer;
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putShort(11499);
                }
                buffer.putShort(10548);
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putByte(139);
                }
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putByte(94);
                }
                buffer.putShort(51693);
                buffer.putByte(16);
                buffer.putShort(15036);
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putByte(65);
                }
                buffer.putByte((int)(Math.random() * 256D));
                buffer.putShort(22990);
                buffer.writeSizeByte(buffer.pointer - i);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("60480, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method70(byte byte0)
    {
        try
        {
            aBoolean812 = true;
            for(int i = 0; i < 7; i++)
            {
                anIntArray849[i] = -1;
                for(int j = 0; j < Class22.anInt463; j++)
                {
                    if(Class22.aClass22Array464[j].aBoolean470 || Class22.aClass22Array464[j].anInt465 != i + (aBoolean1179 ? 0 : 7))
                    {
                        continue;
                    }
                    anIntArray849[i] = j;
                    break;
                }
            }
            if(byte0 != -127)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("72183, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void prepare_render(Buffer buffer) {
		for (int player_index = 0; player_index < local_player_count; player_index++) {
			int other = local_entities[player_index];
			PlayerModel player_model = player_models[other];
			int rendering_hints = buffer.getUnsignedByte();
			if ((rendering_hints & 0x80) == 128) {
				rendering_hints += buffer.getUnsignedByte() << 8;
			}
			get_player_update_flags(rendering_hints, buffer, other, player_model);
		}
	}

	public String method72(int value, boolean flag) {
		if (flag) {
			method6();
		}
		if (value < 0x3b9ac9ff) {
			return String.valueOf(value);
		} else {
			return "*";
		}
	}

    public void method73(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1)
    {
        try
        {
            if(j != 0)
            {
                buffer.putByte(179);
            }
            if(j1 >= 1 && l1 >= 1 && j1 <= 102 && l1 <= 102)
            {
                if(highmem && l != height_level)
                {
                    return;
                }
                int i2 = 0;
                if(k1 == 0)
                {
                    i2 = aClass36_1192.method304(l, j1, l1);
                }
                if(k1 == 1)
                {
                    i2 = aClass36_1192.method305(l1, 7, l, j1);
                }
                if(k1 == 2)
                {
                    i2 = aClass36_1192.method306(l, j1, l1);
                }
                if(k1 == 3)
                {
                    i2 = aClass36_1192.method307(l, j1, l1);
                }
                if(i2 != 0)
                {
                    int i3 = aClass36_1192.method308(l, j1, l1, i2);
                    int j2 = i2 >> 14 & 0x7fff;
                    int k2 = i3 & 0x1f;
                    int l2 = i3 >> 6;
                    if(k1 == 0)
                    {
                        aClass36_1192.method295(l1, j1, (byte)7, l);
                        Class8 class8 = Class8.method199(j2);
                        if(class8.aBoolean224)
                        {
                            planes[l].method236(l2, k2, l1, j1, class8.aBoolean225, (byte)3);
                        }
                    }
                    if(k1 == 1)
                    {
                        aClass36_1192.method296(537, l, l1, j1);
                    }
                    if(k1 == 2)
                    {
                        aClass36_1192.method297(2, l, l1, j1);
                        Class8 class8_1 = Class8.method199(j2);
                        if(j1 + class8_1.anInt222 > 103 || l1 + class8_1.anInt222 > 103 || j1 + class8_1.anInt223 > 103 || l1 + class8_1.anInt223 > 103)
                        {
                            return;
                        }
                        if(class8_1.aBoolean224)
                        {
                            planes[l].method237(class8_1.anInt223, l1, j1, class8_1.aBoolean225, 8, l2, class8_1.anInt222);
                        }
                    }
                    if(k1 == 3)
                    {
                        aClass36_1192.method298(j1, l1, 3, l);
                        Class8 class8_2 = Class8.method199(j2);
                        if(class8_2.aBoolean224 && class8_2.aBoolean226)
                        {
                            planes[l].method239(l1, true, j1);
                        }
                    }
                }
                if(i1 >= 0)
                {
                    int j3 = l;
                    if(j3 < 3 && (aByteArrayArrayArray871[1][j1][l1] & 2) == 2)
                    {
                        j3++;
                    }
                    LandscapeParser.method174(i, l, l1, k, anIntArrayArrayArray865, j3, j1, planes[l], aClass36_1192, i1, 0);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("55555, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method74(int i, RenderingHints class44_sub3_sub4_sub6, int j)
    {
        try
        {
            if(j != 0)
            {
                anInt964 = cipher.method545();
            }
            method75(class44_sub3_sub4_sub6.anInt1615, i, (byte)-79, class44_sub3_sub4_sub6.anInt1616);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("86761, " + i + ", " + class44_sub3_sub4_sub6 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method75(int i, int j, byte byte0, int k)
    {
        try
        {
            if(i < 128 || k < 128 || i > 13056 || k > 13056)
            {
                anInt1064 = -1;
                anInt1065 = -1;
                return;
            }
            int l = method51(false, k, i, height_level) - j;
            i -= camera_x;
            if(byte0 != -79)
            {
                buffer.putByte(22);
            }
            l -= anInt876;
            k -= camera_y;
            int i1 = Model.anIntArray1598[anInt878];
            int j1 = Model.anIntArray1599[anInt878];
            int k1 = Model.anIntArray1598[anInt879];
            int l1 = Model.anIntArray1599[anInt879];
            int i2 = k * k1 + i * l1 >> 16;
            k = k * l1 - i * k1 >> 16;
            i = i2;
            i2 = l * j1 - k * i1 >> 16;
            k = l * i1 + k * j1 >> 16;
            l = i2;
            if(k >= 50)
            {
                anInt1064 = Rasterizer.anInt1423 + (i << 9) / k;
                anInt1065 = Rasterizer.anInt1424 + (l << 9) / k;
                return;
            } else
            {
                anInt1064 = -1;
                anInt1065 = -1;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20782, " + i + ", " + j + ", " + byte0 + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method76(byte byte0)
    {
        try
        {
            Class8.aClass39_251.method341();
            Class8.aClass39_252.method341();
            if(byte0 != -71)
            {
                //anInt1056 = aClass46_927.method545();
            }
            NPCDefinition.list.method341();
            ItemDefinition.model_cache.method341();
            ItemDefinition.sprite_cache.method341();
            PlayerModel.aClass39_1696.method341();
            Class32.aClass39_571.method341();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("83788, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public DataInputStream method77(String s)
        throws IOException
    {
        if(!aBoolean922)
        {
            if(signlink.mainapp != null)
            {
                return signlink.openurl(s);
            } else
            {
                return new DataInputStream((new URL(getCodeBase(), s)).openStream());
            }
        }
        if(aSocket1013 != null)
        {
            try
            {
                aSocket1013.close();
            }
            catch(Exception _ex)
            {
            }
            aSocket1013 = null;
        }
        aSocket1013 = connect(43595);
        aSocket1013.setSoTimeout(10000);
        java.io.InputStream inputstream = aSocket1013.getInputStream();
        OutputStream outputstream = aSocket1013.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public boolean method78(int i, int j, boolean flag, int k, int l)
    {
        try
        {
            int i1 = i >> 14 & 0x7fff;
            int j1 = aClass36_1192.method308(height_level, l, k, i);
            if(j1 == -1)
            {
                return false;
            }
            int k1 = j1 & 0x1f;
            int l1 = j1 >> 6 & 3;
            anInt1207++;
            if(anInt1207 > 1086)
            {
                anInt1207 = 0;
                buffer.putOpcode(154);
                buffer.putByte(0);
                int i2 = buffer.pointer;
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putShort(16791);
                }
                buffer.putByte(254);
                buffer.putShort((int)(Math.random() * 65536D));
                buffer.putShort(16128);
                buffer.putShort(52610);
                buffer.putShort((int)(Math.random() * 65536D));
                buffer.putShort(55420);
                if((int)(Math.random() * 2D) == 0)
                {
                    buffer.putShort(35025);
                }
                buffer.putShort(46628);
                buffer.putByte((int)(Math.random() * 256D));
                buffer.writeSizeByte(buffer.pointer - i2);
            }
            if(k1 == 10 || k1 == 11 || k1 == 22)
            {
                Class8 class8 = Class8.method199(i1);
                int j2;
                int k2;
                if(l1 == 0 || l1 == 2)
                {
                    j2 = class8.anInt222;
                    k2 = class8.anInt223;
                } else
                {
                    j2 = class8.anInt223;
                    k2 = class8.anInt222;
                }
                int l2 = class8.anInt245;
                if(l1 != 0)
                {
                    l2 = (l2 << l1 & 0xf) + (l2 >> 4 - l1);
                }
                walk(j2, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, k, l2, 0, false, 2, 124, k2, l, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
            } else
            {
                walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], l1, k, 0, k1 + 1, false, 2, 124, 0, l, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
            }
            anInt815 = super.anInt28;
            if(flag)
            {
                anInt1246 = -113;
            }
            anInt816 = super.anInt29;
            anInt818 = 2;
            anInt817 = 0;
            buffer.putOpcode(j);
            buffer.putShort(l + base_x);
            buffer.putShort(k + base_y);
            buffer.putShort(i1);
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("86165, " + i + ", " + j + ", " + flag + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method79(byte byte0)
    {
        try
        {
            if(byte0 != 9)
            {
                anInt964 = -393;
            }
            return signlink.wavereplay();
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96494, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method80(String s, int i)
    {
        try
        {
            if(i < 3 || i > 3)
            {
                aBoolean985 = !aBoolean985;
            }
            if(s == null)
            {
                return false;
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(s.equalsIgnoreCase(aStringArray1044[j]))
                {
                    return true;
                }
            }
            return s.equalsIgnoreCase(player_appearance.username);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("59627, " + s + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method81(int i, int j, Interface class5, int k, boolean flag, int l, byte byte0,
            int i1, int j1)
    {
        try
        {
            if(aBoolean1156)
            {
                anInt832 = 32;
            } else
            {
                anInt832 = 0;
            }
            aBoolean1156 = false;
            if(byte0 != -83)
            {
                buffer.putByte(103);
            }
            if(j >= k && j < k + 16 && i1 >= i && i1 < i + 16)
            {
                class5.anInt120 -= anInt1066 * 4;
                if(flag)
                {
                    redrawTabArea = true;
                    return;
                }
            } else
            if(j >= k && j < k + 16 && i1 >= (i + l) - 16 && i1 < i + l)
            {
                class5.anInt120 += anInt1066 * 4;
                if(flag)
                {
                    redrawTabArea = true;
                    return;
                }
            } else
            if(j >= k - anInt832 && j < k + 16 + anInt832 && i1 >= i + 16 && i1 < (i + l) - 16 && anInt1066 > 0)
            {
                int k1 = ((l - 32) * l) / j1;
                if(k1 < 8)
                {
                    k1 = 8;
                }
                int l1 = i1 - i - 16 - k1 / 2;
                int i2 = l - 32 - k1;
                class5.anInt120 = ((j1 - l) * l1) / i2;
                if(flag)
                {
                    redrawTabArea = true;
                }
                aBoolean1156 = true;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("35389, " + i + ", " + j + ", " + class5 + ", " + k + ", " + flag + ", " + l + ", " + byte0 + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method10(boolean flag)
    {
        try
        {
            aBoolean908 = true;
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20297, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method82(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1, int i2, int j2)
    {
        try
        {
            Class44_Sub1 class44_sub1 = null;
            Class44_Sub1 class44_sub1_1 = (Class44_Sub1)deque.peek();
            if(i != -23081)
            {
                return;
            }
            for(; class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1)deque.next())
            {
                if(class44_sub1_1.anInt1323 != k || class44_sub1_1.anInt1325 != j2 || class44_sub1_1.anInt1326 != j1 || class44_sub1_1.anInt1324 != i2)
                {
                    continue;
                }
                class44_sub1 = class44_sub1_1;
                break;
            }
            if(class44_sub1 == null)
            {
                class44_sub1 = new Class44_Sub1();
                class44_sub1.anInt1323 = k;
                class44_sub1.anInt1324 = i2;
                class44_sub1.anInt1325 = j2;
                class44_sub1.anInt1326 = j1;
                method139(class44_sub1, false);
                deque.addLast(class44_sub1);
            }
            class44_sub1.anInt1330 = l;
            class44_sub1.anInt1332 = i1;
            class44_sub1.anInt1331 = k1;
            class44_sub1.anInt1333 = j;
            class44_sub1.anInt1334 = l1;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("49827, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method83(byte byte0)
    {
        try
        {
            for(int i = -1; i < expected_player_count; i++)
            {
                int j;
                if(i == -1)
                {
                    j = player_processed_flag;
                } else
                {
                    j = local_players[i];
                }
                PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[j];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    method117(-34028, class44_sub3_sub4_sub6_sub1, 1);
                }
            }
            if(byte0 == 5)
            {
                byte0 = 0;
                return;
            } else
            {
                method6();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("82180, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method84(int i)
    {
        try
        {
            char c = '\u0100';
            if(i != 0)
            {
                buffer.putByte(28);
            }
            if(anInt1259 > 0)
            {
                for(int j = 0; j < 256; j++)
                {
                    if(anInt1259 > 768)
                    {
                        anIntArray1218[j] = method91(anIntArray1219[j], anIntArray1220[j], 1024 - anInt1259, 35);
                    } else
                    if(anInt1259 > 256)
                    {
                        anIntArray1218[j] = anIntArray1220[j];
                    } else
                    {
                        anIntArray1218[j] = method91(anIntArray1220[j], anIntArray1219[j], 256 - anInt1259, 35);
                    }
                }
            } else
            if(anInt1260 > 0)
            {
                for(int k = 0; k < 256; k++)
                {
                    if(anInt1260 > 768)
                    {
                        anIntArray1218[k] = method91(anIntArray1219[k], anIntArray1221[k], 1024 - anInt1260, 35);
                    } else
                    if(anInt1260 > 256)
                    {
                        anIntArray1218[k] = anIntArray1221[k];
                    } else
                    {
                        anIntArray1218[k] = method91(anIntArray1221[k], anIntArray1219[k], 256 - anInt1260, 35);
                    }
                }
            } else
            {
                for(int l = 0; l < 256; l++)
                {
                    anIntArray1218[l] = anIntArray1219[l];
                }
            }
            for(int i1 = 0; i1 < 33920; i1++)
            {
                aClass34_1266.anIntArray582[i1] = aClass44_Sub3_Sub1_Sub2_1277.pixel_array[i1];
            }
            int j1 = 0;
            int k1 = 1152;
            for(int l1 = 1; l1 < c - 1; l1++)
            {
                int i2 = (anIntArray1018[l1] * (c - l1)) / c;
                int k2 = 22 + i2;
                if(k2 < 0)
                {
                    k2 = 0;
                }
                j1 += k2;
                for(int i3 = k2; i3 < 128; i3++)
                {
                    int k3 = anIntArray1272[j1++];
                    if(k3 != 0)
                    {
                        int i4 = k3;
                        int k4 = 256 - k3;
                        k3 = anIntArray1218[k3];
                        int i5 = aClass34_1266.anIntArray582[k1];
                        aClass34_1266.anIntArray582[k1++] = ((k3 & 0xff00ff) * i4 + (i5 & 0xff00ff) * k4 & 0xff00ff00) + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
                    } else
                    {
                        k1++;
                    }
                }
                k1 += k2;
            }
            aClass34_1266.method273(-781, 0, 0, super.graphics);
            for(int j2 = 0; j2 < 33920; j2++)
            {
                aClass34_1267.anIntArray582[j2] = aClass44_Sub3_Sub1_Sub2_1278.pixel_array[j2];
            }
            j1 = 0;
            k1 = 1176;
            for(int l2 = 1; l2 < c - 1; l2++)
            {
                int j3 = (anIntArray1018[l2] * (c - l2)) / c;
                int l3 = 103 - j3;
                k1 += j3;
                for(int j4 = 0; j4 < l3; j4++)
                {
                    int l4 = anIntArray1272[j1++];
                    if(l4 != 0)
                    {
                        int j5 = l4;
                        int k5 = 256 - l4;
                        l4 = anIntArray1218[l4];
                        int l5 = aClass34_1267.anIntArray582[k1];
                        aClass34_1267.anIntArray582[k1++] = ((l4 & 0xff00ff) * j5 + (l5 & 0xff00ff) * k5 & 0xff00ff00) + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
                    } else
                    {
                        k1++;
                    }
                }
                j1 += 128 - l3;
                k1 += 128 - l3 - j3;
            }
            aClass34_1267.method273(-781, 637, 0, super.graphics);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("27482, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public URL getCodeBase()
    {
    	try {
			return new URL("http://127.0.0.1:" + (80 + port_offset));
		} catch (MalformedURLException e) {
			throw new NullPointerException();
		}
//        if(signlink.mainapp != null)
//        {
//            return signlink.mainapp.getCodeBase();
//        }
//        try
//        {
//            if(super.aFrame_Sub1_16 != null)
//            {
//                return new URL("http://127.0.0.1:" + (80 + anInt1233));
//            }
//        }
//        catch(Exception _ex)
//        {
//        }
//        return super.getCodeBase();
    }

    public void setEffectVolume(boolean flag, int i)
    {
        try
        {
            if(!flag)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            signlink.wavevol = i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("41016, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method86(int i, int j, int k, byte byte0, int l, int i1)
    {
        try
        {
            int j1 = aClass36_1192.method304(l, i, j);
            if(j1 != 0)
            {
                int k1 = aClass36_1192.method308(l, i, j, j1);
                int j2 = k1 >> 6 & 3;
                int l2 = k1 & 0x1f;
                int j3 = k;
                if(j1 > 0)
                {
                    j3 = i1;
                }
                int ai[] = aClass44_Sub3_Sub1_Sub2_913.pixel_array;
                int j4 = 24624 + i * 4 + (103 - j) * 512 * 4;
                int l4 = j1 >> 14 & 0x7fff;
                Class8 class8_2 = Class8.method199(l4);
                if(class8_2.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_2 = aClass44_Sub3_Sub1_Sub3Array1241[class8_2.anInt236];
                    if(class44_sub3_sub1_sub3_2 != null)
                    {
                        int l5 = (class8_2.anInt222 * 4 - class44_sub3_sub1_sub3_2.anInt1460) / 2;
                        int i6 = (class8_2.anInt223 * 4 - class44_sub3_sub1_sub3_2.anInt1461) / 2;
                        class44_sub3_sub1_sub3_2.method453(48 + (104 - j - class8_2.anInt223) * 4 + i6, aByte1213, 48 + i * 4 + l5);
                    }
                } else
                {
                    if(l2 == 0 || l2 == 2)
                    {
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                            ai[j4 + 512] = j3;
                            ai[j4 + 1024] = j3;
                            ai[j4 + 1536] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4] = j3;
                            ai[j4 + 1] = j3;
                            ai[j4 + 2] = j3;
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 3] = j3;
                            ai[j4 + 3 + 512] = j3;
                            ai[j4 + 3 + 1024] = j3;
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 3)
                        {
                            ai[j4 + 1536] = j3;
                            ai[j4 + 1536 + 1] = j3;
                            ai[j4 + 1536 + 2] = j3;
                            ai[j4 + 1536 + 3] = j3;
                        }
                    }
                    if(l2 == 3)
                    {
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 3)
                        {
                            ai[j4 + 1536] = j3;
                        }
                    }
                    if(l2 == 2)
                    {
                        if(j2 == 3)
                        {
                            ai[j4] = j3;
                            ai[j4 + 512] = j3;
                            ai[j4 + 1024] = j3;
                            ai[j4 + 1536] = j3;
                        } else
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                            ai[j4 + 1] = j3;
                            ai[j4 + 2] = j3;
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4 + 3] = j3;
                            ai[j4 + 3 + 512] = j3;
                            ai[j4 + 3 + 1024] = j3;
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 1536] = j3;
                            ai[j4 + 1536 + 1] = j3;
                            ai[j4 + 1536 + 2] = j3;
                            ai[j4 + 1536 + 3] = j3;
                        }
                    }
                }
            }
            j1 = aClass36_1192.method306(l, i, j);
            if(j1 != 0)
            {
                int l1 = aClass36_1192.method308(l, i, j, j1);
                int k2 = l1 >> 6 & 3;
                int i3 = l1 & 0x1f;
                int k3 = j1 >> 14 & 0x7fff;
                Class8 class8_1 = Class8.method199(k3);
                if(class8_1.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = aClass44_Sub3_Sub1_Sub3Array1241[class8_1.anInt236];
                    if(class44_sub3_sub1_sub3_1 != null)
                    {
                        int i5 = (class8_1.anInt222 * 4 - class44_sub3_sub1_sub3_1.anInt1460) / 2;
                        int j5 = (class8_1.anInt223 * 4 - class44_sub3_sub1_sub3_1.anInt1461) / 2;
                        class44_sub3_sub1_sub3_1.method453(48 + (104 - j - class8_1.anInt223) * 4 + j5, aByte1213, 48 + i * 4 + i5);
                    }
                } else
                if(i3 == 9)
                {
                    int k4 = 0xeeeeee;
                    if(j1 > 0)
                    {
                        k4 = 0xee0000;
                    }
                    int ai1[] = aClass44_Sub3_Sub1_Sub2_913.pixel_array;
                    int k5 = 24624 + i * 4 + (103 - j) * 512 * 4;
                    if(k2 == 0 || k2 == 2)
                    {
                        ai1[k5 + 1536] = k4;
                        ai1[k5 + 1024 + 1] = k4;
                        ai1[k5 + 512 + 2] = k4;
                        ai1[k5 + 3] = k4;
                    } else
                    {
                        ai1[k5] = k4;
                        ai1[k5 + 512 + 1] = k4;
                        ai1[k5 + 1024 + 2] = k4;
                        ai1[k5 + 1536 + 3] = k4;
                    }
                }
            }
            j1 = aClass36_1192.method307(l, i, j);
            if(byte0 == 5)
            {
                byte0 = 0;
            } else
            {
                aBoolean1262 = !aBoolean1262;
            }
            if(j1 != 0)
            {
                int i2 = j1 >> 14 & 0x7fff;
                Class8 class8 = Class8.method199(i2);
                if(class8.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = aClass44_Sub3_Sub1_Sub3Array1241[class8.anInt236];
                    if(class44_sub3_sub1_sub3 != null)
                    {
                        int l3 = (class8.anInt222 * 4 - class44_sub3_sub1_sub3.anInt1460) / 2;
                        int i4 = (class8.anInt223 * 4 - class44_sub3_sub1_sub3.anInt1461) / 2;
                        class44_sub3_sub1_sub3.method453(48 + (104 - j - class8.anInt223) * 4 + i4, aByte1213, 48 + i * 4 + l3);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("97581, " + i + ", " + j + ", " + k + ", " + byte0 + ", " + l + ", " + i1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method87(int i)
    {
        try
        {
            if(aClass34_1263 != null)
            {
                return;
            }
            super.aClass34_14 = null;
            aClass34_1198 = null;
            aClass34_1196 = null;
            aClass34_1195 = null;
            aClass34_1197 = null;
            aClass34_858 = null;
            aClass34_859 = null;
            aClass34_860 = null;
            aClass34_1266 = new Class34(method11(7), 128, 265, 2);
            i = 40 / i;
            DrawingArea.method409((byte)127);
            aClass34_1267 = new Class34(method11(7), 128, 265, 2);
            DrawingArea.method409((byte)127);
            aClass34_1263 = new Class34(method11(7), 509, 171, 2);
            DrawingArea.method409((byte)127);
            aClass34_1264 = new Class34(method11(7), 360, 132, 2);
            DrawingArea.method409((byte)127);
            aClass34_1265 = new Class34(method11(7), 360, 200, 2);
            DrawingArea.method409((byte)127);
            aClass34_1268 = new Class34(method11(7), 202, 238, 2);
            DrawingArea.method409((byte)127);
            aClass34_1269 = new Class34(method11(7), 203, 238, 2);
            DrawingArea.method409((byte)127);
            aClass34_1270 = new Class34(method11(7), 74, 94, 2);
            DrawingArea.method409((byte)127);
            aClass34_1271 = new Class34(method11(7), 75, 94, 2);
            DrawingArea.method409((byte)127);
            if(aClass47_1117 != null)
            {
                method68(0);
                method48(-532);
            }
            aBoolean908 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("94767, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method88(Interface class5, int i)
    {
        try
        {
            if(i != 0)
            {
                throw new NullPointerException();
            }
            if(class5.anIntArray116 == null)
            {
                return false;
            }
            for(int j = 0; j < class5.anIntArray116.length; j++)
            {
                int k = method94(j, aByte1086, class5);
                int l = class5.anIntArray117[j];
                if(class5.anIntArray116[j] == 2)
                {
                    if(k >= l)
                    {
                        return false;
                    }
                } else
                if(class5.anIntArray116[j] == 3)
                {
                    if(k <= l)
                    {
                        return false;
                    }
                } else
                if(class5.anIntArray116[j] == 4)
                {
                    if(k == l)
                    {
                        return false;
                    }
                } else
                if(k != l)
                {
                    return false;
                }
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20821, " + class5 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method89(int i)
    {
        try
        {
            int j = chat_area_graphics.method457("Choose Option", true);
            for(int k = 0; k < anInt971; k++)
            {
                int l = chat_area_graphics.method457(aStringArray897[k], true);
                if(l > j)
                {
                    j = l;
                }
            }
            j += 8;
            if(i != 0)
            {
                aBoolean1036 = !aBoolean1036;
            }
            int i1 = 15 * anInt971 + 21;
            if(super.anInt28 > 4 && super.anInt29 > 4 && super.anInt28 < 516 && super.anInt29 < 338)
            {
                int j1 = super.anInt28 - 4 - j / 2;
                if(j1 + j > 512)
                {
                    j1 = 512 - j;
                }
                if(j1 < 0)
                {
                    j1 = 0;
                }
                int i2 = super.anInt29 - 4;
                if(i2 + i1 > 334)
                {
                    i2 = 334 - i1;
                }
                if(i2 < 0)
                {
                    i2 = 0;
                }
                aBoolean946 = true;
                anInt1030 = 0;
                anInt1031 = j1;
                anInt1032 = i2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
            }
            if(super.anInt28 > 553 && super.anInt29 > 205 && super.anInt28 < 743 && super.anInt29 < 466)
            {
                int k1 = super.anInt28 - 553 - j / 2;
                if(k1 < 0)
                {
                    k1 = 0;
                } else
                if(k1 + j > 190)
                {
                    k1 = 190 - j;
                }
                int j2 = super.anInt29 - 205;
                if(j2 < 0)
                {
                    j2 = 0;
                } else
                if(j2 + i1 > 261)
                {
                    j2 = 261 - i1;
                }
                aBoolean946 = true;
                anInt1030 = 1;
                anInt1031 = k1;
                anInt1032 = j2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
            }
            if(super.anInt28 > 17 && super.anInt29 > 357 && super.anInt28 < 496 && super.anInt29 < 453)
            {
                int l1 = super.anInt28 - 17 - j / 2;
                if(l1 < 0)
                {
                    l1 = 0;
                } else
                if(l1 + j > 479)
                {
                    l1 = 479 - j;
                }
                int k2 = super.anInt29 - 357;
                if(k2 < 0)
                {
                    k2 = 0;
                } else
                if(k2 + i1 > 96)
                {
                    k2 = 96 - i1;
                }
                aBoolean946 = true;
                anInt1030 = 2;
                anInt1031 = l1;
                anInt1032 = k2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("90690, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void update_new(int packet_size, Buffer buffer) {
		while (true) {
			if (buffer.bitOffset + 10 >= packet_size * 8) {
				break;
			}
			int player_id = buffer.getBits(11);
			if (player_id == 2047) {
				break;
			}
			if (player_models[player_id] == null) {
				player_models[player_id] = new PlayerModel();
				if (render_buffer[player_id] != null) {
					player_models[player_id].render(false, render_buffer[player_id]);
				}
			}
			local_players[expected_player_count++] = player_id;
			PlayerModel model = player_models[player_id];
			model.anInt1660 = anInt1240; // ???
			int x = buffer.getBits(5);
			int y = buffer.getBits(5);
			if (x > 15) {
				x -= 32;
			}
			if (y > 15) {
				y -= 32;
			}
			int region_changed = buffer.getBits(1);
			model.teleport(((RenderingHints) (player_appearance)).walking_queue_x[0] + x, ((RenderingHints) (player_appearance)).walking_queue_y[0] + y, region_changed == 1);
			int update_required = buffer.getBits(1);
			if (update_required == 1) {
				local_entities[local_player_count++] = player_id;
			}
		}
		buffer.endBitAccess();
	}

    public int method91(int i, int j, int k, int l)
    {
        try
        {
            l = 95 / l;
            int i1 = 256 - k;
            return ((i & 0xff00ff) * i1 + (j & 0xff00ff) * k & 0xff00ff00) + ((i & 0xff00) * i1 + (j & 0xff00) * k & 0xff0000) >> 8;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("66303, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void updateGroundItems(int i, int j)
    {
        Deque class28 = groundItems[height_level][i][j];
        if(class28 == null)
        {
            aClass36_1192.method299(height_level, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Object obj = null;
        for(GroundItem class44_sub3_sub4_sub2 = (GroundItem)class28.peek(); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (GroundItem)class28.next())
        {
            ItemDefinition class14 = ItemDefinition.get(class44_sub3_sub4_sub2.id);
            int l = class14.value;
            if(class14.stackable)
            {
                l *= class44_sub3_sub4_sub2.amount + 1;
            }
            if(l > k)
            {
                k = l;
                obj = class44_sub3_sub4_sub2;
            }
        }
        class28.addFirst(((Node) (obj)));
        Object obj1 = null;
        Object obj2 = null;
        for(GroundItem class44_sub3_sub4_sub2_1 = (GroundItem)class28.peek(); class44_sub3_sub4_sub2_1 != null; class44_sub3_sub4_sub2_1 = (GroundItem)class28.next())
        {
            if(class44_sub3_sub4_sub2_1.id != ((GroundItem) (obj)).id && obj1 == null)
            {
                obj1 = class44_sub3_sub4_sub2_1;
            }
            if(class44_sub3_sub4_sub2_1.id != ((GroundItem) (obj)).id && class44_sub3_sub4_sub2_1.id != ((GroundItem) (obj1)).id && obj2 == null)
            {
                obj2 = class44_sub3_sub4_sub2_1;
            }
        }
        int i1 = i + (j << 7) + 0x60000000;
        aClass36_1192.method285(j, i1, ((Class44_Sub3_Sub4) (obj1)), i, (byte)2, ((Class44_Sub3_Sub4) (obj2)), height_level, method51(false, j * 128 + 64, i * 128 + 64, height_level), ((Class44_Sub3_Sub4) (obj)));
    }

    public void method93(boolean flag)
    {
        try
        {
            if(flag)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            do
            {
                FileRequest request;
                do
                {
                    request = cache.method394();
                    if(request == null)
                    {
                        return;
                    }
                    if(request.cache_index == 0)
                    {
                        Model.method504(request.data, request.file_index, (byte)23);
                        if((cache.method390(request.file_index, -600) & 0x62) != 0)
                        {
                            redrawTabArea = true;
                            if(active_chat_interface != -1)
                            {
                                inputTaken = true;
                            }
                        }
                    }
                    if(request.cache_index == 1 && request.data != null)
                    {
                        AnimationFrame.load(request.data);
                    }
                    if(request.cache_index == 2 && request.file_index == anInt1190 && request.data != null)
                    {
                        method33((byte)27, request.data, aBoolean1191);
                    }
                    if(request.cache_index == 3 && game_state == 1)
                    {
                        for(int i = 0; i < map_files.length; i++)
                        {
                            if(anIntArray1040[i] == request.file_index)
                            {
                                map_files[i] = request.data;
                                if(request.data == null)
                                {
                                    anIntArray1040[i] = -1;
                                }
                                break;
                            }
                            if(anIntArray1041[i] != request.file_index)
                            {
                                continue;
                            }
                            landscape_files[i] = request.data;
                            if(request.data == null)
                            {
                                anIntArray1041[i] = -1;
                            }
                            break;
                        }
                    }
                } while(request.cache_index != 93 || !cache.method389(request.file_index, anInt857));
                LandscapeParser.method160(cache, new Buffer(request.data), anInt1247);
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("44515, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method94(int i, byte byte0, Interface class5)
    {
        try
        {
            if(byte0 != aByte884)
            {
                buffer.putByte(14);
            }
            if(class5.anIntArrayArray115 == null || i >= class5.anIntArrayArray115.length)
            {
                return -2;
            }
            try
            {
                int ai[] = class5.anIntArrayArray115[i];
                int j = 0;
                int k = 0;
                int l = 0;
                do
                {
                    int i1 = ai[k++];
                    int j1 = 0;
                    byte byte1 = 0;
                    if(i1 == 0)
                    {
                        return j;
                    }
                    if(i1 == 1)
                    {
                        j1 = levels[ai[k++]];
                    }
                    if(i1 == 2)
                    {
                        j1 = absoluteLevel[ai[k++]];
                    }
                    if(i1 == 3)
                    {
                        j1 = experience[ai[k++]];
                    }
                    if(i1 == 4)
                    {
                        Interface class5_1 = Interface.interfaces[ai[k++]];
                        int j2 = ai[k++];
                        if(j2 >= 0 && j2 < ItemDefinition.count && (!ItemDefinition.get(j2).premium || aBoolean1234))
                        {
                            for(int i3 = 0; i3 < class5_1.item_id.length; i3++)
                            {
                                if(class5_1.item_id[i3] == j2 + 1)
                                {
                                    j1 += class5_1.item_count[i3];
                                }
                            }
                        }
                    }
                    if(i1 == 5)
                    {
                        j1 = settings[ai[k++]];
                    }
                    if(i1 == 6)
                    {
                        j1 = experienceTable[absoluteLevel[ai[k++]] - 1];
                    }
                    if(i1 == 7)
                    {
                        j1 = (settings[ai[k++]] * 100) / 46875;
                    }
                    if(i1 == 8)
                    {
                        j1 = player_appearance.combat_level;
                    }
                    if(i1 == 9)
                    {
                        for(int k1 = 0; k1 < Skills.skillCount; k1++)
                        {
                            if(Skills.active[k1])
                            {
                                j1 += absoluteLevel[k1];
                            }
                        }
                    }
                    if(i1 == 10)
                    {
                        Interface class5_2 = Interface.interfaces[ai[k++]];
                        int k2 = ai[k++] + 1;
                        if(k2 >= 0 && k2 < ItemDefinition.count && (!ItemDefinition.get(k2).premium || aBoolean1234))
                        {
                            for(int j3 = 0; j3 < class5_2.item_id.length; j3++)
                            {
                                if(class5_2.item_id[j3] != k2)
                                {
                                    continue;
                                }
                                j1 = 0x3b9ac9ff;
                                break;
                            }
                        }
                    }
                    if(i1 == 11)
                    {
                        j1 = anInt936;
                    }
                    if(i1 == 12)
                    {
                        j1 = anInt1205;
                    }
                    if(i1 == 13)
                    {
                        int l1 = settings[ai[k++]];
                        int l2 = ai[k++];
                        j1 = (l1 & 1 << l2) == 0 ? 0 : 1;
                    }
                    if(i1 == 14)
                    {
                        int i2 = ai[k++];
                        Class35 class35 = Class35.aClass35Array590[i2];
                        int k3 = class35.anInt592;
                        int l3 = class35.anInt593;
                        int i4 = class35.anInt594;
                        int j4 = anIntArray1088[i4 - l3];
                        j1 = settings[k3] >> l3 & j4;
                    }
                    if(i1 == 15)
                    {
                        byte1 = 1;
                    }
                    if(i1 == 16)
                    {
                        byte1 = 2;
                    }
                    if(i1 == 17)
                    {
                        byte1 = 3;
                    }
                    if(i1 == 18)
                    {
                        j1 = (((RenderingHints) (player_appearance)).anInt1615 >> 7) + base_x;
                    }
                    if(i1 == 19)
                    {
                        j1 = (((RenderingHints) (player_appearance)).anInt1616 >> 7) + base_y;
                    }
                    if(i1 == 20)
                    {
                        j1 = ai[k++];
                    }
                    if(byte1 == 0)
                    {
                        if(l == 0)
                        {
                            j += j1;
                        }
                        if(l == 1)
                        {
                            j -= j1;
                        }
                        if(l == 2 && j1 != 0)
                        {
                            j /= j1;
                        }
                        if(l == 3)
                        {
                            j *= j1;
                        }
                        l = 0;
                    } else
                    {
                        l = byte1;
                    }
                } while(true);
            }
            catch(Exception _ex)
            {
                return -1;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("71115, " + i + ", " + byte0 + ", " + class5 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method95(int i, long l)
    {
        try
        {
            if(l == 0L)
            {
                return;
            }
            if(anInt1104 >= 100 && anInt1089 != 1)
            {
                message(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
                return;
            }
            if(anInt1104 >= 200)
            {
                message(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
                return;
            }
            String s = StringUtil.format(StringUtil.from_hash(l, true), true);
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    message(0, s + " is already on your friend list", "");
                    return;
                }
            }
            for(int k = 0; k < anInt957; k++)
            {
                if(aLongArray1254[k] == l)
                {
                    message(0, "Please remove " + s + " from your ignore list first", "");
                    return;
                }
            }
            if(s.equals(player_appearance.username))
            {
                return;
            }
            aStringArray1044[anInt1104] = s;
            aLongArray979[anInt1104] = l;
            anIntArray894[anInt1104] = 0;
            if(i != 0)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            anInt1104++;
            redrawTabArea = true;
            buffer.putOpcode(235);
            buffer.putLong(l);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("60470, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
	}

    /**
     * The login method
     * @param username
     * @param password
     * @param reconnecting
     */
	public void login(String username, String password, boolean reconnecting) {
		signlink.errorname = username;
		try {
			if (!reconnecting) {
				login_label_top = "";
				login_label_bottom = "Connecting to server...";
				method66(true);
			}
			channel = new Channel(connect(43594 + port_offset), this);
			long name_hash = StringUtil.hash(username);
			int hash_part = (int) (name_hash >> 16 & 31L);
			buffer.pointer = 0;
			buffer.putByte(14);
			buffer.putByte(hash_part);
			channel.write(buffer.payload, 0, 2);
			for (int j = 0; j < 8; j++) {
				channel.read();
			}
			int k = channel.read();
			if (k == 0) {
				channel.read(incoming_buffer.payload, 0, 8);
				incoming_buffer.pointer = 0;
				aLong813 = incoming_buffer.getLong();
				int ai[] = new int[4];
				ai[0] = (int) (Math.random() * 99999999D);
				ai[1] = (int) (Math.random() * 99999999D);
				ai[2] = (int) (aLong813 >> 32);
				ai[3] = (int) aLong813;
				buffer.pointer = 0;
				buffer.putByte(10);
				buffer.putInt(ai[0]);
				buffer.putInt(ai[1]);
				buffer.putInt(ai[2]);
				buffer.putInt(ai[3]);
				buffer.putInt(signlink.uid);
				buffer.putRSString(username);
				buffer.putRSString(password);
//				buffer.encodeRSA(RSA_MODULUS, RSA_PRIVATE_KEY);
				loginbuffer.pointer = 0;
				loginbuffer.putByte(reconnecting ? 18 : 16);
				loginbuffer.putByte(buffer.pointer + 36 + 1 + 1 + 2);
				loginbuffer.putByte(255);
				loginbuffer.putShort(289);
				loginbuffer.putByte(highmem ? 1 : 0);
				for (int k1 = 0; k1 < 9; k1++) {
					loginbuffer.putInt(anIntArray1051[k1]);
				}
				loginbuffer.putByte(0);
				loginbuffer.put(buffer.payload, 0, buffer.pointer);
				buffer.isaac = new ISAACCipher(ai);
				for (int i2 = 0; i2 < 4; i2++) {
					ai[i2] += 50;
				}
				cipher = new ISAACCipher(ai);
				channel.write(loginbuffer.payload, 0, loginbuffer.pointer);
				k = channel.read();
			}
			if (k == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception _ex) {
				}
				login(username, password, reconnecting);
				return;
			}
			if (k == 2) {
				user_privilege = channel.read();
				macro_flag = channel.read() == 1;
				aLong1181 = 0L;
				anInt819 = 0;
				aClass10_866.index = 0;
				super.aBoolean18 = true;
				aBoolean934 = true;
				aBoolean863 = true;
				buffer.pointer = 0;
				incoming_buffer.pointer = 0;
				packet_opcode = -1;
				debugOpcode1 = -1;
				debugOpcode2 = -1;
				debugOpcode3 = -1;
				packet_size = 0;
				anInt1171 = 0;
				anInt998 = 0;
				anInt1173 = 0;
				anInt1005 = 0;
				anInt971 = 0;
				aBoolean946 = false;
				super.anInt19 = 0;
				for (int i1 = 0; i1 < 100; i1++) {
					chat_entry_text[i1] = null;
				}
				anInt952 = 0;
				anInt994 = 0;
				game_state = 0;
				anInt968 = 0;
				anInt1011 = (int) (Math.random() * 100D) - 50;
				anInt1215 = (int) (Math.random() * 110D) - 55;
				anInt1106 = (int) (Math.random() * 80D) - 40;
				anInt959 = (int) (Math.random() * 120D) - 60;
				anInt1075 = (int) (Math.random() * 30D) - 20;
				anInt930 = (int) (Math.random() * 20D) - 10 & 0x7ff;
				anInt848 = 0;
				anInt1063 = -1;
				absolute_x = 0;
				absolute_y = 0;
				expected_player_count = 0;
				expected_npc_count = 0;
				for (int l1 = 0; l1 < anInt1223; l1++) {
					player_models[l1] = null;
					render_buffer[l1] = null;
				}
				for (int j2 = 0; j2 < 16384; j2++) {
					local_npcs[j2] = null;
				}
				player_appearance = player_models[player_processed_flag] = new PlayerModel();
				aClass28_918.clear();
				aClass28_1054.clear();
				for (int k2 = 0; k2 < 4; k2++) {
					for (int l2 = 0; l2 < 104; l2++) {
						for (int j3 = 0; j3 < 104; j3++) {
							groundItems[k2][l2][j3] = null;
						}
					}
				}
				deque = new Deque(-199);
				anInt1105 = 0;
				anInt1104 = 0;
				dialog_id = -1;
				active_chat_interface = -1;
				active_game_interface = -1;
				active_inventory_interface = -1;
				anInt924 = -1;
				aBoolean935 = false;
				anInt1027 = 3;
				user_amount_prompt = false;
				aBoolean946 = false;
				aBoolean1222 = false;
				aString823 = null;
				anInt1112 = 0;
				anInt833 = -1;
				aBoolean1179 = true;
				method70(aByte883);
				for (int i3 = 0; i3 < 5; i3++) {
					anIntArray938[i3] = 0;
				}
				for (int k3 = 0; k3 < 5; k3++) {
					aStringArray919[k3] = null;
					aBooleanArray920[k3] = false;
				}
				anInt1238 = 0;
				anInt1180 = 0;
				anInt986 = 0;
				anInt870 = 0;
				anInt821 = 0;
				anInt1274 = 0;
				anInt1114 = 0;
				anInt1046 = 0;
				anInt1100 = 0;
				anInt845 = 0;
				method60(817);
				return;
			}
			if (k == 3) {
				login_label_top = "";
				login_label_bottom = "Invalid username or password.";
				return;
			}
			if (k == 4) {
				login_label_top = "Your account has been disabled.";
				login_label_bottom = "Please check your message-centre for details.";
				return;
			}
			if (k == 5) {
				login_label_top = "Your account is already logged in.";
				login_label_bottom = "Try again in 60 secs...";
				return;
			}
			if (k == 6) {
				login_label_top = "RuneScape has been updated!";
				login_label_bottom = "Please reload this page.";
				return;
			}
			if (k == 7) {
				login_label_top = "This world is full.";
				login_label_bottom = "Please use a different world.";
				return;
			}
			if (k == 8) {
				login_label_top = "Unable to connect.";
				login_label_bottom = "Login server offline.";
				return;
			}
			if (k == 9) {
				login_label_top = "Login limit exceeded.";
				login_label_bottom = "Too many connections from your address.";
				return;
			}
			if (k == 10) {
				login_label_top = "Unable to connect.";
				login_label_bottom = "Bad session id.";
				return;
			}
			if (k == 11) {
				login_label_bottom = "Login server rejected session.";
				login_label_bottom = "Please try again.";
				return;
			}
			if (k == 12) {
				login_label_top = "You need a members account to login to this world.";
				login_label_bottom = "Please subscribe, or use a different world.";
				return;
			}
			if (k == 13) {
				login_label_top = "Could not complete login.";
				login_label_bottom = "Please try using a different world.";
				return;
			}
			if (k == 14) {
				login_label_top = "The server is being updated.";
				login_label_bottom = "Please wait 1 minute and try again.";
				return;
			}
			if (k == 15) {
				aBoolean863 = true;
				buffer.pointer = 0;
				incoming_buffer.pointer = 0;
				packet_opcode = -1;
				debugOpcode1 = -1;
				debugOpcode2 = -1;
				debugOpcode3 = -1;
				packet_size = 0;
				anInt1171 = 0;
				anInt998 = 0;
				anInt971 = 0;
				aBoolean946 = false;
				aLong1070 = System.currentTimeMillis();
				return;
			}
			if (k == 16) {
				login_label_top = "Login attempts exceeded.";
				login_label_bottom = "Please wait 1 minute and try again.";
				return;
			}
			if (k == 17) {
				login_label_top = "You are standing in a members-only area.";
				login_label_bottom = "To play on this world move to a free area first";
				return;
			}
			if (k == 20) {
				login_label_top = "Invalid loginserver requested";
				login_label_bottom = "Please try using a different world.";
				return;
			}
			if (k == 21) {
				for (int j1 = channel.read(); j1 >= 0; j1--) {
					login_label_top = "You have only just left another world";
					login_label_bottom = "Your profile will be transferred in: " + j1 + " seconds";
					method66(true);
					try {
						Thread.sleep(1000L);
					} catch (Exception _ex) {
					}
				}
				login(username, password, reconnecting);
				return;
			}
			if (k == -1) {
				login_label_top = "No response from server";
				login_label_bottom = "Please try using a different world.";
				return;
			} else {
				System.out.println("response:" + k);
				login_label_top = "Unexpected server response";
				login_label_bottom = "Please try using a different world.";
				return;
			}
		} catch (IOException _ex) {
			login_label_top = "";
		}
		login_label_bottom = "Error connecting to server.";
	}

    public void method97(byte byte0)
    {
        try
        {
            if(byte0 != 122)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            if(anInt1014 == 0)
            {
                int i = super.anInt11 / 2 - 80;
                int l = super.anInt12 / 2 + 20;
                l += 20;
                if(super.anInt27 == 1 && super.anInt28 >= i - 75 && super.anInt28 <= i + 75 && super.anInt29 >= l - 20 && super.anInt29 <= l + 20)
                {
                    anInt1014 = 3;
                    anInt831 = 0;
                }
                i = super.anInt11 / 2 + 80;
                if(super.anInt27 == 1 && super.anInt28 >= i - 75 && super.anInt28 <= i + 75 && super.anInt29 >= l - 20 && super.anInt29 <= l + 20)
                {
                    login_label_top = "";
                    login_label_bottom = "Enter your username & password.";
                    anInt1014 = 2;
                    anInt831 = 0;
                    return;
                }
            } else
            {
                if(anInt1014 == 2)
                {
                    int j = super.anInt12 / 2 - 40;
                    j += 30;
                    j += 25;
                    if(super.anInt27 == 1 && super.anInt29 >= j - 15 && super.anInt29 < j)
                    {
                        anInt831 = 0;
                    }
                    j += 15;
                    if(super.anInt27 == 1 && super.anInt29 >= j - 15 && super.anInt29 < j)
                    {
                        anInt831 = 1;
                    }
                    j += 15;
                    int i1 = super.anInt11 / 2 - 80;
                    int k1 = super.anInt12 / 2 + 50;
                    k1 += 20;
                    if(super.anInt27 == 1 && super.anInt28 >= i1 - 75 && super.anInt28 <= i1 + 75 && super.anInt29 >= k1 - 20 && super.anInt29 <= k1 + 20)
                    {
                        login(aString1071, aString1072, false);
                        if(aBoolean863)
                        {
                            return;
                        }
                    }
                    i1 = super.anInt11 / 2 + 80;
                    if(super.anInt27 == 1 && super.anInt28 >= i1 - 75 && super.anInt28 <= i1 + 75 && super.anInt29 >= k1 - 20 && super.anInt29 <= k1 + 20)
                    {
                        anInt1014 = 0;
                        aString1071 = "";
                        aString1072 = "";
                    }
                    do
                    {
                        int l1 = method5(-128);
                        if(l1 == -1)
                        {
                            break;
                        }
                        boolean flag = false;
                        for(int i2 = 0; i2 < aString966.length(); i2++)
                        {
                            if(l1 != aString966.charAt(i2))
                            {
                                continue;
                            }
                            flag = true;
                            break;
                        }
                        if(anInt831 == 0)
                        {
                            if(l1 == 8 && aString1071.length() > 0)
                            {
                                aString1071 = aString1071.substring(0, aString1071.length() - 1);
                            }
                            if(l1 == 9 || l1 == 10 || l1 == 13)
                            {
                                anInt831 = 1;
                            }
                            if(flag)
                            {
                                aString1071 += (char)l1;
                            }
                            if(aString1071.length() > 12)
                            {
                                aString1071 = aString1071.substring(0, 12);
                            }
                        } else
                        if(anInt831 == 1)
                        {
                            if(l1 == 8 && aString1072.length() > 0)
                            {
                                aString1072 = aString1072.substring(0, aString1072.length() - 1);
                            }
                            if(l1 == 9 || l1 == 10 || l1 == 13)
                            {
                                anInt831 = 0;
                            }
                            if(flag)
                            {
                                aString1072 += (char)l1;
                            }
                            if(aString1072.length() > 20)
                            {
                                aString1072 = aString1072.substring(0, 20);
                            }
                        }
                    } while(true);
                    return;
                }
                if(anInt1014 == 3)
                {
                    int k = super.anInt11 / 2;
                    int j1 = super.anInt12 / 2 + 50;
                    j1 += 20;
                    if(super.anInt27 == 1 && super.anInt28 >= k - 75 && super.anInt28 <= k + 75 && super.anInt29 >= j1 - 20 && super.anInt29 <= j1 + 20)
                    {
                        anInt1014 = 0;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("36554, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method98(int i, byte byte0)
    {
        try
        {
            String s = String.valueOf(i);
            for(int j = s.length() - 3; j > 0; j -= 3)
            {
                s = s.substring(0, j) + "," + s.substring(j);
            }
            if(byte0 != 5)
            {
                throw new NullPointerException();
            }
            if(s.length() > 8)
            {
                s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
            } else
            if(s.length() > 4)
            {
                s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
            }
            return " " + s;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("6522, " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void draw_disconnection_text(byte byte0) {
		if (anInt1173 > 0) {
			logout();
			return;
		}
		aClass34_1197.method272((byte) 5);
		plain_font.draw_centered_string("Connection lost", 144, 257, 0);
		plain_font.draw_centered_string("Connection lost", 143, 256, 0xffffff);
		plain_font.draw_centered_string("Please wait - attempting to reestablish", 159, 257, 0);
		plain_font.draw_centered_string("Please wait - attempting to reestablish", 158, 256, 0xffffff);
		aClass34_1197.method273(-781, 4, 4, super.graphics);
		anInt848 = 0;
		if (byte0 != 7) {
			return;
		}
		absolute_x = 0;
		Channel new_channel = channel;
		aBoolean863 = false;
		login(aString1071, aString1072, true);
		if (!aBoolean863) {
			logout();
		}
		try {
			new_channel.close();
		} catch (Exception _ex) {
			
		}
	}

	public static String amount_suffix(int amount) {
		if (amount < 100_000) {
			return String.valueOf(amount);
		}
		if (amount < 10_000_000) {
			return amount / 1000 + "K";
		} else {
			return amount / 1_000_000 + "M";
		}
	}

	public void method101() {
		for (Class44_Sub1 class44_sub1 = (Class44_Sub1) deque.peek(); class44_sub1 != null; class44_sub1 = (Class44_Sub1) deque.next()) {
			if (class44_sub1.anInt1334 == -1) {
				class44_sub1.anInt1333 = 0;
				method139(class44_sub1, false);
			} else {
				class44_sub1.destroy();
			}
		}
	}

    public String method102(int i)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1147 = !aBoolean1147;
            }
            if(signlink.mainapp != null)
            {
                return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            }
            if(super.aFrame_Sub1_16 != null)
            {
                return "runescape.com";
            } else
            {
                return super.getDocumentBase().getHost().toLowerCase();
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("16537, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void update_other(Buffer buffer, int packet_size) {
		int player_count = buffer.getBits(8);
		if (player_count < expected_player_count) {
			for (int player_id = player_count; player_id < expected_player_count; player_id++) {
				local_entity_index[anInt940++] = local_players[player_id];
			}
		}
		if (player_count > expected_player_count) {
			throw new RuntimeException("player count size mismatch - " + player_count + ", " + expected_player_count);
		}
		expected_player_count = 0;
		for (int player_id = 0; player_id < player_count; player_id++) {
			int local_id = local_players[player_id];
			PlayerModel model = player_models[local_id];
			int synchronization_needed = buffer.getBits(1);
			if (synchronization_needed == 0) {
				local_players[expected_player_count++] = local_id;
				model.anInt1660 = anInt1240;
			} else {
				int steps_taken = buffer.getBits(2);
				if (steps_taken == 0) {
					local_players[expected_player_count++] = local_id;
					model.anInt1660 = anInt1240;
					local_entities[local_player_count++] = local_id;
				} else if (steps_taken == 1) {
					local_players[expected_player_count++] = local_id;
					model.anInt1660 = anInt1240;
					
					int direction = buffer.getBits(3);
					int update_required = buffer.getBits(1);
					
					model.queue_step(false, direction);
					if (update_required == 1) {
						local_entities[local_player_count++] = local_id;
					}
				} else if (steps_taken == 2) {
					local_players[expected_player_count++] = local_id;
					model.anInt1660 = anInt1240;
					
					int primary_direction = buffer.getBits(3);
					int secondary_direction = buffer.getBits(3);
					int update_required = buffer.getBits(1);
					
					model.queue_step(true, primary_direction);
					model.queue_step(true, secondary_direction);
					
					if (update_required == 1) {
						local_entities[local_player_count++] = local_id;
					}
				} else if (steps_taken == 3) {
					local_entity_index[anInt940++] = local_id;
				}
			}
		}
	}

	public void openTab(int interface_id) {
		Interface tab_interface = Interface.interfaces[interface_id];
		for (int child_id = 0; child_id < tab_interface.children.length; child_id++) {
			if (tab_interface.children[child_id] == -1) {
				break;
			}
			Interface child_interface = Interface.interfaces[tab_interface.children[child_id]];
			if (child_interface.type == 1) {
				openTab(child_interface.id);
			}
			child_interface.anInt103 = 0;
			child_interface.anInt104 = 0;
		}
	}

	public void synchronize_npcs(int i, Buffer buffer) {
		anInt940 = 0;
		local_player_count = 0;
		update_npc_movement(i, buffer, anInt1202);
		add_new_npc(i, buffer);
		update_npc(0, buffer, i);
		for (int j = 0; j < anInt940; j++) {
			int npc_index = local_entity_index[j];
			
			if (((RenderingHints) (local_npcs[npc_index])).anInt1660 != anInt1240) {
				local_npcs[npc_index].definition = null;
				local_npcs[npc_index] = null;
			}
		}
		if (buffer.pointer != i) {
			throw new RuntimeException("npc packet size mismatch: " + buffer.pointer + "," + packet_size);
		}
		for (int npc_index = 0; npc_index < expected_npc_count; npc_index++) {
			if (local_npcs[local_npc_indices[npc_index]] == null) {
				throw new NullPointerException("invalid npc model - id:" + npc_index + ", expected: " + expected_npc_count);
			}
		}
	}

    public void method106(int i)
    {
        try
        {
            while(i >= 0)
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                if(super.anInt28 >= 539 && super.anInt28 <= 573 && super.anInt29 >= 169 && super.anInt29 < 205 && sidebarInterfaces[0] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 0;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 569 && super.anInt28 <= 599 && super.anInt29 >= 168 && super.anInt29 < 205 && sidebarInterfaces[1] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 1;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 597 && super.anInt28 <= 627 && super.anInt29 >= 168 && super.anInt29 < 205 && sidebarInterfaces[2] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 2;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 625 && super.anInt28 <= 669 && super.anInt29 >= 168 && super.anInt29 < 203 && sidebarInterfaces[3] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 3;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 666 && super.anInt28 <= 696 && super.anInt29 >= 168 && super.anInt29 < 205 && sidebarInterfaces[4] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 4;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 694 && super.anInt28 <= 724 && super.anInt29 >= 168 && super.anInt29 < 205 && sidebarInterfaces[5] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 5;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 722 && super.anInt28 <= 756 && super.anInt29 >= 169 && super.anInt29 < 205 && sidebarInterfaces[6] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 6;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 540 && super.anInt28 <= 574 && super.anInt29 >= 466 && super.anInt29 < 502 && sidebarInterfaces[7] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 7;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 572 && super.anInt28 <= 602 && super.anInt29 >= 466 && super.anInt29 < 503 && sidebarInterfaces[8] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 8;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 599 && super.anInt28 <= 629 && super.anInt29 >= 466 && super.anInt29 < 503 && sidebarInterfaces[9] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 9;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 627 && super.anInt28 <= 671 && super.anInt29 >= 467 && super.anInt29 < 502 && sidebarInterfaces[10] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 10;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 669 && super.anInt28 <= 699 && super.anInt29 >= 466 && super.anInt29 < 503 && sidebarInterfaces[11] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 11;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 696 && super.anInt28 <= 726 && super.anInt29 >= 466 && super.anInt29 < 503 && sidebarInterfaces[12] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 12;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 724 && super.anInt28 <= 758 && super.anInt29 >= 466 && super.anInt29 < 502 && sidebarInterfaces[13] != -1)
                {
                    redrawTabArea = true;
                    anInt1027 = 13;
                    aBoolean1154 = true;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("63058, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method107(Interface class5, boolean flag)
    {
        try
        {
            aBoolean863 &= flag;
            int i = class5.anInt109;
            if(i >= 1 && i <= 200 || i >= 701 && i <= 900)
            {
                if(i >= 801)
                {
                    i -= 701;
                } else
                if(i >= 701)
                {
                    i -= 601;
                } else
                if(i >= 101)
                {
                    i -= 101;
                } else
                {
                    i--;
                }
                aStringArray897[anInt971] = "Remove @whi@" + aStringArray1044[i];
                anIntArray839[anInt971] = 513;
                anInt971++;
                aStringArray897[anInt971] = "Message @whi@" + aStringArray1044[i];
                anIntArray839[anInt971] = 902;
                anInt971++;
                return true;
            }
            if(i >= 401 && i <= 500)
            {
                aStringArray897[anInt971] = "Remove @whi@" + class5.message;
                anIntArray839[anInt971] = 884;
                anInt971++;
                return true;
            } else
            {
                return false;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("1354, " + class5 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method108(int i)
    {
        try
        {
            i = 32 / i;
            for(int j = 0; j < anInt968; j++)
            {
                if(anIntArray1193[j] <= 0)
                {
                    boolean flag = false;
                    try
                    {
                        if(anIntArray846[j] == anInt900 && anIntArray1006[j] == anInt1177)
                        {
                            if(!method79((byte)9))
                            {
                                flag = true;
                            }
                        } else
                        {
                            Buffer class44_sub3_sub2 = SoundEffect.data(anIntArray846[j], anIntArray1006[j]);
                            if(System.currentTimeMillis() + (long)(class44_sub3_sub2.pointer / 22) > aLong1048 + (long)(anInt1028 / 22))
                            {
                                anInt1028 = class44_sub3_sub2.pointer;
                                aLong1048 = System.currentTimeMillis();
                                if(method146(class44_sub3_sub2.payload, 0, class44_sub3_sub2.pointer))
                                {
                                    anInt900 = anIntArray846[j];
                                    anInt1177 = anIntArray1006[j];
                                } else
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                    catch(Exception exception)
                    {
                    }
                    if(!flag || anIntArray1193[j] == -5)
                    {
                        anInt968--;
                        for(int k = j; k < anInt968; k++)
                        {
                            anIntArray846[k] = anIntArray846[k + 1];
                            anIntArray1006[k] = anIntArray1006[k + 1];
                            anIntArray1193[k] = anIntArray1193[k + 1];
                        }
                        j--;
                    } else
                    {
                        anIntArray1193[j] = -5;
                    }
                } else
                {
                    anIntArray1193[j]--;
                }
            }
            if(anInt942 > 0)
            {
                anInt942 -= 20;
                if(anInt942 < 0)
                {
                    anInt942 = 0;
                }
                if(anInt942 == 0 && aBoolean1057 && !highmem)
                {
                    anInt1190 = anInt963;
                    aBoolean1191 = true;
                    cache.load(2, anInt1190);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("64409, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method109(Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3, int i)
    {
        try
        {
            int j = 256;
            for(int k = 0; k < anIntArray1133.length; k++)
            {
                anIntArray1133[k] = 0;
            }
            for(int l = 0; l < 5000; l++)
            {
                int i1 = (int)(Math.random() * 128D * (double)j);
                anIntArray1133[i1] = (int)(Math.random() * 256D);
            }
            for(int j1 = 0; j1 < 20; j1++)
            {
                for(int k1 = 1; k1 < j - 1; k1++)
                {
                    for(int i2 = 1; i2 < 127; i2++)
                    {
                        int k2 = i2 + (k1 << 7);
                        anIntArray1134[k2] = (anIntArray1133[k2 - 1] + anIntArray1133[k2 + 1] + anIntArray1133[k2 - 128] + anIntArray1133[k2 + 128]) / 4;
                    }
                }
                int ai[] = anIntArray1133;
                anIntArray1133 = anIntArray1134;
                anIntArray1134 = ai;
            }
            if(i != 34809)
            {
                packet_opcode = -1;
            }
            if(class44_sub3_sub1_sub3 != null)
            {
                int l1 = 0;
                for(int j2 = 0; j2 < class44_sub3_sub1_sub3.anInt1461; j2++)
                {
                    for(int l2 = 0; l2 < class44_sub3_sub1_sub3.anInt1460; l2++)
                    {
                        if(class44_sub3_sub1_sub3.aByteArray1458[l1++] != 0)
                        {
                            int i3 = l2 + 16 + class44_sub3_sub1_sub3.anInt1462;
                            int j3 = j2 + 16 + class44_sub3_sub1_sub3.anInt1463;
                            int k3 = i3 + (j3 << 7);
                            anIntArray1133[k3] = 0;
                        }
                    }
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10967, " + class44_sub3_sub1_sub3 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method110(boolean flag, boolean flag1)
    {
        try
        {
            if(((RenderingHints) (player_appearance)).anInt1615 >> 7 == absolute_x && ((RenderingHints) (player_appearance)).anInt1616 >> 7 == absolute_y)
            {
                absolute_x = 0;
                anInt944++;
                if(anInt944 > 122)
                {
                    anInt944 = 0;
                    buffer.putOpcode(255);
                    buffer.putByte(62);
                }
            }
            int i = expected_player_count;
            if(!flag)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            if(flag1)
            {
                i = 1;
            }
            for(int j = 0; j < i; j++)
            {
                PlayerModel class44_sub3_sub4_sub6_sub1;
                int k;
                if(flag1)
                {
                    class44_sub3_sub4_sub6_sub1 = player_appearance;
                    k = player_processed_flag << 14;
                } else
                {
                    class44_sub3_sub4_sub6_sub1 = player_models[local_players[j]];
                    k = local_players[j] << 14;
                }
                if(class44_sub3_sub4_sub6_sub1 == null || !class44_sub3_sub4_sub6_sub1.method535(true))
                {
                    continue;
                }
                class44_sub3_sub4_sub6_sub1.aBoolean1692 = false;
                if((highmem && expected_player_count > 50 || expected_player_count > 200) && !flag1 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1640 == ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).idle_animation)
                {
                    class44_sub3_sub4_sub6_sub1.aBoolean1692 = true;
                }
                int l = ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 >> 7;
                int i1 = ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 >> 7;
                if(l < 0 || l >= 104 || i1 < 0 || i1 >= 104)
                {
                    continue;
                }
                if(class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1687 != null && anInt1240 >= class44_sub3_sub4_sub6_sub1.anInt1682 && anInt1240 < class44_sub3_sub4_sub6_sub1.anInt1683)
                {
                    class44_sub3_sub4_sub6_sub1.aBoolean1692 = false;
                    class44_sub3_sub4_sub6_sub1.anInt1681 = method51(false, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615, height_level);
                    aClass36_1192.method290(60, k, true, class44_sub3_sub4_sub6_sub1.anInt1689, class44_sub3_sub4_sub6_sub1.anInt1690, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615, class44_sub3_sub4_sub6_sub1.anInt1691, class44_sub3_sub4_sub6_sub1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, height_level, class44_sub3_sub4_sub6_sub1.anInt1681, class44_sub3_sub4_sub6_sub1.anInt1688, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1617);
                    continue;
                }
                if((((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 & 0x7f) == 64 && (((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 & 0x7f) == 64)
                {
                    if(anIntArrayArray885[l][i1] == anInt1189)
                    {
                        continue;
                    }
                    anIntArrayArray885[l][i1] = anInt1189;
                }
                class44_sub3_sub4_sub6_sub1.anInt1681 = method51(false, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615, height_level);
                aClass36_1192.method289(60, k, class44_sub3_sub4_sub6_sub1.anInt1681, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615, 384, class44_sub3_sub4_sub6_sub1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1617, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).aBoolean1618, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616, height_level);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("61838, " + flag + ", " + flag1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method111(int i, byte byte0, int j)
    {
        try
        {
            int k = 0;
            for(int l = 0; l < 100; l++)
            {
                if(chat_entry_text[l] == null)
                {
                    continue;
                }
                int i1 = chat_entry_type[l];
                int j1 = (70 - k * 14) + anInt1103 + 4;
                if(j1 < -20)
                {
                    break;
                }
                String s = chat_entry_username[l];
                if(s != null && s.startsWith("@cr1@"))
                {
                    s = s.substring(5);
                }
                if(s != null && s.startsWith("@cr2@"))
                {
                    s = s.substring(5);
                }
                if(i1 == 0)
                {
                    k++;
                }
                if((i1 == 1 || i1 == 2) && (i1 == 1 || chat_settings == 0 || chat_settings == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1 && !s.equals(player_appearance.username))
                    {
                        if(user_privilege >= 1)
                        {
                            aStringArray897[anInt971] = "Report abuse @whi@" + s;
                            anIntArray839[anInt971] = 524;
                            anInt971++;
                        }
                        aStringArray897[anInt971] = "Add ignore @whi@" + s;
                        anIntArray839[anInt971] = 47;
                        anInt971++;
                        aStringArray897[anInt971] = "Add friend @whi@" + s;
                        anIntArray839[anInt971] = 605;
                        anInt971++;
                    }
                    k++;
                }
                if((i1 == 3 || i1 == 7) && anInt1017 == 0 && (i1 == 7 || pm_settings == 0 || pm_settings == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        if(user_privilege >= 1)
                        {
                            aStringArray897[anInt971] = "Report abuse @whi@" + s;
                            anIntArray839[anInt971] = 524;
                            anInt971++;
                        }
                        aStringArray897[anInt971] = "Add ignore @whi@" + s;
                        anIntArray839[anInt971] = 47;
                        anInt971++;
                        aStringArray897[anInt971] = "Add friend @whi@" + s;
                        anIntArray839[anInt971] = 605;
                        anInt971++;
                    }
                    k++;
                }
                if(i1 == 4 && (trade_settings == 0 || trade_settings == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        aStringArray897[anInt971] = "Accept trade @whi@" + s;
                        anIntArray839[anInt971] = 507;
                        anInt971++;
                    }
                    k++;
                }
                if((i1 == 5 || i1 == 6) && anInt1017 == 0 && pm_settings < 2)
                {
                    k++;
                }
                if(i1 == 8 && (trade_settings == 0 || trade_settings == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        aStringArray897[anInt971] = "Accept challenge @whi@" + s;
                        anIntArray839[anInt971] = 957;
                        anInt971++;
                    }
                    k++;
                }
            }
            if(byte0 != 7)
            {
                method6();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("6327, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public void method112(int i, PlayerModel model, int k, int l) {
		if (model == player_appearance) {
			return;
		}
		if (anInt971 >= 400) {
			return;
		}
		String s;
		if (model.gamesroom_skill == 0) {
			s = model.username + getColorForLevelDifference(model.combat_level, player_appearance.combat_level) + " (level-" + model.combat_level + ")";
		} else {
			s = model.username + " (skill-" + model.gamesroom_skill + ")";
		}
		if (anInt952 == 1) {
			aStringArray897[anInt971] = "Use " + selected_item_id + " with @whi@" + s;
			anIntArray839[anInt971] = 275;
			anIntArray840[anInt971] = l;
			anIntArray837[anInt971] = k;
			anIntArray838[anInt971] = i;
			anInt971++;
		} else if (anInt994 == 1) {
			if ((anInt996 & 8) == 8) {
				aStringArray897[anInt971] = aString997 + " @whi@" + s;
				anIntArray839[anInt971] = 131;
				anIntArray840[anInt971] = l;
				anIntArray837[anInt971] = k;
				anIntArray838[anInt971] = i;
				anInt971++;
			}
		} else {
			for (int i1 = 4; i1 >= 0; i1--) {
				if (aStringArray919[i1] != null) {
					aStringArray897[anInt971] = aStringArray919[i1] + " @whi@" + s;
					char c = '\0';
					if (aStringArray919[i1].equalsIgnoreCase("attack")) {
						if (model.combat_level > player_appearance.combat_level) {
							c = '\u07D0';
						}
						if (player_appearance.anInt1695 != 0 && model.anInt1695 != 0) {
							if (player_appearance.anInt1695 == model.anInt1695) {
								c = '\u07D0';
							} else {
								c = '\0';
							}
						}
					} else if (aBooleanArray920[i1]) {
						c = '\u07D0';
					}
					if (i1 == 0) {
						anIntArray839[anInt971] = 639 + c;
					}
					if (i1 == 1) {
						anIntArray839[anInt971] = 499 + c;
					}
					if (i1 == 2) {
						anIntArray839[anInt971] = 27 + c;
					}
					if (i1 == 3) {
						anIntArray839[anInt971] = 387 + c;
					}
					if (i1 == 4) {
						anIntArray839[anInt971] = 185 + c;
					}
					anIntArray840[anInt971] = l;
					anIntArray837[anInt971] = k;
					anIntArray838[anInt971] = i;
					anInt971++;
				}
			}
		}
		for (int j1 = 0; j1 < anInt971; j1++) {
			if (anIntArray839[j1] != 718) {
				continue;
			}
			aStringArray897[j1] = "Walk here @whi@" + s;
			break;
		}
	}

    public void method113(byte byte0)
    {
        try
        {
            aClass34_1195.method272((byte)5);
            Rasterizer.anIntArray1429 = anIntArray915;
            if(byte0 != 3)
            {
                return;
            }
            aClass44_Sub3_Sub1_Sub3_1143.method453(0, aByte1213, 0);
            if(active_inventory_interface != -1)
            {
                method37(6, 0, 0, Interface.interfaces[active_inventory_interface], 0);
            } else
            if(sidebarInterfaces[anInt1027] != -1)
            {
                method37(6, 0, 0, Interface.interfaces[sidebarInterfaces[anInt1027]], 0);
            }
            if(aBoolean946 && anInt1030 == 1)
            {
                method115(393);
            }
            aClass34_1195.method273(-781, 553, 205, super.graphics);
            aClass34_1197.method272((byte)5);
            Rasterizer.anIntArray1429 = anIntArray916;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("78878, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method114(int i)
    {
        try
        {
            Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5)aClass28_1054.peek();
            if(i >= 0)
            {
                buffer.putByte(87);
            }
            for(; class44_sub3_sub4_sub5 != null; class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5)aClass28_1054.next())
            {
                if(class44_sub3_sub4_sub5.anInt1606 != height_level || class44_sub3_sub4_sub5.aBoolean1612)
                {
                    class44_sub3_sub4_sub5.destroy();
                } else
                if(anInt1240 >= class44_sub3_sub4_sub5.anInt1605)
                {
                    class44_sub3_sub4_sub5.method531(922, anInt824);
                    if(class44_sub3_sub4_sub5.aBoolean1612)
                    {
                        class44_sub3_sub4_sub5.destroy();
                    } else
                    {
                        aClass36_1192.method289(60, -1, class44_sub3_sub4_sub5.anInt1609, class44_sub3_sub4_sub5.anInt1607, 384, class44_sub3_sub4_sub5, 0, false, class44_sub3_sub4_sub5.anInt1608, class44_sub3_sub4_sub5.anInt1606);
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("1882, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method115(int i)
    {
        try
        {
            int j = anInt1031;
            int k = anInt1032;
            int l = anInt1033;
            int i1 = anInt1034;
            int j1 = 0x5d5447;
            DrawingArea.method411(j1, 210, k, i1, j, l);
            DrawingArea.method411(0, 210, k + 1, 16, j + 1, l - 2);
            if(i <= 0)
            {
                anInt1153 = 111;
            }
            DrawingArea.method412(1, j + 1, l - 2, 0, k + 18, i1 - 19);
            chat_area_graphics.method459((byte)-104, j1, "Choose Option", j + 3, k + 14);
            int k1 = super.mouse_x;
            int l1 = super.mouse_y;
            if(anInt1030 == 0)
            {
                k1 -= 4;
                l1 -= 4;
            }
            if(anInt1030 == 1)
            {
                k1 -= 553;
                l1 -= 205;
            }
            if(anInt1030 == 2)
            {
                k1 -= 17;
                l1 -= 357;
            }
            for(int i2 = 0; i2 < anInt971; i2++)
            {
                int j2 = k + 31 + (anInt971 - 1 - i2) * 15;
                int k2 = 0xffffff;
                if(k1 > j && k1 < j + l && l1 > j2 - 13 && l1 < j2 + 3)
                {
                    k2 = 0xffff00;
                }
                chat_area_graphics.method463(k2, 2, j2, true, j + 3, aStringArray897[i2]);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33105, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method116(int i)
    {
        try
        {
            for(int j = 0; j < expected_npc_count; j++)
            {
                int k = local_npc_indices[j];
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[k];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    method117(-34028, class44_sub3_sub4_sub6_sub2, class44_sub3_sub4_sub6_sub2.definition.size);
                }
            }
            if(i <= 0)
            {
                anInt1247 = -115;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89148, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method117(int i, RenderingHints class44_sub3_sub4_sub6, int j)
    {
        try
        {
            if(i != -34028)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
            }
            if(class44_sub3_sub4_sub6.anInt1615 < 128 || class44_sub3_sub4_sub6.anInt1616 < 128 || class44_sub3_sub4_sub6.anInt1615 >= 13184 || class44_sub3_sub4_sub6.anInt1616 >= 13184)
            {
                class44_sub3_sub4_sub6.animation_id = -1;
                class44_sub3_sub4_sub6.spotanim_id = -1;
                class44_sub3_sub4_sub6.anInt1657 = 0;
                class44_sub3_sub4_sub6.anInt1658 = 0;
                class44_sub3_sub4_sub6.anInt1615 = class44_sub3_sub4_sub6.walking_queue_x[0] * 128 + class44_sub3_sub4_sub6.size * 64;
                class44_sub3_sub4_sub6.anInt1616 = class44_sub3_sub4_sub6.walking_queue_y[0] * 128 + class44_sub3_sub4_sub6.size * 64;
                class44_sub3_sub4_sub6.reset_movement();
            }
            if(class44_sub3_sub4_sub6 == player_appearance && (class44_sub3_sub4_sub6.anInt1615 < 1536 || class44_sub3_sub4_sub6.anInt1616 < 1536 || class44_sub3_sub4_sub6.anInt1615 >= 11776 || class44_sub3_sub4_sub6.anInt1616 >= 11776))
            {
                class44_sub3_sub4_sub6.animation_id = -1;
                class44_sub3_sub4_sub6.spotanim_id = -1;
                class44_sub3_sub4_sub6.anInt1657 = 0;
                class44_sub3_sub4_sub6.anInt1658 = 0;
                class44_sub3_sub4_sub6.anInt1615 = class44_sub3_sub4_sub6.walking_queue_x[0] * 128 + class44_sub3_sub4_sub6.size * 64;
                class44_sub3_sub4_sub6.anInt1616 = class44_sub3_sub4_sub6.walking_queue_y[0] * 128 + class44_sub3_sub4_sub6.size * 64;
                class44_sub3_sub4_sub6.reset_movement();
            }
            if(class44_sub3_sub4_sub6.anInt1657 > anInt1240)
            {
                method118(5, class44_sub3_sub4_sub6);
            } else
            if(class44_sub3_sub4_sub6.anInt1658 >= anInt1240)
            {
                method119(anInt1091, class44_sub3_sub4_sub6);
            } else
            {
                method120(class44_sub3_sub4_sub6, 0);
            }
            method121((byte)2, class44_sub3_sub4_sub6);
            method122(class44_sub3_sub4_sub6, 0);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("3333, " + i + ", " + class44_sub3_sub4_sub6 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method118(int i, RenderingHints class44_sub3_sub4_sub6)
    {
        try
        {
            int j = class44_sub3_sub4_sub6.anInt1657 - anInt1240;
            if(i < 5 || i > 5)
            {
                groundItems = null;
            }
            int k = class44_sub3_sub4_sub6.anInt1653 * 128 + class44_sub3_sub4_sub6.size * 64;
            int l = class44_sub3_sub4_sub6.anInt1655 * 128 + class44_sub3_sub4_sub6.size * 64;
            class44_sub3_sub4_sub6.anInt1615 += (k - class44_sub3_sub4_sub6.anInt1615) / j;
            class44_sub3_sub4_sub6.anInt1616 += (l - class44_sub3_sub4_sub6.anInt1616) / j;
            class44_sub3_sub4_sub6.anInt1668 = 0;
            if(class44_sub3_sub4_sub6.anInt1659 == 0)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1536;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 2)
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 3)
            {
                class44_sub3_sub4_sub6.anInt1662 = 512;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("29708, " + i + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method119(int i, RenderingHints class44_sub3_sub4_sub6)
    {
        try
        {
            if(class44_sub3_sub4_sub6.anInt1658 == anInt1240 || class44_sub3_sub4_sub6.animation_id == -1 || class44_sub3_sub4_sub6.animation_delay != 0 || class44_sub3_sub4_sub6.anInt1645 + 1 > AnimationSequence.cache[class44_sub3_sub4_sub6.animation_id].getLength(class44_sub3_sub4_sub6.anInt1644))
            {
                int j = class44_sub3_sub4_sub6.anInt1658 - class44_sub3_sub4_sub6.anInt1657;
                int k = anInt1240 - class44_sub3_sub4_sub6.anInt1657;
                int l = class44_sub3_sub4_sub6.anInt1653 * 128 + class44_sub3_sub4_sub6.size * 64;
                int i1 = class44_sub3_sub4_sub6.anInt1655 * 128 + class44_sub3_sub4_sub6.size * 64;
                int j1 = class44_sub3_sub4_sub6.anInt1654 * 128 + class44_sub3_sub4_sub6.size * 64;
                int k1 = class44_sub3_sub4_sub6.anInt1656 * 128 + class44_sub3_sub4_sub6.size * 64;
                class44_sub3_sub4_sub6.anInt1615 = (l * (j - k) + j1 * k) / j;
                class44_sub3_sub4_sub6.anInt1616 = (i1 * (j - k) + k1 * k) / j;
            }
            class44_sub3_sub4_sub6.anInt1668 = 0;
            if(class44_sub3_sub4_sub6.anInt1659 == 0)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1536;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 2)
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 3)
            {
                class44_sub3_sub4_sub6.anInt1662 = 512;
            }
            class44_sub3_sub4_sub6.anInt1617 = class44_sub3_sub4_sub6.anInt1662;
            if(i != 37395)
            {
                packet_opcode = incoming_buffer.getUnsignedByte();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("74708, " + i + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method120(RenderingHints class44_sub3_sub4_sub6, int i)
    {
        try
        {
            class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.idle_animation;
            if(class44_sub3_sub4_sub6.current_step == 0)
            {
                class44_sub3_sub4_sub6.anInt1668 = 0;
                return;
            }
            if(class44_sub3_sub4_sub6.animation_id != -1 && class44_sub3_sub4_sub6.animation_delay == 0)
            {
                AnimationSequence class26 = AnimationSequence.cache[class44_sub3_sub4_sub6.animation_id];
                if(class44_sub3_sub4_sub6.anInt1669 > 0 && class26.precedenceAnimating == 0)
                {
                    class44_sub3_sub4_sub6.anInt1668++;
                    return;
                }
                if(class44_sub3_sub4_sub6.anInt1669 <= 0 && class26.walking_blend_mode == 0)
                {
                    class44_sub3_sub4_sub6.anInt1668++;
                    return;
                }
            }
            int j = class44_sub3_sub4_sub6.anInt1615;
            int k = class44_sub3_sub4_sub6.anInt1616;
            int l = class44_sub3_sub4_sub6.walking_queue_x[class44_sub3_sub4_sub6.current_step - 1] * 128 + class44_sub3_sub4_sub6.size * 64;
            int i1 = class44_sub3_sub4_sub6.walking_queue_y[class44_sub3_sub4_sub6.current_step - 1] * 128 + class44_sub3_sub4_sub6.size * 64;
            if(l - j > 256 || l - j < -256 || i1 - k > 256 || i1 - k < -256)
            {
                class44_sub3_sub4_sub6.anInt1615 = l;
                class44_sub3_sub4_sub6.anInt1616 = i1;
                return;
            }
            if(j < l)
            {
                if(k < i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1280;
                } else
                if(k > i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1792;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1536;
                }
            } else
            if(j > l)
            {
                if(k < i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 768;
                } else
                if(k > i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 256;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1662 = 512;
                }
            } else
            if(k < i1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            } else
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            int j1 = class44_sub3_sub4_sub6.anInt1662 - class44_sub3_sub4_sub6.anInt1617 & 0x7ff;
            if(j1 > 1024)
            {
                j1 -= 2048;
            }
            int k1 = class44_sub3_sub4_sub6.rotate_animation;
            packet_size += i;
            if(j1 >= -256 && j1 <= 256)
            {
                k1 = class44_sub3_sub4_sub6.walk_animation;
            } else
            if(j1 >= 256 && j1 < 768)
            {
                k1 = class44_sub3_sub4_sub6.clockwise_animation;
            } else
            if(j1 >= -768 && j1 <= -256)
            {
                k1 = class44_sub3_sub4_sub6.counter_clockwise_animation;
            }
            if(k1 == -1)
            {
                k1 = class44_sub3_sub4_sub6.walk_animation;
            }
            class44_sub3_sub4_sub6.anInt1640 = k1;
            int l1 = 4;
            if(class44_sub3_sub4_sub6.anInt1617 != class44_sub3_sub4_sub6.anInt1662 && class44_sub3_sub4_sub6.interacting_entity == -1 && class44_sub3_sub4_sub6.degrees_to_turn != 0)
            {
                l1 = 2;
            }
            if(class44_sub3_sub4_sub6.current_step > 2)
            {
                l1 = 6;
            }
            if(class44_sub3_sub4_sub6.current_step > 3)
            {
                l1 = 8;
            }
            if(class44_sub3_sub4_sub6.anInt1668 > 0 && class44_sub3_sub4_sub6.current_step > 1)
            {
                l1 = 8;
                class44_sub3_sub4_sub6.anInt1668--;
            }
            if(class44_sub3_sub4_sub6.running_queue[class44_sub3_sub4_sub6.current_step - 1])
            {
                l1 <<= 1;
            }
            if(l1 >= 8 && class44_sub3_sub4_sub6.anInt1640 == class44_sub3_sub4_sub6.walk_animation && class44_sub3_sub4_sub6.anInt1626 != -1)
            {
                class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1626;
            }
            if(j < l)
            {
                class44_sub3_sub4_sub6.anInt1615 += l1;
                if(class44_sub3_sub4_sub6.anInt1615 > l)
                {
                    class44_sub3_sub4_sub6.anInt1615 = l;
                }
            } else
            if(j > l)
            {
                class44_sub3_sub4_sub6.anInt1615 -= l1;
                if(class44_sub3_sub4_sub6.anInt1615 < l)
                {
                    class44_sub3_sub4_sub6.anInt1615 = l;
                }
            }
            if(k < i1)
            {
                class44_sub3_sub4_sub6.anInt1616 += l1;
                if(class44_sub3_sub4_sub6.anInt1616 > i1)
                {
                    class44_sub3_sub4_sub6.anInt1616 = i1;
                }
            } else
            if(k > i1)
            {
                class44_sub3_sub4_sub6.anInt1616 -= l1;
                if(class44_sub3_sub4_sub6.anInt1616 < i1)
                {
                    class44_sub3_sub4_sub6.anInt1616 = i1;
                }
            }
            if(class44_sub3_sub4_sub6.anInt1615 == l && class44_sub3_sub4_sub6.anInt1616 == i1)
            {
                class44_sub3_sub4_sub6.current_step--;
                if(class44_sub3_sub4_sub6.anInt1669 > 0)
                {
                    class44_sub3_sub4_sub6.anInt1669--;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("29188, " + class44_sub3_sub4_sub6 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method121(byte byte0, RenderingHints class44_sub3_sub4_sub6)
    {
        try
        {
            if(byte0 == 2)
            {
                byte0 = 0;
            } else
            {
                groundItems = null;
            }
            if(class44_sub3_sub4_sub6.degrees_to_turn == 0)
            {
                return;
            }
            if(class44_sub3_sub4_sub6.interacting_entity != -1 && class44_sub3_sub4_sub6.interacting_entity < 32768)
            {
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[class44_sub3_sub4_sub6.interacting_entity];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    int l = class44_sub3_sub4_sub6.anInt1615 - ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615;
                    int j1 = class44_sub3_sub4_sub6.anInt1616 - ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616;
                    if(l != 0 || j1 != 0)
                    {
                        class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(l, j1) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if(class44_sub3_sub4_sub6.interacting_entity >= 32768)
            {
                int i = class44_sub3_sub4_sub6.interacting_entity - 32768;
                if(i == anInt1115)
                {
                    i = player_processed_flag;
                }
                PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[i];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    int k1 = class44_sub3_sub4_sub6.anInt1615 - ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615;
                    int l1 = class44_sub3_sub4_sub6.anInt1616 - ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616;
                    if(k1 != 0 || l1 != 0)
                    {
                        class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(k1, l1) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if((class44_sub3_sub4_sub6.view_x != 0 || class44_sub3_sub4_sub6.view_y != 0) && (class44_sub3_sub4_sub6.current_step == 0 || class44_sub3_sub4_sub6.anInt1668 > 0))
            {
                int j = class44_sub3_sub4_sub6.anInt1615 - (class44_sub3_sub4_sub6.view_x - base_x - base_x) * 64;
                int i1 = class44_sub3_sub4_sub6.anInt1616 - (class44_sub3_sub4_sub6.view_y - base_y - base_y) * 64;
                if(j != 0 || i1 != 0)
                {
                    class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(j, i1) * 325.94900000000001D) & 0x7ff;
                }
                class44_sub3_sub4_sub6.view_x = 0;
                class44_sub3_sub4_sub6.view_y = 0;
            }
            int k = class44_sub3_sub4_sub6.anInt1662 - class44_sub3_sub4_sub6.anInt1617 & 0x7ff;
            if(k != 0)
            {
                if(k < class44_sub3_sub4_sub6.degrees_to_turn || k > 2048 - class44_sub3_sub4_sub6.degrees_to_turn)
                {
                    class44_sub3_sub4_sub6.anInt1617 = class44_sub3_sub4_sub6.anInt1662;
                } else
                if(k > 1024)
                {
                    class44_sub3_sub4_sub6.anInt1617 -= class44_sub3_sub4_sub6.degrees_to_turn;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1617 += class44_sub3_sub4_sub6.degrees_to_turn;
                }
                class44_sub3_sub4_sub6.anInt1617 &= 0x7ff;
                if(class44_sub3_sub4_sub6.anInt1640 == class44_sub3_sub4_sub6.idle_animation && class44_sub3_sub4_sub6.anInt1617 != class44_sub3_sub4_sub6.anInt1662)
                {
                    if(class44_sub3_sub4_sub6.anInt1621 != -1)
                    {
                        class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1621;
                        return;
                    } else
                    {
                        class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.walk_animation;
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("53139, " + byte0 + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method122(RenderingHints class44_sub3_sub4_sub6, int i)
    {
        try
        {
            packet_size += i;
            class44_sub3_sub4_sub6.aBoolean1618 = false;
            if(class44_sub3_sub4_sub6.anInt1640 != -1)
            {
                AnimationSequence class26 = AnimationSequence.cache[class44_sub3_sub4_sub6.anInt1640];
                class44_sub3_sub4_sub6.anInt1642++;
                if(class44_sub3_sub4_sub6.anInt1641 < class26.frame_count && class44_sub3_sub4_sub6.anInt1642 > class26.getLength(class44_sub3_sub4_sub6.anInt1641))
                {
                    class44_sub3_sub4_sub6.anInt1642 = 0;
                    class44_sub3_sub4_sub6.anInt1641++;
                }
                if(class44_sub3_sub4_sub6.anInt1641 >= class26.frame_count)
                {
                    class44_sub3_sub4_sub6.anInt1642 = 0;
                    class44_sub3_sub4_sub6.anInt1641 = 0;
                }
            }
            if(class44_sub3_sub4_sub6.spotanim_id != -1 && anInt1240 >= class44_sub3_sub4_sub6.anspotanim_delay)
            {
                if(class44_sub3_sub4_sub6.anInt1649 < 0)
                {
                    class44_sub3_sub4_sub6.anInt1649 = 0;
                }
                AnimationSequence class26_1 = Class32.aClass32Array559[class44_sub3_sub4_sub6.spotanim_id].aClass26_563;
                for(class44_sub3_sub4_sub6.anInt1650++; class44_sub3_sub4_sub6.anInt1649 < class26_1.frame_count && class44_sub3_sub4_sub6.anInt1650 > class26_1.getLength(class44_sub3_sub4_sub6.anInt1649); class44_sub3_sub4_sub6.anInt1649++)
                {
                    class44_sub3_sub4_sub6.anInt1650 -= class26_1.getLength(class44_sub3_sub4_sub6.anInt1649);
                }
                if(class44_sub3_sub4_sub6.anInt1649 >= class26_1.frame_count && (class44_sub3_sub4_sub6.anInt1649 < 0 || class44_sub3_sub4_sub6.anInt1649 >= class26_1.frame_count))
                {
                    class44_sub3_sub4_sub6.spotanim_id = -1;
                }
            }
            if(class44_sub3_sub4_sub6.animation_id != -1 && class44_sub3_sub4_sub6.animation_delay <= 1)
            {
                AnimationSequence class26_2 = AnimationSequence.cache[class44_sub3_sub4_sub6.animation_id];
                if(class26_2.precedenceAnimating == 1 && class44_sub3_sub4_sub6.anInt1669 > 0 && class44_sub3_sub4_sub6.anInt1657 <= anInt1240 && class44_sub3_sub4_sub6.anInt1658 < anInt1240)
                {
                    class44_sub3_sub4_sub6.animation_delay = 1;
                    return;
                }
            }
            if(class44_sub3_sub4_sub6.animation_id != -1 && class44_sub3_sub4_sub6.animation_delay == 0)
            {
                AnimationSequence class26_3 = AnimationSequence.cache[class44_sub3_sub4_sub6.animation_id];
                for(class44_sub3_sub4_sub6.anInt1645++; class44_sub3_sub4_sub6.anInt1644 < class26_3.frame_count && class44_sub3_sub4_sub6.anInt1645 > class26_3.getLength(class44_sub3_sub4_sub6.anInt1644); class44_sub3_sub4_sub6.anInt1644++)
                {
                    class44_sub3_sub4_sub6.anInt1645 -= class26_3.getLength(class44_sub3_sub4_sub6.anInt1644);
                }
                if(class44_sub3_sub4_sub6.anInt1644 >= class26_3.frame_count)
                {
                    class44_sub3_sub4_sub6.anInt1644 -= class26_3.frame_step;
                    class44_sub3_sub4_sub6.anInt1647++;
                    if(class44_sub3_sub4_sub6.anInt1647 >= class26_3.maximumLoops)
                    {
                        class44_sub3_sub4_sub6.animation_id = -1;
                    }
                    if(class44_sub3_sub4_sub6.anInt1644 < 0 || class44_sub3_sub4_sub6.anInt1644 >= class26_3.frame_count)
                    {
                        class44_sub3_sub4_sub6.animation_id = -1;
                    }
                }
                class44_sub3_sub4_sub6.aBoolean1618 = class26_3.dynamic;
            }
            if(class44_sub3_sub4_sub6.animation_delay > 0)
            {
                class44_sub3_sub4_sub6.animation_delay--;
                return;
            }
        }
        catch(Exception runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("50955, " + class44_sub3_sub4_sub6 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method123(boolean flag)
    {
        try
        {
            if(flag)
            {
                return;
            }
            if(aBoolean908)
            {
                aBoolean908 = false;
                aClass34_1123.method273(-781, 0, 4, super.graphics);
                aClass34_1124.method273(-781, 0, 357, super.graphics);
                aClass34_1125.method273(-781, 722, 4, super.graphics);
                aClass34_1126.method273(-781, 743, 205, super.graphics);
                aClass34_1127.method273(-781, 0, 0, super.graphics);
                aClass34_1128.method273(-781, 516, 4, super.graphics);
                aClass34_1129.method273(-781, 516, 205, super.graphics);
                aClass34_1130.method273(-781, 496, 357, super.graphics);
                aClass34_1131.method273(-781, 0, 338, super.graphics);
                redrawTabArea = true;
                inputTaken = true;
                aBoolean1154 = true;
                aBoolean1062 = true;
                if(game_state != 2)
                {
                    aClass34_1197.method273(-781, 4, 4, super.graphics);
                    aClass34_1196.method273(-781, 550, 4, super.graphics);
                }
            }
            if(game_state == 2)
            {
                method43(0);
            }
            if(aBoolean946 && anInt1030 == 1)
            {
                redrawTabArea = true;
            }
            if(active_inventory_interface != -1)
            {
                boolean flag1 = method65(anInt824, active_inventory_interface, (byte)-103);
                if(flag1)
                {
                    redrawTabArea = true;
                }
            }
            if(anInt1151 == 2)
            {
                redrawTabArea = true;
            }
            if(anInt1095 == 2)
            {
                redrawTabArea = true;
            }
            if(redrawTabArea)
            {
                method113((byte)3);
                redrawTabArea = false;
            }
            if(active_chat_interface == -1)
            {
                aClass5_1201.anInt120 = anInt874 - anInt1103 - 77;
                if(super.mouse_x > 448 && super.mouse_x < 560 && super.mouse_y > 332)
                {
                    method81(0, super.mouse_x - 17, aClass5_1201, 463, false, 77, aByte830, super.mouse_y - 357, anInt874);
                }
                int i = anInt874 - 77 - aClass5_1201.anInt120;
                if(i < 0)
                {
                    i = 0;
                }
                if(i > anInt874 - 77)
                {
                    i = anInt874 - 77;
                }
                if(anInt1103 != i)
                {
                    anInt1103 = i;
                    inputTaken = true;
                }
            }
            if(active_chat_interface != -1)
            {
                boolean flag2 = method65(anInt824, active_chat_interface, (byte)-103);
                if(flag2)
                {
                    inputTaken = true;
                }
            }
            if(anInt1151 == 3)
            {
                inputTaken = true;
            }
            if(anInt1095 == 3)
            {
                inputTaken = true;
            }
            if(aString823 != null)
            {
                inputTaken = true;
            }
            if(aBoolean946 && anInt1030 == 2)
            {
                inputTaken = true;
            }
            if(inputTaken)
            {
                method47(311);
                inputTaken = false;
            }
            if(game_state == 2)
            {
                method36(0);
                aClass34_1196.method273(-781, 550, 4, super.graphics);
            }
            if(anInt833 != -1)
            {
                aBoolean1154 = true;
            }
            if(aBoolean1154)
            {
                if(anInt833 != -1 && anInt833 == anInt1027)
                {
                    anInt833 = -1;
                    buffer.putOpcode(146);
                    buffer.putByte(anInt1027);
                }
                aBoolean1154 = false;
                aClass34_860.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_905.method453(0, aByte1213, 0);
                if(active_inventory_interface == -1)
                {
                    if(sidebarInterfaces[anInt1027] != -1)
                    {
                        if(anInt1027 == 0)
                        {
                            aClass44_Sub3_Sub1_Sub3_1136.method453(10, aByte1213, 22);
                        }
                        if(anInt1027 == 1)
                        {
                            aClass44_Sub3_Sub1_Sub3_1137.method453(8, aByte1213, 54);
                        }
                        if(anInt1027 == 2)
                        {
                            aClass44_Sub3_Sub1_Sub3_1137.method453(8, aByte1213, 82);
                        }
                        if(anInt1027 == 3)
                        {
                            aClass44_Sub3_Sub1_Sub3_1138.method453(8, aByte1213, 110);
                        }
                        if(anInt1027 == 4)
                        {
                            aClass44_Sub3_Sub1_Sub3_1140.method453(8, aByte1213, 153);
                        }
                        if(anInt1027 == 5)
                        {
                            aClass44_Sub3_Sub1_Sub3_1140.method453(8, aByte1213, 181);
                        }
                        if(anInt1027 == 6)
                        {
                            aClass44_Sub3_Sub1_Sub3_1139.method453(9, aByte1213, 209);
                        }
                    }
                    if(sidebarInterfaces[0] != -1 && (anInt833 != 0 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[0].method453(13, aByte1213, 29);
                    }
                    if(sidebarInterfaces[1] != -1 && (anInt833 != 1 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[1].method453(11, aByte1213, 53);
                    }
                    if(sidebarInterfaces[2] != -1 && (anInt833 != 2 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[2].method453(11, aByte1213, 82);
                    }
                    if(sidebarInterfaces[3] != -1 && (anInt833 != 3 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[3].method453(12, aByte1213, 115);
                    }
                    if(sidebarInterfaces[4] != -1 && (anInt833 != 4 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[4].method453(13, aByte1213, 153);
                    }
                    if(sidebarInterfaces[5] != -1 && (anInt833 != 5 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[5].method453(11, aByte1213, 180);
                    }
                    if(sidebarInterfaces[6] != -1 && (anInt833 != 6 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[6].method453(13, aByte1213, 208);
                    }
                }
                aClass34_860.method273(-781, 516, 160, super.graphics);
                aClass34_859.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_904.method453(0, aByte1213, 0);
                if(active_inventory_interface == -1)
                {
                    if(sidebarInterfaces[anInt1027] != -1)
                    {
                        if(anInt1027 == 7)
                        {
                            aClass44_Sub3_Sub1_Sub3_852.method453(0, aByte1213, 42);
                        }
                        if(anInt1027 == 8)
                        {
                            aClass44_Sub3_Sub1_Sub3_853.method453(0, aByte1213, 74);
                        }
                        if(anInt1027 == 9)
                        {
                            aClass44_Sub3_Sub1_Sub3_853.method453(0, aByte1213, 102);
                        }
                        if(anInt1027 == 10)
                        {
                            aClass44_Sub3_Sub1_Sub3_854.method453(1, aByte1213, 130);
                        }
                        if(anInt1027 == 11)
                        {
                            aClass44_Sub3_Sub1_Sub3_856.method453(0, aByte1213, 173);
                        }
                        if(anInt1027 == 12)
                        {
                            aClass44_Sub3_Sub1_Sub3_856.method453(0, aByte1213, 201);
                        }
                        if(anInt1027 == 13)
                        {
                            aClass44_Sub3_Sub1_Sub3_855.method453(0, aByte1213, 229);
                        }
                    }
                    if(sidebarInterfaces[8] != -1 && (anInt833 != 8 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[7].method453(2, aByte1213, 74);
                    }
                    if(sidebarInterfaces[9] != -1 && (anInt833 != 9 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[8].method453(3, aByte1213, 102);
                    }
                    if(sidebarInterfaces[10] != -1 && (anInt833 != 10 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[9].method453(4, aByte1213, 137);
                    }
                    if(sidebarInterfaces[11] != -1 && (anInt833 != 11 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[10].method453(2, aByte1213, 174);
                    }
                    if(sidebarInterfaces[12] != -1 && (anInt833 != 12 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[11].method453(2, aByte1213, 201);
                    }
                    if(sidebarInterfaces[13] != -1 && (anInt833 != 13 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[12].method453(2, aByte1213, 226);
                    }
                }
                aClass34_859.method273(-781, 496, 466, super.graphics);
                aClass34_1197.method272((byte)5);
            }
            if(aBoolean1062)
            {
                aBoolean1062 = false;
                aClass34_858.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_903.method453(0, aByte1213, 0);
                plain_font.method456(true, 0xffffff, 55, "Public chat", 28);
                if(chat_settings == 0)
                {
                    plain_font.method456(true, 65280, 55, "On", 41);
                }
                if(chat_settings == 1)
                {
                    plain_font.method456(true, 0xffff00, 55, "Friends", 41);
                }
                if(chat_settings == 2)
                {
                    plain_font.method456(true, 0xff0000, 55, "Off", 41);
                }
                if(chat_settings == 3)
                {
                    plain_font.method456(true, 65535, 55, "Hide", 41);
                }
                plain_font.method456(true, 0xffffff, 184, "Private chat", 28);
                if(pm_settings == 0)
                {
                    plain_font.method456(true, 65280, 184, "On", 41);
                }
                if(pm_settings == 1)
                {
                    plain_font.method456(true, 0xffff00, 184, "Friends", 41);
                }
                if(pm_settings == 2)
                {
                    plain_font.method456(true, 0xff0000, 184, "Off", 41);
                }
                plain_font.method456(true, 0xffffff, 324, "Trade/compete", 28);
                if(trade_settings == 0)
                {
                    plain_font.method456(true, 65280, 324, "On", 41);
                }
                if(trade_settings == 1)
                {
                    plain_font.method456(true, 0xffff00, 324, "Friends", 41);
                }
                if(trade_settings == 2)
                {
                    plain_font.method456(true, 0xff0000, 324, "Off", 41);
                }
                plain_font.method456(true, 0xffffff, 458, "Report abuse", 33);
                aClass34_858.method273(-781, 0, 453, super.graphics);
                aClass34_1197.method272((byte)5);
            }
            anInt824 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("27122, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public boolean walk(int i, int j, int k, int l, int i1, int j1, boolean flag, int opcode, int l1, int i2, int j2,
			int k2) {
		byte width = 104;
		byte height = 104;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				anIntArrayArray1113[x][y] = 0;
				anIntArrayArray975[x][y] = 0x5f5e0ff;
			}
		}
		int current_x = j;
		int current_y = k2;
		anIntArrayArray1113[j][k2] = 99;
		anIntArrayArray975[j][k2] = 0;
		int l3 = 0;
		int coordinate_index = 0;
		walk_queue_x[l3] = j;
		walk_queue_y[l3++] = k2;
		boolean flag1 = false;
		if (l1 <= 0) {
			anInt1091 = 304;
		}
		int j4 = walk_queue_x.length;
		int ai[][] = planes[height_level].collision_flags;
		while (coordinate_index != l3) {
			current_x = walk_queue_x[coordinate_index];
			current_y = walk_queue_y[coordinate_index];
			coordinate_index = (coordinate_index + 1) % j4;
			if (current_x == j2 && current_y == l) {
				flag1 = true;
				break;
			}
			if (j1 != 0) {
				if ((j1 < 5 || j1 == 10)
						&& planes[height_level].method240(l, k, j1 - 1, j2, current_y, current_x, -628)) {
					flag1 = true;
					break;
				}
				if (j1 < 10 && planes[height_level].method241((byte) -58, j2, current_y, l, j1 - 1, k, current_x)) {
					flag1 = true;
					break;
				}
			}
			if (i != 0 && i2 != 0 && planes[height_level].method242(i, l, current_y, anInt958, i2, current_x, i1, j2)) {
				flag1 = true;
				break;
			}
			int l4 = anIntArrayArray975[current_x][current_y] + 1;
			if (current_x > 0 && anIntArrayArray1113[current_x - 1][current_y] == 0
					&& (ai[current_x - 1][current_y] & 0x280108) == 0) {
				walk_queue_x[l3] = current_x - 1;
				walk_queue_y[l3] = current_y;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x - 1][current_y] = 2;
				anIntArrayArray975[current_x - 1][current_y] = l4;
			}
			if (current_x < width - 1 && anIntArrayArray1113[current_x + 1][current_y] == 0
					&& (ai[current_x + 1][current_y] & 0x280180) == 0) {
				walk_queue_x[l3] = current_x + 1;
				walk_queue_y[l3] = current_y;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x + 1][current_y] = 8;
				anIntArrayArray975[current_x + 1][current_y] = l4;
			}
			if (current_y > 0 && anIntArrayArray1113[current_x][current_y - 1] == 0
					&& (ai[current_x][current_y - 1] & 0x280102) == 0) {
				walk_queue_x[l3] = current_x;
				walk_queue_y[l3] = current_y - 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x][current_y - 1] = 1;
				anIntArrayArray975[current_x][current_y - 1] = l4;
			}
			if (current_y < height - 1 && anIntArrayArray1113[current_x][current_y + 1] == 0
					&& (ai[current_x][current_y + 1] & 0x280120) == 0) {
				walk_queue_x[l3] = current_x;
				walk_queue_y[l3] = current_y + 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x][current_y + 1] = 4;
				anIntArrayArray975[current_x][current_y + 1] = l4;
			}
			if (current_x > 0 && current_y > 0 && anIntArrayArray1113[current_x - 1][current_y - 1] == 0
					&& (ai[current_x - 1][current_y - 1] & 0x28010e) == 0
					&& (ai[current_x - 1][current_y] & 0x280108) == 0
					&& (ai[current_x][current_y - 1] & 0x280102) == 0) {
				walk_queue_x[l3] = current_x - 1;
				walk_queue_y[l3] = current_y - 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x - 1][current_y - 1] = 3;
				anIntArrayArray975[current_x - 1][current_y - 1] = l4;
			}
			if (current_x < width - 1 && current_y > 0 && anIntArrayArray1113[current_x + 1][current_y - 1] == 0
					&& (ai[current_x + 1][current_y - 1] & 0x280183) == 0
					&& (ai[current_x + 1][current_y] & 0x280180) == 0
					&& (ai[current_x][current_y - 1] & 0x280102) == 0) {
				walk_queue_x[l3] = current_x + 1;
				walk_queue_y[l3] = current_y - 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x + 1][current_y - 1] = 9;
				anIntArrayArray975[current_x + 1][current_y - 1] = l4;
			}
			if (current_x > 0 && current_y < height - 1 && anIntArrayArray1113[current_x - 1][current_y + 1] == 0
					&& (ai[current_x - 1][current_y + 1] & 0x280138) == 0
					&& (ai[current_x - 1][current_y] & 0x280108) == 0
					&& (ai[current_x][current_y + 1] & 0x280120) == 0) {
				walk_queue_x[l3] = current_x - 1;
				walk_queue_y[l3] = current_y + 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x - 1][current_y + 1] = 6;
				anIntArrayArray975[current_x - 1][current_y + 1] = l4;
			}
			if (current_x < width - 1 && current_y < height - 1
					&& anIntArrayArray1113[current_x + 1][current_y + 1] == 0
					&& (ai[current_x + 1][current_y + 1] & 0x2801e0) == 0
					&& (ai[current_x + 1][current_y] & 0x280180) == 0
					&& (ai[current_x][current_y + 1] & 0x280120) == 0) {
				walk_queue_x[l3] = current_x + 1;
				walk_queue_y[l3] = current_y + 1;
				l3 = (l3 + 1) % j4;
				anIntArrayArray1113[current_x + 1][current_y + 1] = 12;
				anIntArrayArray975[current_x + 1][current_y + 1] = l4;
			}
		}
		anInt972 = 0;
		if (!flag1) {
			if (flag) {
				int i5 = 100;
				for (int k5 = 1; k5 < 2; k5++) {
					for (int i6 = j2 - k5; i6 <= j2 + k5; i6++) {
						for (int k6 = l - k5; k6 <= l + k5; k6++) {
							if (i6 >= 0 && k6 >= 0 && i6 < 104 && k6 < 104 && anIntArrayArray975[i6][k6] < i5) {
								i5 = anIntArrayArray975[i6][k6];
								current_x = i6;
								current_y = k6;
								anInt972 = 1;
								flag1 = true;
							}
						}
					}
					if (flag1) {
						break;
					}
				}
			}
			if (!flag1) {
				return false;
			}
		}
		coordinate_index = 0;
		walk_queue_x[coordinate_index] = current_x;
		walk_queue_y[coordinate_index++] = current_y;
		int l5;
		for (int j5 = l5 = anIntArrayArray1113[current_x][current_y]; current_x != j
				|| current_y != k2; j5 = anIntArrayArray1113[current_x][current_y]) {
			if (j5 != l5) {
				l5 = j5;
				walk_queue_x[coordinate_index] = current_x;
				walk_queue_y[coordinate_index++] = current_y;
			}
			if ((j5 & 2) != 0) {
				current_x++;
			} else if ((j5 & 8) != 0) {
				current_x--;
			}
			if ((j5 & 1) != 0) {
				current_y++;
			} else if ((j5 & 4) != 0) {
				current_y--;
			}
		}
		if (coordinate_index > 0) {
			int length = coordinate_index;
			if (length > 25) {
				length = 25;
			}
			coordinate_index--;
			int region_x = walk_queue_x[coordinate_index];
			int region_y = walk_queue_y[coordinate_index];
			if (opcode == 0) {
				buffer.putOpcode(234);
				buffer.putByte(length + length + 3);
			}
			if (opcode == 1) {
				buffer.putOpcode(236);
				buffer.putByte(length + length + 3 + 14);
			}
			if (opcode == 2) {
				buffer.putOpcode(67);
				buffer.putByte(length + length + 3);
			}
			if (super.player_configuration[5] == 1) {
				buffer.putByte(1);
			} else {
				buffer.putByte(0);
			}
			buffer.putShort(region_x + base_x);
			buffer.putShort(region_y + base_y);
			absolute_x = walk_queue_x[0];
			absolute_y = walk_queue_y[0];
			for (int index = 1; index < length; index++) {
				coordinate_index--;
				buffer.putByte(walk_queue_x[coordinate_index] - region_x);
				buffer.putByte(walk_queue_y[coordinate_index] - region_y);
			}
			return true;
		}
		return opcode != 1;
    }

    public Archive method125(byte byte0, String s, int i, String s1, int j, int k)
    {
        try
        {
            byte abyte0[] = null;
            if(byte0 != -9)
            {
                throw new NullPointerException();
            }
            int l = 5;
            try
            {
                if(aClass45Array1208[0] != null)
                {
                    abyte0 = aClass45Array1208[0].method541(false, i);
                }
            }
            catch(Exception _ex)
            {
            }
            /*if(abyte0 != null)
            {
                aCRC32_951.reset();
                aCRC32_951.update(abyte0);
                int i1 = (int)aCRC32_951.getValue();
                if(i1 != k)
                {
                    abyte0 = null;
                }
            }*/
            if(abyte0 != null)
            {
                Archive class47 = new Archive(abyte0);
                return class47;
            }
            int j1 = 0;
            while(abyte0 == null)
            {
                String s2 = "Unknown error";
                method13(false, j, "Requesting " + s);
                try
                {
                    int k1 = 0;
                    DataInputStream datainputstream = method77(s1 + k);
                    byte abyte1[] = new byte[6];
                    datainputstream.readFully(abyte1, 0, 6);
                    Buffer class44_sub3_sub2 = new Buffer(abyte1);
                    class44_sub3_sub2.pointer = 3;
                    int i2 = class44_sub3_sub2.getUnsignedTriByte() + 6;
                    int j2 = 6;
                    abyte0 = new byte[i2];
                    for(int k2 = 0; k2 < 6; k2++)
                    {
                        abyte0[k2] = abyte1[k2];
                    }
                    while(j2 < i2)
                    {
                        int l2 = i2 - j2;
                        if(l2 > 1000)
                        {
                            l2 = 1000;
                        }
                        int j3 = datainputstream.read(abyte0, j2, l2);
                        if(j3 < 0)
                        {
                            s2 = "Length error: " + j2 + "/" + i2;
                            throw new IOException("EOF");
                        }
                        j2 += j3;
                        int k3 = (j2 * 100) / i2;
                        if(k3 != k1)
                        {
                            method13(false, j, "Loading " + s + " - " + k3 + "%");
                        }
                        k1 = k3;
                    }
                    datainputstream.close();
                    try
                    {
                        if(aClass45Array1208[0] != null)
                        {
                            aClass45Array1208[0].method542(abyte0, (byte)4, abyte0.length, i);
                        }
                    }
                    catch(Exception _ex)
                    {
                        aClass45Array1208[0] = null;
                    }
                    if(abyte0 != null)
                    {
                        aCRC32_951.reset();
                        aCRC32_951.update(abyte0);
                        int i3 = (int)aCRC32_951.getValue();
                        if(i3 != k)
                        {
                            abyte0 = null;
                            j1++;
                            s2 = "Checksum error: " + i3;
                        }
                    }
                }
                catch(IOException ioexception)
                {
                    if(s2.equals("Unknown error"))
                    {
                        s2 = "Connection error";
                    }
                    abyte0 = null;
                }
                catch(NullPointerException _ex)
                {
                    s2 = "Null error";
                    abyte0 = null;
                    if(!signlink.reporterror)
                    {
                        return null;
                    }
                }
                catch(ArrayIndexOutOfBoundsException _ex)
                {
                    s2 = "Bounds error";
                    abyte0 = null;
                    if(!signlink.reporterror)
                    {
                        return null;
                    }
                }
                catch(Exception _ex)
                {
                    s2 = "Unexpected error";
                    abyte0 = null;
                    if(!signlink.reporterror)
                    {
                        return null;
                    }
                }
                if(abyte0 == null)
                {
                    for(int l1 = l; l1 > 0; l1--)
                    {
                        if(j1 >= 3)
                        {
                            method13(false, j, "Game updated - please reload page");
                            l1 = 10;
                        } else
                        {
                            method13(false, j, s2 + " - Retrying in " + l1);
                        }
                        try
                        {
                            Thread.sleep(1000L);
                        }
                        catch(Exception _ex)
                        {
                        }
                    }
                    l *= 2;
                    if(l > 60)
                    {
                        l = 60;
                    }
                    aBoolean922 = !aBoolean922;
                }
            }
            Archive class47_1 = new Archive(abyte0);
            return class47_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12814, " + byte0 + ", " + s + ", " + i + ", " + s1 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method126(byte byte0)
    {
        try
        {
            int i = 3;
            if(byte0 != 2)
            {
                groundItems = null;
            }
            if(anInt878 < 310)
            {
                int j = camera_x >> 7;
                int k = camera_y >> 7;
                int l = ((RenderingHints) (player_appearance)).anInt1615 >> 7;
                int i1 = ((RenderingHints) (player_appearance)).anInt1616 >> 7;
                if (k<0) return height_level;
                if((aByteArrayArrayArray871[height_level][j][k] & 4) != 0)
                {
                    i = height_level;
                }
                int j1;
                if(l > j)
                {
                    j1 = l - j;
                } else
                {
                    j1 = j - l;
                }
                int k1;
                if(i1 > k)
                {
                    k1 = i1 - k;
                } else
                {
                    k1 = k - i1;
                }
                if(j1 > k1)
                {
                    int l1 = (k1 * 0x10000) / j1;
                    int j2 = 32768;
                    while(j != l)
                    {
                        if(j < l)
                        {
                            j++;
                        } else
                        if(j > l)
                        {
                            j--;
                        }
                        if((aByteArrayArrayArray871[height_level][j][k] & 4) != 0)
                        {
                            i = height_level;
                        }
                        j2 += l1;
                        if(j2 >= 0x10000)
                        {
                            j2 -= 0x10000;
                            if(k < i1)
                            {
                                k++;
                            } else
                            if(k > i1)
                            {
                                k--;
                            }
                            if((aByteArrayArrayArray871[height_level][j][k] & 4) != 0)
                            {
                                i = height_level;
                            }
                        }
                    }
                } else
                {
                    int i2 = (j1 * 0x10000) / k1;
                    int k2 = 32768;
                    while(k != i1)
                    {
                        if(k < i1)
                        {
                            k++;
                        } else
                        if(k > i1)
                        {
                            k--;
                        }
                        if((aByteArrayArrayArray871[height_level][j][k] & 4) != 0)
                        {
                            i = height_level;
                        }
                        k2 += i2;
                        if(k2 >= 0x10000)
                        {
                            k2 -= 0x10000;
                            if(j < l)
                            {
                                j++;
                            } else
                            if(j > l)
                            {
                                j--;
                            }
                            if((aByteArrayArrayArray871[height_level][j][k] & 4) != 0)
                            {
                                i = height_level;
                            }
                        }
                    }
                }
            }
            if((aByteArrayArrayArray871[height_level][((RenderingHints) (player_appearance)).anInt1615 >> 7][((RenderingHints) (player_appearance)).anInt1616 >> 7] & 4) != 0)
            {
                i = height_level;
            }
            return i;
        }
        catch(Exception runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("26640, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method127(byte byte0)
    {
        try
        {
            if(byte0 == 7)
            {
                byte0 = 0;
            } else
            {
                return 2;
            }
            int i = method51(false, camera_y, camera_x, height_level);
            if(i - anInt876 < 800 && (aByteArrayArrayArray871[height_level][camera_x >> 7][camera_y >> 7] & 4) != 0)
            {
                return height_level;
            } else
            {
                return 3;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19764, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method128(boolean flag)
    {
        try
        {
            aBoolean1174 = false;
            while(aBoolean893)
            {
                aBoolean1174 = false;
                try
                {
                    Thread.sleep(50L);
                }
                catch(Exception _ex)
                {
                }
            }
            aClass44_Sub3_Sub1_Sub3_891 = null;
            aClass44_Sub3_Sub1_Sub3_892 = null;
            aClass44_Sub3_Sub1_Sub3Array864 = null;
            anIntArray1218 = null;
            anIntArray1219 = null;
            anIntArray1220 = null;
            anIntArray1221 = null;
            anIntArray1133 = null;
            anIntArray1134 = null;
            anIntArray1272 = null;
            if(flag)
            {
                buffer.putByte(203);
            }
            anIntArray1273 = null;
            aClass44_Sub3_Sub1_Sub2_1277 = null;
            aClass44_Sub3_Sub1_Sub2_1278 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("94958, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void run()
    {
        if(aBoolean886)
        {
            method35(false);
            return;
        } else
        {
            super.run();
            return;
        }
    }

    public void method129(int i)
    {
        try
        {
            try
            {
                anInt1063 = -1;
                aClass28_1054.clear();
                aClass28_918.clear();
                Rasterizer.method421(false);
                method76(aByte1042);
                aClass36_1192.method278(true);
                for(int j = 0; j < 4; j++)
                {
                    planes[j].method231();
                }
                System.gc();
                LandscapeParser class3 = new LandscapeParser(anIntArrayArrayArray865, 104, aByteArrayArrayArray871, 104);
                int k1 = map_files.length;
                LandscapeParser.aBoolean64 = Class36.aBoolean606;
                for(int j2 = 0; j2 < k1; j2++)
                {
                    int l2 = region_identifiers[j2] >> 8;
                    int k3 = region_identifiers[j2] & 0xff;
                    if(l2 == 33 && k3 >= 71 && k3 <= 73)
                    {
                        LandscapeParser.aBoolean64 = false;
                    }
                }
                if(LandscapeParser.aBoolean64)
                {
                    aClass36_1192.method279((byte)7, height_level);
                } else
                {
                    aClass36_1192.method279((byte)7, 0);
                }
                buffer.putOpcode(181);
                for(int i3 = 0; i3 < k1; i3++)
                {
                    int l3 = (region_identifiers[i3] >> 8) * 64 - base_x;
                    int k4 = (region_identifiers[i3] & 0xff) * 64 - base_y;
                    byte abyte0[] = map_files[i3];
                    if(abyte0 != null)
                    {
                        class3.method158((region_y - 6) * 8, (region_x - 6) * 8, (byte)-54, abyte0, k4, l3);
                    }
                }
                for(int i4 = 0; i4 < k1; i4++)
                {
                    int l4 = (region_identifiers[i4] >> 8) * 64 - base_x;
                    int k5 = (region_identifiers[i4] & 0xff) * 64 - base_y;
                    byte abyte2[] = map_files[i4];
                    if(abyte2 == null && region_y < 800)
                    {
                        class3.method157(l4, k5, 64, 64);
                    }
                }
                buffer.putOpcode(181);
                for(int i5 = 0; i5 < k1; i5++)
                {
                    byte abyte1[] = landscape_files[i5];
                    if(abyte1 != null)
                    {
                        int j6 = (region_identifiers[i5] >> 8) * 64 - base_x;
                        int l6 = (region_identifiers[i5] & 0xff) * 64 - base_y;
                        
                        class3.parse_landscape(l6, j6, abyte1, aClass36_1192, planes);
                    }
                }
                buffer.putOpcode(181);
                class3.method163((byte)76, planes, aClass36_1192);
                aClass34_1197.method272((byte)5);
                buffer.putOpcode(181);
                for(int l5 = 0; l5 < 104; l5++)
                {
                    for(int k6 = 0; k6 < 104; k6++)
                    {
                        updateGroundItems(l5, k6);
                    }
                }
                method101();
            }
            catch(Exception exception)
            {
            }
            Class8.aClass39_251.method341();
            if(highmem && signlink.cache_dat != null)
            {
                int k = cache.method385(0, (byte)7);
                for(int i1 = 0; i1 < k; i1++)
                {
                    int l1 = cache.method390(i1, -600);
                    if((l1 & 0x79) == 0)
                    {
                        Model.method505((byte)63, i1);
                    }
                }
            }
            System.gc();
            Rasterizer.method422(1, 20);
            if(i != -17416)
            {
                return;
            }
            cache.method396(anInt948);
            int l = (region_x - 6) / 8 - 1;
            int j1 = (region_x + 6) / 8 + 1;
            int i2 = (region_y - 6) / 8 - 1;
            int k2 = (region_y + 6) / 8 + 1;
            if(aBoolean906)
            {
                l = 49;
                j1 = 50;
                i2 = 49;
                k2 = 50;
            }
            for(int j3 = l; j3 <= j1; j3++)
            {
                for(int j4 = i2; j4 <= k2; j4++)
                {
                    if(j3 == l || j3 == j1 || j4 == i2 || j4 == k2)
                    {
                        int j5 = cache.getRegionFile(0, j3, j4);
                        if(j5 != -1)
                        {
                            cache.method397(j5, 3, (byte)6);
                        }
                        int i6 = cache.getRegionFile(1, j3, j4);
                        if(i6 != -1)
                        {
                            cache.method397(i6, 3, (byte)6);
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93797, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    /**
     * Updates the movement of a known player
     * 
     * @param packet_size
     * @param buffer
     */
	public void update_self(int packet_size, Buffer buffer) {
		buffer.startBitAccess();
		int sync_required = buffer.getBits(1);
		if (sync_required == 0) {
			return;
		}
		int steps_taken = buffer.getBits(2);
		if (steps_taken == 0) {
			local_entities[local_player_count++] = player_processed_flag;
		}
		else if (steps_taken == 1) {
			int direction = buffer.getBits(3);
			int update_required = buffer.getBits(1);
			
			player_appearance.queue_step(false, direction);
			if (update_required == 1) {
				local_entities[local_player_count++] = player_processed_flag;
			}
		}
		else if (steps_taken == 2) {
			int direction_primary = buffer.getBits(3);
			int direction_secondary = buffer.getBits(3);
			int update_required = buffer.getBits(1);
			
			
			player_appearance.queue_step(true, direction_primary);
			player_appearance.queue_step(true, direction_secondary);
			if (update_required == 1) {
				local_entities[local_player_count++] = player_processed_flag;
			}
		}
		else if (steps_taken == 3) {
			height_level = buffer.getBits(2);
			int x = buffer.getBits(7);
			int y = buffer.getBits(7);
			int teleporting = buffer.getBits(1);
			int update_required = buffer.getBits(1);
			
			player_appearance.teleport(x, y, teleporting == 1);
			if (update_required == 1) {
				local_entities[local_player_count++] = player_processed_flag;
			}
		}
	}

	public static void method131() {
		Class36.aBoolean606 = true;
		Rasterizer.aBoolean1418 = true;
		highmem = true;
		LandscapeParser.aBoolean64 = true;
	}

    public void method132(int i)
    {
        try
        {
            int j = anInt1118 * 128 + 64;
            int k = anInt1119 * 128 + 64;
            int l = method51(false, k, j, height_level) - anInt1120;
            if(camera_x < j)
            {
                camera_x += anInt1121 + ((j - camera_x) * anInt1122) / 1000;
                if(camera_x > j)
                {
                    camera_x = j;
                }
            }
            if(camera_x > j)
            {
                camera_x -= anInt1121 + ((camera_x - j) * anInt1122) / 1000;
                if(camera_x < j)
                {
                    camera_x = j;
                }
            }
            if(anInt876 < l)
            {
                anInt876 += anInt1121 + ((l - anInt876) * anInt1122) / 1000;
                if(anInt876 > l)
                {
                    anInt876 = l;
                }
            }
            if(anInt876 > l)
            {
                anInt876 -= anInt1121 + ((anInt876 - l) * anInt1122) / 1000;
                if(anInt876 < l)
                {
                    anInt876 = l;
                }
            }
            if(camera_y < k)
            {
                camera_y += anInt1121 + ((k - camera_y) * anInt1122) / 1000;
                if(camera_y > k)
                {
                    camera_y = k;
                }
            }
            if(camera_y > k)
            {
                camera_y -= anInt1121 + ((camera_y - k) * anInt1122) / 1000;
                if(camera_y < k)
                {
                    camera_y = k;
                }
            }
            j = anInt989 * 128 + 64;
            k = anInt990 * 128 + 64;
            l = method51(false, k, j, height_level) - anInt991;
            int i1 = j - camera_x;
            int j1 = l - anInt876;
            int k1 = k - camera_y;
            packet_size += i;
            int l1 = (int)Math.sqrt(i1 * i1 + k1 * k1);
            int i2 = (int)(Math.atan2(j1, l1) * 325.94900000000001D) & 0x7ff;
            int j2 = (int)(Math.atan2(i1, k1) * -325.94900000000001D) & 0x7ff;
            if(i2 < 128)
            {
                i2 = 128;
            }
            if(i2 > 383)
            {
                i2 = 383;
            }
            if(anInt878 < i2)
            {
                anInt878 += anInt992 + ((i2 - anInt878) * anInt993) / 1000;
                if(anInt878 > i2)
                {
                    anInt878 = i2;
                }
            }
            if(anInt878 > i2)
            {
                anInt878 -= anInt992 + ((anInt878 - i2) * anInt993) / 1000;
                if(anInt878 < i2)
                {
                    anInt878 = i2;
                }
            }
            int k2 = j2 - anInt879;
            if(k2 > 1024)
            {
                k2 -= 2048;
            }
            if(k2 < -1024)
            {
                k2 += 2048;
            }
            if(k2 > 0)
            {
                anInt879 += anInt992 + (k2 * anInt993) / 1000;
                anInt879 &= 0x7ff;
            }
            if(k2 < 0)
            {
                anInt879 -= anInt992 + (-k2 * anInt993) / 1000;
                anInt879 &= 0x7ff;
            }
            int l2 = j2 - anInt879;
            if(l2 > 1024)
            {
                l2 -= 2048;
            }
            if(l2 < -1024)
            {
                l2 += 2048;
            }
            if(l2 < 0 && k2 > 0 || l2 > 0 && k2 < 0)
            {
                anInt879 = j2;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("37827, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method133(int i)
    {
        try
        {
            anInt1087++;
            while(i >= 0)
            {
                anInt962 = 326;
            }
            if(anInt1087 > 192)
            {
                anInt1087 = 0;
                buffer.putOpcode(137);
                buffer.putByte(232);
            }
            do
            {
                int j = method5(-128);
                if(j == -1)
                {
                    break;
                }
                if(active_game_interface != -1 && active_game_interface == anInt1217)
                {
                    if(j == 8 && aString939.length() > 0)
                    {
                        aString939 = aString939.substring(0, aString939.length() - 1);
                    }
                    if((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && aString939.length() < 12)
                    {
                        aString939 += (char)j;
                    }
                } else
                if(aBoolean1222)
                {
                    if(j >= 32 && j <= 122 && aString1007.length() < 80)
                    {
                        aString1007 += (char)j;
                        inputTaken = true;
                    }
                    if(j == 8 && aString1007.length() > 0)
                    {
                        aString1007 = aString1007.substring(0, aString1007.length() - 1);
                        inputTaken = true;
                    }
                    if(j == 13 || j == 10)
                    {
                        aBoolean1222 = false;
                        inputTaken = true;
                        if(anInt880 == 1)
                        {
                            long l = StringUtil.hash(aString1007);
                            method95(0, l);
                        }
                        if(anInt880 == 2 && anInt1104 > 0)
                        {
                            long l1 = StringUtil.hash(aString1007);
                            method44(l1, 37517);
                        }
                        if(anInt880 == 3 && aString1007.length() > 0)
                        {
                            buffer.putOpcode(107);
                            buffer.putByte(0);
                            int k = buffer.pointer;
                            buffer.putLong(aLong967);
                            RS2BufferUtils.putRS2String(aString1007, buffer, 991);
                            buffer.writeSizeByte(buffer.pointer - k);
                            aString1007 = RS2BufferUtils.method558(aString1007, anInt1242);
                            aString1007 = Class41.method352(aString1007, anInt1242);
                            message(6, aString1007, StringUtil.format(StringUtil.from_hash(aLong967, true), true));
                            if(pm_settings == 2)
                            {
                                pm_settings = 1;
                                aBoolean1062 = true;
                                buffer.putOpcode(161);
                                buffer.putByte(chat_settings);
                                buffer.putByte(pm_settings);
                                buffer.putByte(trade_settings);
                            }
                        }
                        if(anInt880 == 4 && anInt957 < 100)
                        {
                            long l2 = StringUtil.hash(aString1007);
                            method55((byte)-37, l2);
                        }
                        if(anInt880 == 5 && anInt957 > 0)
                        {
                            long l3 = StringUtil.hash(aString1007);
                            method142(-197, l3);
                        }
                    }
                } else
                if(user_amount_prompt)
                {
                    if(j >= 48 && j <= 57 && aString1092.length() < 10)
                    {
                        aString1092 += (char)j;
                        inputTaken = true;
                    }
                    if(j == 8 && aString1092.length() > 0)
                    {
                        aString1092 = aString1092.substring(0, aString1092.length() - 1);
                        inputTaken = true;
                    }
                    if(j == 13 || j == 10)
                    {
                        if(aString1092.length() > 0)
                        {
                            int i1 = 0;
                            try
                            {
                                i1 = Integer.parseInt(aString1092);
                            }
                            catch(Exception _ex)
                            {
                            }
                            buffer.putOpcode(180);
                            buffer.putInt(i1);
                        }
                        user_amount_prompt = false;
                        inputTaken = true;
                    }
                } else if (active_chat_interface == -1) {
					if (j >= 32 && j <= 122 && chat_text.length() < 80) {
						chat_text += (char) j;
						inputTaken = true;
					}
					if (j == 8 && chat_text.length() > 0) {
						chat_text = chat_text.substring(0, chat_text.length() - 1);
						inputTaken = true;
					}
                    if((j == 13 || j == 10) && chat_text.length() > 0)
                    {
//                        if(anInt1188 == 2)
//                        {
//                            if(chat_text.equals("::clientdrop"))
//                            {
//                                method99((byte)7);
//                            }
//                            if(chat_text.equals("::lag"))
//                            {
//                                print_network_debug();
//                            }
//                            if(chat_text.equals("::prefetchmusic"))
//                            {
//                                for(int j1 = 0; j1 < cache.method385(2, (byte)7); j1++)
//                                {
//                                    cache.method395(7, 2, (byte)1, j1);
//                                }
//                            }
//                        }
                        if(chat_text.startsWith("::")) {
                            buffer.putOpcode(Constants.SEND_COMMAND);
                            buffer.putByte(chat_text.length() - 1);
                            buffer.putRSString(chat_text.substring(2));
                        } else {
							String text = chat_text.toLowerCase();
							int color = 0;
							if (text.startsWith("yellow:")) {
								color = 0;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("red:")) {
								color = 1;
								chat_text = chat_text.substring(4);
							} else if (text.startsWith("green:")) {
								color = 2;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("cyan:")) {
								color = 3;
								chat_text = chat_text.substring(5);
							} else if (text.startsWith("purple:")) {
								color = 4;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("white:")) {
								color = 5;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("flash1:")) {
								color = 6;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("flash2:")) {
								color = 7;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("flash3:")) {
								color = 8;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("glow1:")) {
								color = 9;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("glow2:")) {
								color = 10;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("glow3:")) {
								color = 11;
								chat_text = chat_text.substring(6);
							}
							text = chat_text.toLowerCase();
							int effect = 0;
							if (text.startsWith("wave:")) {
								effect = 1;
								chat_text = chat_text.substring(5);
							} else if (text.startsWith("wave2:")) {
								effect = 2;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("shake:")) {
								effect = 3;
								chat_text = chat_text.substring(6);
							} else if (text.startsWith("scroll:")) {
								effect = 4;
								chat_text = chat_text.substring(7);
							} else if (text.startsWith("slide:")) {
								effect = 5;
								chat_text = chat_text.substring(6);
							}
                            buffer.putOpcode(156);
                            buffer.putByte(0);
                            int j2 = buffer.pointer;
                            buffer.putByte(color);
                            buffer.putByte(effect);
                            RS2BufferUtils.putRS2String(chat_text, buffer, 991);
                            buffer.writeSizeByte(buffer.pointer - j2);
                            chat_text = RS2BufferUtils.method558(chat_text, anInt1242);
                            chat_text = Class41.method352(chat_text, anInt1242);
                            player_appearance.floating_text = chat_text;
                            player_appearance.textColor = color;
                            player_appearance.textEffects = effect;
                            player_appearance.anInt1628 = 150;
                            if(user_privilege == 2)
                            {
                                message(2, ((RenderingHints) (player_appearance)).floating_text, "@cr2@" + player_appearance.username);
                            } else
                            if(user_privilege == 1)
                            {
                                message(2, ((RenderingHints) (player_appearance)).floating_text, "@cr1@" + player_appearance.username);
                            } else
                            {
                                message(2, ((RenderingHints) (player_appearance)).floating_text, player_appearance.username);
                            }
                            if(chat_settings == 2)
                            {
                                chat_settings = 3;
                                aBoolean1062 = true;
                                buffer.putOpcode(161);
                                buffer.putByte(chat_settings);
                                buffer.putByte(pm_settings);
                                buffer.putByte(trade_settings);
                            }
                        }
                        chat_text = "";
                        inputTaken = true;
                    }
                }
            } while(true);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93263, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method9(byte byte0)
    {
        try
        {
            if(aBoolean1236 || aBoolean1055 || aBoolean820)
            {
                method53(9);
                return;
            }
            anInt1175++;
            if(!aBoolean863)
            {
                method66(false);
            } else
            {
                method123(false);
            }
            anInt1066 = 0;
            if(byte0 == 1)
            {
                byte0 = 0;
                return;
            } else
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("25980, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method134(int i, int j)
    {
        try
        {
            if(i < 0)
            {
                return;
            }
            if(user_amount_prompt)
            {
                user_amount_prompt = false;
                inputTaken = true;
            }
            int cmd1 = anIntArray837[i];
            int cmd2 = anIntArray838[i];
            int i1 = anIntArray839[i];
            int j1 = anIntArray840[i];
            if(i1 >= 2000)
            {
                i1 -= 2000;
            }
            if(i1 == 721)
            {
                anInt1238 += cmd2;
                if(anInt1238 >= 139)
                {
                    buffer.putOpcode(195);
                    buffer.putInt(0);
                }
                method78(j1, 45, false, cmd2, cmd1);
            }
            if(i1 == 718)
            {
                if(!aBoolean946)
                {
                    aClass36_1192.method316(super.anInt29 - 4, anInt861, super.anInt28 - 4);
                } else
                {
                    aClass36_1192.method316(cmd2 - 4, anInt861, cmd1 - 4);
                }
            }
            if(i1 == 131)
            {
                PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[j1];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    buffer.putOpcode(138);
                    buffer.putShort(j1);
                    buffer.putShort(anInt995);
                }
            }
            if(i1 == 507 || i1 == 957)
            {
                String s = aStringArray897[i];
                int l1 = s.indexOf("@whi@");
                if(l1 != -1)
                {
                    s = s.substring(l1 + 5).trim();
                    String s8 = StringUtil.format(StringUtil.from_hash(StringUtil.hash(s), true), true);
                    boolean flag4 = false;
                    for(int k3 = 0; k3 < expected_player_count; k3++)
                    {
                        PlayerModel class44_sub3_sub4_sub6_sub1_3 = player_models[local_players[k3]];
                        if(class44_sub3_sub4_sub6_sub1_3 == null || class44_sub3_sub4_sub6_sub1_3.username == null || !class44_sub3_sub4_sub6_sub1_3.username.equalsIgnoreCase(s8))
                        {
                            continue;
                        }
                        walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_3)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_3)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                        if(i1 == 507)
                        {
                            anInt821 += j1;
                            if(anInt821 >= 66)
                            {
                                buffer.putOpcode(46);
                                buffer.putByte(154);
                            }
                            buffer.putOpcode(189);
                        }
                        if(i1 == 957)
                        {
                            anInt870++;
                            if(anInt870 >= 52)
                            {
                                buffer.putOpcode(49);
                                buffer.putByte(131);
                            }
                            buffer.putOpcode(220);
                        }
                        buffer.putShort(local_players[k3]);
                        flag4 = true;
                        break;
                    }
                    if(!flag4)
                    {
                        message(0, "Unable to find " + s8, "");
                    }
                }
            }
            if(i1 == 625)
            {
                method78(j1, 10, false, cmd2, cmd1);
            }
            if(i1 == 1152)
            {
                ItemDefinition class14 = ItemDefinition.get(j1);
                String s4;
                if(class14.description != null)
                {
                    s4 = new String(class14.description);
                } else
                {
                    s4 = "It's a " + class14.name + ".";
                }
                message(0, s4, "");
            }
            if(i1 == 737)
            {
                method28(3);
            }
            if(i1 == 902)
            {
                String s1 = aStringArray897[i];
                int i2 = s1.indexOf("@whi@");
                if(i2 != -1)
                {
                    long l3 = StringUtil.hash(s1.substring(i2 + 5).trim());
                    int i4 = -1;
                    for(int j4 = 0; j4 < anInt1104; j4++)
                    {
                        if(aLongArray979[j4] != l3)
                        {
                            continue;
                        }
                        i4 = j4;
                        break;
                    }
                    if(i4 != -1 && anIntArray894[i4] > 0)
                    {
                        inputTaken = true;
                        user_amount_prompt = false;
                        aBoolean1222 = true;
                        aString1007 = "";
                        anInt880 = 3;
                        aLong967 = aLongArray979[i4];
                        aString1102 = "Enter message to send to " + aStringArray1044[i4];
                    }
                }
            }
            if(i1 == 605 || i1 == 47 || i1 == 513 || i1 == 884)
            {
                String s2 = aStringArray897[i];
                int j2 = s2.indexOf("@whi@");
                if(j2 != -1)
                {
                    long l4 = StringUtil.hash(s2.substring(j2 + 5).trim());
                    if(i1 == 605)
                    {
                        method95(0, l4);
                    }
                    if(i1 == 47)
                    {
                        method55((byte)-37, l4);
                    }
                    if(i1 == 513)
                    {
                        method44(l4, 37517);
                    }
                    if(i1 == 884)
                    {
                        method142(-197, l4);
                    }
                }
            }
            if(i1 == 563)
            {
                buffer.putOpcode(112);
                buffer.putShort(j1);
                buffer.putShort(cmd1);
                buffer.putShort(cmd2);
                buffer.putShort(anInt995);
                anInt1148 = 0;
                anInt1149 = cmd2;
                anInt1150 = cmd1;
                anInt1151 = 2;
                if(Interface.interfaces[cmd2].parentId == active_game_interface)
                {
                    anInt1151 = 1;
                }
                if(Interface.interfaces[cmd2].parentId == active_chat_interface)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 274)
            {
                Interface class5 = Interface.interfaces[cmd2];
                anInt994 = 1;
                anInt995 = cmd2;
                anInt996 = class5.anInt160;
                anInt952 = 0;
                redrawTabArea = true;
                String s5 = class5.aString158;
                if(s5.indexOf(" ") != -1)
                {
                    s5 = s5.substring(0, s5.indexOf(" "));
                }
                String s9 = class5.aString158;
                if(s9.indexOf(" ") != -1)
                {
                    s9 = s9.substring(s9.indexOf(" ") + 1);
                }
                aString997 = s5 + " " + class5.aString159 + " " + s9;
                if(anInt996 == 16)
                {
                    redrawTabArea = true;
                    anInt1027 = 3;
                    aBoolean1154 = true;
                }
                return;
            }
            if(i1 == 225)
            {
                buffer.putOpcode(86);
                buffer.putShort(cmd2);
                Interface class5_1 = Interface.interfaces[cmd2];
                if(class5_1.anIntArrayArray115 != null && class5_1.anIntArrayArray115[0][0] == 5)
                {
                    int k2 = class5_1.anIntArrayArray115[0][1];
                    if(settings[k2] != class5_1.anIntArray117[0])
                    {
                        settings[k2] = class5_1.anIntArray117[0];
                        setConfigurationValue(true, k2);
                        redrawTabArea = true;
                    }
                }
            }
            if(i1 == 524)
            {
                String s3 = aStringArray897[i];
                int l2 = s3.indexOf("@whi@");
                if(l2 != -1)
                {
                    if(active_game_interface == -1)
                    {
                        method28(3);
                        aString939 = s3.substring(l2 + 5).trim();
                        aBoolean987 = false;
                        for(int j3 = 0; j3 < Interface.interfaces.length; j3++)
                        {
                            if(Interface.interfaces[j3] == null || Interface.interfaces[j3].anInt109 != 600)
                            {
                                continue;
                            }
                            anInt1217 = active_game_interface = Interface.interfaces[j3].parentId;
                            break;
                        }
                    } else
                    {
                        message(0, "Please close the interface you have open before using 'report abuse'", "");
                    }
                }
            }
            if(i1 == 242 || i1 == 209 || i1 == 309 || i1 == 852 || i1 == 793)
            {
                NPC class44_sub3_sub4_sub6_sub2 = local_npcs[j1];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    if(i1 == 242)
                    {
                        buffer.putOpcode(252);
                    }
                    if(i1 == 209)
                    {
                        buffer.putOpcode(21);
                    }
                    if(i1 == 793)
                    {
                        buffer.putOpcode(247);
                    }
                    if(i1 == 309)
                    {
                        buffer.putOpcode(178);
                    }
                    if(i1 == 852)
                    {
                        buffer.putOpcode(30);
                    }
                    buffer.putShort(j1);
                }
            }
            if(i1 == 231)
            {
                Interface class5_2 = Interface.interfaces[cmd2];
                boolean flag3 = true;
                if(class5_2.anInt109 > 0)
                {
                    flag3 = prompt_user((byte)-16, class5_2);
                }
                if(flag3)
                {
                    buffer.putOpcode(86);
                    buffer.putShort(cmd2);
                }
            }
            if(i1 == 1714)
            {
                NPC class44_sub3_sub4_sub6_sub2_1 = local_npcs[j1];
                if(class44_sub3_sub4_sub6_sub2_1 != null)
                {
                    String s6;
                    if(class44_sub3_sub4_sub6_sub2_1.definition.description != null)
                    {
                        s6 = new String(class44_sub3_sub4_sub6_sub2_1.definition.description);
                    } else
                    {
                        s6 = "It's a " + class44_sub3_sub4_sub6_sub2_1.definition.name + ".";
                    }
                    message(0, s6, "");
                }
            }
            if(i1 == 398)
            {
                buffer.putOpcode(200);
                buffer.putShort(j1);
                buffer.putShort(cmd1);
                buffer.putShort(cmd2);
                buffer.putShort(anInt955);
                buffer.putShort(anInt953);
                buffer.putShort(anInt954);
                anInt1148 = 0;
                anInt1149 = cmd2;
                anInt1150 = cmd1;
                anInt1151 = 2;
                if(Interface.interfaces[cmd2].parentId == active_game_interface)
                {
                    anInt1151 = 1;
                }
                if(Interface.interfaces[cmd2].parentId == active_chat_interface)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 102)
            {
                anInt952 = 1;
                anInt953 = cmd1;
                anInt954 = cmd2;
                anInt955 = j1;
                selected_item_id = ItemDefinition.get(j1).name;
                anInt994 = 0;
                redrawTabArea = true;
                return;
            }
            if(i1 == 997 && !aBoolean935)
            {
                buffer.putOpcode(166);
                buffer.putShort(cmd2);
                aBoolean935 = true;
            }
            if(i1 == 899 && method78(j1, 218, false, cmd2, cmd1))
            {
                buffer.putShort(anInt995);
            }
            if(i1 == 694 || i1 == 962 || i1 == 795 || i1 == 681 || i1 == 100)
            {
                if(i1 == 100)
                {
                    buffer.putOpcode(79);
                }
                if(i1 == 681)
                {
                    anInt1100++;
                    if(anInt1100 >= 116)
                    {
                        buffer.putOpcode(88);
                        buffer.putTriByte(0xc6a439);
                    }
                    buffer.putOpcode(191);
                }
                if(i1 == 694)
                {
                    buffer.putOpcode(76);
                }
                if(i1 == 795)
                {
                    buffer.putOpcode(40);
                }
                if(i1 == 962)
                {
                    buffer.putOpcode(177);
                }
                buffer.putShort(j1);
                buffer.putShort(cmd1);
                buffer.putShort(cmd2);
                anInt1148 = 0;
                anInt1149 = cmd2;
                anInt1150 = cmd1;
                anInt1151 = 2;
                if(Interface.interfaces[cmd2].parentId == active_game_interface)
                {
                    anInt1151 = 1;
                }
                if(Interface.interfaces[cmd2].parentId == active_chat_interface)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 275)
            {
                PlayerModel class44_sub3_sub4_sub6_sub1_1 = player_models[j1];
                if(class44_sub3_sub4_sub6_sub1_1 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    buffer.putOpcode(16);
                    buffer.putShort(j1);
                    buffer.putShort(anInt955);
                    buffer.putShort(anInt953);
                    buffer.putShort(anInt954);
                }
            }
            if(i1 == 240)
            {
                NPC class44_sub3_sub4_sub6_sub2_2 = local_npcs[j1];
                if(class44_sub3_sub4_sub6_sub2_2 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub2_2)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub2_2)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    buffer.putOpcode(108);
                    buffer.putShort(j1);
                    buffer.putShort(anInt995);
                }
            }
            if(i1 == 743)
            {
                anInt1180++;
                if(anInt1180 >= 124)
                {
                    buffer.putOpcode(81);
                    buffer.putShort(37954);
                }
                method78(j1, 196, false, cmd2, cmd1);
            }
            if(i1 == 111)
            {
                boolean flag = walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 0, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                if(!flag)
                {
                    flag = walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 1, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                buffer.putOpcode(55);
                buffer.putShort(cmd1 + base_x);
                buffer.putShort(cmd2 + base_y);
                buffer.putShort(j1);
                buffer.putShort(anInt955);
                buffer.putShort(anInt953);
                buffer.putShort(anInt954);
            }
            if(i1 == 810 && method78(j1, 184, false, cmd2, cmd1))
            {
                buffer.putShort(anInt955);
                buffer.putShort(anInt953);
                buffer.putShort(anInt954);
            }
            if(i1 == 829)
            {
                NPC class44_sub3_sub4_sub6_sub2_3 = local_npcs[j1];
                if(class44_sub3_sub4_sub6_sub2_3 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub2_3)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub2_3)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    buffer.putOpcode(160);
                    buffer.putShort(j1);
                    buffer.putShort(anInt955);
                    buffer.putShort(anInt953);
                    buffer.putShort(anInt954);
                }
            }
            if(i1 == 1381)
            {
                int k1 = j1 >> 14 & 0x7fff;
                Class8 class8 = Class8.method199(k1);
                String s10;
                if(class8.aByteArray219 != null)
                {
                    s10 = new String(class8.aByteArray219);
                } else
                {
                    s10 = "It's a " + class8.aString218 + ".";
                }
                message(0, s10, "");
            }
            if(i1 == 1071)
            {
                method78(j1, 126, false, cmd2, cmd1);
            }
            if(i1 == 139 || i1 == 778 || i1 == 617 || i1 == 224 || i1 == 662)
            {
                boolean flag1 = walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 0, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                if(!flag1)
                {
                    flag1 = walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 1, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                if(i1 == 662)
                {
                    anInt986 += base_y;
                    if(anInt986 >= 118)
                    {
                        buffer.putOpcode(122);
                        buffer.putInt(0);
                    }
                    buffer.putOpcode(22);
                }
                if(i1 == 139)
                {
                    if((cmd1 & 3) == 0)
                    {
                        anInt1114++;
                    }
                    if(anInt1114 >= 123)
                    {
                        buffer.putOpcode(133);
                        buffer.putInt(0);
                    }
                    buffer.putOpcode(97);
                }
                if(i1 == 778)
                {
                    buffer.putOpcode(4);
                }
                if(i1 == 617)
                {
                    buffer.putOpcode(110);
                }
                if(i1 == 224)
                {
                    anInt1046 += cmd2;
                    if(anInt1046 >= 75)
                    {
                        buffer.putOpcode(168);
                        buffer.putByte(19);
                    }
                    buffer.putOpcode(147);
                }
                buffer.putShort(cmd1 + base_x);
                buffer.putShort(cmd2 + base_y);
                buffer.putShort(j1);
            }
            if(i1 == 435)
            {
                buffer.putOpcode(86);
                buffer.putShort(cmd2);
                Interface class5_3 = Interface.interfaces[cmd2];
                if(class5_3.anIntArrayArray115 != null && class5_3.anIntArrayArray115[0][0] == 5)
                {
                    int i3 = class5_3.anIntArrayArray115[0][1];
                    settings[i3] = 1 - settings[i3];
                    setConfigurationValue(true, i3);
                    redrawTabArea = true;
                }
            }
            if(i1 == 357)
            {
                method78(j1, 53, false, cmd2, cmd1);
            }
            if(i1 == 370)
            {
                boolean flag2 = walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 0, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                if(!flag2)
                {
                    flag2 = walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, cmd2, 0, 0, false, 2, 124, 1, cmd1, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                buffer.putOpcode(241);
                buffer.putShort(cmd1 + base_x);
                buffer.putShort(cmd2 + base_y);
                buffer.putShort(j1);
                buffer.putShort(anInt995);
            }
            if(i1 == 639 || i1 == 499 || i1 == 27 || i1 == 387 || i1 == 185)
            {
                PlayerModel class44_sub3_sub4_sub6_sub1_2 = player_models[j1];
                if(class44_sub3_sub4_sub6_sub1_2 != null)
                {
                    walk(1, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_2)).walking_queue_y[0], 0, 0, false, 2, 124, 1, ((RenderingHints) (class44_sub3_sub4_sub6_sub1_2)).walking_queue_x[0], ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    if(i1 == 185)
                    {
                        buffer.putOpcode(69);
                    }
                    if(i1 == 387)
                    {
                        anInt821 += j1;
                        if(anInt821 >= 66)
                        {
                            buffer.putOpcode(46);
                            buffer.putByte(154);
                        }
                        buffer.putOpcode(189);
                    }
                    if(i1 == 499)
                    {
                        buffer.putOpcode(51);
                    }
                    if(i1 == 639)
                    {
                        anInt870++;
                        if(anInt870 >= 52)
                        {
                            buffer.putOpcode(49);
                            buffer.putByte(131);
                        }
                        buffer.putOpcode(220);
                    }
                    if(i1 == 27)
                    {
                        buffer.putOpcode(13);
                    }
                    buffer.putShort(j1);
                }
            }
            if(i1 == 582 || i1 == 113 || i1 == 555 || i1 == 331 || i1 == 354)
            {
                if(i1 == 555)
                {
                    buffer.putOpcode(124);
                }
                if(i1 == 113)
                {
                    buffer.putOpcode(111);
                }
                if(i1 == 354)
                {
                    buffer.putOpcode(227);
                }
                if(i1 == 582)
                {
                    if((j1 & 3) == 0)
                    {
                        anInt1274++;
                    }
                    if(anInt1274 >= 133)
                    {
                        buffer.putOpcode(73);
                        buffer.putShort(6118);
                    }
                    buffer.putOpcode(44);
                }
                if(i1 == 331)
                {
                    buffer.putOpcode(248);
                }
                buffer.putShort(j1);
                buffer.putShort(cmd1);
                buffer.putShort(cmd2);
                anInt1148 = 0;
                anInt1149 = cmd2;
                anInt1150 = cmd1;
                anInt1151 = 2;
                if(Interface.interfaces[cmd2].parentId == active_game_interface)
                {
                    anInt1151 = 1;
                }
                if(Interface.interfaces[cmd2].parentId == active_chat_interface)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 1328)
            {
                ItemDefinition class14_1 = ItemDefinition.get(j1);
                Interface class5_4 = Interface.interfaces[cmd2];
                String s7;
                if(class5_4 != null && class5_4.item_count[cmd1] >= 0x186a0)
                {
                    s7 = class5_4.item_count[cmd1] + " x " + class14_1.name;
                } else
                if(class14_1.description != null)
                {
                    s7 = new String(class14_1.description);
                } else
                {
                    s7 = "It's a " + class14_1.name + ".";
                }
                message(0, s7, "");
            }
            anInt952 = 0;
            j = 14 / j;
            anInt994 = 0;
            redrawTabArea = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("27672, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method135(boolean flag)
    {
        try
        {
            if(anInt952 == 0 && anInt994 == 0)
            {
                aStringArray897[anInt971] = "Walk here";
                anIntArray839[anInt971] = 718;
                anIntArray837[anInt971] = super.mouse_x;
                anIntArray838[anInt971] = super.mouse_y;
                anInt971++;
            }
            int i = -1;
            aBoolean863 &= flag;
            for(int j = 0; j < Model.anInt1596; j++)
            {
                int k = Model.anIntArray1597[j];
                int l = k & 0x7f;
                int i1 = k >> 7 & 0x7f;
                int j1 = k >> 29 & 3;
                int k1 = k >> 14 & 0x7fff;
                if(k == i)
                {
                    continue;
                }
                i = k;
                if(j1 == 2 && aClass36_1192.method308(height_level, l, i1, k) >= 0)
                {
                    Class8 class8 = Class8.method199(k1);
                    if(class8.anIntArray250 != null)
                    {
                        Class35 class35 = Class35.aClass35Array590[class8.anInt249];
                        int k2 = class35.anInt592;
                        int j3 = class35.anInt593;
                        int l3 = class35.anInt594;
                        int i4 = anIntArray1088[l3 - j3];
                        int j4 = settings[k2] >> j3 & i4;
                        if(j4 < 0 || j4 >= class8.anIntArray250.length || class8.anIntArray250[j4] == -1)
                        {
                            continue;
                        }
                        class8 = Class8.method199(class8.anIntArray250[j4]);
                    }
                    if(anInt952 == 1)
                    {
                        aStringArray897[anInt971] = "Use " + selected_item_id + " with @cya@" + class8.aString218;
                        anIntArray839[anInt971] = 810;
                        anIntArray840[anInt971] = k;
                        anIntArray837[anInt971] = l;
                        anIntArray838[anInt971] = i1;
                        anInt971++;
                    } else
                    if(anInt994 == 1)
                    {
                        if((anInt996 & 4) == 4)
                        {
                            aStringArray897[anInt971] = aString997 + " @cya@" + class8.aString218;
                            anIntArray839[anInt971] = 899;
                            anIntArray840[anInt971] = k;
                            anIntArray837[anInt971] = l;
                            anIntArray838[anInt971] = i1;
                            anInt971++;
                        }
                    } else
                    {
                        if(class8.aStringArray234 != null)
                        {
                            for(int l1 = 4; l1 >= 0; l1--)
                            {
                                if(class8.aStringArray234[l1] != null)
                                {
                                    aStringArray897[anInt971] = class8.aStringArray234[l1] + " @cya@" + class8.aString218;
                                    if(l1 == 0)
                                    {
                                        anIntArray839[anInt971] = 625;
                                    }
                                    if(l1 == 1)
                                    {
                                        anIntArray839[anInt971] = 721;
                                    }
                                    if(l1 == 2)
                                    {
                                        anIntArray839[anInt971] = 743;
                                    }
                                    if(l1 == 3)
                                    {
                                        anIntArray839[anInt971] = 357;
                                    }
                                    if(l1 == 4)
                                    {
                                        anIntArray839[anInt971] = 1071;
                                    }
                                    anIntArray840[anInt971] = k;
                                    anIntArray837[anInt971] = l;
                                    anIntArray838[anInt971] = i1;
                                    anInt971++;
                                }
                            }
                        }
                        aStringArray897[anInt971] = "Examine @cya@" + class8.aString218;
                        anIntArray839[anInt971] = 1381;
                        anIntArray840[anInt971] = class8.anInt215 << 14;
                        anIntArray837[anInt971] = l;
                        anIntArray838[anInt971] = i1;
                        anInt971++;
                    }
                }
                if(j1 == 1)
                {
                    NPC class44_sub3_sub4_sub6_sub2 = local_npcs[k1];
                    if(class44_sub3_sub4_sub6_sub2.definition.size == 1 && (((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 & 0x7f) == 64 && (((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616 & 0x7f) == 64)
                    {
                        for(int i2 = 0; i2 < expected_npc_count; i2++)
                        {
                            NPC class44_sub3_sub4_sub6_sub2_1 = local_npcs[local_npc_indices[i2]];
                            if(class44_sub3_sub4_sub6_sub2_1 != null && class44_sub3_sub4_sub6_sub2_1 != class44_sub3_sub4_sub6_sub2 && class44_sub3_sub4_sub6_sub2_1.definition.size == 1 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2_1)).anInt1615 == ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2_1)).anInt1616 == ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616)
                            {
                                method58(local_npc_indices[i2], class44_sub3_sub4_sub6_sub2_1.definition, l, 559, i1);
                            }
                        }
                        for(int l2 = 0; l2 < expected_player_count; l2++)
                        {
                            PlayerModel class44_sub3_sub4_sub6_sub1_1 = player_models[local_players[l2]];
                            if(class44_sub3_sub4_sub6_sub1_1 != null && ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).anInt1615 == ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1615 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1_1)).anInt1616 == ((RenderingHints) (class44_sub3_sub4_sub6_sub2)).anInt1616)
                            {
                                method112(i1, class44_sub3_sub4_sub6_sub1_1, l, local_players[l2]);
                            }
                        }
                    }
                    method58(k1, class44_sub3_sub4_sub6_sub2.definition, l, 559, i1);
                }
                if(j1 == 0)
                {
                    PlayerModel class44_sub3_sub4_sub6_sub1 = player_models[k1];
                    if((((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 & 0x7f) == 64 && (((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616 & 0x7f) == 64)
                    {
                        for(int j2 = 0; j2 < expected_npc_count; j2++)
                        {
                            NPC class44_sub3_sub4_sub6_sub2_2 = local_npcs[local_npc_indices[j2]];
                            if(class44_sub3_sub4_sub6_sub2_2 != null && class44_sub3_sub4_sub6_sub2_2.definition.size == 1 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2_2)).anInt1615 == ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 && ((RenderingHints) (class44_sub3_sub4_sub6_sub2_2)).anInt1616 == ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616)
                            {
                                method58(local_npc_indices[j2], class44_sub3_sub4_sub6_sub2_2.definition, l, 559, i1);
                            }
                        }
                        for(int i3 = 0; i3 < expected_player_count; i3++)
                        {
                            PlayerModel class44_sub3_sub4_sub6_sub1_2 = player_models[local_players[i3]];
                            if(class44_sub3_sub4_sub6_sub1_2 != null && class44_sub3_sub4_sub6_sub1_2 != class44_sub3_sub4_sub6_sub1 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1_2)).anInt1615 == ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1615 && ((RenderingHints) (class44_sub3_sub4_sub6_sub1_2)).anInt1616 == ((RenderingHints) (class44_sub3_sub4_sub6_sub1)).anInt1616)
                            {
                                method112(i1, class44_sub3_sub4_sub6_sub1_2, l, local_players[i3]);
                            }
                        }
                    }
                    method112(i1, class44_sub3_sub4_sub6_sub1, l, k1);
                }
                if(j1 == 3)
                {
                    Deque class28 = groundItems[height_level][l][i1];
                    if(class28 != null)
                    {
                        for(GroundItem class44_sub3_sub4_sub2 = (GroundItem)class28.getLast(); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (GroundItem)class28.previous())
                        {
                            ItemDefinition class14 = ItemDefinition.get(class44_sub3_sub4_sub2.id);
                            if(anInt952 == 1)
                            {
                                aStringArray897[anInt971] = "Use " + selected_item_id + " with @lre@" + class14.name;
                                anIntArray839[anInt971] = 111;
                                anIntArray840[anInt971] = class44_sub3_sub4_sub2.id;
                                anIntArray837[anInt971] = l;
                                anIntArray838[anInt971] = i1;
                                anInt971++;
                            } else
                            if(anInt994 == 1)
                            {
                                if((anInt996 & 1) == 1)
                                {
                                    aStringArray897[anInt971] = aString997 + " @lre@" + class14.name;
                                    anIntArray839[anInt971] = 370;
                                    anIntArray840[anInt971] = class44_sub3_sub4_sub2.id;
                                    anIntArray837[anInt971] = l;
                                    anIntArray838[anInt971] = i1;
                                    anInt971++;
                                }
                            } else
                            {
                                for(int k3 = 4; k3 >= 0; k3--)
                                {
                                    if(class14.menu_actions_ground != null && class14.menu_actions_ground[k3] != null)
                                    {
                                        aStringArray897[anInt971] = class14.menu_actions_ground[k3] + " @lre@" + class14.name;
                                        if(k3 == 0)
                                        {
                                            anIntArray839[anInt971] = 139;
                                        }
                                        if(k3 == 1)
                                        {
                                            anIntArray839[anInt971] = 778;
                                        }
                                        if(k3 == 2)
                                        {
                                            anIntArray839[anInt971] = 617;
                                        }
                                        if(k3 == 3)
                                        {
                                            anIntArray839[anInt971] = 224;
                                        }
                                        if(k3 == 4)
                                        {
                                            anIntArray839[anInt971] = 662;
                                        }
                                        anIntArray840[anInt971] = class44_sub3_sub4_sub2.id;
                                        anIntArray837[anInt971] = l;
                                        anIntArray838[anInt971] = i1;
                                        anInt971++;
                                    } else
                                    if(k3 == 2)
                                    {
                                        aStringArray897[anInt971] = "Take @lre@" + class14.name;
                                        anIntArray839[anInt971] = 617;
                                        anIntArray840[anInt971] = class44_sub3_sub4_sub2.id;
                                        anIntArray837[anInt971] = l;
                                        anIntArray838[anInt971] = i1;
                                        anInt971++;
                                    }
                                }
                                aStringArray897[anInt971] = "Examine @lre@" + class14.name;
                                anIntArray839[anInt971] = 1152;
                                anIntArray840[anInt971] = class44_sub3_sub4_sub2.id;
                                anIntArray837[anInt971] = l;
                                anIntArray838[anInt971] = i1;
                                anInt971++;
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("60112, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method136(int i)
    {
        try
        {
            if(i <= 0)
            {
                packet_opcode = -1;
            }
            if(anInt1005 != 2)
            {
                return;
            }
            method75((anInt1248 - base_x << 7) + anInt1251, anInt1250 * 2, (byte)-79, (anInt1249 - base_y << 7) + anInt1252);
            if(anInt1064 > -1 && anInt1240 % 20 < 10)
            {
                aClass44_Sub3_Sub1_Sub2Array1183[2].drawImage(anInt1065 - 28, anInt1064 - 12);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("57596, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public static String getColorForLevelDifference(int self, int other) {
		int difference = other - self;
		if (difference < -9) {
			return "@red@";
		}
		if (difference < -6) {
			return "@or3@";
		}
		if (difference < -3) {
			return "@or2@";
		}
		if (difference < 0) {
			return "@or1@";
		}
		if (difference > 9) {
			return "@gre@";
		}
		if (difference > 6) {
			return "@gr3@";
		}
		if (difference > 3) {
			return "@gr2@";
		}
		if (difference > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

    public void positionCamera(int i, byte byte0, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(byte0 != 6)
            {
                aBoolean1036 = !aBoolean1036;
            }
            int k1 = 2048 - j1 & 0x7ff;
            int l1 = 2048 - j & 0x7ff;
            int yaw = 0;
            int zoom = 0;
            int pitch = i;
            if(k1 != 0)
            {
                int l2 = Model.anIntArray1598[k1];
                int j3 = Model.anIntArray1599[k1];
                int l3 = zoom * j3 - pitch * l2 >> 16;
                pitch = zoom * l2 + pitch * j3 >> 16;
                zoom = l3;
            }
            if(l1 != 0)
            {
                int i3 = Model.anIntArray1598[l1];
                int k3 = Model.anIntArray1599[l1];
                int i4 = pitch * i3 + yaw * k3 >> 16;
                pitch = pitch * k3 - yaw * i3 >> 16;
                yaw = i4;
            }
            camera_x = i1 - yaw;
            anInt876 = k - zoom;
            camera_y = l - pitch;
            anInt878 = j1;
            anInt879 = j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("24308, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method139(Class44_Sub1 class44_sub1, boolean flag)
    {
        try
        {
            int i = 0;
            int j = -1;
            int k = 0;
            int l = 0;
            if(flag)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            if(class44_sub1.anInt1324 == 0)
            {
                i = aClass36_1192.method304(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(class44_sub1.anInt1324 == 1)
            {
                i = aClass36_1192.method305(class44_sub1.anInt1326, 7, class44_sub1.anInt1323, class44_sub1.anInt1325);
            }
            if(class44_sub1.anInt1324 == 2)
            {
                i = aClass36_1192.method306(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(class44_sub1.anInt1324 == 3)
            {
                i = aClass36_1192.method307(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(i != 0)
            {
                int j1 = aClass36_1192.method308(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326, i);
                j = i >> 14 & 0x7fff;
                k = j1 & 0x1f;
                l = j1 >> 6;
            }
            class44_sub1.anInt1327 = j;
            class44_sub1.anInt1329 = k;
            class44_sub1.anInt1328 = l;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("51962, " + class44_sub1 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void update_npc(int i, Buffer buffer, int j) {
        j += i;
        for(int index = 0; index < local_player_count; index++) {
			int entity_id = local_entities[index];
			NPC npc = local_npcs[entity_id];
			int rendering_hints = buffer.getUnsignedByte();
			if ((rendering_hints & 1) == 1) {
				int j1 = buffer.getUnsignedByte();
				int j2 = buffer.getUnsignedByte();
				npc.method536(j2, anInt1240, j1, false);
				npc.anInt1634 = anInt1240 + 300;
				npc.anInt1635 = buffer.getUnsignedByte();
				npc.anInt1636 = buffer.getUnsignedByte();
			}
			if ((rendering_hints & 2) == 2) {
				int animation_id = buffer.getUnsignedShort();
				if (animation_id == 65535) {
					animation_id = -1;
				}
				if (animation_id == ((RenderingHints) (npc)).animation_id) {
					npc.anInt1647 = 0;
				}
				int animation_delay = buffer.getUnsignedByte();
				if (animation_id == ((RenderingHints) (npc)).animation_id
						&& animation_id != -1) {
					int i3 = AnimationSequence.cache[animation_id].replay_mode;
					if (i3 == 1) {
						npc.anInt1644 = 0;
						npc.anInt1645 = 0;
						npc.animation_delay = animation_delay;
						npc.anInt1647 = 0;
					}
					if (i3 == 2) {
						npc.anInt1647 = 0;
					}
                } else
                if(animation_id == -1 || ((RenderingHints) (npc)).animation_id == -1 || AnimationSequence.cache[animation_id].priority >= AnimationSequence.cache[((RenderingHints) (npc)).animation_id].priority) {
					npc.animation_id = animation_id;
					npc.anInt1644 = 0;
					npc.anInt1645 = 0;
					npc.animation_delay = animation_delay;
					npc.anInt1647 = 0;
					npc.anInt1669 = ((RenderingHints) (npc)).current_step;
				}
			}
			if ((rendering_hints & 4) == 4) {
				npc.interacting_entity = buffer.getUnsignedShort();
				if (((RenderingHints) (npc)).interacting_entity == 65535) {
					npc.interacting_entity = -1;
				}
			}
			if ((rendering_hints & 8) == 8) {
				npc.floating_text = buffer.getRSString();
				npc.anInt1628 = 100;
			}
			if ((rendering_hints & 0x10) == 16) {
				int l1 = buffer.getUnsignedByte();
				int l2 = buffer.getUnsignedByte();
				npc.method536(l2, anInt1240, l1, false);
				npc.anInt1634 = anInt1240 + 300;
				npc.anInt1635 = buffer.getUnsignedByte();
				npc.anInt1636 = buffer.getUnsignedByte();
			}
			if ((rendering_hints & 0x20) == 32) { // transform
				npc.definition = NPCDefinition.forId(buffer.getUnsignedShort());
				npc.size = npc.definition.size;
				npc.degrees_to_turn = npc.definition.degrees_to_turn;
				npc.walk_animation = npc.definition.walk_animation;
				npc.rotate_animation = npc.definition.rotate_animation;
				npc.counter_clockwise_animation = npc.definition.counter_clockwise_animation;
				npc.clockwise_animation = npc.definition.clockwise_animation;
				npc.idle_animation = npc.definition.idle_animation;
			}
			if ((rendering_hints & 0x40) == 64) {
				npc.spotanim_id = buffer.getUnsignedShort();
				int modifier = buffer.getUnsignedInt();
				npc.spotanim_height = modifier >> 16;
				npc.anspotanim_delay = anInt1240 + (modifier & 0xffff);
				npc.anInt1649 = 0;
				npc.anInt1650 = 0;
				if (((RenderingHints) (npc)).anspotanim_delay > anInt1240) {
					npc.anInt1649 = -1;
				}
				if (((RenderingHints) (npc)).spotanim_id == 65535) {
					npc.spotanim_id = -1;
				}
			}
			if ((rendering_hints & 0x80) == 128) {
				npc.view_x = buffer.getUnsignedShort();
				npc.view_y = buffer.getUnsignedShort();
			}
		}
	}

    public void method141(int i, Sprite class44_sub3_sub1_sub2, int j, int k)
    {
        try
        {
            int l = anInt930 + anInt959 & 0x7ff;
            int i1 = i * i + k * k;
            if(i1 > 6400)
            {
                return;
            }
            int j1 = Model.anIntArray1598[l];
            int k1 = Model.anIntArray1599[l];
            j1 = (j1 * 256) / (anInt1075 + 256);
            k1 = (k1 * 256) / (anInt1075 + 256);
            if(j <= 0)
            {
                for(int l1 = 1; l1 > 0; l1++)
                {
                }
            }
            int i2 = k * j1 + i * k1 >> 16;
            int j2 = k * k1 - i * j1 >> 16;
            if(i1 > 2500)
            {
                class44_sub3_sub1_sub2.method446(((94 + i2) - class44_sub3_sub1_sub2.max_width / 2) + 4, aClass44_Sub3_Sub1_Sub3_1144, true, 83 - j2 - class44_sub3_sub1_sub2.max_height / 2 - 4);
                return;
            } else
            {
                class44_sub3_sub1_sub2.drawImage(83 - j2 - class44_sub3_sub1_sub2.max_height / 2 - 4, ((94 + i2) - class44_sub3_sub1_sub2.max_width / 2) + 4);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("87513, " + i + ", " + class44_sub3_sub1_sub2 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method142(int i, long l)
    {
        try
        {
            if(i >= 0)
            {
                anInt1056 = -168;
            }
            if(l == 0L)
            {
                return;
            }
            for(int j = 0; j < anInt957; j++)
            {
                if(aLongArray1254[j] == l)
                {
                    anInt957--;
                    redrawTabArea = true;
                    for(int k = j; k < anInt957; k++)
                    {
                        aLongArray1254[k] = aLongArray1254[k + 1];
                    }
                    buffer.putOpcode(251);
                    buffer.putLong(l);
                    return;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("81778, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method143(int i)
    {
        try
        {
            if(i <= 0)
            {
                buffer.putByte(126);
            }
            if(anInt848 != 0)
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                int j = super.anInt28 - 25 - 550;
                int k = super.anInt29 - 5 - 4;
                if(j >= 0 && k >= 0 && j < 146 && k < 151)
                {
                    j -= 73;
                    k -= 75;
                    int l = anInt930 + anInt959 & 0x7ff;
                    int i1 = Rasterizer.anIntArray1427[l];
                    int j1 = Rasterizer.anIntArray1428[l];
                    i1 = i1 * (anInt1075 + 256) >> 8;
                    j1 = j1 * (anInt1075 + 256) >> 8;
                    int k1 = k * i1 + j * j1 >> 11;
                    int l1 = k * j1 - j * i1 >> 11;
                    int i2 = ((RenderingHints) (player_appearance)).anInt1615 + k1 >> 7;
                    int j2 = ((RenderingHints) (player_appearance)).anInt1616 - l1 >> 7;
                    boolean flag = walk(0, ((RenderingHints) (player_appearance)).walking_queue_x[0], 0, j2, 0, 0, true, 1, 124, 0, i2, ((RenderingHints) (player_appearance)).walking_queue_y[0]);
                    if(flag)
                    {
                        buffer.putByte(j);
                        buffer.putByte(k);
                        buffer.putShort(anInt930);
                        buffer.putByte(57);
                        buffer.putByte(anInt959);
                        buffer.putByte(anInt1075);
                        buffer.putByte(89);
                        buffer.putShort(((RenderingHints) (player_appearance)).anInt1615);
                        buffer.putShort(((RenderingHints) (player_appearance)).anInt1616);
                        buffer.putByte(anInt972);
                        buffer.putByte(63);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("62107, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void update_npc_movement(int i, Buffer buffer, int j) {
        buffer.startBitAccess();
        int amount = buffer.getBits(8);
        if(amount < expected_npc_count) {
            for(int l = amount; l < expected_npc_count; l++) {
                local_entity_index[anInt940++] = local_npc_indices[l];
            }
        }
        if(amount > expected_npc_count) {
            signlink.reporterror(aString1071 + " Too many npcs");
            throw new RuntimeException("eek");
        }
        expected_npc_count = 0;
		for (int index = 0; index < amount; index++) {
			int npc_index = local_npc_indices[index];
			NPC npc = local_npcs[npc_index];
			int k1 = buffer.getBits(1);
			if (k1 == 0) {
				local_npc_indices[expected_npc_count++] = npc_index;
				npc.anInt1660 = anInt1240;
			} else {
				int l1 = buffer.getBits(2);
				if (l1 == 0) {
					local_npc_indices[expected_npc_count++] = npc_index;
					npc.anInt1660 = anInt1240;
					local_entities[local_player_count++] = npc_index;
				} else if (l1 == 1) {
					local_npc_indices[expected_npc_count++] = npc_index;
					npc.anInt1660 = anInt1240;
					int i2 = buffer.getBits(3);
					npc.queue_step(false, i2);
					int k2 = buffer.getBits(1);
					if (k2 == 1) {
						local_entities[local_player_count++] = npc_index;
					}
				} else if (l1 == 2) {
					local_npc_indices[expected_npc_count++] = npc_index;
					npc.anInt1660 = anInt1240;
					int j2 = buffer.getBits(3);
					npc.queue_step(true, j2);
					int l2 = buffer.getBits(3);
					npc.queue_step(true, l2);
					int i3 = buffer.getBits(1);
					if (i3 == 1) {
						local_entities[local_player_count++] = npc_index;
					}
				} else if (l1 == 3) {
					local_entity_index[anInt940++] = npc_index;
				}
			}
		}
		if (j < 9 || j > 9) {
			packet_opcode = -1;
		}
    }

	public void logout(int i) {
		try {
			signlink.reporterror = false;
			try {
				if (channel != null) {
					channel.close();
				}
			} catch (Exception _ex) {
			}
			channel = null;
			clear(0);
			if (aClass10_866 != null) {
				aClass10_866.running = false;
			}
			aClass10_866 = null;
			cache.reset();
			cache = null;
			buffer = null;
			loginbuffer = null;
			incoming_buffer = null;
			region_identifiers = null;
			map_files = null;
			landscape_files = null;
			anIntArray1040 = null;
			anIntArray1041 = null;
			anIntArrayArrayArray865 = null;
			aByteArrayArrayArray871 = null;
			aClass36_1192 = null;
			planes = null;
			anIntArrayArray1113 = null;
			anIntArrayArray975 = null;
			walk_queue_x = null;
			walk_queue_y = null;
			aByteArray1109 = null;
			aClass34_1195 = null;
			aClass34_1196 = null;
			aClass34_1197 = null;
			aClass34_1198 = null;
			aClass34_858 = null;
			aClass34_859 = null;
			aClass34_860 = null;
			aClass34_1123 = null;
			aClass34_1124 = null;
			aClass34_1125 = null;
			aClass34_1126 = null;
			aClass34_1127 = null;
			aClass34_1128 = null;
			aClass34_1129 = null;
			aClass34_1130 = null;
			aClass34_1131 = null;
			aClass44_Sub3_Sub1_Sub3_1143 = null;
			aClass44_Sub3_Sub1_Sub3_1144 = null;
			aClass44_Sub3_Sub1_Sub3_1145 = null;
			aClass44_Sub3_Sub1_Sub3_903 = null;
			aClass44_Sub3_Sub1_Sub3_904 = null;
			aClass44_Sub3_Sub1_Sub3_905 = null;
			aClass44_Sub3_Sub1_Sub3Array1276 = null;
			aClass44_Sub3_Sub1_Sub3_1136 = null;
			aClass44_Sub3_Sub1_Sub3_1137 = null;
			aClass44_Sub3_Sub1_Sub3_1138 = null;
			aClass44_Sub3_Sub1_Sub3_1139 = null;
			aClass44_Sub3_Sub1_Sub3_1140 = null;
			aClass44_Sub3_Sub1_Sub3_852 = null;
			aClass44_Sub3_Sub1_Sub3_853 = null;
			aClass44_Sub3_Sub1_Sub3_854 = null;
			aClass44_Sub3_Sub1_Sub3_855 = null;
			aClass44_Sub3_Sub1_Sub3_856 = null;
			aClass44_Sub3_Sub1_Sub2_988 = null;
			aClass44_Sub3_Sub1_Sub2Array1108 = null;
			aClass44_Sub3_Sub1_Sub2Array1183 = null;
			aClass44_Sub3_Sub1_Sub2Array867 = null;
			aClass44_Sub3_Sub1_Sub2_1077 = null;
			aClass44_Sub3_Sub1_Sub2_1078 = null;
			aClass44_Sub3_Sub1_Sub2_1079 = null;
			aClass44_Sub3_Sub1_Sub2_1080 = null;
			aClass44_Sub3_Sub1_Sub3Array1241 = null;
			aClass44_Sub3_Sub1_Sub2Array1052 = null;
			anIntArrayArray885 = null;
			player_models = null;
			local_players = null;
			local_entities = null;
			render_buffer = null;
			local_entity_index = null;
			local_npcs = null;
			local_npc_indices = null;
			groundItems = null;
			deque = null;
			aClass28_918 = null;
			aClass28_1054 = null;
			anIntArray837 = null;
			anIntArray838 = null;
			anIntArray839 = null;
			anIntArray840 = null;
			aStringArray897 = null;
			settings = null;
			anIntArray827 = null;
			anIntArray828 = null;
			aClass44_Sub3_Sub1_Sub2Array872 = null;
			if (i <= 0) {
				groundItems = null;
			}
			aClass44_Sub3_Sub1_Sub2_913 = null;
			aStringArray1044 = null;
			aLongArray979 = null;
			anIntArray894 = null;
			aClass34_1266 = null;
			aClass34_1267 = null;
			aClass34_1263 = null;
			aClass34_1264 = null;
			aClass34_1265 = null;
			aClass34_1268 = null;
			aClass34_1269 = null;
			aClass34_1270 = null;
			aClass34_1271 = null;
			method128(false);
			Class8.method198((byte) 42);
			NPCDefinition.destroy();
			ItemDefinition.destroy();
			Tile.tiles = null;
			Class22.aClass22Array464 = null;
			Interface.interfaces = null;
			Class24.aClass24Array490 = null;
			AnimationSequence.cache = null;
			Class32.aClass32Array559 = null;
			Class32.aClass39_571 = null;
			Class38.aClass38Array674 = null;
			super.aClass34_14 = null;
			PlayerModel.aClass39_1696 = null;
			Rasterizer.method418((byte) 42);
			Class36.method277((byte) 42);
			Model.method502((byte) 42);
			AnimationFrame.destroy();
			System.gc();
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("75879, " + i + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

    public void method145(byte byte0)
    {
        try
        {
            if(byte0 == 9)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                if(super.anInt28 >= 6 && super.anInt28 <= 106 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    chat_settings = (chat_settings + 1) % 4;
                    aBoolean1062 = true;
                    inputTaken = true;
                    buffer.putOpcode(161);
                    buffer.putByte(chat_settings);
                    buffer.putByte(pm_settings);
                    buffer.putByte(trade_settings);
                }
                if(super.anInt28 >= 135 && super.anInt28 <= 235 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    pm_settings = (pm_settings + 1) % 3;
                    aBoolean1062 = true;
                    inputTaken = true;
                    buffer.putOpcode(161);
                    buffer.putByte(chat_settings);
                    buffer.putByte(pm_settings);
                    buffer.putByte(trade_settings);
                }
                if(super.anInt28 >= 273 && super.anInt28 <= 373 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    trade_settings = (trade_settings + 1) % 3;
                    aBoolean1062 = true;
                    inputTaken = true;
                    buffer.putOpcode(161);
                    buffer.putByte(chat_settings);
                    buffer.putByte(pm_settings);
                    buffer.putByte(trade_settings);
                }
                if(super.anInt28 >= 412 && super.anInt28 <= 512 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    if(active_game_interface == -1)
                    {
                        method28(3);
                        aString939 = "";
                        aBoolean987 = false;
                        for(int i = 0; i < Interface.interfaces.length; i++)
                        {
                            if(Interface.interfaces[i] != null && Interface.interfaces[i].anInt109 == 600)
                            {
                                anInt1217 = active_game_interface = Interface.interfaces[i].parentId;
                                return;
                            }
                        }
                        return;
                    } else
                    {
                        message(0, "Please close the interface you have open before using 'report abuse'", "");
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("77202, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method146(byte abyte0[], int i, int j)
    {
        try
        {
            if(i != 0)
            {
                throw new NullPointerException();
            }
            if(abyte0 == null)
            {
                return true;
            } else
            {
                return signlink.wavesave(abyte0, j);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("56223, " + abyte0 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void setConfigurationValue(boolean flag, int i) // volume
    {
        try
        {
            aBoolean863 &= flag;
            int type = Class38.aClass38Array674[i].anInt682;
            if(type == 0)
            {
                return;
            }
            int value = settings[i];
            if(type == 1)
            {
                if(value == 1)
                {
                    Rasterizer.setBrightness(0.90000000000000002D, 0);
                }
                if(value == 2)
                {
                    Rasterizer.setBrightness(0.80000000000000004D, 0);
                }
                if(value == 3)
                {
                    Rasterizer.setBrightness(0.69999999999999996D, 0);
                }
                if(value == 4)
                {
                    Rasterizer.setBrightness(0.59999999999999998D, 0);
                }
                ItemDefinition.sprite_cache.method341();
                aBoolean908 = true;
            }
            if(type == 3)
            {
                boolean flag1 = aBoolean1057;
                if(value == 0)
                {
                    setMusicVolume(true, 0, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(value == 1)
                {
                    setMusicVolume(true, -400, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(value == 2)
                {
                    setMusicVolume(true, -800, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(value == 3)
                {
                    setMusicVolume(true, -1200, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(value == 4)
                {
                    aBoolean1057 = false;
                }
                if(aBoolean1057 != flag1 && !highmem)
                {
                    if(aBoolean1057)
                    {
                        anInt1190 = anInt963;
                        aBoolean1191 = true;
                        cache.load(2, anInt1190);
                    } else
                    {
                        clear(0);
                    }
                    anInt942 = 0;
                }
            }
            if(type == 4)
            {
                if(value == 0)
                {
                    aBoolean1050 = true;
                    setEffectVolume(aBoolean985, 0);
                }
                if(value == 1)
                {
                    aBoolean1050 = true;
                    setEffectVolume(aBoolean985, -400);
                }
                if(value == 2)
                {
                    aBoolean1050 = true;
                    setEffectVolume(aBoolean985, -800);
                }
                if(value == 3)
                {
                    aBoolean1050 = true;
                    setEffectVolume(aBoolean985, -1200);
                }
                if(value == 4)
                {
                    aBoolean1050 = false;
                }
            }
            if(type == 5)
            {
                anInt862 = value;
            }
            if(type == 6)
            {
                anInt970 = value;
            }
            if(type == 8)
            {
                anInt1017 = value;
                inputTaken = true;
            }
            if(type == 9)
            {
                anInt835 = value;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33016, " + flag + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public client()
    {
        aBoolean812 = false;
        aBoolean820 = false;
        loginbuffer = Buffer.allocate(1);
        anIntArray827 = new int[1000];
        anIntArray828 = new int[1000];
        aBoolean829 = false;
        aByte830 = -83;
        anInt833 = -1;
        aClass44_Sub3_Sub1_Sub3Array836 = new Class44_Sub3_Sub1_Sub3[2];
        anIntArray837 = new int[500];
        anIntArray838 = new int[500];
        anIntArray839 = new int[500];
        anIntArray840 = new int[500];
        anInt844 = 0x332d25;
        anIntArray846 = new int[50];
        aBoolean847 = false;
        anIntArray849 = new int[7];
        buffer = Buffer.allocate(1);
        experience = new int[Skills.skillCount];
        aBoolean863 = false;
        aClass44_Sub3_Sub1_Sub2Array867 = new Sprite[8];
        anIntArray868 = new int[151];
        aClass44_Sub3_Sub1_Sub2Array872 = new Sprite[1000];
        anInt874 = 78;
        anIntArray881 = new int[151];
        aByte883 = -127;
        aByte884 = 38;
        anIntArrayArray885 = new int[104][104];
        aBoolean886 = false;
        active_inventory_interface = -1;
        aBoolean893 = false;
        anIntArray894 = new int[200];
        aStringArray897 = new String[500];
        redrawTabArea = false;
        anInt900 = -1;
        anInt902 = 70;
        aBoolean906 = false;
        aBoolean908 = false;
        anIntArray910 = new int[33];
        aClass28_918 = new Deque(-199);
        aStringArray919 = new String[5];
        aBooleanArray920 = new boolean[5];
        aBoolean922 = false;
        anInt924 = -1;
        aByte925 = 1;
        anInt929 = 128;
        aBoolean934 = true;
        aBoolean935 = false;
        anIntArray938 = new int[5];
        aString939 = "";
        local_entity_index = new int[1000];
        anIntArray943 = new int[5];
        aBoolean946 = false;
        anInt948 = -587;
        aBoolean950 = true;
        aCRC32_951 = new CRC32();
        anInt960 = 2;
        anIntArray961 = new int[33];
        anInt962 = 817;
        anInt963 = -1;
        dialog_id = -1;
        anInt969 = -8033;
        anInt974 = 8;
        anIntArrayArray975 = new int[104][104];
        anIntArray976 = new int[5];
        aByte977 = 8;
        aLongArray979 = new long[200];
        user_amount_prompt = false;
        aBoolean985 = true;
        aBoolean987 = false;
        anInt1000 = 0x23201b;
        anIntArray1001 = new int[5];
        chat_entry_type = new int[100];
        chat_entry_username = new String[100];
        chat_entry_text = new String[100];
        anIntArray1006 = new int[50];
        aString1007 = "";
        local_npcs = new NPC[16384];
        local_npc_indices = new int[16384];
        anInt1012 = 2;
        anInt1015 = 100;
        anIntArray1016 = new int[100];
        anIntArray1018 = new int[256];
        anInt1019 = 661;
        walk_queue_x = new int[4000];
        walk_queue_y = new int[4000];
        planes = new CollisionMap[4];
        anIntArray1024 = new int[2000];
        anInt1027 = 3;
        levels = new int[Skills.skillCount];
        aBoolean1036 = true;
        aByte1042 = -71;
        aStringArray1044 = new String[200];
        inputTaken = false;
        aBoolean1050 = true;
        anIntArray1051 = new int[9];
        aClass44_Sub3_Sub1_Sub2Array1052 = new Sprite[100];
        aByte1053 = 29;
        aClass28_1054 = new Deque(-199);
        aBoolean1055 = false;
        anInt1056 = 513;
        aBoolean1057 = true;
        aBoolean1062 = false;
        anInt1063 = -1;
        anInt1064 = -1;
        anInt1065 = -1;
        aString1071 = "";
        aString1072 = "";
        anInt1074 = -940;
        anInt1076 = 1;
        aBoolean1084 = false;
        anInt1085 = 0x766654;
        aByte1086 = 38;
        absoluteLevel = new int[Skills.skillCount];
        anInt1091 = 37395;
        aString1092 = "";
        aByte1098 = 29;
        aByte1101 = 6;
        aString1102 = "";
        anInt1107 = 1;
        aClass44_Sub3_Sub1_Sub2Array1108 = new Sprite[20];
        aByteArray1109 = new byte[16384];
        login_label_top = "";
        login_label_bottom = "";
        anIntArrayArray1113 = new int[104][104];
        anInt1115 = -1;
        deque = new Deque(-199);
        incoming_buffer = Buffer.allocate(1);
        chat_text = "";
        groundItems = new Deque[4][104][104];
        aBoolean1147 = false;
        anInt1153 = -6002;
        aBoolean1154 = false;
        aBoolean1156 = false;
        anInt1158 = 50;
        anIntArray1159 = new int[anInt1158];
        anIntArray1160 = new int[anInt1158];
        anIntArray1161 = new int[anInt1158];
        anIntArray1162 = new int[anInt1158];
        anIntArray1163 = new int[anInt1158];
        anIntArray1164 = new int[anInt1158];
        anIntArray1165 = new int[anInt1158];
        aStringArray1166 = new String[anInt1158];
        aBoolean1174 = false;
        anInt1177 = -1;
        aBoolean1178 = true;
        aBoolean1179 = true;
        aByte1182 = 2;
        aClass44_Sub3_Sub1_Sub2Array1183 = new Sprite[20];
        aBoolean1191 = true;
        anIntArray1193 = new int[50];
        active_game_interface = -1;
        anInt1200 = 0x4d4233;
        aClass5_1201 = new Interface();
        anInt1202 = 9;
        anIntArray1206 = new int[5];
        aClass45Array1208 = new Class45[5];
        aBooleanArray1209 = new boolean[5];
        aByte1213 = 1;
        settings = new int[2000];
        anInt1216 = 2;
        anInt1217 = -1;
        aBoolean1222 = false;
        anInt1223 = 2048;
        player_processed_flag = 2047;
        player_models = new PlayerModel[anInt1223];
        local_players = new int[anInt1223];
        local_entities = new int[anInt1223];
        render_buffer = new Buffer[anInt1223];
        aBoolean1236 = false;
        aBoolean1237 = false;
        aClass44_Sub3_Sub1_Sub3Array1241 = new Class44_Sub3_Sub1_Sub3[100];
        anInt1243 = 831;
        anInt1244 = 393;
        anInt1247 = -282;
        active_chat_interface = -1;
        aLongArray1254 = new long[100];
        aBoolean1262 = false;
        aBoolean1275 = false;
        aClass44_Sub3_Sub1_Sub3Array1276 = new Class44_Sub3_Sub1_Sub3[13];
    }

    static
    {
        experienceTable = new int[99];
        int i = 0;
        for(int j = 0; j < 99; j++)
        {
            int l = j + 1;
            int i1 = (int)((double)l + 300D * Math.pow(2D, (double)l / 7D));
            i += i1;
            experienceTable[j] = i / 4;
        }
        anIntArray1088 = new int[32];
        i = 2;
        for(int k = 0; k < 32; k++)
        {
            anIntArray1088[k] = i - 1;
            i += i;
        }
    }


    /**
     * The login method
     * @param username
     * @param password
     * @param reconnecting
     */
	public void login_mock(String username, String password, boolean reconnecting) throws IOException {
		if (!reconnecting) {
			method66(true);
		}
		channel = new Channel(connect(43594 + port_offset), this);
		long name_hash = StringUtil.hash(username);
		int hash_part = (int) (name_hash >> 16 & 31L);
		buffer.pointer = 0;
		buffer.putByte(14);
		buffer.putByte(hash_part);
		channel.write(buffer.payload, 0, 2);
		for (int j = 0; j < 8; j++) {
			channel.read();
		}
		int k = channel.read();
		if (k == 0) {
			channel.read(incoming_buffer.payload, 0, 8);
			incoming_buffer.pointer = 0;
			aLong813 = incoming_buffer.getLong();
			int ai[] = new int[4];
			ai[0] = (int) (Math.random() * 99999999D);
			ai[1] = (int) (Math.random() * 99999999D);
			ai[2] = (int) (aLong813 >> 32);
			ai[3] = (int) aLong813;
			buffer.pointer = 0;
			buffer.putByte(10);
			buffer.putInt(ai[0]);
			buffer.putInt(ai[1]);
			buffer.putInt(ai[2]);
			buffer.putInt(ai[3]);
			buffer.putInt(signlink.uid);
			buffer.putRSString(username);
			buffer.putRSString(password);
//				buffer.encodeRSA(RSA_MODULUS, RSA_PRIVATE_KEY);
			loginbuffer.pointer = 0;
			loginbuffer.putByte(reconnecting ? 18 : 16);
			loginbuffer.putByte(buffer.pointer + 36 + 1 + 1 + 2);
			loginbuffer.putByte(255);
			loginbuffer.putShort(289);
			loginbuffer.putByte(highmem ? 1 : 0);
			for (int k1 = 0; k1 < 9; k1++) {
				loginbuffer.putInt(anIntArray1051[k1]);
			}
			loginbuffer.putByte(0);
			loginbuffer.put(buffer.payload, 0, buffer.pointer);
			buffer.isaac = new ISAACCipher(ai);
			for (int i2 = 0; i2 < 4; i2++) {
				ai[i2] += 50;
			}
			cipher = new ISAACCipher(ai);
			channel.write(loginbuffer.payload, 0, loginbuffer.pointer);
			k = channel.read();
		}
		if (k == 1) {
			try {
				Thread.sleep(2000L);
			} catch (Exception _ex) {
			}
			login(username, password, reconnecting);
			return;
		}
		if (k == 2) {
			user_privilege = channel.read();
			macro_flag = channel.read() == 1;
			
			System.out.println("login successful " + user_privilege + ", " + macro_flag);
			return;
		}
		if (k == 3) {
			login_label_top = "";
			login_label_bottom = "Invalid username or password.";
			return;
		}
		if (k == 4) {
			login_label_top = "Your account has been disabled.";
			login_label_bottom = "Please check your message-centre for details.";
			return;
		}
		if (k == 5) {
			login_label_top = "Your account is already logged in.";
			login_label_bottom = "Try again in 60 secs...";
			return;
		}
		if (k == 6) {
			login_label_top = "RuneScape has been updated!";
			login_label_bottom = "Please reload this page.";
			return;
		}
		if (k == 7) {
			login_label_top = "This world is full.";
			login_label_bottom = "Please use a different world.";
			return;
		}
		if (k == 8) {
			login_label_top = "Unable to connect.";
			login_label_bottom = "Login server offline.";
			return;
		}
		if (k == 9) {
			login_label_top = "Login limit exceeded.";
			login_label_bottom = "Too many connections from your address.";
			return;
		}
		if (k == 10) {
			login_label_top = "Unable to connect.";
			login_label_bottom = "Bad session id.";
			return;
		}
		if (k == 11) {
			login_label_top = "Login server rejected session.";
			login_label_bottom = "Please try again.";
			return;
		}
		if (k == 12) {
			login_label_top = "You need a members account to login to this world.";
			login_label_bottom = "Please subscribe, or use a different world.";
			return;
		}
		if (k == 13) {
			login_label_top = "Could not complete login.";
			login_label_bottom = "Please try using a different world.";
			return;
		}
		if (k == 14) {
			login_label_top = "The server is being updated.";
			login_label_bottom = "Please wait 1 minute and try again.";
			return;
		}
		if (k == 15) {
			aBoolean863 = true;
			buffer.pointer = 0;
			incoming_buffer.pointer = 0;
			packet_opcode = -1;
			debugOpcode1 = -1;
			debugOpcode2 = -1;
			debugOpcode3 = -1;
			packet_size = 0;
			anInt1171 = 0;
			anInt998 = 0;
			anInt971 = 0;
			aBoolean946 = false;
			aLong1070 = System.currentTimeMillis();
			return;
		}
		if (k == 16) {
			login_label_top = "Login attempts exceeded.";
			login_label_bottom = "Please wait 1 minute and try again.";
			return;
		}
		if (k == 17) {
			login_label_top = "You are standing in a members-only area.";
			login_label_bottom = "To play on this world move to a free area first";
			return;
		}
		if (k == 20) {
			login_label_top = "Invalid loginserver requested";
			login_label_bottom = "Please try using a different world.";
			return;
		}
		if (k == 21) {
			for (int j1 = channel.read(); j1 >= 0; j1--) {
				login_label_top = "You have only just left another world";
				login_label_bottom = "Your profile will be transferred in: " + j1 + " seconds";
				method66(true);
				try {
					Thread.sleep(1000L);
				} catch (Exception _ex) {
				}
			}
			login(username, password, reconnecting);
			return;
		}
		if (k == -1) {
			login_label_top = "No response from server";
			login_label_bottom = "Please try using a different world.";
			return;
		} else {
			System.out.println("response:" + k);
			login_label_top = "Unexpected server response";
			login_label_bottom = "Please try using a different world.";
			return;
		}
	}
}
