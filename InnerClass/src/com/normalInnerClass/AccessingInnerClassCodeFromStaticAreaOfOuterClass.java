package com.normalInnerClass;

public class AccessingInnerClassCodeFromStaticAreaOfOuterClass {

	public class InnerClass{
		public void m1() {
			System.out.println("Inside m1() method of inner class.");
		}
	}
	
	public static void main(String[] args) {
		
		AccessingInnerClassCodeFromStaticAreaOfOuterClass o = new AccessingInnerClassCodeFromStaticAreaOfOuterClass();	//OuterClass o = new OuterClass();
		
		AccessingInnerClassCodeFromStaticAreaOfOuterClass.InnerClass i = o.new InnerClass();	//Outer.Inner i = o.new Inner();
		
		i.m1();
	}
}
