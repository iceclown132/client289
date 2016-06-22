package com.jagex;
public class Envelope {

	public boolean aBoolean37;
	public int size;
	public int anIntArray39[];
	public int anIntArray40[];
	public int start;
	public int end;
	public int form;
	public int anInt44;
	public int anInt45;
	public int anInt46;
	public int anInt47;
	public int anInt48;
	public static int anInt49;

	public void decode(Buffer buffer) {
		form = buffer.getUnsignedByte();
		start = buffer.getUnsignedInt();
		end = buffer.getUnsignedInt();
		decode_shape(buffer);
	}

	public void decode_shape(Buffer buffer) {
		size = buffer.getUnsignedByte();
		anIntArray39 = new int[size];
		anIntArray40 = new int[size];
		for (int j = 0; j < size; j++) {
			anIntArray39[j] = buffer.getUnsignedShort();
			anIntArray40[j] = buffer.getUnsignedShort();
		}
	}

	public void reset() {
		anInt44 = 0;
		anInt45 = 0;
		anInt46 = 0;
		anInt47 = 0;
		anInt48 = 0;
	}

	public int step(int i, int j) {
		if (anInt48 >= anInt44) {
			anInt47 = anIntArray40[anInt45++] << 15;
			if (anInt45 >= size) {
				anInt45 = size - 1;
			}
			anInt44 = (int) (((double) anIntArray39[anInt45] / 65536D) * (double) j);
			if (anInt44 > anInt48) {
				anInt46 = ((anIntArray40[anInt45] << 15) - anInt47) / (anInt44 - anInt48);
			}
		}
		anInt47 += anInt46;
		anInt48++;
		if (i != 0) {
			for (int k = 1; k > 0; k++) {
			}
		}
		return anInt47 - anInt46 >> 15;
	}

	public Envelope() {
		aBoolean37 = false;
	}

}