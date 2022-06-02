package com.NewMultiThreading;

public class Ex09 {
	public static void main(String[] args) {
		MyThread9 t = new MyThread9();
		t.start();
		System.out.println("Main method executed by thread: " + Thread.currentThread().getName());
	}

}
class MyThread9 extends Thread{
	public void run() {
		System.out.println("Run method executed by thread: " + Thread.currentThread().getName());
	}
}