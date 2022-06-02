package com.dp;

public class Singleton extends CommonUtils {	//Singleton with synchronized block and double null check eager instantiation

	//serial version uid
	private static final long serialVersionUID = 1l;
	
	//private instance
	private static Singleton INSTANCE = null;
	
	private static boolean isInstantiated = false;
	
	private Singleton() {
		
		if(isInstantiated)
			throw new RuntimeException("Object already created");
		else
			isInstantiated = true;
		
		
		System.out.println("Singleton.0-param private constructor");
	}
	
	public static Singleton getInstance() {
		if(INSTANCE==null) {
			
			synchronized(Singleton.class){
				if(INSTANCE==null) {
					
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException("This is singleton class and clonning is not supported.");
	}
	
	public Object readResolve() {
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	
}
