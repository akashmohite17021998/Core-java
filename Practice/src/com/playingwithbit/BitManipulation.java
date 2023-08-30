package com.playingwithbit;

public class BitManipulation {

	public static void main(String[] args) {
		
		/*if we want to convert 10 to -10 efficiently then 
		use ( ~ ) operator which converts binary of 10 to 
		binary of -11 then add 1 and reverse is also 
		possible from (-) to (+)*/

		
		/*
		 * int a = -87;
		 * 
		 * int b = ~a + 1;
		 * 
		 * System.out.println("a : " + a);
		 * 
		 * System.out.println("b : " + b);
		 */
		
		
		
		/**
		 * Swiping the values of the variables 
		 * without using third variable -> 
		 */
		
		/*Approach 1 :-
		 * 
		 * int a = 10; int b = 20;
		 * 
		 * a = a+b; //10+20=30 b = a-b; //30-20=10 a = a-b; //30-10=20
		 * 
		 * //a = 20 b = 10
		 * 
		 * System.out.println(a + " " + b);
		 */
		
		/*
		 * Approach 2 :-	(best)
		 * 
		 * int a = 10; int b = 20;
		 * 
		 * a = a^b; b = a^b; a = a^b;
		 * 
		 * System.out.println(a + " " + b);
		 */
		
		
		
		/*
		 * 5>>1 means 5/2 -> if we use >>(right shift) instead of / then 
		 * it decreases * the calculation time of the program(But both 
		 * the approaches only works when * we want to multiply and 
		 * devide with 2) 
		 * 
		 * 5<<1 means 5*2 -> if we use <<(left shift) instead of * 
		 * then it decreases the calculation time of the program
		 */
		
		int a = 10;	int b = 20;
		
		a = a>>1;	//which means a/2
		
		b = b<<1;	//which means a*2
		
		System.out.println(a + " " + b);
	}
}














