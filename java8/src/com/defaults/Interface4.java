package com.defaults;

public interface Interface4 {

	default void method1() {
		System.out.println("Inside method A " + Interface4.class);
	}
}
