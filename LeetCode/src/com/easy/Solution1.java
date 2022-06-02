package com.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	/**
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.

		You can return the answer in any order.
	 * 
	 * 
	 * 
	 */
	
	    public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i = 0; i< nums.length; i++){
	            int cur = nums[i];
	            int x = target - cur;
	            if(map.containsKey(x)){
	                return new int [] {map.get(x), i};
	            }
	            map.put(cur, i);
	        }
	        return null;
	    }
	
	    public static void main(String[] args) {
			int[] nums = {2, 7, 11, 15};
			int target = 9;
			Solution1 s = new Solution1();
			int[] a = s.twoSum(nums, target);
			for(int b:a) {
				System.out.println(b);
			}
		}
}
