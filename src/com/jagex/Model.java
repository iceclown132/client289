package com.jagex;
import sign.signlink;

public class Model extends Class44_Sub3_Sub4
{

    public int anInt1523;
    public static int anInt1524 = 101;
    public byte aByte1525;
    public byte aByte1526;
    public int anInt1527;
    public static boolean aBoolean1528 = true;
    public static int anInt1529;
    public static Model aClass44_Sub3_Sub4_Sub4_1530 = new Model((byte)91);
    public static int anIntArray1531[] = new int[2000];
    public static int anIntArray1532[] = new int[2000];
    public static int anIntArray1533[] = new int[2000];
    public static int anIntArray1534[] = new int[2000];
    public int anInt1535;
    public int anIntArray1536[];
    public int anIntArray1537[];
    public int anIntArray1538[];
    public int colors;
    public int anIntArray1540[];
    public int anIntArray1541[];
    public int anIntArray1542[];
    public int anIntArray1543[];
    public int anIntArray1544[];
    public int anIntArray1545[];
    public int anIntArray1546[];
    public int anIntArray1547[];
    public int anIntArray1548[];
    public int palette[];
    public int anInt1550;
    public int anInt1551;
    public int anIntArray1552[];
    public int anIntArray1553[];
    public int anIntArray1554[];
    public int anInt1555;
    public int anInt1556;
    public int anInt1557;
    public int anInt1558;
    public int anInt1559;
    public int anInt1560;
    public int anInt1561;
    public int anInt1562;
    public int anInt1563;
    public int anIntArray1564[];
    public int anIntArray1565[];
    public int anIntArrayArray1566[][];
    public int anIntArrayArray1567[][];
    public boolean single_tile;
    public Class25 aClass25Array1569[];
    public static Class21 aClass21Array1570[];
    public static Class43 aClass43_1571;
    public static boolean aBooleanArray1572[] = new boolean[4096];
    public static boolean aBooleanArray1573[] = new boolean[4096];
    public static int anIntArray1574[] = new int[4096];
    public static int anIntArray1575[] = new int[4096];
    public static int anIntArray1576[] = new int[4096];
    public static int anIntArray1577[] = new int[4096];
    public static int anIntArray1578[] = new int[4096];
    public static int anIntArray1579[] = new int[4096];
    public static int anIntArray1580[] = new int[1500];
    public static int anIntArrayArray1581[][] = new int[1500][512];
    public static int anIntArray1582[] = new int[12];
    public static int anIntArrayArray1583[][] = new int[12][2000];
    public static int anIntArray1584[] = new int[2000];
    public static int anIntArray1585[] = new int[2000];
    public static int anIntArray1586[] = new int[12];
    public static int anIntArray1587[] = new int[10];
    public static int anIntArray1588[] = new int[10];
    public static int anIntArray1589[] = new int[10];
    public static int anInt1590;
    public static int anInt1591;
    public static int anInt1592;
    public static boolean aBoolean1593;
    public static int anInt1594;
    public static int anInt1595;
    public static int anInt1596;
    public static int anIntArray1597[] = new int[1000];
    public static int anIntArray1598[];
    public static int anIntArray1599[];
    public static int anIntArray1600[];
    public static int anIntArray1601[];

