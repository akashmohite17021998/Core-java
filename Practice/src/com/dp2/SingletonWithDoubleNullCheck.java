package com.dp2;

public class SingletonWithDoubleNullCheck extends Commence{

	private static final long serialVersionUID = 1L;
	
	private static SingletonWithDoubleNullCheck INSTANCE = null;
	
	private static boolean isInstantiated = false;
	
	private SingletonWithDoubleNullCheck() {
		
		if(isInstantiated) {
			
			throw new RuntimeException("Object is already created");
			
		}else {
			isInstantiated = true;
		}
		
	}
	
	public static SingletonWithDoubleNullCheck getInstance() {
		
		if(INSTANCE==null) {
			
			System.out.println("Outside synchronized block with thread : " + Thread.currentThread().getName());
			
			synchronized(SingletonWithDoubleNullCheck.class) {
				
				System.out.println("Inside synchronized block with thread : " + Thread.currentThread().getName());
				
				if(INSTANCE==null) {
					
					INSTANCE = new SingletonWithDoubleNullCheck();
					
				}
				
			}
			
		}
		return INSTANCE;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("SingletonWithDoubleNullCheck is a singleton class and clonning is not supported.");
	}
	
	public Object readResolve() {
		return INSTANCE;
	}
	
	public void bMethod() {
		System.out.println("SingletonWithDoubleNullCheck.bMethod()");
	}
	
}
