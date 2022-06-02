package com.easy;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {	//1 3 5 6
        														//2
        for(int i = 0; i<nums.length; i++) {	//1		//0
        	
        	if(nums[i]==target) {
        		return i;
        	}
        	else if(target<nums[i]) {
        		return i;
        	}
        	
        }
        
//        for(int i = 0; i<nums.length; i++) {	//1 3 5 6
//        	
//        	
//        	
//        }
        return nums.length-1;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		
		int target = 7;
		
		System.out.println(searchInsert(nums, target));
		
	}
}
