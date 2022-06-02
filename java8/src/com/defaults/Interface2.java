package com.defaults;

public interface Interface2 extends Interface1 {

	default void method2() {
		System.out.println("Inside method B " + Interface2.class);
	}
	
	default void method1() {
		System.out.println("Inside method A " + Interface2.class);
	}
}
