package com.practice;

public class ABCDPermutation {

	public static void permutation(String s) {
		
		int size = s.length();		//lenght of string
		
		int factorial = 1;			//number of Permutation
		
		int count = 0;
		
		int count1 = 0;
		
		int count2 = 0;
		
		int count3 = 0;
		
		for(int i = 1; i<=size; i++) {	//for Permutation calculation
			
			factorial = factorial*i;
			
		}
		
		for(int i = 0; i<factorial; i++) {
			
			if(i<factorial/2) {
													//3   1					
				for(int j = count; j<factorial; j = ((j)+count2<size)?j+count2:(j%2!=0)?(0+count2):0) {
					
					
					
					System.out.print(s.charAt(j));
					
					count1++;
					
					j++;
					
					if(count1==size) {
						break;
					}
				}
				
				count1 = 0;	//i am here right now
				
				count3++;
				
				count++;		//it is j
//				System.out.println(count + " " + count1 + " " + count2);
				if(count>=size) {
					
					count2++;
					
					count = 0;
					
					count3 = 0;
					
				}
				
				System.out.println(count + " " + count1 + " " + count2);
				
				
				
				System.out.println();
				
			}else {
				
				
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		
		permutation(s);
	}
}
