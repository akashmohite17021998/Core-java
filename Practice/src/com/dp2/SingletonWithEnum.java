package com.dp2;

public enum SingletonWithEnum {

	INSTANCE;
	
	public SingletonWithEnum getInstance() {
		return INSTANCE;
	}
	
}
