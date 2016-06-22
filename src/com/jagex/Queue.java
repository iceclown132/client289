package com.jagex;
public class Queue {

	public QueueNode head;
	public QueueNode current;

	public Queue() {
		head = new QueueNode();
		head.next = head;
		head.previous = head;
	}

	public void addLast(QueueNode node) {
		if (node.previous != null) {
			node.unlink();
		}
		node.previous = head.previous;
		node.next = head;
		node.previous.next = node;
		node.next.previous = node;
	}

	public QueueNode poll() {
		QueueNode node = head.next;
		if (node == head) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	public QueueNode peek() {
		QueueNode node = head.next;
		if (node == head) {
			current = null;
			return null;
		} else {
			current = node.next;
			return node;
		}
	}

	public QueueNode next() {
		QueueNode node = current;
		if (node == head) {
			current = null;
			return null;
		} else {
			current = node.next;
			return node;
		}
	}

	public int size() {
		int i = 0;
		for (QueueNode node = head.next; node != head; node = node.next) {
			i++;
		}
		return i;
	}
}
