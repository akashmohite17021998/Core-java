package com.NewMultiThreading;

public class Ex12 {
	public static void main(String[] args) {
		MyThread12 t = new MyThread12();
		t.start();
		for(int i = 0; i<10; i++) {
			System.out.println("main method");
			Thread.yield();
		}
	}

}
class MyThread12 extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Run method");
			
		}
	}
}