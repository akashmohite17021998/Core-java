package com.OOPs;

public class Ex26 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);

		Child7 c = new Child7();
		System.out.println(c.x);

		Test t1 = new Child7();
		System.out.println(t1.x);
	}

}

class Test {
	int x = 888;
}

class Child7 extends Test {
	static int x = 999;
}
