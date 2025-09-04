package com.linkedlist;

public class InsertAtEnd {
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
		Node updateHead = insertAtEnd(head, 50);
		traversal(updateHead);
	}

	public static Node insertAtEnd(Node head, int x) {
		Node newNode = new Node(x);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next=newNode;
		return head;
	}

	public static void traversal(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println(temp);
	}
}
