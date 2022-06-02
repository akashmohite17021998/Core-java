package com.test2;

public class MultiThreadTest {

	public static void main(String[] args) {
		
		TicketBookingTest t = new TicketBookingTest();
		
		TicketBookingTest t1 = new TicketBookingTest();
		
		t.start();
		t1.start();
	}
	
	
}
