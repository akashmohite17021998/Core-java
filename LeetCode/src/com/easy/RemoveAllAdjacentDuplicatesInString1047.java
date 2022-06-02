package com.easy;

public class RemoveAllAdjacentDuplicatesInString1047 {

	public static String removeDuplicates(String s) {
        
        if(s.length()==1)
            return s;
        
        int b = 1;
        
        StringBuffer sb = new StringBuffer(s);
        
        for(int i = 0; i<sb.length()-1; i = b){
            
            if(sb.charAt(i) == sb.charAt(i+1)){
                
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if(i!=0){
                    b = i-1;
                }
                
            }else{
                
                b = i++;
                
            }
            
        }
        
        return sb.toString();
        
    }
	
	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}
	
}
