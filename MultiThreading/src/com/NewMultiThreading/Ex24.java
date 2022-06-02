package com.NewMultiThreading;

public class Ex24 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread24 t = new MyThread24();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		
	}

}

class MyThread24 extends Thread{
	
}