package com.MultiThreading;

public class Ex06 {
	public static void main(String[] args) {
		MyThread6 r = new MyThread6();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i < 10; i++) {
		System.out.println("main method");
		}
	}

}
class MyThread6 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Run method");
		}
	}
}