package com.singly.linkedlist;

public class StudentNode {

	private Student student;
	private StudentNode next;
	
	public StudentNode(Student head) {
		this.head = head;
	}

	public Student getHead() {
		return head;
	}

	public void setHead(Student head) {
		this.head = head;
	}

	public StudentNode getNext() {
		return next;
	}

	public void setNext(StudentNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return student.toString();
	}
	
	
	
}
