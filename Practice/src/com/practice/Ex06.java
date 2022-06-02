package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
	
	public static int lengthOfLongestSubstring(String s) { //au
        
		char[] c = s.toCharArray(); //au
        
        List<Character> list = new ArrayList<Character>();  //a
        
        int[] count = new int[c.length];
        
        int num = 0;    //2
        
        int max = 0;
        
        if(c.length > 1){
        
        for(int i = 0; i<c.length; i++){
            
            char c1 = c[i];
            
            if(!(list.contains(c1))){
                
                list.add(c1);
                
                num++;
                
            }else{
                
                list.removeAll(list);
                
                count[i] = num;
                
                num = 0;
                
                num++;
                
                list.add(c1);
                
            }
            
        }
        
        for(int count1:count){
           
            if(max<count1){
                
                max=count1;
            
            }
        }
        }
        else if(c.length <= 1){
            return (c.length==1)? 1:0;
        }
        
        return (num<max)? max:num;
        
    }
    
	public static void main(String args[])
	{
		String s = "pwwkew";
		
		System.out.println(lengthOfLongestSubstring(s));
		
		
	}
	
}