package com.MultiThreading;

public class Ex05 {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.start();
		System.out.println("main method");
	}

}

class MyThread5 extends Thread{
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}