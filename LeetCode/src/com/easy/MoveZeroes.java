package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
        
        int[] ai = new int[nums.length];
        
        int a = 0;  //1, 2
        
        for(int i = 0; i<nums.length; i++){    //[0,1,0,3,12]
            
            if(nums[i]==0){
                
                a++;
                
            }else{
                ai[i-a] = nums[i];
            }
            
        }
        
        for(int i = 0; i<a; i++){
            ai[nums.length-1-i] = 0;
        }
        System.out.println(nums +"     "+ai);
        nums = ai;
        System.out.println(nums +"     "+ai);
        
        System.out.println(Arrays.toString(nums));
    }

	public static void main(String[] args) {
		int[] i = {0,1,0,3,12};
		moveZeroes(i);
	}
}
