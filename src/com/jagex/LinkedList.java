package com.jagex;
public class LinkedList {

	public boolean aBoolean688;
	public boolean aBoolean689;
	public int anInt690;
	public int anInt691;
	public QueueNode node;
	public int anInt693;
	public int anInt694;
	public Class42 aClass42_695;
	public Queue queue;

	public LinkedList(int i) {
		aBoolean688 = true;
		aBoolean689 = false;
		node = new QueueNode();
		queue = new Queue();
		anInt693 = i;
		anInt694 = i;
		aClass42_695 = new Class42(1024, (byte) 124);
	}

	public QueueNode get(long l) {
		QueueNode node = (QueueNode) aClass42_695.method380(l);
		if (node != null) {
			queue.addLast(node);
			anInt691++;
		} else {
			anInt690++;
		}
		return node;
	}

	public void put(long l, QueueNode class44_sub3) {
		if (anInt694 == 0) {
			QueueNode class44_sub3_1 = queue.poll();
			class44_sub3_1.destroy();
			class44_sub3_1.unlink();
			if (class44_sub3_1 == node) {
				QueueNode class44_sub3_2 = queue.poll();
				class44_sub3_2.destroy();
				class44_sub3_2.unlink();
			}
		} else {
			anInt694--;
		}
		aClass42_695.method381(false, class44_sub3, l);
		queue.addLast(class44_sub3);
	}

	public void method341() {
		do {
			QueueNode class44_sub3 = queue.poll();
			if (class44_sub3 != null) {
				class44_sub3.destroy();
				class44_sub3.unlink();
			} else {
				anInt694 = anInt693;
				return;
			}
		} while (true);
	}

}
