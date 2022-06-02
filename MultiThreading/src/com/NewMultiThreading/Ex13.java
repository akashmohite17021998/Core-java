package com.NewMultiThreading;

public class Ex13 {
	public static void main(String[] args) throws InterruptedException {
		MyThread13 t = new MyThread13();
		t.start();
		t.join();
		for(int i = 0; i<10 ; i++) {
			System.out.println("Main method");
		}
	}

}

class MyThread13 extends Thread{
	public void run() {
		for(int i = 0; i<10 ; i++) {
			System.out.println("Run method");
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}