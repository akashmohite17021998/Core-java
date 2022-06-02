package com.normalInnerClass;

public class AccessingInnerClassCodeFromInstanceAreaOfOuterClass {

	public class Inner{
		public void m1() {
			System.out.println("Inside inner class.");
		}
	}
	
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	
	public static void main(String[] args) {
		AccessingInnerClassCodeFromInstanceAreaOfOuterClass o = new AccessingInnerClassCodeFromInstanceAreaOfOuterClass();
		o.m2();
	}
}
