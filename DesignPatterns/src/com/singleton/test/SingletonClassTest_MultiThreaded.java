package com.singleton.test;

public class SingletonClassTest_MultiThreaded {

	public static void main(String[] args) {
		
		TicketBookingOperation operation = new TicketBookingOperation();
		
		Thread t1 = new Thread(operation);
		Thread t2 = new Thread(operation);
		Thread t3 = new Thread(operation);
		
		t1.start();
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		try {
			Class.forName("com.singleton.SingletonUsingEagerInstantiation");	//loading of class
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		try {
//		Class.forName("com.singleton.SingletonWithInnerClassLazyInstantiation");
//		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}
