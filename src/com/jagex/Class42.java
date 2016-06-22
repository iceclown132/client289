package com.jagex;
import sign.signlink;

public class Class42
{

    public boolean aBoolean764;
    public boolean aBoolean765;
    public int anInt766;
    public int anInt767;
    public Node aClass44Array768[];

    public Class42(int i, byte byte0)
    {
        aBoolean764 = false;
        aBoolean765 = false;
        anInt766 = 8;
        try
        {
            anInt767 = i;
            aClass44Array768 = new Node[i];
            for(int j = 0; j < i; j++)
            {
                Node class44 = aClass44Array768[j] = new Node();
                class44.next = class44;
                class44.previous = class44;
            }
            if(byte0 != 124)
            {
                for(int k = 1; k > 0; k++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10752, " + i + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Node method380(long l)
    {
        Node class44 = aClass44Array768[(int)(l & (long)(anInt767 - 1))];
        for(Node class44_1 = class44.next; class44_1 != class44; class44_1 = class44_1.next)
        {
            if(class44_1.aLong769 == l)
            {
                return class44_1;
            }
        }
        return null;
    }

    public void method381(boolean flag, Node class44, long l)
    {
        try
        {
            if(class44.previous != null)
            {
                class44.destroy();
            }
            Node class44_1 = aClass44Array768[(int)(l & (long)(anInt767 - 1))];
            class44.previous = class44_1.previous;
            if(flag)
            {
                aBoolean764 = !aBoolean764;
            }
            class44.next = class44_1;
            class44.previous.next = class44;
            class44.next.previous = class44;
            class44.aLong769 = l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("44360, " + flag + ", " + class44 + ", " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }
}
