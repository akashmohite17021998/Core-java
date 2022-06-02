package com.leaning.linkedlist;

public class EmployeeLinkedList {

	private EmployeeNode head;	//node->janeJones->johnDoe->marySmith->mikeWilson
	
	private int size;
	
	public void addToFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		
		node.setNext(head);
		
		head = node;
	}
	
	public void printList() {
		EmployeeNode current = head;	//marySmith
		System.out.print("HEAD -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
			size++;
		}
		System.out.println("null");
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public EmployeeNode removeFromFront() {
		
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removeNode = head;	//mikeWilson
		head = head.getNext();	//marySmith
		size--;
		removeNode.setNext(null);
		
		return removeNode;
		
	}
	
}
