package com.easy;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] a) {	//4,3,2,9
		
		boolean flag = (a[a.length-1]==9);	//true
		
		int count = 0;	//0
		
		char[] c1 = null;
        
        int[] k = null;
        
       if(flag){
           
           StringBuffer s = new StringBuffer();
           
           for(int i = 0; i<a.length; i++){
               
               s.append(a[i]);
               
           }
           
           Double i = Double.parseDouble(s.toString())+1;
           
           String s1 = i.toString();
           
           count = s1.length();
           
           c1 = new char[count];
           
           c1 = s1.toCharArray();
           
           k = new int[count];
           
           for(int j = 0; j<c1.length; j++){
               
               k[j] = c1[j]-48;
               
           }
           
       }else{
           a[a.length-1] = a[a.length-1]+1;
       }
        return (flag)?k:a;
		
    }
	
	public static void main(String[] args) {
		int[] i = {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
		
		int[] a = plusOne(i);
		
		System.out.println(Arrays.toString(a));
		
//		for(int b:a) {
//			System.out.println(b);
//		}
	}
	
}
