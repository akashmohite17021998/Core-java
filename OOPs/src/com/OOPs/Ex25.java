package com.OOPs;

public class Ex25 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.m1(10);
		
		Child2 c = new Child2();
		c.m1(10);
		
		Parent1 p1 = new Child2();
		p1.m1(10);
	}

}

class Parent1{
	public void m1(int... i) {
		System.out.println("Parent");
	}
}

class Child2 extends Parent1{
	public void m1(int... i) {
		System.out.println("Child");
	}
}