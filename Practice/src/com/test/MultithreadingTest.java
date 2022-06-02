package com.test;

public class MultithreadingTest {

	public static void main(String[] args) {
		
		TicketBookingTest t = new TicketBookingTest();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
