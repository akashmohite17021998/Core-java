package com.MultiThreading;

public class Ex07 {
	public static void main(String[] args) {
		MyThread7 t = new MyThread7();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("main thread");
	}

}
class MyThread7 extends Thread{
	public void run() {
		System.out.println("Child thread");
	}
}