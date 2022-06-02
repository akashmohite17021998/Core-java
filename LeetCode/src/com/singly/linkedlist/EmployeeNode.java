package com.singly.linkedlist;

public class EmployeeNode {

	private Employee employee;	//janeJones	johnDoe marySmith mikeWilson
	private EmployeeNode next;	//null new EmployeeNode(janeJones) new EmployeeNode(johnDoe) mew EmployeeNode(marySmith)
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	public String toString() {
		return employee.toString();
	}
	
}
