package com.easy;

import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) { // 0,1,2,2,3,0,4,2
        
			int x = 0;
			
			for(int num:nums) {
				if(num!=val) {
					nums[x]=num;
					x++;
				}
			}
			
			for(int i = x; i<nums.length; i++) {
				nums[i] = 0;
			}
			
			return x;
    }

	public static void main(String[] args) {
	
		int[] nums = {3,2,2,3};
		
		int val = 2;
		
		System.out.println(removeElement(nums, val));
		
	}
	
}
