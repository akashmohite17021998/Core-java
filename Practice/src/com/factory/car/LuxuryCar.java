package com.factory.car;

public class LuxuryCar implements Car {

	private String price;
	private String milage;
	
	@Override
	public void assemble() {
		System.out.println("LuxuryCar.assemble()");
	}
	@Override
	public void roadTest() {
		System.out.println("LuxuryCar.roadTest()");
	}
	@Override
	public void drive() {
		System.out.println("LuxuryCar.drive()");
	}
}
