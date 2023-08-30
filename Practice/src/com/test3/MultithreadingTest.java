package com.test3;

public class MultithreadingTest {

	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		MyRunnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
