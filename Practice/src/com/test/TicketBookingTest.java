package com.test;

import com.dp.Singleton;

public class TicketBookingTest implements Runnable{

	public void run() {
		
		Singleton s  = Singleton.getInstance();
		
		System.out.println(s.hashCode());
	}
}
