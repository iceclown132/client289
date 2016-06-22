package com.jagex;
import java.io.*;
import java.net.Socket;
import java.util.zip.*;

import sign.signlink;

public class Cache extends Class43 implements Runnable {

    public boolean aBoolean1280;
    public int anInt1281;
    public int anInt1282;
    public byte aByte1283;
    public int indices[][];
    public int file_crc[][];
    public byte aByteArrayArray1286[][];
    public int anInt1287;
    public byte aByteArray1288[];
    public int map_identifiers[];
    public int map_file[];
    public int landscape_file[];
    public int anIntArray1292[];
    public int anim_index[];
    public int midi_index[];
    public boolean aBoolean1295;
    public client client;
    public CRC32 aCRC32_1297;
    public boolean aBoolean1298;
    public int anInt1299;
    public int anInt1300;
    public Queue queue;
    public Deque deque;
    public Deque aClass28_1303;
    public Deque aClass28_1304;
    public Deque aClass28_1305;
    public Deque aClass28_1306;
    public String aString1307;
    public int anInt1308;
    public int anInt1309;
    public Socket aSocket1310;
    public InputStream inputstream;
    public OutputStream anOutputStream1312;
    public int anInt1313;
    public FileRequest request;
    public int anInt1315;
    public int anInt1316;
    public byte aByteArray1317[];
    public byte aByteArray1318[];
    public int anInt1319;
    public int anInt1320;
    public long aLong1321;
    public int anInt1322;

    public void method383(Archive archive, client client1)
    {
        String as[] = {
            "model_version", "anim_version", "midi_version", "map_version"
        };
        for(int i = 0; i < 4; i++)
        {
            byte abyte0[] = archive.entry(as[i], null);
            int length = abyte0.length / 2;
            Buffer class44_sub3_sub2 = new Buffer(abyte0);
            indices[i] = new int[length];
            aByteArrayArray1286[i] = new byte[length];
            for(int j = 0; j < length; j++)
            {
                indices[i][j] = class44_sub3_sub2.getUnsignedShort();
            }
        }
        String file_names[] = {
            "model_crc", "anim_crc", "midi_crc", "map_crc"
        };
        for(int i = 0; i < 4; i++)
        {
            byte abyte1[] = archive.entry(file_names[i], null);
            int i1 = abyte1.length / 4;
            Buffer class44_sub3_sub2_1 = new Buffer(abyte1);
            file_crc[i] = new int[i1];
            for(int l1 = 0; l1 < i1; l1++)
            {
                file_crc[i][l1] = class44_sub3_sub2_1.getUnsignedInt();
            }
        }
        byte data[] = archive.entry("model_index", null);
        int size = indices[0].length;
        aByteArray1288 = new byte[size];
        for(int k1 = 0; k1 < size; k1++)
        {
            if(k1 < data.length)
            {
                aByteArray1288[k1] = data[k1];
            } else
            {
                aByteArray1288[k1] = 0;
            }
        }
        data = archive.entry("map_index", null);
        Buffer buffer = new Buffer(data);
        size = data.length / 7;
        map_identifiers = new int[size];
        map_file = new int[size];
        landscape_file = new int[size];
        anIntArray1292 = new int[size];
        for(int i2 = 0; i2 < size; i2++)
        {
            map_identifiers[i2] = buffer.getUnsignedShort();
            map_file[i2] = buffer.getUnsignedShort();
            landscape_file[i2] = buffer.getUnsignedShort();
            anIntArray1292[i2] = buffer.getUnsignedByte();
//
//            System.out.println("-------------------------------------");
//            System.out.println("anIntArray1289[" + i2 + "]: " + map_identifiers[i2]);
//            System.out.println("anIntArray1290[" + i2 + "]: " + map_file[i2]);
//            System.out.println("anIntArray1291[" + i2 + "]: " + landscape_file[i2]);
//            System.out.println("anIntArray1292[" + i2 + "]: " + anIntArray1292[i2]);
        }
        data = archive.entry("anim_index", null);
        buffer = new Buffer(data);
        size = data.length / 2;
        anim_index = new int[size];
        for(int i = 0; i < size; i++)
        {
            anim_index[i] = buffer.getUnsignedShort();
        }
        data = archive.entry("midi_index", null);
        buffer = new Buffer(data);
        size = data.length;
        midi_index = new int[size];
        for(int i = 0; i < size; i++)
        {
            midi_index[i] = buffer.getUnsignedByte();
        }
        client = client1;
        aBoolean1295 = true;
        client.submit(this, 2);
    }

