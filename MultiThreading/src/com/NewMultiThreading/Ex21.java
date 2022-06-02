package com.NewMultiThreading;

public class Ex21 {
	public static void main(String[] args) {
		
		Display21 d = new Display21();
		
		MyThread211 t1 = new MyThread211(d, "Dhoni");
		
		MyThread212 t2 = new MyThread212(d, "Kohli");
		
		t1.start();
		
		t2.start();
		
	}

}

class Display21{
	
	public void wish(String name) {
		
		synchronized(this) {
			
			for(int i = 0; i < 10; i++) {
				System.out.print("Good Morning - ");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {}
				System.out.println(name);
			}
		}
	}
	
}

class MyThread211 extends Thread{
	
	Display21 d;
	
	String name;
	
	MyThread211(Display21 d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}

class MyThread212 extends Thread{
	
	Display21 d;
	
	String name;
	
	MyThread212(Display21 d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}