package com.easy;

public class Solution2 {

	public static int[] twoSum(int[] nums, int target) {
		int[] elements = new int[2];
		int a = 0;
		for(int i = 0; i<nums.length-1; i++) {
			for(int j =1+i; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					elements[a] = i;
					a++;
					elements[a] = j;
				}
			}
		}
		return elements;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] a = twoSum(nums, target);
		for(int b:a) {
			System.out.println(b);
		}
	}
}
