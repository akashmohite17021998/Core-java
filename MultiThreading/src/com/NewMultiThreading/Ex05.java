package com.NewMultiThreading;

public class Ex05 {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.start();
		System.out.println("Main method");
	}

}
class MyThread5 extends Thread{
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	public void run() {
		System.out.println("Run Method");
	}
}