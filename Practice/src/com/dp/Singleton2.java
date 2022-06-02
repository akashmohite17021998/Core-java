package com.dp;

public class Singleton2 {	//with static inner class lazy instantiation

	private static boolean isInstantiation = false;
	
	private Singleton2() {
		
		if(isInstantiation)
			throw new RuntimeException("This is singleton class.");
		else
			isInstantiation = true;
		
		System.out.println("Singleton2.Singleton2()");
	}
	
	private static class Singleton2InnerClass{
		private static Singleton2 INSTANCE = new Singleton2();
	}
	
	public static Singleton2 getInstance() {	
	
		return Singleton2InnerClass.INSTANCE;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
			
		throw new CloneNotSupportedException("This is singleton class clone is not supported.");
	}
	
	
	public Object readResolve() {
		return Singleton2InnerClass.INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
