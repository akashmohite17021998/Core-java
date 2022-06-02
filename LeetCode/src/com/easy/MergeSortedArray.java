package com.easy;

import java.util.Arrays;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int a = 0;
		
		int b = 0;
		
        for(int i = 0; i<nums2.length; i++) {		//0			//2
        	
        	for(int j = a; j<nums1.length; j++) {	//012			//123
            		//2		//3			//1	  //0
            	if(nums2[i]<nums1[j]||nums1[j]==0) {
            		
//            		if(nums1[j]!=0) {
//            			nums1[j+1] = nums1[j];
//            		}
            		
            		b = nums1[j];
            		
            		nums1[j] = nums2[i];
            		
            		nums2[i] = b;
            		
            		a++;
            		break;
            	}
            	a++;	//12
            }
        	
        }
        int c = 0;
        for(int i = 0; i<nums2.length; i++) {
        	
        	if(nums1[i])
        	
        }
        
        System.out.println(Arrays.toString(nums1));	//1223
        System.out.println(Arrays.toString(nums2));
    }
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		
		merge(nums1, m, nums2, n);
	}
	
}
