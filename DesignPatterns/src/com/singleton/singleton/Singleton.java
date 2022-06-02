package com.singleton.singleton;



import com.singleton.commons.CommonsUtils;

//Singleton java class with minimum standards
public class Singleton extends CommonsUtils {
	
	private static final long serialVersionUID = 1L;
	
//	int i = 10;

	//private static reference variable
	private static Singleton INSTANCE = null;
	
	private static boolean isInstantiated = false;
	
	//private constructor
	private Singleton() {
		
//		if(INSTANCE != null)	//This approach is works only when we call static factory method first
//			throw new RuntimeException("Object is already created.");
		
		if(isInstantiated)	//This approach will works in any condition if we call static factory method first or later.
			throw new RuntimeException("Object is already creadted.");
		
		else
			isInstantiated = true;
		
		System.out.println("Singleton 0 param constructor.");
	}
	
	
	
	//public static factory method having singleton logic without synchronized
//	public static Singleton getInstance() {
//		
//		if(INSTANCE == null)
//			INSTANCE = new Singleton();
//		
//		return INSTANCE;
//	}
	
	
	
//	//public synchronized static factory method having singleton logic
//		public synchronized static Singleton getInstance() {
//			
//			try {
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			if(INSTANCE == null)
//				INSTANCE = new Singleton();
//			
//			return INSTANCE;
//		}
	
	
	
	//public static factory method having singleton logic within the synchronized block
			public static Singleton getINSTANCE() { //this method is static method
				
				if(INSTANCE == null) {	//First null check.
				
					System.out.println("Singleton.getInstance()(Outside synchronized block) : " + Thread.currentThread().getName());
					
					synchronized(Singleton.class) {	//we can not use "this" inside the static method so we can not pass synchronized(this) in the static factory method
						
						System.out.println("Singleton.getInstance()(Inside synchronized block) : " + Thread.currentThread().getName());
						
						if(INSTANCE == null) {	//Second null check.
					
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
			
//	@Override			// We can use this approach but not best approach
//	public Object clone() throws CloneNotSupportedException {
//		
//		return INSTANCE;
//	}
			
	@Override			// Best approach
	public Object clone() throws CloneNotSupportedException {
	
		throw new CloneNotSupportedException("In this singleton class clonning is not supported.");
	}
	
//	public Object readResolve() {	
//		throw new IllegalArgumentException("Deserialization not allowed on this class.");
//	}
	
	public Object readResolve() {	//Best approach
		return INSTANCE;
	}
	
	//Business methods
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
