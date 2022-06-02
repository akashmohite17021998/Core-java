package com.easy;

import java.util.Arrays;

public class MissingNumber268 {

	public static int missingNumber(int[] nums) {
        
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int b = 0;
		for(int num:nums) {
			if(num!=b)
				return b;
			b++;
		}
		
		return 1;
    }
	
	public static void main(String[] args) {
		
		int[] a = {9,6,4,2,3,5,7,0,1};
		
		System.out.println(missingNumber(a));
	}
}
