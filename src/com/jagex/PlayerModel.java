package com.jagex;
import sign.signlink;

public class PlayerModel extends RenderingHints
{

    public int anInt1670;
    public boolean aBoolean1671;
    public String username;
    public boolean aBoolean1673;
    public int gender;
    public int head_icon;
    public int anIntArray1676[];
    public int anIntArray1677[];
    public int combat_level;
    public int gamesroom_skill;
    public long aLong1680;
    public int anInt1681;
    public int anInt1682;
    public int anInt1683;
    public int anInt1684;
    public int anInt1685;
    public int anInt1686;
    public Model aClass44_Sub3_Sub4_Sub4_1687;
    public int anInt1688;
    public int anInt1689;
    public int anInt1690;
    public int anInt1691;
    public boolean aBoolean1692;
    public long aLong1693;
    public NPCDefinition mob_definition;
    public int anInt1695;
    public static LinkedList aClass39_1696 = new LinkedList(260);

    public void render(boolean flag, Buffer buffer)
    {
        try
        {
            if(flag)
            {
                aBoolean1671 = !aBoolean1671;
            }
            buffer.pointer = 0;
            gender = buffer.getUnsignedByte();
            head_icon = buffer.getUnsignedByte();
            mob_definition = null;
            anInt1695 = 0;
            for(int i = 0; i < 12; i++)
            {
                int j = buffer.getUnsignedByte();
                if(j == 0)
                {
                    anIntArray1676[i] = 0;
                    continue;
                }
                int npc_flag = buffer.getUnsignedByte();
                anIntArray1676[i] = (j << 8) + npc_flag;
                if(i == 0 && anIntArray1676[0] == 65535)
                {
                    mob_definition = NPCDefinition.forId(buffer.getUnsignedShort());
                    break;
                }
                if(anIntArray1676[i] >= 512 && anIntArray1676[i] - 512 < ItemDefinition.count)
                {
                    int k1 = ItemDefinition.get(anIntArray1676[i] - 512).team;
                    if(k1 != 0)
                    {
                        anInt1695 = k1;
                    }
                }
            }
            for(int k = 0; k < 5; k++)
            {
                int i1 = buffer.getUnsignedByte();
                if(i1 < 0 || i1 >= client.anIntArrayArray1073[k].length)
                {
                    i1 = 0;
                }
                anIntArray1677[k] = i1;
            }
            super.idle_animation = buffer.getUnsignedShort();
            if(super.idle_animation == 65535)
            {
                super.idle_animation = -1;
            }
            super.anInt1621 = buffer.getUnsignedShort();
            if(super.anInt1621 == 65535)
            {
                super.anInt1621 = -1;
            }
            super.walk_animation = buffer.getUnsignedShort();
            if(super.walk_animation == 65535)
            {
                super.walk_animation = -1;
            }
            super.rotate_animation = buffer.getUnsignedShort();
            if(super.rotate_animation == 65535)
            {
                super.rotate_animation = -1;
            }
            super.counter_clockwise_animation = buffer.getUnsignedShort();
            if(super.counter_clockwise_animation == 65535)
            {
                super.counter_clockwise_animation = -1;
            }
            super.clockwise_animation = buffer.getUnsignedShort();
            if(super.clockwise_animation == 65535)
            {
                super.clockwise_animation = -1;
            }
            super.anInt1626 = buffer.getUnsignedShort();
            if(super.anInt1626 == 65535)
            {
                super.anInt1626 = -1;
            }
            username = StringUtil.format(StringUtil.from_hash(buffer.getLong(), true), true);
            combat_level = buffer.getUnsignedByte();
            gamesroom_skill = buffer.getUnsignedShort();
            aBoolean1673 = true;
            aLong1680 = 0L;
            for(int j1 = 0; j1 < 12; j1++)
            {
                aLong1680 <<= 4;
                if(anIntArray1676[j1] >= 256)
                {
                    aLong1680 += anIntArray1676[j1] - 256;
                }
            }
            if(anIntArray1676[0] >= 256)
            {
                aLong1680 += anIntArray1676[0] - 256 >> 4;
            }
            if(anIntArray1676[1] >= 256)
            {
                aLong1680 += anIntArray1676[1] - 256 >> 8;
            }
            for(int l1 = 0; l1 < 5; l1++)
            {
                aLong1680 <<= 3;
                aLong1680 += anIntArray1677[l1];
            }
            aLong1680 <<= 1;
            aLong1680 += gender;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
        	runtimeexception.printStackTrace();
            signlink.reporterror("26459, " + flag + ", " + buffer + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method499(int i)
    {
        try
        {
            if(!aBoolean1673)
            {
                return null;
            }
            Model class44_sub3_sub4_sub4 = method538(false);
            if(i != -37770)
            {
                throw new NullPointerException();
            }
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            super.anInt1661 = ((Class44_Sub3_Sub4) (class44_sub3_sub4_sub4)).anInt1412;
            class44_sub3_sub4_sub4.single_tile = true;
            if(aBoolean1692)
            {
                return class44_sub3_sub4_sub4;
            }
            if(super.spotanim_id != -1 && super.anInt1649 != -1)
            {
                Class32 class32 = Class32.aClass32Array559[super.spotanim_id];
                Model class44_sub3_sub4_sub4_2 = class32.method271();
                if(class44_sub3_sub4_sub4_2 != null)
                {
                    Model class44_sub3_sub4_sub4_3 = new Model(class44_sub3_sub4_sub4_2, AnimationFrame.invalid(super.anInt1649), false, anInt1670, true);
                    class44_sub3_sub4_sub4_3.translate(-super.spotanim_height, 0, 0);
                    class44_sub3_sub4_sub4_3.method513((byte)3);
                    class44_sub3_sub4_sub4_3.method514(class32.aClass26_563.frame_index[super.anInt1649], 188);
                    class44_sub3_sub4_sub4_3.anIntArrayArray1567 = null;
                    class44_sub3_sub4_sub4_3.anIntArrayArray1566 = null;
                    if(class32.anInt566 != 128 || class32.anInt567 != 128)
                    {
                        class44_sub3_sub4_sub4_3.scale(class32.anInt566, class32.anInt566, class32.anInt567, (byte)31);
                    }
                    class44_sub3_sub4_sub4_3.applyLighting(64 + class32.anInt569, 850 + class32.anInt570, -30, -50, -30, true);
                    Model aclass44_sub3_sub4_sub4_1[] = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_3
                    };
                    class44_sub3_sub4_sub4 = new Model(true, 0, aclass44_sub3_sub4_sub4_1, 2);
                }
            }
            if(aClass44_Sub3_Sub4_Sub4_1687 != null)
            {
                if(client.anInt1240 >= anInt1683)
                {
                    aClass44_Sub3_Sub4_Sub4_1687 = null;
                }
                if(client.anInt1240 >= anInt1682 && client.anInt1240 < anInt1683)
                {
                    Model class44_sub3_sub4_sub4_1 = aClass44_Sub3_Sub4_Sub4_1687;
                    class44_sub3_sub4_sub4_1.translate(anInt1685 - anInt1681, anInt1684 - super.anInt1615, anInt1686 - super.anInt1616);
                    if(super.anInt1662 == 512)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                    } else
                    if(super.anInt1662 == 1024)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                    } else
                    if(super.anInt1662 == 1536)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                    }
                    Model aclass44_sub3_sub4_sub4[] = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_1
                    };
                    class44_sub3_sub4_sub4 = new Model(true, 0, aclass44_sub3_sub4_sub4, 2);
                    if(super.anInt1662 == 512)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                    } else
                    if(super.anInt1662 == 1024)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                    } else
                    if(super.anInt1662 == 1536)
                    {
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                        class44_sub3_sub4_sub4_1.method517(0);
                    }
                    class44_sub3_sub4_sub4_1.translate(anInt1681 - anInt1685, super.anInt1615 - anInt1684, super.anInt1616 - anInt1686);
                }
            }
            class44_sub3_sub4_sub4.single_tile = true;
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("67533, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method538(boolean flag)
    {
        try
        {
            if(mob_definition != null)
            {
                int i = -1;
                if(super.animation_id >= 0 && super.animation_delay == 0)
                {
                    i = AnimationSequence.cache[super.animation_id].frame_index[super.anInt1644];
                } else
                if(super.anInt1640 >= 0)
                {
                    i = AnimationSequence.cache[super.anInt1640].frame_index[super.anInt1641];
                }
                Model class44_sub3_sub4_sub4 = mob_definition.method216(0, -1, i, null);
                return class44_sub3_sub4_sub4;
            }
            long l = aLong1680;
            int j = -1;
            int k = -1;
            int i1 = -1;
            int j1 = -1;
            if(super.animation_id >= 0 && super.animation_delay == 0)
            {
                AnimationSequence class26 = AnimationSequence.cache[super.animation_id];
                j = class26.frame_index[super.anInt1644];
                if(super.anInt1640 >= 0 && super.anInt1640 != super.idle_animation)
                {
                    k = AnimationSequence.cache[super.anInt1640].frame_index[super.anInt1641];
                }
                if(class26.playerReplacementShield >= 0)
                {
                    i1 = class26.playerReplacementShield;
                    l += i1 - anIntArray1676[5] << 40;
                }
                if(class26.playerReplacementWeapon >= 0)
                {
                    j1 = class26.playerReplacementWeapon;
                    l += j1 - anIntArray1676[3] << 48;
                }
            } else
            if(super.anInt1640 >= 0)
            {
                j = AnimationSequence.cache[super.anInt1640].frame_index[super.anInt1641];
            }
            Model class44_sub3_sub4_sub4_1 = (Model)aClass39_1696.get(l);
            if(flag)
            {
                aBoolean1671 = !aBoolean1671;
            }
            if(class44_sub3_sub4_sub4_1 == null)
            {
                boolean flag1 = false;
                for(int k1 = 0; k1 < 12; k1++)
                {
                    int i2 = anIntArray1676[k1];
                    if(j1 >= 0 && k1 == 3)
                    {
                        i2 = j1;
                    }
                    if(i1 >= 0 && k1 == 5)
                    {
                        i2 = i1;
                    }
                    if(i2 >= 256 && i2 < 512 && !Class22.aClass22Array464[i2 - 256].method249(9))
                    {
                        flag1 = true;
                    }
                    if(i2 >= 512 && !ItemDefinition.get(i2 - 512).isEquippedModelCached(gender))
                    {
                        flag1 = true;
                    }
                }
                if(flag1)
                {
                    if(aLong1693 != -1L)
                    {
                        class44_sub3_sub4_sub4_1 = (Model)aClass39_1696.get(aLong1693);
                    }
                    if(class44_sub3_sub4_sub4_1 == null)
                    {
                        return null;
                    }
                }
            }
            if(class44_sub3_sub4_sub4_1 == null)
            {
                Model aclass44_sub3_sub4_sub4[] = new Model[12];
                int l1 = 0;
                for(int j2 = 0; j2 < 12; j2++)
                {
                    int k2 = anIntArray1676[j2];
                    if(j1 >= 0 && j2 == 3)
                    {
                        k2 = j1;
                    }
                    if(i1 >= 0 && j2 == 5)
                    {
                        k2 = i1;
                    }
                    if(k2 >= 256 && k2 < 512)
                    {
                        Model class44_sub3_sub4_sub4_3 = Class22.aClass22Array464[k2 - 256].method250(0);
                        if(class44_sub3_sub4_sub4_3 != null)
                        {
                            aclass44_sub3_sub4_sub4[l1++] = class44_sub3_sub4_sub4_3;
                        }
                    }
                    if(k2 >= 512)
                    {
                        Model class44_sub3_sub4_sub4_4 = ItemDefinition.get(k2 - 512).getEquippedModel(gender);
                        if(class44_sub3_sub4_sub4_4 != null)
                        {
                            aclass44_sub3_sub4_sub4[l1++] = class44_sub3_sub4_sub4_4;
                        }
                    }
                }
                class44_sub3_sub4_sub4_1 = new Model(aclass44_sub3_sub4_sub4, l1);
                for(int l2 = 0; l2 < 5; l2++)
                {
                    if(anIntArray1677[l2] != 0)
                    {
                        class44_sub3_sub4_sub4_1.recolor(client.anIntArrayArray1073[l2][0], client.anIntArrayArray1073[l2][anIntArray1677[l2]]);
                        if(l2 == 1)
                        {
                            class44_sub3_sub4_sub4_1.recolor(client.anIntArray1043[0], client.anIntArray1043[anIntArray1677[l2]]);
                        }
                    }
                }
                class44_sub3_sub4_sub4_1.method513((byte)3);
                class44_sub3_sub4_sub4_1.applyLighting(64, 850, -30, -50, -30, true);
                aClass39_1696.put(l, class44_sub3_sub4_sub4_1);
                aLong1693 = l;
            }
            if(aBoolean1692)
            {
                return class44_sub3_sub4_sub4_1;
            }
            Model class44_sub3_sub4_sub4_2 = Model.aClass44_Sub3_Sub4_Sub4_1530;
            class44_sub3_sub4_sub4_2.method508(AnimationFrame.invalid(j) & AnimationFrame.invalid(k), class44_sub3_sub4_sub4_1, 0);
            if(j != -1 && k != -1)
            {
                class44_sub3_sub4_sub4_2.method515(j, true, k, AnimationSequence.cache[super.animation_id].flowControl);
            } else
            if(j != -1)
            {
                class44_sub3_sub4_sub4_2.method514(j, 188);
            }
            class44_sub3_sub4_sub4_2.method510();
            class44_sub3_sub4_sub4_2.anIntArrayArray1567 = null;
            class44_sub3_sub4_sub4_2.anIntArrayArray1566 = null;
            return class44_sub3_sub4_sub4_2;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33523, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method539(boolean flag)
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            if(!aBoolean1673)
            {
                return null;
            }
            if(mob_definition != null)
            {
                return mob_definition.method217();
            }
            boolean flag1 = false;
            for(int j = 0; j < 12; j++)
            {
                int k = anIntArray1676[j];
                if(k >= 256 && k < 512 && !Class22.aClass22Array464[k - 256].method251((byte)0))
                {
                    flag1 = true;
                }
                if(k >= 512 && !ItemDefinition.get(k - 512).isDialogueModelCached(gender))
                {
                    flag1 = true;
                }
            }
            if(flag1)
            {
                return null;
            }
            Model aclass44_sub3_sub4_sub4[] = new Model[12];
            int l = 0;
            for(int i1 = 0; i1 < 12; i1++)
            {
                int j1 = anIntArray1676[i1];
                if(j1 >= 256 && j1 < 512)
                {
                    Model class44_sub3_sub4_sub4_1 = Class22.aClass22Array464[j1 - 256].method252((byte)-45);
                    if(class44_sub3_sub4_sub4_1 != null)
                    {
                        aclass44_sub3_sub4_sub4[l++] = class44_sub3_sub4_sub4_1;
                    }
                }
                if(j1 >= 512)
                {
                    Model class44_sub3_sub4_sub4_2 = ItemDefinition.get(j1 - 512).getDialogueModel(gender);
                    if(class44_sub3_sub4_sub4_2 != null)
                    {
                        aclass44_sub3_sub4_sub4[l++] = class44_sub3_sub4_sub4_2;
                    }
                }
            }
            Model class44_sub3_sub4_sub4 = new Model(aclass44_sub3_sub4_sub4, l);
            for(int k1 = 0; k1 < 5; k1++)
            {
                if(anIntArray1677[k1] != 0)
                {
                    class44_sub3_sub4_sub4.recolor(client.anIntArrayArray1073[k1][0], client.anIntArrayArray1073[k1][anIntArray1677[k1]]);
                    if(k1 == 1)
                    {
                        class44_sub3_sub4_sub4.recolor(client.anIntArray1043[0], client.anIntArray1043[anIntArray1677[k1]]);
                    }
                }
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96228, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method535(boolean flag)
    {
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            }
            return aBoolean1673;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("52910, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public PlayerModel()
    {
        aBoolean1671 = false;
        aBoolean1673 = false;
        anIntArray1676 = new int[12];
        anIntArray1677 = new int[5];
        aBoolean1692 = false;
        aLong1693 = -1L;
    }

}
