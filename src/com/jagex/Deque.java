package com.jagex;

public class Deque {

	public Node head;
	public Node current;

	public Deque(int i) {
		head = new Node();
		head.next = head;
		head.previous = head;
	}

	public void addLast(Node node) {
		if (node.previous != null) {
			node.destroy();
		}
		node.previous = head.previous;
		node.next = head;
		node.previous.next = node;
		node.next.previous = node;
	}

	public void addFirst(Node node) {
		if (node.previous != null) {
			node.destroy();
		}
		node.previous = head;
		node.next = head.next;
		node.previous.next = node;
		node.next.previous = node;
	}

	public Node poll() {
		Node node = head.next;
		if (node == head) {
			return null;
		} else {
			node.destroy();
			return node;
		}
	}

	public Node peek() {
		Node node = head.next;
		if (node == head) {
			current = null;
			return null;
		} else {
			current = node.next;
			return node;
		}
	}

	public Node getLast() {
		Node node = head.previous;
		if (node == head) {
			current = null;
			return null;
		}
		current = node.previous;
		return node;
	}

	public Node next() {
		Node node = current;
		if (node == head) {
			current = null;
			return null;
		} else {
			current = node.next;
			return node;
		}
	}

	public Node previous() {
		Node node = current;
		if (node == head) {
			current = null;
			return null;
		} else {
			current = node.previous;
			return node;
		}
	}

	public void clear() {
		if (head.next == head) {
			return;
		}
		for (Node node = head.next; node != head; node = head.next) {
			node.destroy();
		}
	}

}
