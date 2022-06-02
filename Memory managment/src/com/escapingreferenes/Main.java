package com.escapingreferenes;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		Map<String, Customer> myCustomer = records.getCustomers();
		
		myCustomer.clear();
		
		System.out.println("hello");
		
		for (Customer next : records)
				{
					System.out.println(next);
				}
		
		

	}
	
}
