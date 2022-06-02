package com.easy;

public class SearchInsertPositionWithBinarySearch {

	public static int searchInsert(int[] nums, int target) {	

		int s = nums.length-1;
		
		int p = s/2;
		
		if(target<=nums[0])
			return 0;
		else if(target>nums[nums.length-1])
			return nums.length;
		
		while((nums[p]!=target)&&((target<=nums[p]&&target>nums[p-1])? false:true)) {
			if(target>nums[p]) {
				if(s-p==1)
					return p+1;
				if(target>nums[p]&&s<p)
					s=p+(p-s);
				p=(p+s)/2;
			}
			else {
				if(p-s==1)
					return p-1;
				if(target<nums[p]&&s>p)
					s=p-(s-p)+1;
				p = (p+s)/2;
			}
		}
		return p;
    }
	
	public static void main(String[] args) {
		//			  0 1 2 3 4 5 6  7  8  9  10 11 12 13 14 15
		int[] nums = {0,1,3,5,6,8,10,12,13,15,16,18,20,21,22,24};
		
		int target = 25;
		
		System.out.println(searchInsert(nums, target));
		
	}
}
