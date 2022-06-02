package com.NewMultiThreading;

public class Ex06 {
	public static void main(String[] args) {
		MyRunnable6 r = new MyRunnable6();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<10 ; i++) {
			System.out.println("Main Method");
		}
	}

}
class MyRunnable6 implements Runnable{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Run Method");
		}
	}
}