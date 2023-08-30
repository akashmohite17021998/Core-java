package com.practice;

public class ABCDPermutation3 {

	private static int a;
	
	private static int b;
	
	private static int c;
	
	public static void permutation1(String s, int l, int r, StringBuffer sb) {
		
		if(r==s.length()-1) {
			
			if(a==s.length()) {
				
				c += s.length();
				
				b++;
			}
			
			a++;
			
			sb.append(s.charAt(r));
			
			System.out.println(sb.toString());
			
			return;
			
		}
		
		
		sb.append(s.charAt(l));
		
		
		permutation1(s, l+1, r+1, sb);
		
		s = swapChar(s, l+b, r+a);
		
		sb.setLength(l);
		
		sb.append(s.charAt(l));
		
//		System.out.println(sb.toString());
		
		permutation1(s, l+1, r+1, sb);
		
		
		
	}
	
	public static String swapChar(String s, int l, int r) {
		
		char[] c = s.toCharArray();
		
		char temp = c[r];
		
		c[r] = c[l];
		
		c[l] = temp;
		
		return new String(c);
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		
		StringBuffer sb = new StringBuffer();
		
		permutation1(s, 0, 0, sb);
	}
	
}
