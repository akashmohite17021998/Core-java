package com.easy;

public class Palindrome1 {

	public static boolean isPalindrom(int x) {
		boolean flag = false;
		StringBuffer sb = new StringBuffer(String.valueOf(x));
		String s = sb.reverse().toString();
		if(s.equals(String.valueOf(x))) {
			flag = true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrom(121));
	}
}
