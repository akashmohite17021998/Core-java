package com.staticNestedClasses;

public interface InterfaceInsideInterface {

	public void m1();
	public static interface Inner{
		public void m2();
	}
}

class Test1 implements InterfaceInsideInterface{
	public void m1() {
		System.out.println("Outer interface method implementation.");
	}
}

class Test2 implements InterfaceInsideInterface.Inner{
	public void m2() {
		System.out.println("Inner interface method implementation.");
	}
}