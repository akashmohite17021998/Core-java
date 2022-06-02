package com.pracice2;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		
		String s1 = String.valueOf(number);
		
		char[] c = s1.toCharArray();
		
		char[] c1 = new char[s1.length()];
		
		for(int i = s1.length()-1; i>=0; i--) {
			c1[s1.length()-1-i] = c[i];
		}
		
		String s2 = new String(c1);
		
		if(s1.equals(s2)) {
			System.out.println("number" + number + " is palindrom.");
		}else {
			System.out.println("number" + number + " is not palindrom.");
		}
	}
	
}
