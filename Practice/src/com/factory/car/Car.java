package com.factory.car;

public abstract class Car {

	private int engineId;
	private String regId;
	
	public abstract void assemble();
	public abstract void roadTest();
	public abstract void drive();
}
