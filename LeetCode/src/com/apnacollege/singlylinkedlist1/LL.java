package com.apnacollege.singlylinkedlist1;

public class LL {

	Node head;
	
	private int size = 0;
	
	class Node {
		
		String data;
		
		Node next;
		
		Node(String data){
			this.data = data;
		}
		
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public void addLast(String data) {
		
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		
		while(curr.next!=null) {
			curr = curr.next;
		}
		
		curr.next = newNode;
	}
	
	public void printList() {
		
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
			
		Node curr = head;
		
		while(curr!=null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		
		System.out.print("null");
		System.out.println();
		
	}
	
	public void deletFirst() {
		
		if(head==null) {
			System.out.println("list is empty.");
			return;
		}
		size--;
		head = head.next;
		
	}
	
	public void deletLast() {
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node sLast = head;
		Node last = head.next;
		while(last.next!=null) {
			last = last.next;
			sLast = sLast.next;
		}
		sLast.next = null;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		System.out.println(list.size());
		list.printList();
		list.deletLast();
		list.deletFirst();
		list.printList();
		System.out.println(list.size());
	}
}
