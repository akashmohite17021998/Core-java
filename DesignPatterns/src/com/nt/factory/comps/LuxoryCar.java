package com.nt.factory.comps;

public class LuxoryCar extends Car {

	private String bootSpace;
	private String security;
	
	public LuxoryCar() {
		System.out.println("LuxoryCar :: 0-param constructor");
	}
	
	@Override
	public void assemble() {
		System.out.println("LuxoryCar.assemble()");
		
	}
	
	@Override
	public void roadTest() {
		System.out.println("LuxoryCar.roadTest()");
		
	}
	
	@Override
	public void drive() {
		System.out.println("LuxoryCar.drive()");
		
	}
}
