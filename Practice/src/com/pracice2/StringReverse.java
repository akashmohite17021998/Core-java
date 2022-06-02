package com.pracice2;

import java.util.StringJoiner;

public class StringReverse {

	public static void main(String[] args) {
		String name = "dhriti";
		char[] c = name.toCharArray();
		for(int i = c.length-1;i>=0; i--) {
			System.out.print(c[i]);
		}
		String name2 = new String(c);
		System.out.println("\n" +name2);
	}
	
}
