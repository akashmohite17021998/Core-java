package com.test2;

import com.dp2.SingletonWithDoubleNullCheck;

public class TicketBookingTest extends Thread{

	public void run() {
		
		SingletonWithDoubleNullCheck s = SingletonWithDoubleNullCheck.getInstance();
		
		System.out.println(s.hashCode());
		
	}
	
}
