package com.easy;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
        
        char[] c = s.toCharArray(); // "   fly me   to   the moon  "
        
        int count = 0;
        
        int count1 = 0;
        
        boolean flag = true;
        
        if(s.length()!=0) {
        
        	for(int i = c.length-1; i>=0; i--){	//'  noo
            
        		if(flag) {
        		
        			if(c[i]!=' ') {
        				flag = false;
        				count++;
        			}
        			
        		}else {
        			
        			if(c[i]==' '){
        				break;
        			}else {
        				count++;
        			}
        		}
        	}
        }
        
        return count;
        
    }
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		System.out.println(lengthOfLastWord(s));
		
	}
	
}
