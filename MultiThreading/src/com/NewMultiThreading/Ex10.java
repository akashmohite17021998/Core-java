package com.NewMultiThreading;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(17);
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		MyThread10 t = new MyThread10();
		System.out.println(t.getPriority());
	}

}
class MyThread10 extends Thread{
	
}