package com.easy;

import java.util.Arrays;

public class MoveZeroes2 {
	public static void moveZeroes(int[] nums) {		//[0,1,0,3,12]
        
		int a = 0;
		
		for(int i:nums) {
			if(i==0) {
				a++;
			}
		}
		
		for(int i = 0; i<nums.length; i++) {	//2
			
			for(int j = i; j<nums.length; j++) {	//4
				
				if(!(nums[j]==0)) {
					
					nums[i] = nums[j];		//[1, 3, 12 ]
					nums[j] = 0;
					break;
				}
				
			}
			
		}
		
		for(int k = nums.length-1; k>nums.length-a-1; k--) {
			nums[k] = 0;
		}
		
		System.out.println(a);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] i = {0, 1, 0, 3, 12};
		
		moveZeroes(i);
	}
}
