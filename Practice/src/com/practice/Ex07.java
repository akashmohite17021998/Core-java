package com.practice;
import java.util.Scanner;

public class Ex07 {
	
	 
	
	public static String largestAndSmallest(String[] s) {
		
		
		char[] c = {};	//234861
		
		for(String s1:s) {
			c = s1.toCharArray();
		}
		
		int large = c[0];
		int small = c[0];
		
		for(int i = 0; i<c.length;i++) {	//234861
			
			if(small>c[i]) {
				small = c[i];
			}
			
			if(large<c[i])
				large = c[i];
			
		}
		
		return (small-48)+""+(large-48);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String s1 = s.nextLine();
		
		String[] s2 = {s1};
		
		System.out.println(Ex07.largestAndSmallest(s2));
	}

}
