package com.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void people(String numPeople) {
		
		char[] charArray = numPeople.toCharArray();
		for(char c:charArray) {
			int a=Character.getNumericValue(c);
			if(a%2==1) {
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number of people : ");
		
		
		String userName = myObj.nextLine(); 
		people(userName);
		
	}

}
