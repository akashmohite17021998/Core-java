package com.factory.car;

public class BudgetCar implements Car {

	private String price;
	private String milage;
	@Override
	public void assemble() {
		System.out.println("BudgetCar.assemble()");
	}
	@Override
	public void roadTest() {
		System.out.println("BudgetCar.roadTest()");
	}
	@Override
	public void drive() {
		System.out.println("BudgetCar.drive()");
	}
	
	
}
