package com.normalInnerClass;

public class AccessingInnerClassCodeFromOutsideOfOuterClass {

	public static void main(String[] args) {
		Test o = new Test();
		Test.Inner i = o.new Inner();
		i.m1();
	}
	
	
}

class Test{
	public class Inner{
		public void m1() {
			System.out.println("Hello I am inside of inner class.");
		}
	}
}
