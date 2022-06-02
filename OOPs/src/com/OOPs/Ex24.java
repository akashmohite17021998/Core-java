package com.OOPs;

class  Check{
	public static void m1() {
		System.out.println("Parent");
	}

}
class C10 extends Check{
	public static void m1() {
		System.out.println("Child");
	}
}

class Ex24{
	public static void main(String[] args) {
		
		Check p = new Check();
		p.m1();
		
		C10 c = new C10();
		c.m1();
		
		Check p1 = new C10();
		p1.m1();
	}
}