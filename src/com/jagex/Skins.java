package com.jagex;

public class Skins {

	public int length;
	public int anIntArray254[];
	public int anIntArrayArray255[][];

	public Skins(Buffer buffer) {
		length = buffer.getUnsignedByte();
		anIntArray254 = new int[length];
		anIntArrayArray255 = new int[length][];
		for (int j = 0; j < length; j++) {
			anIntArray254[j] = buffer.getUnsignedByte();
		}
		for (int index = 0; index < length; index++) {
			int amount = buffer.getUnsignedByte();
			anIntArrayArray255[index] = new int[amount];
			for (int subindex = 0; subindex < amount; subindex++) {
				anIntArrayArray255[index][subindex] = buffer.getUnsignedByte();
			}
		}
	}

}
