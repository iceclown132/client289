package com.jagex;

/**
 * Contains several constant values
 * 
 * @author red
 */
public interface Constants {

	/**
	 * The opcode for the player synchronization packet
	 */
	int PLAYER_SYNCHRONIZATION = 188;

	/**
	 * The packet for the sprite-interface type 2 (NPC) update
	 */
	int NPC_CHAT_MODEL = 244;

	/**
	 * The opcode for the packet that closes the game session
	 */
	int LOGOUT = 121;

	/**
	 * The opcode for the packet that opens a game-interface
	 */
	int INTERFACE_OPEN_GAME = 119;

	/**
	 * The opcode for the map region packet
	 */
	int MAP_REGION = 219;

	/**
	 * The opcode for the map region packet
	 */
	int INITIALIZE = 133;

	/**
	 * The opcode for the packet that opens an interface in the main gamescreen
	 * and in the player's inventory tab
	 */
	int INTERFACE_INVENTORY = 55;

	/**
	 * The opcode for the packet that opens a tab
	 */
	int OPEN_TAB = 252;

	/**
	 * The opcode for the outgoing packet that sends command information
	 */
	int SEND_COMMAND = 34;

	/**
	 * The opcode for the set tab packet
	 */
	int SET_TAB = 63;

}