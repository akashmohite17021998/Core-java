package com.singleton.singleton;

public class SingletonUsingEagerInstantiation {

	private static SingletonUsingEagerInstantiation INSTANCE = new SingletonUsingEagerInstantiation(); //Singleton logic through eager instantiation
	
	private SingletonUsingEagerInstantiation() {
		System.out.println("SingletonUsingEagerInstantiation 0 param constructor.");
	}
	
	public static SingletonUsingEagerInstantiation getINSTANCE() {
		
		return INSTANCE;
	
	}
	
	//Business methods
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
