package com.easy;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
        
		int x = 0, y = 0;
		
		for(int i = 0; i<nums.length-1; i++) {
			
			if(x!=nums.length) {
				
				for(int j = x; j<nums.length; j++) {
					
					x++;
					
					if(nums[i]!=nums[j]) {
						
						y++;
						
						nums[i+1] = nums[j];
						
						break;
						
					}
					
				}
				
			}else {
				nums[i+1] = 0;
			}
			
		}
		
		return y+1;
		
    }
	
	public static void main(String[] args) {
		
		int[] i = {1,1,2};
		
		System.out.println(removeDuplicates(i));
	}
	
}
