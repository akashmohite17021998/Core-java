package com.singleton.singleton;

public enum Singleton3 {

	INSTANCE;//enum constant --> it is internally public static Singleton3 INSTANCE = new Singleton3();
	
	public static Singleton3 getINSTANCE() {
		return INSTANCE;
	}
}
