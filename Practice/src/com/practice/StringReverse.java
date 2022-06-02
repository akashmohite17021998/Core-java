package com.practice;

public class StringReverse {
	public static void main(String[] args) {
		String str = "akash";
		
		char[] ch = str.toCharArray();	//a k a s h 
		
		for(int i = (ch.length-1); i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
