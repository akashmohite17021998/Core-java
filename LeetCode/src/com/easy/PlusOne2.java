package com.easy;

import java.util.Arrays;

public class PlusOne2 {
											//9,9,9,9,9
	public static int[] plusOne(int[] a) {	//4,3,2,9,9
		
		boolean flag = true;
		
		boolean flag1 = (a[a.length-1]==9);//true
		
		int[] i1 = new int[a.length+1];
		
		for(int i:a) {
			if(i!=9) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			i1[0] = 1;
			for(int i = 1; i<i1.length; i++) {
				i1[i] = 0;
			}
		}					//    3,0,0
		else if(flag1) {	//4,3,2,9,9
			for(int i = a.length-1; i>=0; i--) {//4
			
				if(a[i]==9) {
					a[i] = 0;
				}else {
					a[i] = a[i]+1;
					for(int j = i-1; j>=0; j--) {
						a[j] = a[j];
					}
					break;
				}
				
			}
		}
		else {
			a[a.length-1] = a[a.length-1]+1;
		}
		
		return (flag)?i1:a;
		
    }
	
	public static void main(String[] args) {
		int[] i = {4,3,2,9,8};
		
		int[] a = plusOne(i);
		
		System.out.println(Arrays.toString(a));
		
//		for(int b:a) {
//			System.out.println(b);
//		}
	}
	
}
