package com.NewMultiThreading;

public class Ex04 {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Main Method");
	}

}

class MyThread4 extends Thread{
	public void start() {
		System.out.println("Normal start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}