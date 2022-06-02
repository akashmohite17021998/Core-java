package com.easy;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {
	
	public static boolean findDuplicate(int[] nums) {	//1,2,3,1
		
		boolean flag = false;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i:nums) {
			
			if(!list.contains(i)) {
				list.add(i);
			}
			else {
				flag = true;
				break;
			}
			
		}
		return flag;
	}

	
	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		System.out.println(findDuplicate(nums));
	}
}
