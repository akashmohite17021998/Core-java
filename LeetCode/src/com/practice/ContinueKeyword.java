package com.practice;

public class ContinueKeyword {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length>nums2.length) {
        	return intersect(nums2, nums1);
        }
        return nums1;
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4,5,6,7,8};
		int[] nums2 = {1, 2, 8, 9, 3, 4};
		int[] a = intersect(nums1, nums2);
		
		for(int b:a) {
			System.out.println(b);
		}
	}
	
}
