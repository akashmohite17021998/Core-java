package com.practice;

import java.util.Arrays;

public class Ex011 {

	public static boolean containsDuplicate(int[] nums) {
	      
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            
        	if(i<nums.length) {
        	
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[i]==nums[j]){
                    return true;
                    
                }
            }
        	}
            
        }
        return false;
    }
	
	public static void main(String[] args) {
		
		int[] i = {1, 2, 3, 1};
		
		System.out.println(containsDuplicate(i));
		
		
	}
}
