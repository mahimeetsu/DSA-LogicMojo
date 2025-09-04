package com.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
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
		// traversal(head);
	//	Node reverseLL = reverseLLUsingStack(head);
		//traversal(reverseLL);
		Node reverseLL1 = reverseLLUsingLoop(head);
		traversal(reverseLL1);
	}

	public static void traversal(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println(temp);
	}

	// O(N) AND O(N)
	public static Node reverseLLUsingStack(Node head) {
		// 10 ->20 ->30 ->40 ->null

		// step-1: traverse a LL and store in stack
		Stack<Integer> st = new Stack();
		Node temp = head;

		while (temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}

		// step-2: read the data from the stack and store in LL
		temp = head;
		while (temp != null) {
			temp.data = st.pop();
			temp = temp.next;
		}
		return head;
	}

	// O(N) AND O(1)
	public static Node reverseLLUsingLoop(Node head) {
		// 10 ->20 ->30 ->40 ->null
		Node prev = null;
		Node temp = head;

		while (temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}

		return prev;
	}
}
