package com.easy;

public class ValidPalindromeWithRecursion {

	public static boolean isPalindrome(String s) {
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i)<=97&&s.charAt(i)<=97+26){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            
        }
        return isPalindrome(sb.toString(), 0, sb.length()-1);
    }
    
    public static boolean isPalindrome(String s, int first, int last){
        
        if(first>=last){
            return true;
        }
        
        if(s.charAt(first)!=s.charAt(last)){
            return false;
        }
        
        return isPalindrome(s, first+1, last-1);
        
    }
    
    public static void main(String[] args) {
		
    	String s = "A man, a plan, a canal: Panama";
    	
    	System.out.println(isPalindrome(s));
    	
	}
	
}
