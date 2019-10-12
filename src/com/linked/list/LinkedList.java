package com.linked.list;

public class LinkedList {

	Node head;
/**
 *  
 */
	public void createLinkedList() {

		head = new Node(0);
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);

		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;

	}

	public void interateLinkedList(Node head) {

		while (head != null) {

			System.out.println(head.data);
			head = head.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj = new LinkedList();

		obj.createLinkedList();

		obj.interateLinkedList(obj.head);

	}

}
