package com.jagex;
import java.math.BigInteger;

public class Buffer extends QueueNode {
	
    public static int MAX_BIT_LEN = 8;
    
    public static int bitMask[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
        0x3fffffff, 0x7fffffff, -1
    };

    public int anInt1380;
    public byte aByte1381;
    public int anInt1382;
    public int anInt1383;
    public int anInt1384;
    public boolean aBoolean1385;
    public int anInt1386;
    public int anInt1387;
    public boolean aBoolean1388;
    public boolean aBoolean1389;
    public byte payload[];
    public int pointer;
    public int bitOffset;
    public static int anIntArray1394[];
    public ISAACCipher isaac;
    public static int anInt1397;
    public static int anInt1398;
    public static int anInt1399;
    public static Deque aClass28_1400 = new Deque(-199);
    public static Deque queue = new Deque(-199);
    public static Deque aClass28_1402 = new Deque(-199);
    public static char aCharArray1403[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', '+', '/'
    };
    public static int anInt1404;

	public static Buffer allocate(int type) {
		synchronized (queue) {
			Buffer buffer = null;
			if (type == 0 && anInt1397 > 0) {
				anInt1397--;
				buffer = (Buffer) aClass28_1400.poll();
			} else if (type == 1 && anInt1398 > 0) {
				anInt1398--;
				buffer = (Buffer) queue.poll();
			} else if (type == 2 && anInt1399 > 0) {
				anInt1399--;
				buffer = (Buffer) aClass28_1402.poll();
			}
			if (buffer != null) {
				buffer.pointer = 0;
				return buffer;
			}
		}
		Buffer buffer = new Buffer();
		buffer.pointer = 0;
		if (type == 0) {
			buffer.payload = new byte[100];
		} else if (type == 1) {
			buffer.payload = new byte[5000];
		} else {
			buffer.payload = new byte[30000];
		}
		return buffer;
	}

	public Buffer() {
		aByte1381 = 95;
		anInt1382 = -731;
		anInt1383 = 1623;
		anInt1384 = 772;
		aBoolean1385 = false;
		anInt1386 = -139;
		anInt1387 = 1;
		aBoolean1388 = false;
		aBoolean1389 = false;
	}

    public Buffer(byte abyte0[])
    {
		aByte1381 = 95;
		anInt1382 = -731;
		anInt1383 = 1623;
		anInt1384 = 772;
		aBoolean1385 = false;
		anInt1386 = -139;
		anInt1387 = 1;
		aBoolean1388 = false;
		aBoolean1389 = false;
		payload = abyte0;
		pointer = 0;
    }

	public void putOpcode(int opcode) {
		// payload[pointer++] = (byte) (opcode + aClass46_1396.method545());
		payload[pointer++] = (byte) opcode;
	}

	public void putByte(int i) {
		payload[pointer++] = (byte) i;
	}

	public void putShort(int i) {
		payload[pointer++] = (byte) (i >> 8);
		payload[pointer++] = (byte) i;
	}

	public void putLEShort(int i) {
		payload[pointer++] = (byte) i;
		payload[pointer++] = (byte) (i >> 8);
	}

	public void putTriByte(int i) {
		payload[pointer++] = (byte) (i >> 16);
		payload[pointer++] = (byte) (i >> 8);
		payload[pointer++] = (byte) i;
	}

	public void putInt(int i) {
		payload[pointer++] = (byte) (i >> 24);
		payload[pointer++] = (byte) (i >> 16);
		payload[pointer++] = (byte) (i >> 8);
		payload[pointer++] = (byte) i;
	}

	public void putLEInt(int i) {
		payload[pointer++] = (byte) i;
		payload[pointer++] = (byte) (i >> 8);
		payload[pointer++] = (byte) (i >> 16);
		payload[pointer++] = (byte) (i >> 24);
	}

	public void putLong(long l) {
		payload[pointer++] = (byte) (int) (l >> 56);
		payload[pointer++] = (byte) (int) (l >> 48);
		payload[pointer++] = (byte) (int) (l >> 40);
		payload[pointer++] = (byte) (int) (l >> 32);
		payload[pointer++] = (byte) (int) (l >> 24);
		payload[pointer++] = (byte) (int) (l >> 16);
		payload[pointer++] = (byte) (int) (l >> 8);
		payload[pointer++] = (byte) (int) l;
	}

