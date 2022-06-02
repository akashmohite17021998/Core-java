package com.WhizLabs;

public class Q09 {
	protected void m1() {
		System.out.println("Hello");
	}

}
class V extends Q09{
	public static void main(String[] args) {
		Q09 a = new Q09();
		a.m1();
		
		V v = new V();
		v.m1();
		
		Q09 a1 = new V();
		a1.m1();
	}
	
}