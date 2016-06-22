package com.jagex;
public class GroundItem extends Class44_Sub3_Sub4 {

	public int id;
	public int amount;

	public Model method499(int i) {
		ItemDefinition class14 = ItemDefinition.get(id);
		return class14.forAmount(amount);
	}

}
