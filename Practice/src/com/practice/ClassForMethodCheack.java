package com.practice;

public abstract class ClassForMethodCheack implements IterfaceForMethodCheck {

	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	public abstract void m3();
	
	public static void main(String[] args) {
		System.out.println("m2");
	}
}
