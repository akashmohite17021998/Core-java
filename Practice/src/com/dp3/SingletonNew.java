package com.dp3;

import java.io.Serializable;

public class SingletonNew implements Cloneable, Serializable {
	
	private static final long serialVerionUID = 1L;

	private static SingletonNew INSTANCE = null;
	
	private static boolean flag = false;
	
	private SingletonNew() {
		
		System.out.println("Singleton.Singleton()");
		
		if(flag) {
			throw new RuntimeException("Object is already created.");
		}else {
			
			flag = true;
		}
		
		
		
	}
	
	public static SingletonNew getInstance() {
		
		System.out.println("Singleton.getInstance()");
		
		if(INSTANCE==null) {
			
			synchronized(SingletonNew.class){
				
				if(INSTANCE==null) {
					
					INSTANCE = new SingletonNew();
					
				}
				
			}
			
		}
		return INSTANCE;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		System.out.println("SingletonNew.clone()");
		
		throw new CloneNotSupportedException("Clonning is prohibated.");
	}
	
	public Object readResolve() {
		
		System.out.println("SingletonNew.readResolve()");
		
		return INSTANCE; 
		
	}
	
}
