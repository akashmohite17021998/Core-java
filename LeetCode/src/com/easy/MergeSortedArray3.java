package com.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray3 {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	    
		if(nums2.length==0)
			return;
        	
		int i = nums1.length-1;
        		
        for(int j = 0; j<nums2.length; j++) {
        	nums1[i] = nums2[j];
        	i--;
        }
        	        	
		Arrays.sort(nums1);
		
        System.out.println(Arrays.toString(nums1));
    }
	
	public static void main(String[] args) {
		int[] nums1 = {0};
		int m = 6;
		int[] nums2 = {1};
		int n = 3;
		merge(nums1, m, nums2, n);
	}
	
}
