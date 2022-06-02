package com.nt.factory.comps;

public abstract class Car {

	private int engineId;
	private String regNo;
	
	public abstract void assemble();
	
	public abstract void roadTest();
	
	public abstract void drive();
}
