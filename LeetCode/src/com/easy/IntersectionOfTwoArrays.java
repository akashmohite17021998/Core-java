package com.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays {
										//3		//5
	public static int[] intersection(int[] a, int[] b) {
        
        HashSet<Integer> h1 = new HashSet<Integer>();
        
        HashSet<Integer> h2 = new HashSet<Integer>();
        
         
        
        for(int i = 0; i<a.length+b.length; i++) {
        	
        	if(i<a.length)
        		h1.add(a[i]);
        	else
        		h2.add(b[i-a.length]);
        	
        }
        h1.retainAll(h2);
        h2.retainAll(h1);
        
        System.out.println(h1);
        
        System.out.println(h2);
        
        int[] i1 = new int[h1.size()];
        
        Iterator i = h1.iterator();
        
        int i3 = 0;
        while(i.hasNext()) {
        	
        	int i2 = (int)i.next();
        	
        	i1[i3] = i2;
        	
        	i3++;
        	
        }
        
        return i1;
    }
	
	public static void main(String[] args) {
		int[] a = {4,9,5};
		int[] b = {9,4,9,8,4};
		int[] c = intersection(a, b);
		for(int a1: c)
			System.out.println(a1);
	}
	
}
