package com.easy;

import java.util.ArrayList;
import java.util.List;



	/**
	 * not solve
	 * @author akash
	 *
	 */


public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] str) {	//flower, flow, flight
		
		String s =""; //flow
		
		int a = 1;//2 
		
		char[] ch1 = str[0].toCharArray(); // f l o w e r
		
		char[] ch2 = str[a].toCharArray(); // f l o w
		
		
		for(int i = 0; i<ch1.length; i++) { //6 loop 1
			
			Character c1 = ch1[i]; // f l
			
			for(int j = 0; j<ch2.length; j++) {//1
				
				if(c1.equals(ch2[j])) {//f l 
					
					s+= ch2[j];
					
				}
				
			}
			
			if(a<str.length) {
				a++;
				
			}
		}
		return s;
    }
	
	public static void main(String[] args) {
		
		String[] s = {"flower", "flow", "flight"};
		
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(s));
	}
}
