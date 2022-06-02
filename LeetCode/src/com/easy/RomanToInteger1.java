package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger1 {

	//I=1, V=5, X=10, L=50, C=100, D=500, M=1000
	public int romanToInt(String s) {//1
		int last = 0;
		if(s.isEmpty()) {
			System.out.println("Please enter valid roman number.");
		}
		else {
		
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		String s1 = s.toUpperCase();
		
		char[] cha = s1.toCharArray();
		
		for(int j = 1; j<cha.length; j++) {//1
			
			int c = j-1;//0
			
			int b = map.get(cha[c]);//X = 10
			int d = map.get(cha[j]);//V = 5
			
			if(b>=d)
				
				last+= b;
			
			else
				
				last-= b;
			
		}
		
		int e = (cha.length)-1;
		
		last+= map.get(cha[e]);
		}
		return last;
	}
	
	public static void main(String[] args) {
		
		
		
		RomanToInteger1 r = new RomanToInteger1();
		
		System.out.println(r.romanToInt("ad"));
	}
}
