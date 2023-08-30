package com.practice;

public class ABCDPermutation4 {

	private static int a;
	
	private static int b;
	
	public static void permutation(String s, int l, int r) {
		
		if(l==r) {
			System.out.println(s);
			return;
		}
		
		for(int i = l; i<r; i++) {
			
			s = swap(s, l, i);
			
			permutation(s, l+1, r);
			
			s = swap(s, l, i);
		}
		
	}
	
	public static String swap(String s, int l, int r) {
		
		char[] c = s.toCharArray();
		
		char temp = c[r];
		
		c[r] = c[l];
		
		c[l] = temp;
		
		return new String(c);
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABC";
		
		permutation(s, 0, s.length());
		
	}
}
