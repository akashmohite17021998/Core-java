package com.singly.linkedlist;

public class EmployeeLinkedList {

	private EmployeeNode head;	//null	new EmployeeNode(janeJones) new Employee(johnDoe) new EmployeeNode(marySmith) new EmployeeNode(mikeWilson)
	
	private int size = 0;
	
	public void addToFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		
		node.setNext(head);
		
		head = node;
		size++;
	}
	
	public void printList() {
		
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public int size() {
		return size;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
}
