package com.nt.factory.test;

import com.nt.factory.comps.BudgetCar;
import com.nt.factory.comps.Car;
import com.nt.factory.comps.LuxoryCar;
import com.nt.factory.comps.SportsCar;
import com.nt.factory.factory.CarFactory;
import com.nt.factory.factory.CarType;

public class CarCustomer3 {

	public static void main(String[] args) {
//		Car sCar = new SportsCar();
//		sCar.assemble();
//		sCar.roadTest();
//		sCar.drive();
		
		Car scar = CarFactory.createCar(CarType.MODEL_SPORTS);
		scar.drive();
	}
}
