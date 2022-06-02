package com.practice;

public class Temp {

	public static void myMethod(String str) {
		str = "def";
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String str = "abc";
		myMethod(str);
		System.out.println(str);
	}
}
