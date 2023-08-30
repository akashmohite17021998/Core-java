package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ABCDPermutation2 {

	public static void permutation(String s) {
		
		int size = s.length();
		
		int factorial = 1;
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 1; i<=size; i++) {
			
			factorial = factorial*i;
			
		}
		
		List<String> list = new ArrayList<String>(factorial);
		
		List<Character> set = new ArrayList<Character>(size);
		
		while(list.size()!=factorial) {
			
			while(set.size()!=size) {
				
				int a= new Random().nextInt(size);
				
				if(!set.contains(s.charAt(a))) {
					set.add(s.charAt(a));
				}
				
			}
				
			for(int i = 0; i<size; i++) {
					
				sb.append(set.get(i));
					
			}
			
			String s1 = sb.toString();
			
			sb.setLength(0);
			
			if(!list.contains(s1)) {
				list.add(s1);
			}
			
			s1 = "";
			
			set.clear();
		}
		
		System.out.println(list.size());
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		
		permutation(s);
	}
}