	@SuppressWarnings("deprecation")
	public void putRSString(String s) {
		s.getBytes(0, s.length(), payload, pointer);
		pointer += s.length();
		payload[pointer++] = 10;
	}

	public void put(byte buf[], int off, int len) {
		for (int k = off; k < off + len; k++) {
			payload[pointer++] = buf[k];
		}
	}

	public void writeSizeByte(int i) {
		payload[pointer - i - 1] = (byte) i;
		return;
	}

	public int getUnsignedByte() {
		return payload[pointer++] & 0xff;
	}

	public byte getSignedByte() {
		return payload[pointer++];
	}

	public int getUnsignedShort() {
		pointer += 2;
		return ((payload[pointer - 2] & 0xff) << 8)
				+ (payload[pointer - 1] & 0xff);
	}

	public int getSignedShort() {
		pointer += 2;
		int i = ((payload[pointer - 2] & 0xff) << 8)
				+ (payload[pointer - 1] & 0xff);
		if (i > 32767) {
			i -= 0x10000;
		}
		return i;
	}

	public int getUnsignedTriByte() {
		pointer += 3;
		return ((payload[pointer - 3] & 0xff) << 16)
				+ ((payload[pointer - 2] & 0xff) << 8)
				+ (payload[pointer - 1] & 0xff);
	}

	public int getUnsignedInt() {
		pointer += 4;
		return ((payload[pointer - 4] & 0xff) << 24)
				+ ((payload[pointer - 3] & 0xff) << 16)
				+ ((payload[pointer - 2] & 0xff) << 8)
				+ (payload[pointer - 1] & 0xff);
	}

	public long getLong() {
		long a = (long) getUnsignedInt() & 0xFFFFFFFFL;
		long b = (long) getUnsignedInt() & 0xFFFFFFFFL;
		return (a << 32) + b;
	}

	public String getRSString() {
		int i = pointer;
		while (payload[pointer++] != 10)
			;
		return new String(payload, i, pointer - i - 1);
	}

	public byte[] getRawString() {
		int start = pointer;
		while (payload[pointer++] != 10)
			;
		byte buf[] = new byte[pointer - start - 1];
		for (int i = start; i < pointer - 1; i++) {
			buf[i - start] = payload[i];
		}
		return buf;
	}

	public void read(byte buf[], int offset, int length) {
		for (int i = offset; i < offset + length; i++) {
			buf[i] = payload[pointer++];
		}
	}

	public void startBitAccess() {
		bitOffset = pointer * 8;
	}

	public void endBitAccess() {
		pointer = (bitOffset + 7) / 8;
	}

	public int getBits(int size) {
		int byteOff = bitOffset >> 3;
		int bitOff = MAX_BIT_LEN - (bitOffset & 7);
		int dest = 0;
		bitOffset += size;
		for (; size > bitOff; bitOff = MAX_BIT_LEN) {
			dest += (payload[byteOff++] & bitMask[bitOff]) << size - bitOff;
			size -= bitOff;
		}
		if (size == bitOff) {
			dest += payload[byteOff] & bitMask[bitOff];
		} else {
			dest += payload[byteOff] >> bitOff - size & bitMask[size];
		}
		return dest;
	}

	public int getUnsigedSmart() {
		return (payload[pointer] & 0xff) < 128 ? getUnsignedByte() - 64
				: getUnsignedShort() - 49152;
	}

	public int getSmart() {
		return (payload[pointer] & 0xff) < 128 ? getUnsignedByte()
				: getUnsignedShort() - 32768;
	}

	public void encodeRSA(BigInteger biginteger, BigInteger biginteger1) {
		int j = pointer;
		pointer = 0;
		byte buf[] = new byte[j];
		read(buf, 0, j);
		BigInteger biginteger2 = new BigInteger(buf);
		BigInteger biginteger3 = biginteger2.modPow(biginteger1, biginteger);
		byte abyte1[] = biginteger3.toByteArray();
		pointer = 0;
		putByte(abyte1.length);
		put(abyte1, 0, abyte1.length);
	}

	static {
		anIntArray1394 = new int[256];
		for (int j = 0; j < 256; j++) {
			int i = j;
			for (int k = 0; k < 8; k++) {
				if ((i & 1) == 1) {
					i = i >>> 1 ^ 0xedb88320;
				} else {
					i >>>= 1;
				}
			}
			anIntArray1394[j] = i;
		}
	}

}