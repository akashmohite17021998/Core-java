package com.NewMultiThreading;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread("The Rock");
		System.out.println(t.getName());
		Thread.currentThread().setName("Jhon Cena");
		System.out.println(Thread.currentThread().getName());
	}

}
class MyThread8 extends Thread{
	
}