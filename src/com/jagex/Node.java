package com.jagex;

public class Node
{

    public long aLong769;
    public Node next;
    public Node previous;
    public static boolean aBoolean772;

    public void destroy()
    {
        if(previous == null)
        {
            return;
        } else
        {
            previous.next = next;
            next.previous = previous;
            next = null;
            previous = null;
            return;
        }
    }

    public Node()
    {
    }
}
