package com.jagex;

public class RenderingHints extends Class44_Sub3_Sub4 {

	public boolean aBoolean1613;
	public boolean aBoolean1614;
	public int anInt1615;
	public int anInt1616;
	public int anInt1617;
	public boolean aBoolean1618;
	public int size;
	public int idle_animation;
	public int anInt1621;
	public int walk_animation;
	public int rotate_animation;
	public int counter_clockwise_animation;
	public int clockwise_animation;
	public int anInt1626;
	public String floating_text;
	public int anInt1628;
	public int textColor;
	public int textEffects;
	public int anIntArray1631[];
	public int anIntArray1632[];
	public int anIntArray1633[];
	public int anInt1634;
	public int anInt1635;
	public int anInt1636;
	public int interacting_entity;
	public int view_x;
	public int view_y;
	public int anInt1640;
	public int anInt1641;
	public int anInt1642;
	public int animation_id;
	public int anInt1644;
	public int anInt1645;
	public int animation_delay;
	public int anInt1647;
	public int spotanim_id;
	public int anInt1649;
	public int anInt1650;
	public int anspotanim_delay;
	public int spotanim_height;
	public int anInt1653;
	public int anInt1654;
	public int anInt1655;
	public int anInt1656;
	public int anInt1657;
	public int anInt1658;
	public int anInt1659;
	public int anInt1660;
	public int anInt1661;
	public int anInt1662;
	public int degrees_to_turn;
	public int current_step;
	public int walking_queue_x[];
	public int walking_queue_y[];
	public boolean running_queue[];
	public int anInt1668;
	public int anInt1669;

	public void teleport(int x, int y, boolean region_changed) {
		if (animation_id != -1 && AnimationSequence.cache[animation_id].walking_blend_mode == 1) {
			animation_id = -1;
		}
		if (!region_changed) {
			int k = x - walking_queue_x[0];
			int l = y - walking_queue_y[0];
			if (k >= -8 && k <= 8 && l >= -8 && l <= 8) {
				if (current_step < 9) {
					current_step++;
				}
				for (int i1 = current_step; i1 > 0; i1--) {
					walking_queue_x[i1] = walking_queue_x[i1 - 1];
					walking_queue_y[i1] = walking_queue_y[i1 - 1];
					running_queue[i1] = running_queue[i1 - 1];
				}
				walking_queue_x[0] = x;
				walking_queue_y[0] = y;
				running_queue[0] = false;
				return;
			}
		}
		current_step = 0;
		anInt1669 = 0;
		anInt1668 = 0;
		walking_queue_x[0] = x;
		walking_queue_y[0] = y;
		anInt1615 = walking_queue_x[0] * 128 + size * 64;
		anInt1616 = walking_queue_y[0] * 128 + size * 64;
	}

	public void queue_step(boolean running, int direction) {
		int source_x = walking_queue_x[0];
		int source_y = walking_queue_y[0];
		if (direction == 0) {
			source_x--;
			source_y++;
		}
		if (direction == 1) {
			source_y++;
		}
		if (direction == 2) {
			source_x++;
			source_y++;
		}
		if (direction == 3) {
			source_x--;
		}
		if (direction == 4) {
			source_x++;
		}
		if (direction == 5) {
			source_x--;
			source_y--;
		}
		if (direction == 6) {
			source_y--;
		}
		if (direction == 7) {
			source_x++;
			source_y--;
		}
		if (animation_id != -1 && AnimationSequence.cache[animation_id].walking_blend_mode == 1) {
			animation_id = -1;
		}
		if (current_step < 9) {
			current_step++;
		}
		for (int step_index = current_step; step_index > 0; step_index--) {
			walking_queue_x[step_index] = walking_queue_x[step_index - 1];
			walking_queue_y[step_index] = walking_queue_y[step_index - 1];
			running_queue[step_index] = running_queue[step_index - 1];
		}
		walking_queue_x[0] = source_x;
		walking_queue_y[0] = source_y;
		running_queue[0] = running;
	}

	public void reset_movement() {
		current_step = 0;
		anInt1669 = 0;
	}

	/**
	 * wtf
	 * @param flag
	 * @return
	 */
	public boolean method535(boolean flag) {
		if (!flag) {
			throw new NullPointerException();
		} else {
			return false;
		}
	}

	public void method536(int i, int j, int k, boolean flag) {
		if (flag) {
			return;
		}
		for (int l = 0; l < 4; l++) {
			if (anIntArray1633[l] <= j) {
				anIntArray1631[l] = k;
				anIntArray1632[l] = i;
				anIntArray1633[l] = j + 70;
				return;
			}
		}
	}

	public RenderingHints() {
		aBoolean1613 = false;
		aBoolean1614 = false;
		aBoolean1618 = false;
		size = 1;
		idle_animation = -1;
		anInt1621 = -1;
		walk_animation = -1;
		rotate_animation = -1;
		counter_clockwise_animation = -1;
		clockwise_animation = -1;
		anInt1626 = -1;
		anInt1628 = 100;
		anIntArray1631 = new int[4];
		anIntArray1632 = new int[4];
		anIntArray1633 = new int[4];
		anInt1634 = -1000;
		interacting_entity = -1;
		anInt1640 = -1;
		animation_id = -1;
		spotanim_id = -1;
		anInt1661 = 200;
		degrees_to_turn = 32;
		walking_queue_x = new int[10];
		walking_queue_y = new int[10];
		running_queue = new boolean[10];
	}

}
