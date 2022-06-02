package com.normalInnerClass;

public class AccessingInstanceAndStaticMembersOfOuterClassFromInnerClass {

	int x = 10;
	static int y = 20;
	
	class Inner{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
//		AccessingInstanceAndStaticMembersOfOuterClassFromInnerClass o = new AccessingInstanceAndStaticMembersOfOuterClassFromInnerClass();
//		AccessingInstanceAndStaticMembersOfOuterClassFromInnerClass.Inner i = o.new Inner();
//		i.m1();
		
		new AccessingInstanceAndStaticMembersOfOuterClassFromInnerClass().new Inner().m1();
	}
}
