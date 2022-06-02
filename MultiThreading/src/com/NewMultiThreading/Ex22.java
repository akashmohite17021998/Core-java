package com.NewMultiThreading;

public class Ex22 {
	public static void main(String[] args) throws InterruptedException {
		MyThread22 t = new MyThread22();
		t.start();
		
		synchronized(t) {
			System.out.println("Main thread calling wait method.");
			t.wait();
			System.out.println("Main thread got notification");
			System.out.println(t.total);
		}
	}

}

class MyThread22 extends Thread{
	
	int total = 0;
	
	public void run() {
		System.out.println("Child thread starts calculation.");
		for(int i = 0; i <= 100; i++) {
			total = total + i;
		}
		synchronized(this) {
		System.out.println("child thread giving notification.");
		this.notify();
		}
	}
}