package com.jagex;

public class QueueNode extends Node
{

    public boolean aBoolean1359;
    public QueueNode next;
    public QueueNode previous;
    public static boolean aBoolean1362;

    public void unlink()
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

    public QueueNode()
    {
        aBoolean1359 = false;
    }
}
