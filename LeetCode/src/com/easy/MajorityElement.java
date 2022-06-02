package com.easy;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
        
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        
        int a = 0;//4
        
        int b = 0;//2
        
        int c = 0;//2
        
        for(int num:nums){
            
            if(m.containsKey(num)){
                
                a = m.get(num)+1;
                
                m.put(num, a);
                
            }else{
                
                m.put(num, 1);
                
            }
            
        }
        
        a = 0;
        
        while(true){
            
        	if(b==10)
                break;
            
            if(m.containsKey(b)){
                
                if(m.get(b)>a) {
                	
                	a = m.get(b);	//3
                	
                	c = b;
                	
                }
                    
                
            }
            
            b++;
            
        }
        
        return c;
        
    }

	public static void main(String[] args) {
		
		int[] i = {3,2,3};	//[1,1,1,1,1,1,1,2,2,3,4,5,6]
		
		System.out.println(majorityElement(i));
		
	}
	
}
