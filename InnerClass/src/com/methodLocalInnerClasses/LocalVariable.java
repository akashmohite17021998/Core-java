package com.methodLocalInnerClasses;

public class LocalVariable {

	public void m1() {
		
		 int x = 10;	//x is local variable and if we access the x in inner class then we will get compile time error if we declare x with final keyword then we won't get any compile time error
		
		class Inner{
			
			public void m2() {
				
				System.out.println(x);
			
			}	
		}
		
		Inner i  = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		LocalVariable o = new LocalVariable();
		o.m1();
	}
}