    public static void method502(byte byte0)
    {
        try
        {
            aClass21Array1570 = null;
            aBooleanArray1572 = null;
            aBooleanArray1573 = null;
            anIntArray1574 = null;
            anIntArray1575 = null;
            anIntArray1576 = null;
            anIntArray1577 = null;
            anIntArray1578 = null;
            anIntArray1579 = null;
            anIntArray1580 = null;
            anIntArrayArray1581 = null;
            anIntArray1582 = null;
            anIntArrayArray1583 = null;
            anIntArray1584 = null;
            if(byte0 != 42)
            {
                return;
            } else
            {
                anIntArray1585 = null;
                anIntArray1586 = null;
                anIntArray1598 = null;
                anIntArray1599 = null;
                anIntArray1600 = null;
                anIntArray1601 = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("555, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method503(int i, Class43 class43)
    {
        aClass21Array1570 = new Class21[i];
        aClass43_1571 = class43;
    }

    public static void method504(byte abyte0[], int i, byte byte0)
    {
        try
        {
            if(abyte0 == null)
            {
                Class21 class21 = aClass21Array1570[i] = new Class21();
                class21.anInt443 = 0;
                class21.anInt444 = 0;
                class21.anInt445 = 0;
                return;
            }
            Buffer class44_sub3_sub2 = new Buffer(abyte0);
            class44_sub3_sub2.pointer = abyte0.length - 18;
            Class21 class21_1 = aClass21Array1570[i] = new Class21();
            class21_1.aByteArray442 = abyte0;
            class21_1.anInt443 = class44_sub3_sub2.getUnsignedShort();
            class21_1.anInt444 = class44_sub3_sub2.getUnsignedShort();
            class21_1.anInt445 = class44_sub3_sub2.getUnsignedByte();
            int j = class44_sub3_sub2.getUnsignedByte();
            int k = class44_sub3_sub2.getUnsignedByte();
            int l = class44_sub3_sub2.getUnsignedByte();
            int i1 = class44_sub3_sub2.getUnsignedByte();
            int j1 = class44_sub3_sub2.getUnsignedByte();
            int k1 = class44_sub3_sub2.getUnsignedShort();
            int l1 = class44_sub3_sub2.getUnsignedShort();
            int i2 = class44_sub3_sub2.getUnsignedShort();
            int j2 = class44_sub3_sub2.getUnsignedShort();
            int k2 = 0;
            class21_1.anInt446 = k2;
            k2 += class21_1.anInt443;
            class21_1.anInt452 = k2;
            k2 += class21_1.anInt444;
            class21_1.anInt455 = k2;
            if(k == 255)
            {
                k2 += class21_1.anInt444;
            } else
            {
                class21_1.anInt455 = -k - 1;
            }
            class21_1.anInt457 = k2;
            if(byte0 != 23)
            {
                aBoolean1528 = !aBoolean1528;
            }
            if(i1 == 1)
            {
                k2 += class21_1.anInt444;
            } else
            {
                class21_1.anInt457 = -1;
            }
            class21_1.anInt454 = k2;
            if(j == 1)
            {
                k2 += class21_1.anInt444;
            } else
            {
                class21_1.anInt454 = -1;
            }
            class21_1.anInt450 = k2;
            if(j1 == 1)
            {
                k2 += class21_1.anInt443;
            } else
            {
                class21_1.anInt450 = -1;
            }
            class21_1.anInt456 = k2;
            if(l == 1)
            {
                k2 += class21_1.anInt444;
            } else
            {
                class21_1.anInt456 = -1;
            }
            class21_1.anInt451 = k2;
            k2 += j2;
            class21_1.anInt453 = k2;
            k2 += class21_1.anInt444 * 2;
            class21_1.anInt458 = k2;
            k2 += class21_1.anInt445 * 6;
            class21_1.anInt447 = k2;
            k2 += k1;
            class21_1.anInt448 = k2;
            k2 += l1;
            class21_1.anInt449 = k2;
            k2 += i2;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15458, " + abyte0 + ", " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method505(byte byte0, int i)
    {
        try
        {
            aClass21Array1570[i] = null;
            if(byte0 != 63)
            {
                anInt1524 = 201;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("7068, " + byte0 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

	public static Model getModel(int i) {
		if (aClass21Array1570 == null) {
			return null;
		}
		Class21 class21 = aClass21Array1570[i];
		if (class21 == null) {
			aClass43_1571.method382(i);
			return null;
		} else {
			return new Model((byte) 5, i);
		}
	}

    public static boolean isCached(int i)
    {
        if(aClass21Array1570 == null)
        {
            return false;
        }
        Class21 class21 = aClass21Array1570[i];
        if(class21 == null)
        {
            aClass43_1571.method382(i);
            return false;
        } else
        {
            return true;
        }
    }

    public Model(byte byte0)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
        single_tile = false;
        try
        {
            if(byte0 != aByte1526)
            {
                throw new NullPointerException();
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("97744, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Model(byte byte0, int i)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
        single_tile = false;
        try
        {
            anInt1529++;
            Class21 class21 = aClass21Array1570[i];
            anInt1535 = class21.anInt443;
            colors = class21.anInt444;
            anInt1551 = class21.anInt445;
            anIntArray1536 = new int[anInt1535];
            anIntArray1537 = new int[anInt1535];
            anIntArray1538 = new int[anInt1535];
            anIntArray1540 = new int[colors];
            anIntArray1541 = new int[colors];
            anIntArray1542 = new int[colors];
            anIntArray1552 = new int[anInt1551];
            anIntArray1553 = new int[anInt1551];
            anIntArray1554 = new int[anInt1551];
            if(class21.anInt450 >= 0)
            {
                anIntArray1564 = new int[anInt1535];
            }
            if(class21.anInt454 >= 0)
            {
                anIntArray1546 = new int[colors];
            }
            if(class21.anInt455 >= 0)
            {
                anIntArray1547 = new int[colors];
            } else
            {
                anInt1550 = -class21.anInt455 - 1;
            }
            if(class21.anInt456 >= 0)
            {
                anIntArray1548 = new int[colors];
            }
            if(class21.anInt457 >= 0)
            {
                anIntArray1565 = new int[colors];
            }
            palette = new int[colors];
            Buffer class44_sub3_sub2 = new Buffer(class21.aByteArray442);
            class44_sub3_sub2.pointer = class21.anInt446;
            Buffer class44_sub3_sub2_1 = new Buffer(class21.aByteArray442);
            class44_sub3_sub2_1.pointer = class21.anInt447;
            Buffer class44_sub3_sub2_2 = new Buffer(class21.aByteArray442);
            class44_sub3_sub2_2.pointer = class21.anInt448;
            Buffer class44_sub3_sub2_3 = new Buffer(class21.aByteArray442);
            class44_sub3_sub2_3.pointer = class21.anInt449;
            Buffer class44_sub3_sub2_4 = new Buffer(class21.aByteArray442);
            class44_sub3_sub2_4.pointer = class21.anInt450;
            int j = 0;
            int k = 0;
            int l = 0;
            for(int i1 = 0; i1 < anInt1535; i1++)
            {
                int j1 = class44_sub3_sub2.getUnsignedByte();
                int l1 = 0;
                if((j1 & 1) != 0)
                {
                    l1 = class44_sub3_sub2_1.getUnsigedSmart();
                }
                int j2 = 0;
                if((j1 & 2) != 0)
                {
                    j2 = class44_sub3_sub2_2.getUnsigedSmart();
                }
                int l2 = 0;
                if((j1 & 4) != 0)
                {
                    l2 = class44_sub3_sub2_3.getUnsigedSmart();
                }
                anIntArray1536[i1] = j + l1;
                anIntArray1537[i1] = k + j2;
                anIntArray1538[i1] = l + l2;
                j = anIntArray1536[i1];
                k = anIntArray1537[i1];
                l = anIntArray1538[i1];
                if(anIntArray1564 != null)
                {
                    anIntArray1564[i1] = class44_sub3_sub2_4.getUnsignedByte();
                }
            }
            class44_sub3_sub2.pointer = class21.anInt453;
            class44_sub3_sub2_1.pointer = class21.anInt454;
            class44_sub3_sub2_2.pointer = class21.anInt455;
            class44_sub3_sub2_3.pointer = class21.anInt456;
            class44_sub3_sub2_4.pointer = class21.anInt457;
            for(int k1 = 0; k1 < colors; k1++)
            {
                palette[k1] = class44_sub3_sub2.getUnsignedShort();
                if(anIntArray1546 != null)
                {
                    anIntArray1546[k1] = class44_sub3_sub2_1.getUnsignedByte();
                }
                if(anIntArray1547 != null)
                {
                    anIntArray1547[k1] = class44_sub3_sub2_2.getUnsignedByte();
                }
                if(anIntArray1548 != null)
                {
                    anIntArray1548[k1] = class44_sub3_sub2_3.getUnsignedByte();
                }
                if(anIntArray1565 != null)
                {
                    anIntArray1565[k1] = class44_sub3_sub2_4.getUnsignedByte();
                }
            }
            class44_sub3_sub2.pointer = class21.anInt451;
            class44_sub3_sub2_1.pointer = class21.anInt452;
            int i2 = 0;
            int k2 = 0;
            int i3 = 0;
            int j3 = 0;
            if(byte0 != 5)
            {
                for(int k3 = 1; k3 > 0; k3++)
                {
                }
            }
            for(int l3 = 0; l3 < colors; l3++)
            {
                int i4 = class44_sub3_sub2_1.getUnsignedByte();
                if(i4 == 1)
                {
                    i2 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = i2;
                    k2 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = k2;
                    i3 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = i3;
                    anIntArray1540[l3] = i2;
                    anIntArray1541[l3] = k2;
                    anIntArray1542[l3] = i3;
                }
                if(i4 == 2)
                {
                    k2 = i3;
                    i3 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = i3;
                    anIntArray1540[l3] = i2;
                    anIntArray1541[l3] = k2;
                    anIntArray1542[l3] = i3;
                }
                if(i4 == 3)
                {
                    i2 = i3;
                    i3 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = i3;
                    anIntArray1540[l3] = i2;
                    anIntArray1541[l3] = k2;
                    anIntArray1542[l3] = i3;
                }
                if(i4 == 4)
                {
                    int k4 = i2;
                    i2 = k2;
                    k2 = k4;
                    i3 = class44_sub3_sub2.getUnsigedSmart() + j3;
                    j3 = i3;
                    anIntArray1540[l3] = i2;
                    anIntArray1541[l3] = k2;
                    anIntArray1542[l3] = i3;
                }
            }
            class44_sub3_sub2.pointer = class21.anInt458;
            for(int j4 = 0; j4 < anInt1551; j4++)
            {
                anIntArray1552[j4] = class44_sub3_sub2.getUnsignedShort();
                anIntArray1553[j4] = class44_sub3_sub2.getUnsignedShort();
                anIntArray1554[j4] = class44_sub3_sub2.getUnsignedShort();
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("1962, " + byte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model(Model aclass44_sub3_sub4_sub4[], int i)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
		single_tile = false;
		anInt1529++;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		anInt1535 = 0;
		colors = 0;
		anInt1551 = 0;
		anInt1550 = -1;
		for (int k = 0; k < i; k++) {
			Model class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[k];
			if (class44_sub3_sub4_sub4 != null) {
				anInt1535 += class44_sub3_sub4_sub4.anInt1535;
				colors += class44_sub3_sub4_sub4.colors;
				anInt1551 += class44_sub3_sub4_sub4.anInt1551;
				flag |= class44_sub3_sub4_sub4.anIntArray1546 != null;
				if (class44_sub3_sub4_sub4.anIntArray1547 != null) {
					flag1 = true;
				} else {
					if (anInt1550 == -1) {
						anInt1550 = class44_sub3_sub4_sub4.anInt1550;
					}
					if (anInt1550 != class44_sub3_sub4_sub4.anInt1550) {
						flag1 = true;
					}
				}
				flag2 |= class44_sub3_sub4_sub4.anIntArray1548 != null;
				flag3 |= class44_sub3_sub4_sub4.anIntArray1565 != null;
			}
		}
		anIntArray1536 = new int[anInt1535];
		anIntArray1537 = new int[anInt1535];
		anIntArray1538 = new int[anInt1535];
		anIntArray1564 = new int[anInt1535];
		anIntArray1540 = new int[colors];
		anIntArray1541 = new int[colors];
		anIntArray1542 = new int[colors];
		anIntArray1552 = new int[anInt1551];
		anIntArray1553 = new int[anInt1551];
		anIntArray1554 = new int[anInt1551];
		if (flag) {
			anIntArray1546 = new int[colors];
		}
		if (flag1) {
			anIntArray1547 = new int[colors];
		}
		if (flag2) {
			anIntArray1548 = new int[colors];
		}
		if (flag3) {
			anIntArray1565 = new int[colors];
		}
		palette = new int[colors];
		anInt1535 = 0;
		colors = 0;
		anInt1551 = 0;
		int l = 0;
		for (int i1 = 0; i1 < i; i1++) {
			Model class44_sub3_sub4_sub4_1 = aclass44_sub3_sub4_sub4[i1];
			if (class44_sub3_sub4_sub4_1 != null) {
				for (int j1 = 0; j1 < class44_sub3_sub4_sub4_1.colors; j1++) {
					if (flag) {
						if (class44_sub3_sub4_sub4_1.anIntArray1546 == null) {
							anIntArray1546[colors] = 0;
						} else {
							int k1 = class44_sub3_sub4_sub4_1.anIntArray1546[j1];
							if ((k1 & 2) == 2) {
								k1 += l << 2;
							}
							anIntArray1546[colors] = k1;
						}
					}
					if (flag1) {
						if (class44_sub3_sub4_sub4_1.anIntArray1547 == null) {
							anIntArray1547[colors] = class44_sub3_sub4_sub4_1.anInt1550;
						} else {
							anIntArray1547[colors] = class44_sub3_sub4_sub4_1.anIntArray1547[j1];
						}
					}
					if (flag2) {
						if (class44_sub3_sub4_sub4_1.anIntArray1548 == null) {
							anIntArray1548[colors] = 0;
						} else {
							anIntArray1548[colors] = class44_sub3_sub4_sub4_1.anIntArray1548[j1];
						}
					}
					if (flag3 && class44_sub3_sub4_sub4_1.anIntArray1565 != null) {
						anIntArray1565[colors] = class44_sub3_sub4_sub4_1.anIntArray1565[j1];
					}
					palette[colors] = class44_sub3_sub4_sub4_1.palette[j1];
					anIntArray1540[colors] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1540[j1]);
					anIntArray1541[colors] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1541[j1]);
					anIntArray1542[colors] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1542[j1]);
					colors++;
				}
				for (int l1 = 0; l1 < class44_sub3_sub4_sub4_1.anInt1551; l1++) {
					anIntArray1552[anInt1551] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1552[l1]);
					anIntArray1553[anInt1551] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1553[l1]);
					anIntArray1554[anInt1551] = method509(class44_sub3_sub4_sub4_1,
							class44_sub3_sub4_sub4_1.anIntArray1554[l1]);
					anInt1551++;
				}
				l += class44_sub3_sub4_sub4_1.anInt1551;
			}
		}
	}

    public Model(boolean flag, int i, Model aclass44_sub3_sub4_sub4[], int j)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
        single_tile = false;
        try
        {
            anInt1529++;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            anInt1535 = 0;
            colors = 0;
            if(i != 0)
            {
                throw new NullPointerException();
            }
            anInt1551 = 0;
            anInt1550 = -1;
            for(int k = 0; k < j; k++)
            {
                Model class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[k];
                if(class44_sub3_sub4_sub4 != null)
                {
                    anInt1535 += class44_sub3_sub4_sub4.anInt1535;
                    colors += class44_sub3_sub4_sub4.colors;
                    anInt1551 += class44_sub3_sub4_sub4.anInt1551;
                    flag1 |= class44_sub3_sub4_sub4.anIntArray1546 != null;
                    if(class44_sub3_sub4_sub4.anIntArray1547 != null)
                    {
                        flag2 = true;
                    } else
                    {
                        if(anInt1550 == -1)
                        {
                            anInt1550 = class44_sub3_sub4_sub4.anInt1550;
                        }
                        if(anInt1550 != class44_sub3_sub4_sub4.anInt1550)
                        {
                            flag2 = true;
                        }
                    }
                    flag3 |= class44_sub3_sub4_sub4.anIntArray1548 != null;
                    flag4 |= class44_sub3_sub4_sub4.palette != null;
                }
            }
            anIntArray1536 = new int[anInt1535];
            anIntArray1537 = new int[anInt1535];
            anIntArray1538 = new int[anInt1535];
            anIntArray1540 = new int[colors];
            anIntArray1541 = new int[colors];
            anIntArray1542 = new int[colors];
            anIntArray1543 = new int[colors];
            anIntArray1544 = new int[colors];
            anIntArray1545 = new int[colors];
            anIntArray1552 = new int[anInt1551];
            anIntArray1553 = new int[anInt1551];
            anIntArray1554 = new int[anInt1551];
            if(flag1)
            {
                anIntArray1546 = new int[colors];
            }
            if(flag2)
            {
                anIntArray1547 = new int[colors];
            }
            if(flag3)
            {
                anIntArray1548 = new int[colors];
            }
            if(flag4)
            {
                palette = new int[colors];
            }
            anInt1535 = 0;
            colors = 0;
            anInt1551 = 0;
            int l = 0;
            for(int i1 = 0; i1 < j; i1++)
            {
                Model class44_sub3_sub4_sub4_1 = aclass44_sub3_sub4_sub4[i1];
                if(class44_sub3_sub4_sub4_1 != null)
                {
                    int j1 = anInt1535;
                    for(int k1 = 0; k1 < class44_sub3_sub4_sub4_1.anInt1535; k1++)
                    {
                        anIntArray1536[anInt1535] = class44_sub3_sub4_sub4_1.anIntArray1536[k1];
                        anIntArray1537[anInt1535] = class44_sub3_sub4_sub4_1.anIntArray1537[k1];
                        anIntArray1538[anInt1535] = class44_sub3_sub4_sub4_1.anIntArray1538[k1];
                        anInt1535++;
                    }
                    for(int l1 = 0; l1 < class44_sub3_sub4_sub4_1.colors; l1++)
                    {
                        anIntArray1540[colors] = class44_sub3_sub4_sub4_1.anIntArray1540[l1] + j1;
                        anIntArray1541[colors] = class44_sub3_sub4_sub4_1.anIntArray1541[l1] + j1;
                        anIntArray1542[colors] = class44_sub3_sub4_sub4_1.anIntArray1542[l1] + j1;
                        anIntArray1543[colors] = class44_sub3_sub4_sub4_1.anIntArray1543[l1];
                        anIntArray1544[colors] = class44_sub3_sub4_sub4_1.anIntArray1544[l1];
                        anIntArray1545[colors] = class44_sub3_sub4_sub4_1.anIntArray1545[l1];
                        if(flag1)
                        {
                            if(class44_sub3_sub4_sub4_1.anIntArray1546 == null)
                            {
                                anIntArray1546[colors] = 0;
                            } else
                            {
                                int i2 = class44_sub3_sub4_sub4_1.anIntArray1546[l1];
                                if((i2 & 2) == 2)
                                {
                                    i2 += l << 2;
                                }
                                anIntArray1546[colors] = i2;
                            }
                        }
                        if(flag2)
                        {
                            if(class44_sub3_sub4_sub4_1.anIntArray1547 == null)
                            {
                                anIntArray1547[colors] = class44_sub3_sub4_sub4_1.anInt1550;
                            } else
                            {
                                anIntArray1547[colors] = class44_sub3_sub4_sub4_1.anIntArray1547[l1];
                            }
                        }
                        if(flag3)
                        {
                            if(class44_sub3_sub4_sub4_1.anIntArray1548 == null)
                            {
                                anIntArray1548[colors] = 0;
                            } else
                            {
                                anIntArray1548[colors] = class44_sub3_sub4_sub4_1.anIntArray1548[l1];
                            }
                        }
                        if(flag4 && class44_sub3_sub4_sub4_1.palette != null)
                        {
                            palette[colors] = class44_sub3_sub4_sub4_1.palette[l1];
                        }
                        colors++;
                    }
                    for(int j2 = 0; j2 < class44_sub3_sub4_sub4_1.anInt1551; j2++)
                    {
                        anIntArray1552[anInt1551] = class44_sub3_sub4_sub4_1.anIntArray1552[j2] + j1;
                        anIntArray1553[anInt1551] = class44_sub3_sub4_sub4_1.anIntArray1553[j2] + j1;
                        anIntArray1554[anInt1551] = class44_sub3_sub4_sub4_1.anIntArray1554[j2] + j1;
                        anInt1551++;
                    }
                    l += class44_sub3_sub4_sub4_1.anInt1551;
                }
            }
            method510();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("44164, " + flag + ", " + i + ", " + aclass44_sub3_sub4_sub4 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model(Model class44_sub3_sub4_sub4, boolean flag, boolean flag1, int i, boolean flag2)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
        single_tile = false;
        try
        {
            anInt1529++;
            anInt1535 = class44_sub3_sub4_sub4.anInt1535;
            colors = class44_sub3_sub4_sub4.colors;
            anInt1551 = class44_sub3_sub4_sub4.anInt1551;
            if(flag1)
            {
                anIntArray1536 = class44_sub3_sub4_sub4.anIntArray1536;
                anIntArray1537 = class44_sub3_sub4_sub4.anIntArray1537;
                anIntArray1538 = class44_sub3_sub4_sub4.anIntArray1538;
            } else
            {
                anIntArray1536 = new int[anInt1535];
                anIntArray1537 = new int[anInt1535];
                anIntArray1538 = new int[anInt1535];
                for(int j = 0; j < anInt1535; j++)
                {
                    anIntArray1536[j] = class44_sub3_sub4_sub4.anIntArray1536[j];
                    anIntArray1537[j] = class44_sub3_sub4_sub4.anIntArray1537[j];
                    anIntArray1538[j] = class44_sub3_sub4_sub4.anIntArray1538[j];
                }
            }
            if(flag2)
            {
                palette = class44_sub3_sub4_sub4.palette;
            } else
            {
                palette = new int[colors];
                for(int k = 0; k < colors; k++)
                {
                    palette[k] = class44_sub3_sub4_sub4.palette[k];
                }
            }
            if(flag)
            {
                anIntArray1548 = class44_sub3_sub4_sub4.anIntArray1548;
            } else
            {
                anIntArray1548 = new int[colors];
                if(class44_sub3_sub4_sub4.anIntArray1548 == null)
                {
                    for(int l = 0; l < colors; l++)
                    {
                        anIntArray1548[l] = 0;
                    }
                } else
                {
                    for(int i1 = 0; i1 < colors; i1++)
                    {
                        anIntArray1548[i1] = class44_sub3_sub4_sub4.anIntArray1548[i1];
                    }
                }
            }
            anIntArray1564 = class44_sub3_sub4_sub4.anIntArray1564;
            anIntArray1565 = class44_sub3_sub4_sub4.anIntArray1565;
            anIntArray1546 = class44_sub3_sub4_sub4.anIntArray1546;
            anIntArray1540 = class44_sub3_sub4_sub4.anIntArray1540;
            anIntArray1541 = class44_sub3_sub4_sub4.anIntArray1541;
            anIntArray1542 = class44_sub3_sub4_sub4.anIntArray1542;
            anIntArray1547 = class44_sub3_sub4_sub4.anIntArray1547;
            anInt1550 = class44_sub3_sub4_sub4.anInt1550;
            if(i != 0)
            {
                for(int j1 = 1; j1 > 0; j1++)
                {
                }
            }
            anIntArray1552 = class44_sub3_sub4_sub4.anIntArray1552;
            anIntArray1553 = class44_sub3_sub4_sub4.anIntArray1553;
            anIntArray1554 = class44_sub3_sub4_sub4.anIntArray1554;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("54490, " + class44_sub3_sub4_sub4 + ", " + flag + ", " + flag1 + ", " + i + ", " + flag2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model(boolean flag, int i, Model class44_sub3_sub4_sub4, boolean flag1)
    {
        anInt1523 = 6;
        aByte1525 = 4;
        aByte1526 = 91;
        anInt1527 = 188;
        single_tile = false;
        try
        {
            anInt1529++;
            anInt1535 = class44_sub3_sub4_sub4.anInt1535;
            colors = class44_sub3_sub4_sub4.colors;
            anInt1551 = class44_sub3_sub4_sub4.anInt1551;
            if(flag1)
            {
                anIntArray1537 = new int[anInt1535];
                for(int j = 0; j < anInt1535; j++)
                {
                    anIntArray1537[j] = class44_sub3_sub4_sub4.anIntArray1537[j];
                }
            } else
            {
                anIntArray1537 = class44_sub3_sub4_sub4.anIntArray1537;
            }
            if(flag)
            {
                anIntArray1543 = new int[colors];
                anIntArray1544 = new int[colors];
                anIntArray1545 = new int[colors];
                for(int k = 0; k < colors; k++)
                {
                    anIntArray1543[k] = class44_sub3_sub4_sub4.anIntArray1543[k];
                    anIntArray1544[k] = class44_sub3_sub4_sub4.anIntArray1544[k];
                    anIntArray1545[k] = class44_sub3_sub4_sub4.anIntArray1545[k];
                }
                anIntArray1546 = new int[colors];
                if(class44_sub3_sub4_sub4.anIntArray1546 == null)
                {
                    for(int i1 = 0; i1 < colors; i1++)
                    {
                        anIntArray1546[i1] = 0;
                    }
                } else
                {
                    for(int j1 = 0; j1 < colors; j1++)
                    {
                        anIntArray1546[j1] = class44_sub3_sub4_sub4.anIntArray1546[j1];
                    }
                }
                super.aClass25Array1411 = new Class25[anInt1535];
                for(int k1 = 0; k1 < anInt1535; k1++)
                {
                    Class25 class25 = super.aClass25Array1411[k1] = new Class25();
                    Class25 class25_1 = ((Class44_Sub3_Sub4) (class44_sub3_sub4_sub4)).aClass25Array1411[k1];
                    class25.anInt500 = class25_1.anInt500;
                    class25.anInt501 = class25_1.anInt501;
                    class25.anInt502 = class25_1.anInt502;
                    class25.anInt503 = class25_1.anInt503;
                }
                aClass25Array1569 = class44_sub3_sub4_sub4.aClass25Array1569;
            } else
            {
                anIntArray1543 = class44_sub3_sub4_sub4.anIntArray1543;
                anIntArray1544 = class44_sub3_sub4_sub4.anIntArray1544;
                anIntArray1545 = class44_sub3_sub4_sub4.anIntArray1545;
                anIntArray1546 = class44_sub3_sub4_sub4.anIntArray1546;
            }
            anIntArray1536 = class44_sub3_sub4_sub4.anIntArray1536;
            anIntArray1538 = class44_sub3_sub4_sub4.anIntArray1538;
            palette = class44_sub3_sub4_sub4.palette;
            anIntArray1548 = class44_sub3_sub4_sub4.anIntArray1548;
            anIntArray1547 = class44_sub3_sub4_sub4.anIntArray1547;
            anInt1550 = class44_sub3_sub4_sub4.anInt1550;
            anIntArray1540 = class44_sub3_sub4_sub4.anIntArray1540;
            anIntArray1541 = class44_sub3_sub4_sub4.anIntArray1541;
            anIntArray1542 = class44_sub3_sub4_sub4.anIntArray1542;
            if(i != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            anIntArray1552 = class44_sub3_sub4_sub4.anIntArray1552;
            anIntArray1553 = class44_sub3_sub4_sub4.anIntArray1553;
            anIntArray1554 = class44_sub3_sub4_sub4.anIntArray1554;
            super.anInt1412 = ((Class44_Sub3_Sub4) (class44_sub3_sub4_sub4)).anInt1412;
            anInt1560 = class44_sub3_sub4_sub4.anInt1560;
            anInt1559 = class44_sub3_sub4_sub4.anInt1559;
            anInt1562 = class44_sub3_sub4_sub4.anInt1562;
            anInt1561 = class44_sub3_sub4_sub4.anInt1561;
            anInt1555 = class44_sub3_sub4_sub4.anInt1555;
            anInt1557 = class44_sub3_sub4_sub4.anInt1557;
            anInt1558 = class44_sub3_sub4_sub4.anInt1558;
            anInt1556 = class44_sub3_sub4_sub4.anInt1556;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("37258, " + flag + ", " + i + ", " + class44_sub3_sub4_sub4 + ", " + flag1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method508(boolean flag, Model class44_sub3_sub4_sub4, int i)
    {
        try
        {
            anInt1535 = class44_sub3_sub4_sub4.anInt1535;
            colors = class44_sub3_sub4_sub4.colors;
            anInt1551 = class44_sub3_sub4_sub4.anInt1551;
            if(anIntArray1531.length < anInt1535)
            {
                anIntArray1531 = new int[anInt1535 + 100];
                anIntArray1532 = new int[anInt1535 + 100];
                anIntArray1533 = new int[anInt1535 + 100];
            }
            anIntArray1536 = anIntArray1531;
            anIntArray1537 = anIntArray1532;
            anIntArray1538 = anIntArray1533;
            for(int j = 0; j < anInt1535; j++)
            {
                anIntArray1536[j] = class44_sub3_sub4_sub4.anIntArray1536[j];
                anIntArray1537[j] = class44_sub3_sub4_sub4.anIntArray1537[j];
                anIntArray1538[j] = class44_sub3_sub4_sub4.anIntArray1538[j];
            }
            if(flag)
            {
                anIntArray1548 = class44_sub3_sub4_sub4.anIntArray1548;
            } else
            {
                if(anIntArray1534.length < colors)
                {
                    anIntArray1534 = new int[colors + 100];
                }
                anIntArray1548 = anIntArray1534;
                if(class44_sub3_sub4_sub4.anIntArray1548 == null)
                {
                    for(int k = 0; k < colors; k++)
                    {
                        anIntArray1548[k] = 0;
                    }
                } else
                {
                    for(int l = 0; l < colors; l++)
                    {
                        anIntArray1548[l] = class44_sub3_sub4_sub4.anIntArray1548[l];
                    }
                }
            }
            anIntArray1546 = class44_sub3_sub4_sub4.anIntArray1546;
            palette = class44_sub3_sub4_sub4.palette;
            anIntArray1547 = class44_sub3_sub4_sub4.anIntArray1547;
            anInt1550 = class44_sub3_sub4_sub4.anInt1550;
            anIntArrayArray1567 = class44_sub3_sub4_sub4.anIntArrayArray1567;
            anIntArrayArray1566 = class44_sub3_sub4_sub4.anIntArrayArray1566;
            anIntArray1540 = class44_sub3_sub4_sub4.anIntArray1540;
            anIntArray1541 = class44_sub3_sub4_sub4.anIntArray1541;
            anIntArray1542 = class44_sub3_sub4_sub4.anIntArray1542;
            anIntArray1543 = class44_sub3_sub4_sub4.anIntArray1543;
            if(i != 0)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            anIntArray1544 = class44_sub3_sub4_sub4.anIntArray1544;
            anIntArray1545 = class44_sub3_sub4_sub4.anIntArray1545;
            anIntArray1552 = class44_sub3_sub4_sub4.anIntArray1552;
            anIntArray1553 = class44_sub3_sub4_sub4.anIntArray1553;
            anIntArray1554 = class44_sub3_sub4_sub4.anIntArray1554;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("85838, " + flag + ", " + class44_sub3_sub4_sub4 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method509(Model class44_sub3_sub4_sub4, int i)
    {
        int j = -1;
        int k = class44_sub3_sub4_sub4.anIntArray1536[i];
        int l = class44_sub3_sub4_sub4.anIntArray1537[i];
        int i1 = class44_sub3_sub4_sub4.anIntArray1538[i];
        for(int j1 = 0; j1 < anInt1535; j1++)
        {
            if(k != anIntArray1536[j1] || l != anIntArray1537[j1] || i1 != anIntArray1538[j1])
            {
                continue;
            }
            j = j1;
            break;
        }
        if(j == -1)
        {
            anIntArray1536[anInt1535] = k;
            anIntArray1537[anInt1535] = l;
            anIntArray1538[anInt1535] = i1;
            if(class44_sub3_sub4_sub4.anIntArray1564 != null)
            {
                anIntArray1564[anInt1535] = class44_sub3_sub4_sub4.anIntArray1564[i];
            }
            j = anInt1535++;
        }
        return j;
    }

	public void method510() {
		super.anInt1412 = 0;
		anInt1559 = 0;
		anInt1560 = 0;
		for (int j = 0; j < anInt1535; j++) {
			int k = anIntArray1536[j];
			int l = anIntArray1537[j];
			int i1 = anIntArray1538[j];
			if (-l > super.anInt1412) {
				super.anInt1412 = -l;
			}
			if (l > anInt1560) {
				anInt1560 = l;
			}
			int j1 = k * k + i1 * i1;
			if (j1 > anInt1559) {
				anInt1559 = j1;
			}
		}
		anInt1559 = (int) (Math.sqrt(anInt1559) + 0.98999999999999999D);
		anInt1562 = (int) (Math.sqrt(anInt1559 * anInt1559 + super.anInt1412 * super.anInt1412) + 0.98999999999999999D);
		anInt1561 = anInt1562 + (int) (Math.sqrt(anInt1559 * anInt1559 + anInt1560 * anInt1560) + 0.98999999999999999D);
	}

    public void method511(int i)
    {
        try
        {
            for(super.anInt1412 = 0; i >= 0;)
            {
                return;
            }
            anInt1560 = 0;
            for(int j = 0; j < anInt1535; j++)
            {
                int k = anIntArray1537[j];
                if(-k > super.anInt1412)
                {
                    super.anInt1412 = -k;
                }
                if(k > anInt1560)
                {
                    anInt1560 = k;
                }
            }
            anInt1562 = (int)(Math.sqrt(anInt1559 * anInt1559 + super.anInt1412 * super.anInt1412) + 0.98999999999999999D);
            anInt1561 = anInt1562 + (int)(Math.sqrt(anInt1559 * anInt1559 + anInt1560 * anInt1560) + 0.98999999999999999D);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("17256, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method512(int i)
    {
        try
        {
            super.anInt1412 = 0;
            anInt1559 = 0;
            anInt1560 = 0;
            anInt1555 = 0xf423f;
            anInt1556 = 0xfff0bdc1;
            anInt1557 = 0xfffe7961;
            anInt1558 = 0x1869f;
            for(int j = 0; j < anInt1535; j++)
            {
                int k = anIntArray1536[j];
                int l = anIntArray1537[j];
                int i1 = anIntArray1538[j];
                if(k < anInt1555)
                {
                    anInt1555 = k;
                }
                if(k > anInt1556)
                {
                    anInt1556 = k;
                }
                if(i1 < anInt1558)
                {
                    anInt1558 = i1;
                }
                if(i1 > anInt1557)
                {
                    anInt1557 = i1;
                }
                if(-l > super.anInt1412)
                {
                    super.anInt1412 = -l;
                }
                if(l > anInt1560)
                {
                    anInt1560 = l;
                }
                int j1 = k * k + i1 * i1;
                if(j1 > anInt1559)
                {
                    anInt1559 = j1;
                }
            }
            anInt1559 = (int)Math.sqrt(anInt1559);
            anInt1562 = (int)Math.sqrt(anInt1559 * anInt1559 + super.anInt1412 * super.anInt1412);
            if(i != 7)
            {
                return;
            } else
            {
                anInt1561 = anInt1562 + (int)Math.sqrt(anInt1559 * anInt1559 + anInt1560 * anInt1560);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10133, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method513(byte byte0)
    {
        try
        {
            if(byte0 == 3)
            {
                byte0 = 0;
            } else
            {
                anInt1524 = -411;
            }
            if(anIntArray1564 != null)
            {
                int ai[] = new int[256];
                int i = 0;
                for(int k = 0; k < anInt1535; k++)
                {
                    int i1 = anIntArray1564[k];
                    ai[i1]++;
                    if(i1 > i)
                    {
                        i = i1;
                    }
                }
                anIntArrayArray1566 = new int[i + 1][];
                for(int j1 = 0; j1 <= i; j1++)
                {
                    anIntArrayArray1566[j1] = new int[ai[j1]];
                    ai[j1] = 0;
                }
                for(int i2 = 0; i2 < anInt1535; i2++)
                {
                    int k2 = anIntArray1564[i2];
                    anIntArrayArray1566[k2][ai[k2]++] = i2;
                }
                anIntArray1564 = null;
            }
            if(anIntArray1565 != null)
            {
                int ai1[] = new int[256];
                int j = 0;
                for(int l = 0; l < colors; l++)
                {
                    int k1 = anIntArray1565[l];
                    ai1[k1]++;
                    if(k1 > j)
                    {
                        j = k1;
                    }
                }
                anIntArrayArray1567 = new int[j + 1][];
                for(int l1 = 0; l1 <= j; l1++)
                {
                    anIntArrayArray1567[l1] = new int[ai1[l1]];
                    ai1[l1] = 0;
                }
                for(int j2 = 0; j2 < colors; j2++)
                {
                    int l2 = anIntArray1565[j2];
                    anIntArrayArray1567[l2][ai1[l2]++] = j2;
                }
                anIntArray1565 = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("8794, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method514(int i, int j)
    {
        try
        {
            if(anIntArrayArray1566 == null)
            {
                return;
            }
            if(i == -1)
            {
                return;
            }
            AnimationFrame class11 = AnimationFrame.get(i);
            if(class11 == null)
            {
                return;
            }
            Skins class9 = class11.joints;
            anInt1590 = 0;
            anInt1591 = 0;
            anInt1592 = 0;
            for(int k = 0; k < class11.size; k++)
            {
                int l = class11.anIntArray268[k];
                method516(class9.anIntArray254[l], class9.anIntArrayArray255[l], class11.anIntArray269[k], class11.anIntArray270[k], class11.anIntArray271[k]);
            }
            j = 30 / j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89296, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method515(int i, boolean flag, int j, int ai[])
    {
        try
        {
            if(i == -1)
            {
                return;
            }
            if(ai == null || j == -1)
            {
                method514(i, 188);
                return;
            }
            AnimationFrame class11 = AnimationFrame.get(i);
            if(class11 == null)
            {
                return;
            }
            AnimationFrame class11_1 = AnimationFrame.get(j);
            if(!flag)
            {
                return;
            }
            if(class11_1 == null)
            {
                method514(i, 188);
                return;
            }
            Skins class9 = class11.joints;
            anInt1590 = 0;
            anInt1591 = 0;
            anInt1592 = 0;
            int k = 0;
            int l = ai[k++];
            for(int i1 = 0; i1 < class11.size; i1++)
            {
                int j1;
                for(j1 = class11.anIntArray268[i1]; j1 > l; l = ai[k++])
                {
                }
                if(j1 != l || class9.anIntArray254[j1] == 0)
                {
                    method516(class9.anIntArray254[j1], class9.anIntArrayArray255[j1], class11.anIntArray269[i1], class11.anIntArray270[i1], class11.anIntArray271[i1]);
                }
            }
            anInt1590 = 0;
            anInt1591 = 0;
            anInt1592 = 0;
            k = 0;
            l = ai[k++];
            for(int k1 = 0; k1 < class11_1.size; k1++)
            {
                int l1;
                for(l1 = class11_1.anIntArray268[k1]; l1 > l; l = ai[k++])
                {
                }
                if(l1 == l || class9.anIntArray254[l1] == 0)
                {
                    method516(class9.anIntArray254[l1], class9.anIntArrayArray255[l1], class11_1.anIntArray269[k1], class11_1.anIntArray270[k1], class11_1.anIntArray271[k1]);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("48519, " + i + ", " + flag + ", " + j + ", " + ai + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method516(int i, int ai[], int j, int k, int l)
    {
        int i1 = ai.length;
        if(i == 0)
        {
            int j1 = 0;
            anInt1590 = 0;
            anInt1591 = 0;
            anInt1592 = 0;
            for(int k2 = 0; k2 < i1; k2++)
            {
                int l3 = ai[k2];
                if(l3 < anIntArrayArray1566.length)
                {
                    int ai5[] = anIntArrayArray1566[l3];
                    for(int i5 = 0; i5 < ai5.length; i5++)
                    {
                        int j6 = ai5[i5];
                        anInt1590 += anIntArray1536[j6];
                        anInt1591 += anIntArray1537[j6];
                        anInt1592 += anIntArray1538[j6];
                        j1++;
                    }
                }
            }
            if(j1 > 0)
            {
                anInt1590 = anInt1590 / j1 + j;
                anInt1591 = anInt1591 / j1 + k;
                anInt1592 = anInt1592 / j1 + l;
                return;
            } else
            {
                anInt1590 = j;
                anInt1591 = k;
                anInt1592 = l;
                return;
            }
        }
        if(i == 1)
        {
            for(int k1 = 0; k1 < i1; k1++)
            {
                int l2 = ai[k1];
                if(l2 < anIntArrayArray1566.length)
                {
                    int ai1[] = anIntArrayArray1566[l2];
                    for(int i4 = 0; i4 < ai1.length; i4++)
                    {
                        int j5 = ai1[i4];
                        anIntArray1536[j5] += j;
                        anIntArray1537[j5] += k;
                        anIntArray1538[j5] += l;
                    }
                }
            }
            return;
        }
        if(i == 2)
        {
            for(int l1 = 0; l1 < i1; l1++)
            {
                int i3 = ai[l1];
                if(i3 < anIntArrayArray1566.length)
                {
                    int ai2[] = anIntArrayArray1566[i3];
                    for(int j4 = 0; j4 < ai2.length; j4++)
                    {
                        int k5 = ai2[j4];
                        anIntArray1536[k5] -= anInt1590;
                        anIntArray1537[k5] -= anInt1591;
                        anIntArray1538[k5] -= anInt1592;
                        int k6 = (j & 0xff) * 8;
                        int l6 = (k & 0xff) * 8;
                        int i7 = (l & 0xff) * 8;
                        if(i7 != 0)
                        {
                            int j7 = anIntArray1598[i7];
                            int i8 = anIntArray1599[i7];
                            int l8 = anIntArray1537[k5] * j7 + anIntArray1536[k5] * i8 >> 16;
                            anIntArray1537[k5] = anIntArray1537[k5] * i8 - anIntArray1536[k5] * j7 >> 16;
                            anIntArray1536[k5] = l8;
                        }
                        if(k6 != 0)
                        {
                            int k7 = anIntArray1598[k6];
                            int j8 = anIntArray1599[k6];
                            int i9 = anIntArray1537[k5] * j8 - anIntArray1538[k5] * k7 >> 16;
                            anIntArray1538[k5] = anIntArray1537[k5] * k7 + anIntArray1538[k5] * j8 >> 16;
                            anIntArray1537[k5] = i9;
                        }
                        if(l6 != 0)
                        {
                            int l7 = anIntArray1598[l6];
                            int k8 = anIntArray1599[l6];
                            int j9 = anIntArray1538[k5] * l7 + anIntArray1536[k5] * k8 >> 16;
                            anIntArray1538[k5] = anIntArray1538[k5] * k8 - anIntArray1536[k5] * l7 >> 16;
                            anIntArray1536[k5] = j9;
                        }
                        anIntArray1536[k5] += anInt1590;
                        anIntArray1537[k5] += anInt1591;
                        anIntArray1538[k5] += anInt1592;
                    }
                }
            }
            return;
        }
        if(i == 3)
        {
            for(int i2 = 0; i2 < i1; i2++)
            {
                int j3 = ai[i2];
                if(j3 < anIntArrayArray1566.length)
                {
                    int ai3[] = anIntArrayArray1566[j3];
                    for(int k4 = 0; k4 < ai3.length; k4++)
                    {
                        int l5 = ai3[k4];
                        anIntArray1536[l5] -= anInt1590;
                        anIntArray1537[l5] -= anInt1591;
                        anIntArray1538[l5] -= anInt1592;
                        anIntArray1536[l5] = (anIntArray1536[l5] * j) / 128;
                        anIntArray1537[l5] = (anIntArray1537[l5] * k) / 128;
                        anIntArray1538[l5] = (anIntArray1538[l5] * l) / 128;
                        anIntArray1536[l5] += anInt1590;
                        anIntArray1537[l5] += anInt1591;
                        anIntArray1538[l5] += anInt1592;
                    }
                }
            }
            return;
        }
        if(i == 5 && anIntArrayArray1567 != null && anIntArray1548 != null)
        {
            for(int j2 = 0; j2 < i1; j2++)
            {
                int k3 = ai[j2];
                if(k3 < anIntArrayArray1567.length)
                {
                    int ai4[] = anIntArrayArray1567[k3];
                    for(int l4 = 0; l4 < ai4.length; l4++)
                    {
                        int i6 = ai4[l4];
                        anIntArray1548[i6] += j * 8;
                        if(anIntArray1548[i6] < 0)
                        {
                            anIntArray1548[i6] = 0;
                        }
                        if(anIntArray1548[i6] > 255)
                        {
                            anIntArray1548[i6] = 255;
                        }
                    }
                }
            }
        }
    }

    public void method517(int i)
    {
        try
        {
            for(int j = 0; j < anInt1535; j++)
            {
                int k = anIntArray1536[j];
                anIntArray1536[j] = anIntArray1538[j];
                anIntArray1538[j] = -k;
            }
            if(i != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("55629, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method518(int i, int j)
    {
        try
        {
            int k = anIntArray1598[j];
            int l = anIntArray1599[j];
            if(i != 46881)
            {
                return;
            }
            for(int i1 = 0; i1 < anInt1535; i1++)
            {
                int j1 = anIntArray1537[i1] * l - anIntArray1538[i1] * k >> 16;
                anIntArray1538[i1] = anIntArray1537[i1] * k + anIntArray1538[i1] * l >> 16;
                anIntArray1537[i1] = j1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12713, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void translate(int x, int amount, int y) {
		for (int index = 0; index < anInt1535; index++) {
			anIntArray1536[index] += amount;
			anIntArray1537[index] += x;
			anIntArray1538[index] += y;
		}
    }

    /**
     * Replaces the original colors with the given modified color
     * 
     * @param original
     * @param modified
     */
	public void recolor(int original, int modified) {
		for (int index = 0; index < colors; index++) {
			if (palette[index] == original) {
				palette[index] = modified;
			}
		}
	}

    public void method521(int i)
    {
        try
        {
            for(int j = 0; j < anInt1535; j++)
            {
                anIntArray1538[j] = -anIntArray1538[j];
            }
            for(int k = 0; k < colors; k++)
            {
                int l = anIntArray1540[k];
                anIntArray1540[k] = anIntArray1542[k];
                anIntArray1542[k] = l;
            }
            if(i < 6 || i > 6)
            {
                aBoolean1528 = !aBoolean1528;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("2770, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void scale(int i, int j, int k, byte byte0)
    {
        try
        {
            if(byte0 != 31)
            {
                anInt1523 = 170;
            }
            for(int l = 0; l < anInt1535; l++)
            {
                anIntArray1536[l] = (anIntArray1536[l] * i) / 128;
                anIntArray1537[l] = (anIntArray1537[l] * k) / 128;
                anIntArray1538[l] = (anIntArray1538[l] * j) / 128;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("76171, " + i + ", " + j + ", " + k + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void applyLighting(int i, int j, int k, int l, int i1, boolean flag)
    {
        int j1 = (int)Math.sqrt(k * k + l * l + i1 * i1);
        int k1 = j * j1 >> 8;
        if(anIntArray1543 == null)
        {
            anIntArray1543 = new int[colors];
            anIntArray1544 = new int[colors];
            anIntArray1545 = new int[colors];
        }
        if(super.aClass25Array1411 == null)
        {
            super.aClass25Array1411 = new Class25[anInt1535];
            for(int l1 = 0; l1 < anInt1535; l1++)
            {
                super.aClass25Array1411[l1] = new Class25();
            }
        }
        for(int i2 = 0; i2 < colors; i2++)
        {
            int j2 = anIntArray1540[i2];
            int l2 = anIntArray1541[i2];
            int i3 = anIntArray1542[i2];
            int j3 = anIntArray1536[l2] - anIntArray1536[j2];
            int k3 = anIntArray1537[l2] - anIntArray1537[j2];
            int l3 = anIntArray1538[l2] - anIntArray1538[j2];
            int i4 = anIntArray1536[i3] - anIntArray1536[j2];
            int j4 = anIntArray1537[i3] - anIntArray1537[j2];
            int k4 = anIntArray1538[i3] - anIntArray1538[j2];
            int l4 = k3 * k4 - j4 * l3;
            int i5 = l3 * i4 - k4 * j3;
            int j5;
            for(j5 = j3 * j4 - i4 * k3; l4 > 8192 || i5 > 8192 || j5 > 8192 || l4 < -8192 || i5 < -8192 || j5 < -8192; j5 >>= 1)
            {
                l4 >>= 1;
                i5 >>= 1;
            }
            int k5 = (int)Math.sqrt(l4 * l4 + i5 * i5 + j5 * j5);
            if(k5 <= 0)
            {
                k5 = 1;
            }
            l4 = (l4 * 256) / k5;
            i5 = (i5 * 256) / k5;
            j5 = (j5 * 256) / k5;
            if(anIntArray1546 == null || (anIntArray1546[i2] & 1) == 0)
            {
                Class25 class25_2 = super.aClass25Array1411[j2];
                class25_2.anInt500 += l4;
                class25_2.anInt501 += i5;
                class25_2.anInt502 += j5;
                class25_2.anInt503++;
                class25_2 = super.aClass25Array1411[l2];
                class25_2.anInt500 += l4;
                class25_2.anInt501 += i5;
                class25_2.anInt502 += j5;
                class25_2.anInt503++;
                class25_2 = super.aClass25Array1411[i3];
                class25_2.anInt500 += l4;
                class25_2.anInt501 += i5;
                class25_2.anInt502 += j5;
                class25_2.anInt503++;
            } else
            {
                int l5 = i + (k * l4 + l * i5 + i1 * j5) / (k1 + k1 / 2);
                anIntArray1543[i2] = method525(palette[i2], l5, anIntArray1546[i2]);
            }
        }
        if(flag)
        {
            method524(i, k1, k, l, i1);
        } else
        {
            aClass25Array1569 = new Class25[anInt1535];
            for(int k2 = 0; k2 < anInt1535; k2++)
            {
                Class25 class25 = super.aClass25Array1411[k2];
                Class25 class25_1 = aClass25Array1569[k2] = new Class25();
                class25_1.anInt500 = class25.anInt500;
                class25_1.anInt501 = class25.anInt501;
                class25_1.anInt502 = class25.anInt502;
                class25_1.anInt503 = class25.anInt503;
            }
        }
        if(flag)
        {
            method510();
            return;
        } else
        {
            method512(7);
            return;
        }
    }

    public void method524(int i, int j, int k, int l, int i1)
    {
        for(int j1 = 0; j1 < colors; j1++)
        {
            int k1 = anIntArray1540[j1];
            int i2 = anIntArray1541[j1];
            int j2 = anIntArray1542[j1];
            if(anIntArray1546 == null)
            {
                int i3 = palette[j1];
                Class25 class25 = super.aClass25Array1411[k1];
                int k2 = i + (k * class25.anInt500 + l * class25.anInt501 + i1 * class25.anInt502) / (j * class25.anInt503);
                anIntArray1543[j1] = method525(i3, k2, 0);
                class25 = super.aClass25Array1411[i2];
                k2 = i + (k * class25.anInt500 + l * class25.anInt501 + i1 * class25.anInt502) / (j * class25.anInt503);
                anIntArray1544[j1] = method525(i3, k2, 0);
                class25 = super.aClass25Array1411[j2];
                k2 = i + (k * class25.anInt500 + l * class25.anInt501 + i1 * class25.anInt502) / (j * class25.anInt503);
                anIntArray1545[j1] = method525(i3, k2, 0);
            } else
            if((anIntArray1546[j1] & 1) == 0)
            {
                int j3 = palette[j1];
                int k3 = anIntArray1546[j1];
                Class25 class25_1 = super.aClass25Array1411[k1];
                int l2 = i + (k * class25_1.anInt500 + l * class25_1.anInt501 + i1 * class25_1.anInt502) / (j * class25_1.anInt503);
                anIntArray1543[j1] = method525(j3, l2, k3);
                class25_1 = super.aClass25Array1411[i2];
                l2 = i + (k * class25_1.anInt500 + l * class25_1.anInt501 + i1 * class25_1.anInt502) / (j * class25_1.anInt503);
                anIntArray1544[j1] = method525(j3, l2, k3);
                class25_1 = super.aClass25Array1411[j2];
                l2 = i + (k * class25_1.anInt500 + l * class25_1.anInt501 + i1 * class25_1.anInt502) / (j * class25_1.anInt503);
                anIntArray1545[j1] = method525(j3, l2, k3);
            }
        }
        super.aClass25Array1411 = null;
        aClass25Array1569 = null;
        anIntArray1564 = null;
        anIntArray1565 = null;
        if(anIntArray1546 != null)
        {
            for(int l1 = 0; l1 < colors; l1++)
            {
                if((anIntArray1546[l1] & 2) == 2)
                {
                    return;
                }
            }
        }
        palette = null;
    }

    public static int method525(int i, int j, int k)
    {
        if((k & 2) == 2)
        {
            if(j < 0)
            {
                j = 0;
            } else
            if(j > 127)
            {
                j = 127;
            }
            j = 127 - j;
            return j;
        }
        j = j * (i & 0x7f) >> 7;
        if(j < 2)
        {
            j = 2;
        } else
        if(j > 126)
        {
            j = 126;
        }
        return (i & 0xff80) + j;
    }

    public void method526(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = Rasterizer.anInt1423;
        int i2 = Rasterizer.anInt1424;
        int j2 = anIntArray1598[i];
        int k2 = anIntArray1599[i];
        int l2 = anIntArray1598[j];
        int i3 = anIntArray1599[j];
        int j3 = anIntArray1598[k];
        int k3 = anIntArray1599[k];
        int l3 = anIntArray1598[l];
        int i4 = anIntArray1599[l];
        int j4 = j1 * l3 + k1 * i4 >> 16;
        for(int k4 = 0; k4 < anInt1535; k4++)
        {
            int l4 = anIntArray1536[k4];
            int i5 = anIntArray1537[k4];
            int j5 = anIntArray1538[k4];
            if(k != 0)
            {
                int k5 = i5 * j3 + l4 * k3 >> 16;
                i5 = i5 * k3 - l4 * j3 >> 16;
                l4 = k5;
            }
            if(i != 0)
            {
                int l5 = i5 * k2 - j5 * j2 >> 16;
                j5 = i5 * j2 + j5 * k2 >> 16;
                i5 = l5;
            }
            if(j != 0)
            {
                int i6 = j5 * l2 + l4 * i3 >> 16;
                j5 = j5 * i3 - l4 * l2 >> 16;
                l4 = i6;
            }
            l4 += i1;
            i5 += j1;
            j5 += k1;
            int j6 = i5 * i4 - j5 * l3 >> 16;
            j5 = i5 * l3 + j5 * i4 >> 16;
            i5 = j6;
            anIntArray1576[k4] = j5 - j4;
            anIntArray1574[k4] = l1 + (l4 << 9) / j5;
            anIntArray1575[k4] = i2 + (i5 << 9) / j5;
            if(anInt1551 > 0)
            {
                anIntArray1577[k4] = l4;
                anIntArray1578[k4] = i5;
                anIntArray1579[k4] = j5;
            }
        }
        try
        {
            method527(false, false, 0);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method498(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1, int i2)
    {
        int j2 = l1 * i1 - j1 * l >> 16;
        int k2 = k1 * j + j2 * k >> 16;
        int l2 = anInt1559 * k >> 16;
        int i3 = k2 + l2;
        if(i3 <= 50 || k2 >= 3500)
        {
            return;
        }
        int j3 = l1 * l + j1 * i1 >> 16;
        int k3 = j3 - anInt1559 << 9;
        if(k3 / i3 >= DrawingArea.anInt1377)
        {
            return;
        }
        int l3 = j3 + anInt1559 << 9;
        if(l3 / i3 <= -DrawingArea.anInt1377)
        {
            return;
        }
        int i4 = k1 * k - j2 * j >> 16;
        int j4 = anInt1559 * j >> 16;
        int k4 = i4 + j4 << 9;
        if(k4 / i3 <= -DrawingArea.anInt1378)
        {
            return;
        }
        int l4 = j4 + (super.anInt1412 * k >> 16);
        int i5 = i4 - l4 << 9;
        if(i5 / i3 >= DrawingArea.anInt1378)
        {
            return;
        }
        int j5 = l2 + (super.anInt1412 * j >> 16);
        boolean flag = false;
        if(k2 - j5 <= 50)
        {
            flag = true;
        }
        boolean flag1 = false;
        if(i2 > 0 && aBoolean1593)
        {
            int k5 = k2 - l2;
            if(k5 <= 50)
            {
                k5 = 50;
            }
            if(j3 > 0)
            {
                k3 /= i3;
                l3 /= k5;
            } else
            {
                l3 /= i3;
                k3 /= k5;
            }
            if(i4 > 0)
            {
                i5 /= i3;
                k4 /= k5;
            } else
            {
                k4 /= i3;
                i5 /= k5;
            }
            int i6 = anInt1594 - Rasterizer.anInt1423;
            int k6 = anInt1595 - Rasterizer.anInt1424;
            if(i6 > k3 && i6 < l3 && k6 > i5 && k6 < k4)
            {
                if(single_tile)
                {
                    anIntArray1597[anInt1596++] = i2;
                } else
                {
                    flag1 = true;
                }
            }
        }
        int l5 = Rasterizer.anInt1423;
        int j6 = Rasterizer.anInt1424;
        int l6 = 0;
        int i7 = 0;
        if(i != 0)
        {
            l6 = anIntArray1598[i];
            i7 = anIntArray1599[i];
        }
        for(int j7 = 0; j7 < anInt1535; j7++)
        {
            int k7 = anIntArray1536[j7];
            int l7 = anIntArray1537[j7];
            int i8 = anIntArray1538[j7];
            if(i != 0)
            {
                int j8 = i8 * l6 + k7 * i7 >> 16;
                i8 = i8 * i7 - k7 * l6 >> 16;
                k7 = j8;
            }
            k7 += j1;
            l7 += k1;
            i8 += l1;
            int k8 = i8 * l + k7 * i1 >> 16;
            i8 = i8 * i1 - k7 * l >> 16;
            k7 = k8;
            k8 = l7 * k - i8 * j >> 16;
            i8 = l7 * j + i8 * k >> 16;
            l7 = k8;
            anIntArray1576[j7] = i8 - k2;
            if(i8 >= 50)
            {
                anIntArray1574[j7] = l5 + (k7 << 9) / i8;
                anIntArray1575[j7] = j6 + (l7 << 9) / i8;
            } else
            {
                anIntArray1574[j7] = -5000;
                flag = true;
            }
            if(flag || anInt1551 > 0)
            {
                anIntArray1577[j7] = k7;
                anIntArray1578[j7] = l7;
                anIntArray1579[j7] = i8;
            }
        }
        try
        {
            method527(flag, flag1, i2);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method527(boolean flag, boolean flag1, int i)
    {
        for(int j = 0; j < anInt1561; j++)
        {
            anIntArray1580[j] = 0;
        }
        for(int k = 0; k < colors; k++)
        {
            if(anIntArray1546 == null || anIntArray1546[k] != -1)
            {
                int l = anIntArray1540[k];
                int k1 = anIntArray1541[k];
                int j2 = anIntArray1542[k];
                int i3 = anIntArray1574[l];
                int l3 = anIntArray1574[k1];
                int k4 = anIntArray1574[j2];
                if(flag && (i3 == -5000 || l3 == -5000 || k4 == -5000))
                {
                    aBooleanArray1573[k] = true;
                    int j5 = (anIntArray1576[l] + anIntArray1576[k1] + anIntArray1576[j2]) / 3 + anInt1562;
                    anIntArrayArray1581[j5][anIntArray1580[j5]++] = k;
                } else
                {
                    if(flag1 && method530(anInt1594, anInt1595, anIntArray1575[l], anIntArray1575[k1], anIntArray1575[j2], i3, l3, k4))
                    {
                        anIntArray1597[anInt1596++] = i;
                        flag1 = false;
                    }
                    if((i3 - l3) * (anIntArray1575[j2] - anIntArray1575[k1]) - (anIntArray1575[l] - anIntArray1575[k1]) * (k4 - l3) > 0)
                    {
                        aBooleanArray1573[k] = false;
                        if(i3 < 0 || l3 < 0 || k4 < 0 || i3 > DrawingArea.anInt1376 || l3 > DrawingArea.anInt1376 || k4 > DrawingArea.anInt1376)
                        {
                            aBooleanArray1572[k] = true;
                        } else
                        {
                            aBooleanArray1572[k] = false;
                        }
                        int k5 = (anIntArray1576[l] + anIntArray1576[k1] + anIntArray1576[j2]) / 3 + anInt1562;
                        anIntArrayArray1581[k5][anIntArray1580[k5]++] = k;
                    }
                }
            }
        }
        if(anIntArray1547 == null)
        {
            for(int i1 = anInt1561 - 1; i1 >= 0; i1--)
            {
                int l1 = anIntArray1580[i1];
                if(l1 > 0)
                {
                    int ai[] = anIntArrayArray1581[i1];
                    for(int j3 = 0; j3 < l1; j3++)
                    {
                        method528(ai[j3]);
                    }
                }
            }
            return;
        }
        for(int j1 = 0; j1 < 12; j1++)
        {
            anIntArray1582[j1] = 0;
            anIntArray1586[j1] = 0;
        }
        for(int i2 = anInt1561 - 1; i2 >= 0; i2--)
        {
            int k2 = anIntArray1580[i2];
            if(k2 > 0)
            {
                int ai1[] = anIntArrayArray1581[i2];
                for(int i4 = 0; i4 < k2; i4++)
                {
                    int l4 = ai1[i4];
                    int l5 = anIntArray1547[l4];
                    int j6 = anIntArray1582[l5]++;
                    anIntArrayArray1583[l5][j6] = l4;
                    if(l5 < 10)
                    {
                        anIntArray1586[l5] += i2;
                    } else
                    if(l5 == 10)
                    {
                        anIntArray1584[j6] = i2;
                    } else
                    {
                        anIntArray1585[j6] = i2;
                    }
                }
            }
        }
        int l2 = 0;
        if(anIntArray1582[1] > 0 || anIntArray1582[2] > 0)
        {
            l2 = (anIntArray1586[1] + anIntArray1586[2]) / (anIntArray1582[1] + anIntArray1582[2]);
        }
        int k3 = 0;
        if(anIntArray1582[3] > 0 || anIntArray1582[4] > 0)
        {
            k3 = (anIntArray1586[3] + anIntArray1586[4]) / (anIntArray1582[3] + anIntArray1582[4]);
        }
        int j4 = 0;
        if(anIntArray1582[6] > 0 || anIntArray1582[8] > 0)
        {
            j4 = (anIntArray1586[6] + anIntArray1586[8]) / (anIntArray1582[6] + anIntArray1582[8]);
        }
        int i6 = 0;
        int k6 = anIntArray1582[10];
        int ai2[] = anIntArrayArray1583[10];
        int ai3[] = anIntArray1584;
        if(i6 == k6)
        {
            i6 = 0;
            k6 = anIntArray1582[11];
            ai2 = anIntArrayArray1583[11];
            ai3 = anIntArray1585;
        }
        int i5;
        if(i6 < k6)
        {
            i5 = ai3[i6];
        } else
        {
            i5 = -1000;
        }
        for(int l6 = 0; l6 < 10; l6++)
        {
            while(l6 == 0 && i5 > l2)
            {
                method528(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1583[11])
                {
                    i6 = 0;
                    k6 = anIntArray1582[11];
                    ai2 = anIntArrayArray1583[11];
                    ai3 = anIntArray1585;
                }
                if(i6 < k6)
                {
                    i5 = ai3[i6];
                } else
                {
                    i5 = -1000;
                }
            }
            while(l6 == 3 && i5 > k3)
            {
                method528(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1583[11])
                {
                    i6 = 0;
                    k6 = anIntArray1582[11];
                    ai2 = anIntArrayArray1583[11];
                    ai3 = anIntArray1585;
                }
                if(i6 < k6)
                {
                    i5 = ai3[i6];
                } else
                {
                    i5 = -1000;
                }
            }
            while(l6 == 5 && i5 > j4)
            {
                method528(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1583[11])
                {
                    i6 = 0;
                    k6 = anIntArray1582[11];
                    ai2 = anIntArrayArray1583[11];
                    ai3 = anIntArray1585;
                }
                if(i6 < k6)
                {
                    i5 = ai3[i6];
                } else
                {
                    i5 = -1000;
                }
            }
            int i7 = anIntArray1582[l6];
            int ai4[] = anIntArrayArray1583[l6];
            for(int j7 = 0; j7 < i7; j7++)
            {
                method528(ai4[j7]);
            }
        }
        while(i5 != -1000)
        {
            method528(ai2[i6++]);
            if(i6 == k6 && ai2 != anIntArrayArray1583[11])
            {
                i6 = 0;
                ai2 = anIntArrayArray1583[11];
                k6 = anIntArray1582[11];
                ai3 = anIntArray1585;
            }
            if(i6 < k6)
            {
                i5 = ai3[i6];
            } else
            {
                i5 = -1000;
            }
        }
    }

    public void method528(int i)
    {
        if(aBooleanArray1573[i])
        {
            method529(i);
            return;
        }
        int j = anIntArray1540[i];
        int k = anIntArray1541[i];
        int l = anIntArray1542[i];
        Rasterizer.aBoolean1419 = aBooleanArray1572[i];
        if(anIntArray1548 == null)
        {
            Rasterizer.anInt1422 = 0;
        } else
        {
            Rasterizer.anInt1422 = anIntArray1548[i];
        }
        int i1;
        if(anIntArray1546 == null)
        {
            i1 = 0;
        } else
        {
            i1 = anIntArray1546[i] & 3;
        }
        if(i1 == 0)
        {
            Rasterizer.method429(anIntArray1575[j], anIntArray1575[k], anIntArray1575[l], anIntArray1574[j], anIntArray1574[k], anIntArray1574[l], anIntArray1543[i], anIntArray1544[i], anIntArray1545[i]);
            return;
        }
        if(i1 == 1)
        {
            Rasterizer.method431(anIntArray1575[j], anIntArray1575[k], anIntArray1575[l], anIntArray1574[j], anIntArray1574[k], anIntArray1574[l], anIntArray1600[anIntArray1543[i]]);
            return;
        }
        if(i1 == 2)
        {
            int j1 = anIntArray1546[i] >> 2;
            int l1 = anIntArray1552[j1];
            int j2 = anIntArray1553[j1];
            int l2 = anIntArray1554[j1];
            Rasterizer.method433(anIntArray1575[j], anIntArray1575[k], anIntArray1575[l], anIntArray1574[j], anIntArray1574[k], anIntArray1574[l], anIntArray1543[i], anIntArray1544[i], anIntArray1545[i], anIntArray1577[l1], anIntArray1577[j2], anIntArray1577[l2], anIntArray1578[l1], anIntArray1578[j2], anIntArray1578[l2], anIntArray1579[l1], anIntArray1579[j2], anIntArray1579[l2], palette[i]);
            return;
        }
        if(i1 == 3)
        {
            int k1 = anIntArray1546[i] >> 2;
            int i2 = anIntArray1552[k1];
            int k2 = anIntArray1553[k1];
            int i3 = anIntArray1554[k1];
            Rasterizer.method433(anIntArray1575[j], anIntArray1575[k], anIntArray1575[l], anIntArray1574[j], anIntArray1574[k], anIntArray1574[l], anIntArray1543[i], anIntArray1543[i], anIntArray1543[i], anIntArray1577[i2], anIntArray1577[k2], anIntArray1577[i3], anIntArray1578[i2], anIntArray1578[k2], anIntArray1578[i3], anIntArray1579[i2], anIntArray1579[k2], anIntArray1579[i3], palette[i]);
        }
    }

    public void method529(int i)
    {
        int j = Rasterizer.anInt1423;
        int k = Rasterizer.anInt1424;
        int l = 0;
        int i1 = anIntArray1540[i];
        int j1 = anIntArray1541[i];
        int k1 = anIntArray1542[i];
        int l1 = anIntArray1579[i1];
        int i2 = anIntArray1579[j1];
        int j2 = anIntArray1579[k1];
        if(l1 >= 50)
        {
            anIntArray1587[l] = anIntArray1574[i1];
            anIntArray1588[l] = anIntArray1575[i1];
            anIntArray1589[l++] = anIntArray1543[i];
        } else
        {
            int k2 = anIntArray1577[i1];
            int k3 = anIntArray1578[i1];
            int k4 = anIntArray1543[i];
            if(j2 >= 50)
            {
                int k5 = (50 - l1) * anIntArray1601[j2 - l1];
                anIntArray1587[l] = j + (k2 + ((anIntArray1577[k1] - k2) * k5 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (k3 + ((anIntArray1578[k1] - k3) * k5 >> 16) << 9) / 50;
                anIntArray1589[l++] = k4 + ((anIntArray1545[i] - k4) * k5 >> 16);
            }
            if(i2 >= 50)
            {
                int l5 = (50 - l1) * anIntArray1601[i2 - l1];
                anIntArray1587[l] = j + (k2 + ((anIntArray1577[j1] - k2) * l5 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (k3 + ((anIntArray1578[j1] - k3) * l5 >> 16) << 9) / 50;
                anIntArray1589[l++] = k4 + ((anIntArray1544[i] - k4) * l5 >> 16);
            }
        }
        if(i2 >= 50)
        {
            anIntArray1587[l] = anIntArray1574[j1];
            anIntArray1588[l] = anIntArray1575[j1];
            anIntArray1589[l++] = anIntArray1544[i];
        } else
        {
            int l2 = anIntArray1577[j1];
            int l3 = anIntArray1578[j1];
            int l4 = anIntArray1544[i];
            if(l1 >= 50)
            {
                int i6 = (50 - i2) * anIntArray1601[l1 - i2];
                anIntArray1587[l] = j + (l2 + ((anIntArray1577[i1] - l2) * i6 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (l3 + ((anIntArray1578[i1] - l3) * i6 >> 16) << 9) / 50;
                anIntArray1589[l++] = l4 + ((anIntArray1543[i] - l4) * i6 >> 16);
            }
            if(j2 >= 50)
            {
                int j6 = (50 - i2) * anIntArray1601[j2 - i2];
                anIntArray1587[l] = j + (l2 + ((anIntArray1577[k1] - l2) * j6 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (l3 + ((anIntArray1578[k1] - l3) * j6 >> 16) << 9) / 50;
                anIntArray1589[l++] = l4 + ((anIntArray1545[i] - l4) * j6 >> 16);
            }
        }
        if(j2 >= 50)
        {
            anIntArray1587[l] = anIntArray1574[k1];
            anIntArray1588[l] = anIntArray1575[k1];
            anIntArray1589[l++] = anIntArray1545[i];
        } else
        {
            int i3 = anIntArray1577[k1];
            int i4 = anIntArray1578[k1];
            int i5 = anIntArray1545[i];
            if(i2 >= 50)
            {
                int k6 = (50 - j2) * anIntArray1601[i2 - j2];
                anIntArray1587[l] = j + (i3 + ((anIntArray1577[j1] - i3) * k6 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (i4 + ((anIntArray1578[j1] - i4) * k6 >> 16) << 9) / 50;
                anIntArray1589[l++] = i5 + ((anIntArray1544[i] - i5) * k6 >> 16);
            }
            if(l1 >= 50)
            {
                int l6 = (50 - j2) * anIntArray1601[l1 - j2];
                anIntArray1587[l] = j + (i3 + ((anIntArray1577[i1] - i3) * l6 >> 16) << 9) / 50;
                anIntArray1588[l] = k + (i4 + ((anIntArray1578[i1] - i4) * l6 >> 16) << 9) / 50;
                anIntArray1589[l++] = i5 + ((anIntArray1543[i] - i5) * l6 >> 16);
            }
        }
        int j3 = anIntArray1587[0];
        int j4 = anIntArray1587[1];
        int j5 = anIntArray1587[2];
        int i7 = anIntArray1588[0];
        int j7 = anIntArray1588[1];
        int k7 = anIntArray1588[2];
        if((j3 - j4) * (k7 - j7) - (i7 - j7) * (j5 - j4) > 0)
        {
            Rasterizer.aBoolean1419 = false;
            if(l == 3)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > DrawingArea.anInt1376 || j4 > DrawingArea.anInt1376 || j5 > DrawingArea.anInt1376)
                {
                    Rasterizer.aBoolean1419 = true;
                }
                int l7;
                if(anIntArray1546 == null)
                {
                    l7 = 0;
                } else
                {
                    l7 = anIntArray1546[i] & 3;
                }
                if(l7 == 0)
                {
                    Rasterizer.method429(i7, j7, k7, j3, j4, j5, anIntArray1589[0], anIntArray1589[1], anIntArray1589[2]);
                } else
                if(l7 == 1)
                {
                    Rasterizer.method431(i7, j7, k7, j3, j4, j5, anIntArray1600[anIntArray1543[i]]);
                } else
                if(l7 == 2)
                {
                    int j8 = anIntArray1546[i] >> 2;
                    int k9 = anIntArray1552[j8];
                    int k10 = anIntArray1553[j8];
                    int k11 = anIntArray1554[j8];
                    Rasterizer.method433(i7, j7, k7, j3, j4, j5, anIntArray1589[0], anIntArray1589[1], anIntArray1589[2], anIntArray1577[k9], anIntArray1577[k10], anIntArray1577[k11], anIntArray1578[k9], anIntArray1578[k10], anIntArray1578[k11], anIntArray1579[k9], anIntArray1579[k10], anIntArray1579[k11], palette[i]);
                } else
                if(l7 == 3)
                {
                    int k8 = anIntArray1546[i] >> 2;
                    int l9 = anIntArray1552[k8];
                    int l10 = anIntArray1553[k8];
                    int l11 = anIntArray1554[k8];
                    Rasterizer.method433(i7, j7, k7, j3, j4, j5, anIntArray1543[i], anIntArray1543[i], anIntArray1543[i], anIntArray1577[l9], anIntArray1577[l10], anIntArray1577[l11], anIntArray1578[l9], anIntArray1578[l10], anIntArray1578[l11], anIntArray1579[l9], anIntArray1579[l10], anIntArray1579[l11], palette[i]);
                }
            }
            if(l == 4)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > DrawingArea.anInt1376 || j4 > DrawingArea.anInt1376 || j5 > DrawingArea.anInt1376 || anIntArray1587[3] < 0 || anIntArray1587[3] > DrawingArea.anInt1376)
                {
                    Rasterizer.aBoolean1419 = true;
                }
                int i8;
                if(anIntArray1546 == null)
                {
                    i8 = 0;
                } else
                {
                    i8 = anIntArray1546[i] & 3;
                }
                if(i8 == 0)
                {
                    Rasterizer.method429(i7, j7, k7, j3, j4, j5, anIntArray1589[0], anIntArray1589[1], anIntArray1589[2]);
                    Rasterizer.method429(i7, k7, anIntArray1588[3], j3, j5, anIntArray1587[3], anIntArray1589[0], anIntArray1589[2], anIntArray1589[3]);
                    return;
                }
                if(i8 == 1)
                {
                    int l8 = anIntArray1600[anIntArray1543[i]];
                    Rasterizer.method431(i7, j7, k7, j3, j4, j5, l8);
                    Rasterizer.method431(i7, k7, anIntArray1588[3], j3, j5, anIntArray1587[3], l8);
                    return;
                }
                if(i8 == 2)
                {
                    int i9 = anIntArray1546[i] >> 2;
                    int i10 = anIntArray1552[i9];
                    int i11 = anIntArray1553[i9];
                    int i12 = anIntArray1554[i9];
                    Rasterizer.method433(i7, j7, k7, j3, j4, j5, anIntArray1589[0], anIntArray1589[1], anIntArray1589[2], anIntArray1577[i10], anIntArray1577[i11], anIntArray1577[i12], anIntArray1578[i10], anIntArray1578[i11], anIntArray1578[i12], anIntArray1579[i10], anIntArray1579[i11], anIntArray1579[i12], palette[i]);
                    Rasterizer.method433(i7, k7, anIntArray1588[3], j3, j5, anIntArray1587[3], anIntArray1589[0], anIntArray1589[2], anIntArray1589[3], anIntArray1577[i10], anIntArray1577[i11], anIntArray1577[i12], anIntArray1578[i10], anIntArray1578[i11], anIntArray1578[i12], anIntArray1579[i10], anIntArray1579[i11], anIntArray1579[i12], palette[i]);
                    return;
                }
                if(i8 == 3)
                {
                    int j9 = anIntArray1546[i] >> 2;
                    int j10 = anIntArray1552[j9];
                    int j11 = anIntArray1553[j9];
                    int j12 = anIntArray1554[j9];
                    Rasterizer.method433(i7, j7, k7, j3, j4, j5, anIntArray1543[i], anIntArray1543[i], anIntArray1543[i], anIntArray1577[j10], anIntArray1577[j11], anIntArray1577[j12], anIntArray1578[j10], anIntArray1578[j11], anIntArray1578[j12], anIntArray1579[j10], anIntArray1579[j11], anIntArray1579[j12], palette[i]);
                    Rasterizer.method433(i7, k7, anIntArray1588[3], j3, j5, anIntArray1587[3], anIntArray1543[i], anIntArray1543[i], anIntArray1543[i], anIntArray1577[j10], anIntArray1577[j11], anIntArray1577[j12], anIntArray1578[j10], anIntArray1578[j11], anIntArray1578[j12], anIntArray1579[j10], anIntArray1579[j11], anIntArray1579[j12], palette[i]);
                }
            }
        }
    }

    public boolean method530(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1)
    {
        if(j < k && j < l && j < i1)
        {
            return false;
        }
        if(j > k && j > l && j > i1)
        {
            return false;
        }
        if(i < j1 && i < k1 && i < l1)
        {
            return false;
        }
        return i <= j1 || i <= k1 || i <= l1;
    }

    static
    {
        anIntArray1598 = Rasterizer.anIntArray1427;
        anIntArray1599 = Rasterizer.anIntArray1428;
        anIntArray1600 = Rasterizer.anIntArray1439;
        anIntArray1601 = Rasterizer.anIntArray1426;
    }
}
