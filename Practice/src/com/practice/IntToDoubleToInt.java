package com.practice;

public class IntToDoubleToInt {

	public static void main(String[] args) {
		
		int left = 0;
		int right = 5;
		int pivot = 0;
		
		pivot = (right + left) >>> 1;
		
		System.out.println(pivot);
	}
	
}
