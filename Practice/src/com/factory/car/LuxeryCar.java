package com.factory.car;

public class LuxeryCar extends Car {

	private String comfort;
	
	public LuxeryCar() {
		System.out.println("LuxeryCar.0-param constructor");
	}
	
	@Override
	public void assemble() {
		System.out.println("LuxeryCar.assemble()");
		
	}

	@Override
	public void roadTest() {
		System.out.println("LuxeryCar.roadTest()");
		
	}

	@Override
	public void drive() {
		System.out.println("LuxeryCar.drive()");
		
	}
	

}
