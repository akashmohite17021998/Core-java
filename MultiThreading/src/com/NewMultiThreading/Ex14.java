package com.NewMultiThreading;

public class Ex14 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread14.mt = Thread.currentThread();
		
		MyThread14 t = new MyThread14();
		t.start();
		for(int i = 0; i<10 ; i++) {
			System.out.println("Main method");
			
				Thread.sleep(2000);
			
		}
	}
}

class MyThread14 extends Thread{
	static Thread mt;

	public void run() {
		try {
		mt.join();
		}
		catch(InterruptedException e) {}
		for(int i = 0; i<10 ; i++) {
			System.out.println("run method");
		}
	}
}