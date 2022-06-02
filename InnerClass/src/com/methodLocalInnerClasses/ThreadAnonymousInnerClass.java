package com.methodLocalInnerClasses;

public class ThreadAnonymousInnerClass {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			public void run() {
				for(int i = 1; i<5; i++) {
					System.out.println("Child thread");
				}
			}
		};
		
		t.start();
		
		for(int i = 1; i<5; i++) {
			System.out.println("Main thread");
		}
		
	}
}
