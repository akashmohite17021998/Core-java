package com.stack.heap;

public class CheckForFinalKeyword {

	public static void main(String[] args) {
		final Customer cust;
		cust = new Customer("akash");
		cust.setName("john");
		System.out.println(cust);
	}
	
}
