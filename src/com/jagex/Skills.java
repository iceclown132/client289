package com.jagex;
/**
 * The constant values for the skills
 * 
 * @author red
 *
 */
public class Skills {

	/**
	 * The amount of skills
	 */
	public static int skillCount = 25;

	/**
	 * The names of the skills
	 */
	public static String skillNames[] = { "attack", "defence", "strength",
			"hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting",
			"fletching", "fishing", "firemaking", "crafting", "smithing",
			"mining", "herblore", "agility", "thieving", "slayer", "-unused-",
			"runecraft", "-unused-", "-unused-", "-unused-", "-unused-" };

	/**
	 * Indicates the skills are active or not (as in actually used)
	 */
	public static boolean active[] = { true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, true, false, false, false, false };

}