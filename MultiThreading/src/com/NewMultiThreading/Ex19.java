package com.NewMultiThreading;

public class Ex19 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread19 t1 = new MyThread19(d, "Dhoni");
		MyThread19 t2 = new MyThread19(d, "Kohli");
		t1.start();
		t2.start();
	}

}


class MyThread19 extends Thread{
	Display d;
	String name;
	MyThread19(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}

class Display{
	public synchronized void wish(String name) {
		for(int i = 0; i < 10 ; i++) {
			System.out.print("Good Morning - ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
	
}