package com.staticNestedClasses;

public class StaticNestedClass {

	static class Nested{
		public void m1() {
			System.out.println("Static nestes class method.");
		}
	}
	
	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
		Test t = new Test();
		t.m1();
	}
}


class Test{
	public void m1() {
		StaticNestedClass.Nested m = new StaticNestedClass.Nested();
		m.m1();
	}
}