package com.singleton.practice;

public class ClientCheck {

	public static void main(String[] args) {
		
//		ThreadCheck tc = new ThreadCheck();
//		
//		Thread t1 = new Thread(tc);
//		Thread t2 = new Thread(tc);
//		Thread t3 = new Thread(tc);
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
		SingltonClassThreading t1 = SingltonClassThreading.getInstance();
		SingltonClassThreading t2 = SingltonClassThreading.getInstance();
		SingltonClassThreading t3 = SingltonClassThreading.getInstance();
		
		System.out.println(t1.hashCode() + " " + t2.hashCode() + " " + t3.hashCode());
	}
}
