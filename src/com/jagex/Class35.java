package com.jagex;
import sign.signlink;

public class Class35
{

    public static int anInt588 = 810;
    public static int anInt589;
    public static Class35 aClass35Array590[];
    public String aString591;
    public int anInt592;
    public int anInt593;
    public int anInt594;
    public boolean aBoolean595;
    public int anInt596;
    public int anInt597;

    public static void method275(boolean flag, Archive class47)
    {
        try
        {
            if(!flag)
            {
                return;
            }
            Buffer class44_sub3_sub2 = new Buffer(class47.entry("varbit.dat", null));
            anInt589 = class44_sub3_sub2.getUnsignedShort();
            if(aClass35Array590 == null)
            {
                aClass35Array590 = new Class35[anInt589];
            }
            for(int i = 0; i < anInt589; i++)
            {
                if(aClass35Array590[i] == null)
                {
                    aClass35Array590[i] = new Class35();
                }
                aClass35Array590[i].method276(anInt588, i, class44_sub3_sub2);
                if(aClass35Array590[i].aBoolean595)
                {
                    Class38.aClass38Array674[aClass35Array590[i].anInt592].aBoolean686 = true;
                }
            }
            if(class44_sub3_sub2.pointer != class44_sub3_sub2.payload.length)
            {
                System.out.println("varbit load mismatch");
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10921, " + flag + ", " + class47 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method276(int i, int j, Buffer class44_sub3_sub2)
    {
        try
        {
            i = 55 / i;
            do
            {
                int k = class44_sub3_sub2.getUnsignedByte();
                if(k == 0)
                {
                    return;
                }
                if(k == 1)
                {
                    anInt592 = class44_sub3_sub2.getUnsignedShort();
                    anInt593 = class44_sub3_sub2.getUnsignedByte();
                    anInt594 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(k == 10)
                {
                    aString591 = class44_sub3_sub2.getRSString();
                } else
                if(k == 2)
                {
                    aBoolean595 = true;
                } else
                if(k == 3)
                {
                    anInt596 = class44_sub3_sub2.getUnsignedInt();
                } else
                if(k == 4)
                {
                    anInt597 = class44_sub3_sub2.getUnsignedInt();
                } else
                {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19355, " + i + ", " + j + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class35()
    {
        aBoolean595 = false;
        anInt596 = -1;
    }

}
