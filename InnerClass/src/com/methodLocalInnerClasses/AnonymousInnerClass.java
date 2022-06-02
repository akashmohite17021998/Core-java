package com.methodLocalInnerClasses;

class Test{
	
	public void taste() {
		
		System.out.println("Salty");
		
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Test t1 = new Test() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		t1.taste();
		
		Test t2 = new Test();
		t2.taste();
		
		Test t3 = new Test() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		t3.taste();
		
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());
		System.out.println(t3.getClass().getName());
	}
}


