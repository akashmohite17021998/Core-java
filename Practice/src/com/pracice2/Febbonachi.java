package com.pracice2;

import java.util.Scanner;

public class Febbonachi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();	//10
		
		int a = 0;	//0
		
		int b = 1;	//1
		
		System.out.println(a + "\n");
		
		System.out.println(b + "\n");
		
		for(int i = 1; i<=number-2; i++) {
			
			int d = a+b;	//1
			
			a = b;
			
			b = d;
			
			System.out.println(d + "\n");	//0, 1, 1, 2, 3
		}
	}
	
}
