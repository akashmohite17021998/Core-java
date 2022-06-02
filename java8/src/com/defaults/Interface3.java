package com.defaults;

public interface Interface3 extends Interface2 {

	default void method3() {
		System.out.println("Inside method C " + Interface3.class);
	}
}
