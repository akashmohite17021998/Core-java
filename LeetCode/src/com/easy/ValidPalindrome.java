package com.easy;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {	//ab
		
		if(s.length()==0) {
			return true;
		}
        
		String s1 = s.toLowerCase();
		
		char[] c = s1.toCharArray();	//ab
		
		char[] c1 = new char[s.length()];	//ab
		
		int i = 0;
		
		for(char c2:c) {
			
			if((c2>=97&&c2<=122)||(c2>=48&&c2<=57)) {
				
				c1[i] = c2;
			
				i++;
				
			}
			
		}
		
//		if(i==1)
//			return false;
		
		for(int j = 0; j<(i)/2; j++) {
			
			if(c1[j]!=c1[i-j-1]) {
				
				return false;
				
			}
			
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		
		String s = "a";
		
		System.out.println(isPalindrome(s));
		
	}
	
}
