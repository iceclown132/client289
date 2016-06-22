package com.jagex;

public class FileRequest extends QueueNode
{

    public int cache_index;
    public int file_index;
    public byte data[];
    public int anInt1408;
    public boolean incomplete;

    public FileRequest()
    {
        incomplete = true;
    }
}
