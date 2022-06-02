package com.NewMultiThreading;

public class Ex20 {
	public static void main(String[] args) {
		Display20 d = new Display20();
		MyThread201 t1 = new MyThread201(d);
		MyThread202 t2 = new MyThread202(d);
		t1.start();
		t2.start();
	}

}

class Display20 {
	
	public synchronized void displayn() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
	
	public synchronized void displayc() {
		for(int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

class MyThread201 extends Thread{
	
	Display20 d;
	
	MyThread201(Display20 d){
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}
}

class MyThread202 extends Thread{
	
	Display20 d;
	
	MyThread202(Display20 d){
		this.d = d;
	}
	public void run() {
		d.displayc();
	}
}