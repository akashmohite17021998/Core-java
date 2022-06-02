package com.WhizLabs;

public class Whiz {
	
	static int i;
	
	public static void main(String[] args) {
		Whiz w1 = new Whiz();
		Whiz w2 = new Whiz();
		Whiz w3 = new Whiz();
		
		w1.method("w1");
		w2.method("w2");
		w3.method("w3");
	}
	
	public void method(String s) {
//		System.out.println(s);
		while(i < 10) {             //due to 
			
			System.out.print(i++);
			i++;
		}
	}

}
