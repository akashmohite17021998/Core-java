package com.apnacollege.recursion;

public class Recursion4 {

	public static void fibonacci(int n, int a, int b) {
		int a1 = b;
		if(n==2) {
			return;
		}
		if(a==0&&b==1) {
			System.out.println(a);
			System.out.println(b);
		}
		
		b = a+b;
		a = a1;
		System.out.println(b);
		fibonacci(n-1, a, b);
		
	}
	
	public static void main(String[] args) {
		
		fibonacci(10, 0, 1);
		
	}
}
