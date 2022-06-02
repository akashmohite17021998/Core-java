package com.leaning.linkedlist;

public class EmployeeNode {

	private Employee employee;	//janeJones johnDoe marySmith mikeWilson
	
	private EmployeeNode next;	//null	janeJones johnDoe marySmith
	
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

	@Override
	public String toString() {
		return employee.toString();
	}
	
	
	
}
