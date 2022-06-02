package com.singleton.test;

import com.singleton.singleton.Singleton;
import com.singleton.singleton.Singleton2;
import com.singleton.singleton.Singleton3;
import com.singleton.singleton.SingletonUsingEagerInstantiation;

public class TicketBookingOperation implements Runnable {
	
	public void run() {
		
////		System.out.println("Ticket booking operation run()");
//		
//		System.out.println("TicketBookingOperation.run()"); //systrace and ctrl + space
//		
////		Singleton s = Singleton.getInstance();
//		
//		Singleton2 s = Singleton2.getINSTANCE();
//		
//		System.out.println(s.hashCode());
		
		
		//System.out.println("Ticket booking operation run()");
		
		System.out.println("TicketBookingOperation.run()"); //systrace and ctrl + space
		
//		Singleton s = Singleton.getInstance();
		
		Singleton s = Singleton.getINSTANCE();
		
		System.out.println(s.hashCode());
		
	}
}
