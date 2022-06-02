package com.apnacollege.recursion;

public class Recursion2 {

	public static void printSum(int a, int n, int sum) {
		if(a==n+1) {
			System.out.println(sum);
			return;
		}
		sum += a;
		printSum(a+1, n, sum);
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {	//12345
		
		printSum(1, 5, 0);
	}
}
