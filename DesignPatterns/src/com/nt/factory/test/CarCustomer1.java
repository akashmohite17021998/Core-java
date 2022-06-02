package com.nt.factory.test;

import com.nt.factory.comps.BudgetCar;
import com.nt.factory.comps.Car;
import com.nt.factory.factory.CarFactory;
import com.nt.factory.factory.CarType;

public class CarCustomer1 {

	public static void main(String[] args) {
//		Car bCar = new BudgetCar();
//		bCar.assemble();
//		bCar.roadTest();
//		bCar.drive();
		
		Car bcar = CarFactory.createCar(CarType.MODEL_BUDGET);
		bcar.drive();
	}
}
