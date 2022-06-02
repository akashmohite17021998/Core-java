package com.NewMultiThreading;

public class Ex23 {
	
	public static void main(String[] args) {
		
		DeadLock23 d = new DeadLock23();
		
		d.m1();
		
	}

}

class A23{
	
	public synchronized void d1(B23 b) {
		System.out.println("Thread 1 starts execution of d1 method.");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 1 trying to call b's last method.");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A, this is last method.");
	}
	
}

class B23{
	
	public synchronized void d2(A23 a) {
		System.out.println("Thread 2 starts execution of d2 method.");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 2 trying to call a's last method.");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B, this is last method");
	}
	
}

class DeadLock23 extends Thread{
	
	A23 a = new A23();
	B23 b = new B23();
	
	public void m1() {
		this.start();
		a.d1(b);
	}
	
	public void run() {
		b.d2(a);
	}
}