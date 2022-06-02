package com.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

	public boolean isValid(String s) {	//input is () [] {} and output should be boolean
        
		boolean b = false;
		
		char[] ch = s.toCharArray();	//{'(', ')', '[', ']', '{', '}'}
		
		Map<Character, Character> map = new HashMap<>();	//{(=), [=], {=}}
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
//		int d = map.get(ch[0]);
//		int e = ch[1];
		
		for(int i = 0; i<ch.length; i++) {
			
			if(map.containsKey(ch[i])) {
				int a = ch[i];
				int c = ch[i+1];
			
				if(a<c) {
					b = true;
				}
				else {
					b = false;
				}
				
			}
			else if(map.containsKey(ch[i]) && ) {
				
			}
			else {
				b = false;
				break;
			}
			
				i++;
//				d+= 2;
//				e+= 2;
			
		}
			return b;
		
    	}
	
	public static void main(String[] args) {
		ValidParentheses v = new ValidParentheses();
		System.out.println(v.isValid(")([]{}"));
	}
}
