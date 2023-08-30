package com.factory.car;

public class SportsCar implements Car {

	private String price;
	private String milage;
	@Override
	public void assemble() {
		System.out.println("SportsCar.assemble()");
	}
	@Override
	public void roadTest() {
		System.out.println("SportsCar.roadTest()");
	}
	@Override
	public void drive() {
		System.out.println("SportsCar.drive()");
	}
}
