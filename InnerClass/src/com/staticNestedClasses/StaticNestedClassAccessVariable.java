package com.staticNestedClasses;

public class StaticNestedClassAccessVariable {

	int x = 10;
	static int y = 20;
	
	static class Inner{
		public void m1() {
			System.out.println(x);	//In static nested inner class we can't access instance variables.
			System.out.println(y);	//But we can access static variables.
		}
	}
	
	public static void main(String[] args) {
		Inner i = new Inner();
		i.m1();
	}
}
