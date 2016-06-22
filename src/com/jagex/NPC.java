package com.jagex;
import sign.signlink;

public class NPC extends RenderingHints
{

    public int anInt1697;
    public int anInt1698;
    public boolean aBoolean1699;
    public NPCDefinition definition;

    public Model method499(int i)
    {
        try
        {
            if(definition == null)
            {
                return null;
            }
            Model class44_sub3_sub4_sub4 = method540(false);
            if(i != -37770)
            {
                throw new NullPointerException();
            }
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            super.anInt1661 = ((Class44_Sub3_Sub4) (class44_sub3_sub4_sub4)).anInt1412;
            if(super.spotanim_id != -1 && super.anInt1649 != -1)
            {
                Class32 class32 = Class32.aClass32Array559[super.spotanim_id];
                Model class44_sub3_sub4_sub4_1 = class32.method271();
                if(class44_sub3_sub4_sub4_1 != null)
                {
                    int j = class32.aClass26_563.frame_index[super.anInt1649];
                    Model class44_sub3_sub4_sub4_2 = new Model(class44_sub3_sub4_sub4_1, AnimationFrame.invalid(j), false, anInt1697, true);
                    class44_sub3_sub4_sub4_2.translate(-super.spotanim_height, 0, 0);
                    class44_sub3_sub4_sub4_2.method513((byte)3);
                    class44_sub3_sub4_sub4_2.method514(j, 188);
                    class44_sub3_sub4_sub4_2.anIntArrayArray1567 = null;
                    class44_sub3_sub4_sub4_2.anIntArrayArray1566 = null;
                    if(class32.anInt566 != 128 || class32.anInt567 != 128)
                    {
                        class44_sub3_sub4_sub4_2.scale(class32.anInt566, class32.anInt566, class32.anInt567, (byte)31);
                    }
                    class44_sub3_sub4_sub4_2.applyLighting(64 + class32.anInt569, 850 + class32.anInt570, -30, -50, -30, true);
                    Model aclass44_sub3_sub4_sub4[] = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_2
                    };
                    class44_sub3_sub4_sub4 = new Model(true, 0, aclass44_sub3_sub4_sub4, 2);
                }
            }
            if(definition.size == 1)
            {
                class44_sub3_sub4_sub4.single_tile = true;
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15988, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method540(boolean flag)
    {
        try
        {
            if(flag)
            {
                aBoolean1699 = !aBoolean1699;
            }
            if(super.animation_id >= 0 && super.animation_delay == 0)
            {
                int i = AnimationSequence.cache[super.animation_id].frame_index[super.anInt1644];
                int k = -1;
                if(super.anInt1640 >= 0 && super.anInt1640 != super.idle_animation)
                {
                    k = AnimationSequence.cache[super.anInt1640].frame_index[super.anInt1641];
                }
                return definition.method216(0, k, i, AnimationSequence.cache[super.animation_id].flowControl);
            }
            int j = -1;
            if(super.anInt1640 >= 0)
            {
                j = AnimationSequence.cache[super.anInt1640].frame_index[super.anInt1641];
            }
            return definition.method216(0, -1, j, null);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("99332, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method535(boolean flag)
    {
        try
        {
            if(!flag)
            {
                anInt1698 = -80;
            }
            return definition != null;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("4937, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public NPC()
    {
        anInt1698 = 8;
        aBoolean1699 = true;
    }
}
