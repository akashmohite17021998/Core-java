package com.factory.car;

public class BudgetCar extends Car {
	
	private Double price;
	
	public BudgetCar() {
		System.out.println("BudgetCar.0-param constructor");
	}

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
