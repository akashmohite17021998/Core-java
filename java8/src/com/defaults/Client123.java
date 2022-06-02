package com.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {
	
	public void method1() {
		System.out.println("Inside method A " + Client123.class);
	}

	public static void main(String[] args) {
		
		Client123 client123 = new Client123();
		
		client123.method1();
		client123.method2();
		client123.method3();
	}
}
