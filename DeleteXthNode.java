package com.linkedlist;

public class DeleteXthNode {
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
		traversal(head);
		// here 2 is index number(1 based)
		Node updateHead = deleteXthNode(head, 1);
		traversal(updateHead);
	}

	private static Node deleteXthNode(Node head, int i) {
		int c = 1;
		Node temp=head;
		if(i==1)
		{
			head=head.next;
			return head;
		}
		temp = head;
		
		while (temp != null) {
			if (c == i - 1)
				break;
			temp = temp.next;
			c++;
		}
		temp.next = temp.next.next;
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
