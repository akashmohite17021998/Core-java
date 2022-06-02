package com.apnacollege.recursion;

public class Recursion3 {

//	public static void calcFactorial(int n, int fac) {
//		
//		if(n==1) {
//			System.out.println(fac);
//			return;
//		}
//		
//		fac *= n;
//		calcFactorial(n-1, fac);
//		
//	}
	
	public static int calcFactorial(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		}
		
		int fact_nm1 = calcFactorial(n-1);
		
		int fact_n = fact_nm1*n;
		
		return fact_n;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(calcFactorial(5));
		
	}
}
