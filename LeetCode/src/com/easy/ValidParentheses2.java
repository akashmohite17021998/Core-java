package com.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses2 {

	private static final Map<Character, Character> map = Map.of('(', ')',
																'{', '}',
																'[', ']');
	 
	 public boolean isValid(String s) {	//() [] {}
		 Stack<Character> stack = new Stack<>();
		 
		 for(char c:s.toCharArray()) {
			 if(map.containsKey(c)) {
				 stack.push(c);
			 }else {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 char open = stack.pop();
				 if(map.get(open) != c) {
					 return false;
				 }
			 }
		 }
		 return stack.isEmpty();
	 }
	 
	 public static void main(String[] args) {
		 
		 ValidParentheses2 v = new ValidParentheses2();
		 
		 System.out.println(v.isValid("()[]{}"));
	}
}
