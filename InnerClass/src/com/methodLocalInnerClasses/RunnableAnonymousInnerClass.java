package com.methodLocalInnerClasses;

public class RunnableAnonymousInnerClass {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("Child thresd");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Main thresd");
		}
	}
}
