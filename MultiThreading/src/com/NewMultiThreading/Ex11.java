package com.NewMultiThreading;

public class Ex11 {
	public static void main(String[] args) {
		MyThread11 t = new MyThread11();
		t.setPriority(10);
		t.start();
		System.out.println("Main method");
	}

}
class MyThread11 extends Thread{
	public void run() {
		System.out.println("Run Method");
	}
}