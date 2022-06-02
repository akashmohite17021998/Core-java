package com.NewMultiThreading;

public class Ex25 {
	public static void main(String[] args) {
		MyThread25 t = new MyThread25();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main thread");
	}
}

class MyThread25 extends Thread{
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
}