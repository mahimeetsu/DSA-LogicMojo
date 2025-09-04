package com.linkedlist;

public class NodeAtGivenIndex {
	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node head = null;
		head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		System.out.println(GetNth(head, 5));
	}

	public static int GetNth(Node head, int index) {
		int c = 1;
		Node temp = head;
		while (temp != null && c < index) {
			temp = temp.next;
			c++;
		}
		if (temp != null)
			return temp.data;
		else
			return -1;

	}
}
