package com.defaults;

public interface Interface1 {

	default void method1() {
		System.out.println("Inside method A " + Interface1.class);
	}
}
