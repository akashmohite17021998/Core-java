package com.practice;

import java.util.Scanner;

public class Solution {

	public static int countTotalPassengers(Bus[] b, int busStop) {
		int a = 0;
		int c = 0;
		for(Bus b1: b) {
			c = b1.getPassengerCount();
			a = b1.getBusStop();
		}
		
		if(a>busStop) {
			return c;
		}
		else {
			return 0;
		}
		
	}
	
	public static Bus searchBus(Bus[] c, int value) {
		
		Bus a = null;
		int d = 0;
		for(Bus b1: c) {
			d = b1.getPassengerCount();
			
			if(d>value) {
				a = b1;
			}
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		int a10 = 0;
		
		String a20 = null;
		
		int a30 = 0;
		
		int a40 = 0;
		
		for(int i = 0; i<4; i++) {
		
		Scanner s1= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter busNo number- ");
		a10= s1.nextInt();
		
		Scanner s2= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter travelsName number- ");
		a20= s2.nextLine();
		
		Scanner s3= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter passengerCount number- ");
		a30= s3.nextInt();
		
		Scanner s4= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter busStop number- ");
		a40= s4.nextInt();
		
		}
		
		Scanner s5= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter count of total passengers number- ");
		int a5= s5.nextInt();
		
		Scanner s6= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter input count of total passengers number- ");
		int a6= s6.nextInt();
		
		Bus b1 = new Bus( a10, a20, a30, a40);
		
		Bus[] b = {b1};
		
		
		System.out.println(Solution.countTotalPassengers(b, a5));
		
		System.out.println(Solution.searchBus(b, a6));
		
	}
}
