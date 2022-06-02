package com.WhizLabs;

public class Q14 {
	final int j = 32;
	
	public static void main(String[] args) {
		char c = 'A';
		System.out.println((char)calc(c));
	}
	static int calc(int i) {
		return (i+j);
	}
}
