package com.linkedlist;

public class KthFromEnd {
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
		// System.out.println(GetKthFromEnd(head, 2));
		System.out.println(GetKthFromEndOptimal(head, 5));
	}

	public static int GetKthFromEnd(Node head, int k) {
		int c = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			c++;
		}
		System.out.println("c=" + c);
		temp = head;
		int res = c - k;
		System.out.println("res=" + res);
		int c1 = 0;
		while (temp != null) {
			if (c1 == res)
				break;
			temp = temp.next;
			c1++;
		}

		if (temp != null)
			return temp.data;
		else
			return -1;

	}

	public static int GetKthFromEndOptimal(Node head, int k) { // k=5
		// 10->20->30->40->null
		Node slow = head, fast = head;
		Node temp = head;
		int counter = 0;
		while (fast != null && counter < k) {
			fast = fast.next;
			counter++;
		}
		while (fast != null) {
			counter++;
			fast = fast.next;
			slow = slow.next;
		}
		if (k > counter)
			return -1;

		if (slow != null)
			return slow.data;
		else
			return -1;

	}
}
