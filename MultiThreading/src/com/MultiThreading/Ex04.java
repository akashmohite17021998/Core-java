package com.MultiThreading;

public class Ex04 {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Main method");
	}

}

class MyThread4 extends Thread{
	public void start() {
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}