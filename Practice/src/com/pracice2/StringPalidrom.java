package com.pracice2;

public class StringPalidrom {

	public static void main(String[] args) {
		String name = "abc";
		char[] c1 = name.toCharArray();
		char[] c2 = new char[name.length()];
		for(int  i = c1.length-1; i>=0; i--) {
			c2[name.length()-1-i] = c1[i];
		}
		String name2 = new String(c2);
		
		if(name.equals(name2)) {
			System.out.println("The name " + name + " is pelidrome.");
		}else {
			System.out.println("The name " + name + " is not pelidrome.");
		}
	}
}
