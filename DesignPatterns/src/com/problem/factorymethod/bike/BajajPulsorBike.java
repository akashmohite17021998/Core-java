package com.problem.factorymethod.bike;

public class BajajPulsorBike implements BajajBike {

	private String power;
	
	@Override
	public void assembling() {
		System.out.println("BajajPulsorBike.assembling()");
		
	}
	
	@Override
	public void drive() {
		System.out.println("BajajPulsorBike.drive()");
		
	}
	
	@Override
	public void engineTest() {
		System.out.println("BajajPulsorBike.engineTest()");
		
	}
	
	@Override
	public void painting() {
		System.out.println("BajajPulsorBike.painting()");
		
	}
	
	@Override
	public void roadTest() {
		System.out.println("BajajPulsorBike.roadTest()");
		
	}
	
	
}
