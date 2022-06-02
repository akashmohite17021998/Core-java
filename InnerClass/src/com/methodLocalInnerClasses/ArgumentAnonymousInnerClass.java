package com.methodLocalInnerClasses;

public class ArgumentAnonymousInnerClass {

	public static void main(String[] args) {
		new Thread(
				new Runnable() {
					public void run() {
						for(int i = 0; i<5; i++) {
							System.out.println("Argument Anonymous Inner Class");
						}
					}
				}).start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Main method123");
		}
	}
}
