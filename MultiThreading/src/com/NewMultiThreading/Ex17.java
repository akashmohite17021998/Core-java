package com.NewMultiThreading;

public class Ex17 {
	public static void main(String[] args) throws InterruptedException {
		MyThread17 t = new MyThread17();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}

}

class MyThread17 extends Thread{
	public void run() {
		
			try {
				for(int i = 0; i < 10; i++) {
				System.out.println("I am lazy thread.");
				Thread.sleep(1000);
			}}
			catch(InterruptedException e) {
				System.out.println("I got interrupted.");
			}
		}
		
	}
