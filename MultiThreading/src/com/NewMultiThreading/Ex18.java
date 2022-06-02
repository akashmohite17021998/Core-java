package com.NewMultiThreading;

public class Ex18 {
	public static void main(String[] args) throws InterruptedException {
		MyThread18 t = new MyThread18();
		t.start();
		t.interrupt();
		System.out.println("End of main thread.");
	}

}

class MyThread18 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("I am lazy thread - " + i);
		}
		System.out.println("I am entering into sleeping state.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("I got Interrupted.");
		}
	}
}