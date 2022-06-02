package com.easy;

public class ImplementStrStr3 {

	public static int strStr(String a, String b) {	//a=hello
   													//b=  ll
		
		if((b.length()==0)&&(b.length()>a.length()))
			return 0;
		
		char[] c = new char[b.length()];	//b=  ll
		
		char[] c1 = new char[a.length()];	//a=hello
		
		fo
		
    }
	
	public static void main(String[] args) {
		
		String hayStack = "hello";
		
		String needle = "ll";
		
		System.out.println(strStr(hayStack, needle));
		
	}
	
}
