package com.NewMultiThreading;

public class Ex02 {
	
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
	}

}

class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("no-arg method");
	}
	public void run(int i) {
		System.out.println("int-arg method");
	}
	
}