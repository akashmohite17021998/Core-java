package com.pracice2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		
		String s1 = String.valueOf(number);
		
		char[] c1 = s1.toCharArray();	//153
		
		char[] c2 = new char[s1.length()];
		
		for(int i = 0; i<s1.length()-1; i++) {
			
			c2[i] = (char) (c1[i]*c1[i]*c1[i]);
			
			
		}
		
		int a = 0;
		
		for(char c3:c2) {
			a += c3;
		}
		System.out.println(a);
		if(a==number) {
			System.out.println(number + " number is armstrong number.");
		}else {
			System.out.println(number + " number is not armstrong number.");
		}
	}
}