    public void reset()
    {
        aBoolean1295 = false;
    }

    public int method385(int i, byte byte0)
    {
        try
        {
            if(byte0 == 7)
            {
                byte0 = 0;
            } else
            {
                return 1;
            }
            return indices[i].length;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("37225, " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method386(int i)
    {
        try
        {
            if(i != 7)
            {
                return 1;
            } else
            {
                return anim_index.length;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("62481, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public int getRegionFile(int type, int x, int y) {
		int identifier = (x << 8) + y;
		for (int index = 0; index < map_identifiers.length; index++) {
			if (map_identifiers[index] == identifier) {
				if (type == 0) {
					return map_file[index];
				} else {
					return landscape_file[index];
				}
			}
		}
		return -1;
	}

    public void method388(boolean flag, boolean flag1)
    {
        try
        {
            int i = map_identifiers.length;
            if(flag)
            {
                aBoolean1280 = !aBoolean1280;
            }
            for(int j = 0; j < i; j++)
            {
                if(flag1 || anIntArray1292[j] != 0)
                {
                    method395(7, 3, (byte)2, landscape_file[j]);
                    method395(7, 3, (byte)2, map_file[j]);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("78980, " + flag + ", " + flag1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method389(int i, int j)
    {
        try
        {
            for(int k = 0; k < map_identifiers.length; k++)
            {
                if(landscape_file[k] == i)
                {
                    return true;
                }
            }
            if(j != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("68583, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method390(int i, int j)
    {
        try
        {
            while(j >= 0)
            {
                anInt1281 = 270;
            }
            return aByteArray1288[i] & 0xff;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("30503, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method391(int i, int j)
    {
            j = 93 / j;
            return midi_index[i] == 1;
    }

    public void method382(int i)
    {
        load(0, i);
    }

	public void load(int cache_index, int file_index) {
		if (cache_index < 0 || cache_index > indices.length || file_index < 0 || file_index > indices[cache_index].length) {
			return;
		}
		if (indices[cache_index][file_index] == 0) {
			return;
		}
		synchronized (queue) {
			for (FileRequest request = (FileRequest) queue.peek(); request != null; request = (FileRequest) queue.next()) {
				if (request.cache_index == cache_index && request.file_index == file_index) {
					return;
				}
			}
			FileRequest request = new FileRequest();
			request.cache_index = cache_index;
			request.file_index = file_index;
			request.incomplete = true;
			synchronized (deque) {
				deque.addLast(request);
			}
			queue.addLast(request);
		}
	}

	public int size() {
		synchronized (queue) {
			return queue.size();
		}
	}

    public FileRequest method394()
    {
        FileRequest class44_sub3_sub3;
        synchronized(aClass28_1305)
        {
            class44_sub3_sub3 = (FileRequest)aClass28_1305.poll();
        }
        if(class44_sub3_sub3 == null)
        {
            return null;
        }
        synchronized(queue)
        {
            class44_sub3_sub3.unlink();
        }
        if(class44_sub3_sub3.data == null)
        {
            return class44_sub3_sub3;
        }
        int i = 0;
        try
        {
            GZIPInputStream gzipinputstream = new GZIPInputStream(new ByteArrayInputStream(class44_sub3_sub3.data));
            do
            {
                if(i == aByteArray1318.length)
                {
                    throw new RuntimeException("buffer overflow!");
                }
                int k = gzipinputstream.read(aByteArray1318, i, aByteArray1318.length - i);
                if(k == -1)
                {
                    break;
                }
                i += k;
            } while(true);
        }
        catch(IOException _ex)
        {
            throw new RuntimeException("error unzipping");
        }
        class44_sub3_sub3.data = new byte[i];
        for(int j = 0; j < i; j++)
        {
            class44_sub3_sub3.data[j] = aByteArray1318[j];
        }
        return class44_sub3_sub3;
    }

    public void method395(int i, int j, byte byte0, int k)
    {
        try
        {
            if(client.aClass45Array1208[0] == null)
            {
                return;
            }
            if(indices[j][k] == 0)
            {
                return;
            }
            byte abyte0[] = client.aClass45Array1208[j + 1].method541(false, k);
            if(method402(abyte0, indices[j][k], (byte)64, file_crc[j][k]))
            {
                return;
            }
            aByteArrayArray1286[j][k] = byte0;
            if(i < 7 || i > 7)
            {
                return;
            }
            if(byte0 > anInt1287)
            {
                anInt1287 = byte0;
            }
            anInt1309++;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("42758, " + i + ", " + j + ", " + byte0 + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method396(int i)
    {
        try
        {
            if(i >= 0)
            {
                return;
            }
            synchronized(aClass28_1306)
            {
                aClass28_1306.clear();
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("65651, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method397(int i, int j, byte byte0)
    {
        try
        {
            if(client.aClass45Array1208[0] == null)
            {
                return;
            }
            if(indices[j][i] == 0)
            {
                return;
            }
            if(aByteArrayArray1286[j][i] == 0)
            {
                return;
            }
            if(anInt1287 == 0)
            {
                return;
            }
            FileRequest class44_sub3_sub3 = new FileRequest();
            class44_sub3_sub3.cache_index = j;
            class44_sub3_sub3.file_index = i;
            class44_sub3_sub3.incomplete = false;
            if(byte0 != 6)
            {
                return;
            }
            synchronized(aClass28_1306)
            {
                aClass28_1306.addLast(class44_sub3_sub3);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("69676, " + i + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void run()
    {
        try
        {
            while(aBoolean1295)
            {
                anInt1322++;
                int i = 20;
                if(anInt1287 == 0 && client.aClass45Array1208[0] != null)
                {
                    i = 50;
                }
                try
                {
                    Thread.sleep(i);
                }
                catch(Exception _ex)
                {
                }
                aBoolean1298 = true;
                for(int j = 0; j < 100; j++)
                {
                    if(!aBoolean1298)
                    {
                        break;
                    }
                    aBoolean1298 = false;
                    method398((byte)-101);
                    method399((byte)-3);
                    if(anInt1299 == 0 && j >= 5)
                    {
                        break;
                    }
                    method400(0);
                    if(inputstream != null)
                    {
                        method401(200);
                    }
                }
                boolean flag = false;
                for(FileRequest class44_sub3_sub3 = (FileRequest)aClass28_1304.peek(); class44_sub3_sub3 != null; class44_sub3_sub3 = (FileRequest)aClass28_1304.next())
                {
                    if(class44_sub3_sub3.incomplete)
                    {
                        flag = true;
                        class44_sub3_sub3.anInt1408++;
                        if(class44_sub3_sub3.anInt1408 > 50)
                        {
                            class44_sub3_sub3.anInt1408 = 0;
                            method403(class44_sub3_sub3, 409);
                        }
                    }
                }
                if(!flag)
                {
                    for(FileRequest class44_sub3_sub3_1 = (FileRequest)aClass28_1304.peek(); class44_sub3_sub3_1 != null; class44_sub3_sub3_1 = (FileRequest)aClass28_1304.next())
                    {
                        flag = true;
                        class44_sub3_sub3_1.anInt1408++;
                        if(class44_sub3_sub3_1.anInt1408 > 50)
                        {
                            class44_sub3_sub3_1.anInt1408 = 0;
                            method403(class44_sub3_sub3_1, 409);
                        }
                    }
                }
                if(flag)
                {
                    anInt1319++;
                    if(anInt1319 > 750)
                    {
                        try
                        {
                            aSocket1310.close();
                        }
                        catch(Exception _ex)
                        {
                        }
                        aSocket1310 = null;
                        inputstream = null;
                        anOutputStream1312 = null;
                        anInt1316 = 0;
                    }
                } else
                {
                    anInt1319 = 0;
                    aString1307 = "";
                }
                if(client.aBoolean863 && aSocket1310 != null && anOutputStream1312 != null && (anInt1287 > 0 || client.aClass45Array1208[0] == null))
                {
                    anInt1320++;
                    if(anInt1320 > 500)
                    {
                        anInt1320 = 0;
                        aByteArray1317[0] = 0;
                        aByteArray1317[1] = 0;
                        aByteArray1317[2] = 0;
                        aByteArray1317[3] = 10;
                        try
                        {
                            anOutputStream1312.write(aByteArray1317, 0, 4);
                        }
                        catch(IOException _ex)
                        {
                            anInt1319 = 5000;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception)
        {
            signlink.reporterror("od_ex " + exception.getMessage());
        }
    }

    public void method398(byte byte0)
    {
        try
        {
            FileRequest class44_sub3_sub3;
            synchronized(deque)
            {
                class44_sub3_sub3 = (FileRequest)deque.poll();
            }
            if(byte0 != -101)
            {
                return;
            }
            while(class44_sub3_sub3 != null)
            {
                aBoolean1298 = true;
                byte abyte0[] = null;
                if(client.aClass45Array1208[0] != null)
                {
                    abyte0 = client.aClass45Array1208[class44_sub3_sub3.cache_index + 1].method541(false, class44_sub3_sub3.file_index);
                }
                if(!method402(abyte0, indices[class44_sub3_sub3.cache_index][class44_sub3_sub3.file_index], (byte)64, file_crc[class44_sub3_sub3.cache_index][class44_sub3_sub3.file_index]))
                {
                    abyte0 = null;
                }
                synchronized(deque)
                {
                    if(abyte0 == null)
                    {
                        aClass28_1303.addLast(class44_sub3_sub3);
                    } else
                    {
                        class44_sub3_sub3.data = abyte0;
                        synchronized(aClass28_1305)
                        {
                            aClass28_1305.addLast(class44_sub3_sub3);
                        }
                    }
                    class44_sub3_sub3 = (FileRequest)deque.poll();
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("28575, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method399(byte byte0)
    {
        try
        {
            anInt1299 = 0;
            anInt1300 = 0;
            if(byte0 != -3)
            {
                anInt1282 = -238;
            }
            for(FileRequest class44_sub3_sub3 = (FileRequest)aClass28_1304.peek(); class44_sub3_sub3 != null; class44_sub3_sub3 = (FileRequest)aClass28_1304.next())
            {
                if(class44_sub3_sub3.incomplete)
                {
                    anInt1299++;
                } else
                {
                    anInt1300++;
                }
            }
            while(anInt1299 < 10)
            {
                FileRequest class44_sub3_sub3_1 = (FileRequest)aClass28_1303.poll();
                if(class44_sub3_sub3_1 == null)
                {
                    break;
                }
                if(aByteArrayArray1286[class44_sub3_sub3_1.cache_index][class44_sub3_sub3_1.file_index] != 0)
                {
                    anInt1308++;
                }
                aByteArrayArray1286[class44_sub3_sub3_1.cache_index][class44_sub3_sub3_1.file_index] = 0;
                aClass28_1304.addLast(class44_sub3_sub3_1);
                anInt1299++;
                method403(class44_sub3_sub3_1, 409);
                aBoolean1298 = true;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10900, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method400(int i)
    {
label0:
        while(true)
        {
            try
            {
                if(i != 0)
                {
                    aBoolean1280 = !aBoolean1280;
                }
                while(true)
                {
                    if(anInt1299 != 0)
                    {
                        break label0;
                    }
                    if(anInt1300 >= 10)
                    {
                        break;
                    }
                    if(anInt1287 == 0)
                    {
                        break;
                    }
                    FileRequest class44_sub3_sub3;
                    synchronized(aClass28_1306)
                    {
                        class44_sub3_sub3 = (FileRequest) aClass28_1306.poll();
                    }
                    while(class44_sub3_sub3 != null)
                    {
                        if(aByteArrayArray1286[class44_sub3_sub3.cache_index][class44_sub3_sub3.file_index] != 0)
                        {
                            aByteArrayArray1286[class44_sub3_sub3.cache_index][class44_sub3_sub3.file_index] = (byte)0;
                            aClass28_1304.addLast(class44_sub3_sub3);
                            method403(class44_sub3_sub3, 409);
                            aBoolean1298 = true;
                            if(anInt1308 < anInt1309)
                            {
                                anInt1308++;
                            }
                            aString1307 = "Loading extra files - " + (anInt1308 * 100 / anInt1309) + "%";
                            anInt1300++;
                            if(anInt1300 == 10)
                            {
                                return;
                            }
                        }
                        synchronized(aClass28_1306)
                        {
                            class44_sub3_sub3 = ((FileRequest)aClass28_1306.poll());
                        }
                    }
                    for(int j = 0; j < 4; j++)
                    {
                        byte[] abyte0 = aByteArrayArray1286[j];
                        int k = abyte0.length;
                        for(int l = 0; l < k; l++)
                        {
                            if(abyte0[l] == anInt1287)
                            {
                                abyte0[l] = (byte) 0;
                                class44_sub3_sub3 = new FileRequest();
                                class44_sub3_sub3.cache_index = j;
                                class44_sub3_sub3.file_index = l;
                                class44_sub3_sub3.incomplete = false;
                                aClass28_1304.addLast(class44_sub3_sub3);
                                method403(class44_sub3_sub3, 409);
                                aBoolean1298 = true;
                                if(anInt1308 < anInt1309)
                                {
                                    anInt1308++;
                                }
                                aString1307 = "Loading extra files - " + (anInt1308 * 100 / anInt1309) + "%";
                                anInt1300++;
                                if(anInt1300 == 10)
                                {
                                    return;
                                }
                            }
                        }
                    }
                    anInt1287--;
                }
            }
            catch(RuntimeException runtimeexception)
            {
                signlink.reporterror("38119, " + i + ", " + runtimeexception.toString());
                throw new RuntimeException();
            }
            break;
        }
    }

    public void method401(int i)
    {
        i = 48 / i;
        try
        {
            int j = inputstream.available();
            if(anInt1316 == 0 && j >= 6)
            {
                aBoolean1298 = true;
                for(int k = 0; k < 6; k += inputstream.read(aByteArray1317, k, 6 - k))
                {
                }
                int l = aByteArray1317[0] & 0xff;
                int j1 = ((aByteArray1317[1] & 0xff) << 8) + (aByteArray1317[2] & 0xff);
                int l1 = ((aByteArray1317[3] & 0xff) << 8) + (aByteArray1317[4] & 0xff);
                int i2 = aByteArray1317[5] & 0xff;
                request = null;
                for(FileRequest class44_sub3_sub3 = (FileRequest)aClass28_1304.peek(); class44_sub3_sub3 != null; class44_sub3_sub3 = (FileRequest)aClass28_1304.next())
                {
                    if(class44_sub3_sub3.cache_index == l && class44_sub3_sub3.file_index == j1)
                    {
                        request = class44_sub3_sub3;
                    }
                    if(request != null)
                    {
                        class44_sub3_sub3.anInt1408 = 0;
                    }
                }
                if(request != null)
                {
                    anInt1319 = 0;
                    if(l1 == 0)
                    {
                        signlink.reporterror("Rej: " + l + "," + j1);
                        request.data = null;
                        if(request.incomplete)
                        {
                            synchronized(aClass28_1305)
                            {
                                aClass28_1305.addLast(request);
                            }
                        } else
                        {
                            request.destroy();
                        }
                        request = null;
                    } else
                    {
                        if(request.data == null && i2 == 0)
                        {
                            request.data = new byte[l1];
                        }
                        if(request.data == null && i2 != 0)
                        {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                anInt1315 = i2 * 500;
                anInt1316 = 500;
                if(anInt1316 > l1 - i2 * 500)
                {
                    anInt1316 = l1 - i2 * 500;
                }
            }
            if(anInt1316 > 0 && j >= anInt1316)
            {
                aBoolean1298 = true;
                byte abyte0[] = aByteArray1317;
                int i1 = 0;
                if(request != null)
                {
                    abyte0 = request.data;
                    i1 = anInt1315;
                }
                for(int k1 = 0; k1 < anInt1316; k1 += inputstream.read(abyte0, k1 + i1, anInt1316 - k1))
                {
                }
                if(anInt1316 + anInt1315 >= abyte0.length && request != null)
                {
                    if(client.aClass45Array1208[0] != null)
                    {
                        client.aClass45Array1208[request.cache_index + 1].method542(abyte0, (byte)4, abyte0.length, request.file_index);
                    }
                    if(!request.incomplete && request.cache_index == 3)
                    {
                        request.incomplete = true;
                        request.cache_index = 93;
                    }
                    if(request.incomplete)
                    {
                        synchronized(aClass28_1305)
                        {
                            aClass28_1305.addLast(request);
                        }
                    } else
                    {
                        request.destroy();
                    }
                }
                anInt1316 = 0;
                return;
            }
        }
        catch(IOException ioexception)
        {
            try
            {
                aSocket1310.close();
            }
            catch(Exception _ex)
            {
            }
            aSocket1310 = null;
            inputstream = null;
            anOutputStream1312 = null;
            anInt1316 = 0;
            return;
        }
    }

	public boolean method402(byte abyte0[], int i, byte byte0, int j) {
		if (abyte0 == null || abyte0.length < 2) {
			return false;
		}
		int k = abyte0.length - 2;
		int l = ((abyte0[k] & 0xff) << 8) + (abyte0[k + 1] & 0xff);
		aCRC32_1297.reset();
		if (byte0 != aByte1283) {
			throw new NullPointerException();
		}
		aCRC32_1297.update(abyte0, 0, k);
		int i1 = (int) aCRC32_1297.getValue();
		if (l != i) {
			return false;
		}
		return i1 == j;
	}

    public void method403(FileRequest class44_sub3_sub3, int i)
    {
        /*try
        {
            i = 99 / i;
            try
            {
                if(aSocket1310 == null)
                {
                    long l = System.currentTimeMillis();
                    if(l - aLong1321 < 4000L)
                    {
                        return;
                    }
                    aLong1321 = l;
                    aSocket1310 = aClient1296.method34(43594 + client.anInt1233);
                    anInputStream1311 = aSocket1310.getInputStream();
                    anOutputStream1312 = aSocket1310.getOutputStream();
                    anOutputStream1312.write(15);
                    for(int j = 0; j < 8; j++)
                    {
                        anInputStream1311.read();
                    }
                    anInt1319 = 0;
                }
                aByteArray1317[0] = (byte)class44_sub3_sub3.anInt1405;
                aByteArray1317[1] = (byte)(class44_sub3_sub3.anInt1406 >> 8);
                aByteArray1317[2] = (byte)class44_sub3_sub3.anInt1406;
                if(class44_sub3_sub3.aBoolean1409)
                {
                    aByteArray1317[3] = 2;
                } else
                if(!aClient1296.aBoolean863)
                {
                    aByteArray1317[3] = 1;
                } else
                {
                    aByteArray1317[3] = 0;
                }
                anOutputStream1312.write(aByteArray1317, 0, 4);
                anInt1320 = 0;
                anInt1313 = -10000;
                return;
            }
            catch(IOException ioexception)
            {
            }
            try
            {
                aSocket1310.close();
            }
            catch(Exception _ex)
            {
            }
            aSocket1310 = null;
            anInputStream1311 = null;
            anOutputStream1312 = null;
            anInt1316 = 0;
            anInt1313++;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("57925, " + class44_sub3_sub3 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
		*/
    }

    public Cache()
    {
        aBoolean1280 = false;
        anInt1281 = -555;
        aByte1283 = 64;
        indices = new int[4][];
        file_crc = new int[4][];
        aByteArrayArray1286 = new byte[4][];
        aBoolean1295 = true;
        aCRC32_1297 = new CRC32();
        aBoolean1298 = false;
        queue = new Queue();
        deque = new Deque(-199);
        aClass28_1303 = new Deque(-199);
        aClass28_1304 = new Deque(-199);
        aClass28_1305 = new Deque(-199);
        aClass28_1306 = new Deque(-199);
        aString1307 = "";
        aByteArray1317 = new byte[500];
        aByteArray1318 = new byte[65000];
    }
}
