package com.dp2;

public class SingletonWithLazyInstantiation {

	private static final long sserialVersionUID = 1L;
	
	private static boolean isInstantiation = false;
	
	private SingletonWithLazyInstantiation() {
	
		if(isInstantiation) {
			throw new RuntimeException("Object is already created.");
		}else {
			isInstantiation = true;
		}
		
	}
	
	private static class LazyInstantiation{
		private static SingletonWithLazyInstantiation INSTANCE = new SingletonWithLazyInstantiation();
	}
	
	public static SingletonWithLazyInstantiation getInstance() {
		return LazyInstantiation.INSTANCE;
	}
	
}
