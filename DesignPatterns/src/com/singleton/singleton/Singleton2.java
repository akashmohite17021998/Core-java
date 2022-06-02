package com.singleton.singleton;

import com.singleton.commons.CommonsUtils;

public class Singleton2 extends CommonsUtils  {
	
	

	private static boolean isInstantiated = false;
	
	//private constructor
	private Singleton2() {
		
//		if(INSTANCE != null)	//This approach is works only when we call static factory method first
//			throw new RuntimeException("Object is already created.");
		
		if(isInstantiated)	//This approach will works in any condition if we call static factory method first or later.
			throw new RuntimeException("Object is already creadted.");
		
		else// for class loading
			isInstantiated = true;
		
		System.out.println("Singleton 0 param constructor.");
	}
	
	//Inner class
	private static class SingletonWithInnerClassLazyInstantiationInner{
		private static Singleton2 INSTANCE = new Singleton2();
	}
	
	//factory method
	public static Singleton2 getINSTANCE() {
		return SingletonWithInnerClassLazyInstantiationInner.INSTANCE;
	}
	
	@Override			// Best approach
	public Object clone() throws CloneNotSupportedException {
	
		throw new CloneNotSupportedException("In this singleton class clonning is not supported.");
	}
	
//	public Object readResolve() {	
//		throw new IllegalArgumentException("Deserialization not allowed on this class.");
//	}
	
	public Object readResolve() {	//Best approach
		return SingletonWithInnerClassLazyInstantiationInner.INSTANCE;
	}
	
	//Business method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
