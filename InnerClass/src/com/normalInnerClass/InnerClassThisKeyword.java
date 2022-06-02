package com.normalInnerClass;

public class InnerClassThisKeyword {

	int x = 10;
	
	public class Inner{
		
		int x = 100;
		
		public void m1() {
		
			int x = 1000;
			
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Inner.this.x);
			System.out.println(InnerClassThisKeyword.this.x);
		}
	}
	
	public static void main(String[] args) {
		InnerClassThisKeyword o = new InnerClassThisKeyword();
		InnerClassThisKeyword.Inner i = o.new Inner();
		i.m1();
	}
}
