package com.easy;

import java.util.TreeSet;

public class MergeSortedArray2 {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        TreeSet<Integer> list = new TreeSet<Integer>();
        
        for(int i = 0; i<m+n; i++) {
        	
        	if(i<(nums1.length)) {
        		System.out.println(i);
        		if(nums1[i]!=0)
        			list.add(nums1[i]);
        	}else {
        		list.add(nums2[i-nums1.length]);
        	}
        }
		
        for(int i = 0; i<nums1.length; i++) {
        	
        }
        System.out.println(list);
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 6;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
	}
	
}
