package com.nt.factory.test;

import com.nt.factory.comps.BudgetCar;
import com.nt.factory.comps.Car;
import com.nt.factory.comps.LuxoryCar;
import com.nt.factory.factory.CarFactory;
import com.nt.factory.factory.CarType;

public class CarCustomer2 {

	public static void main(String[] args) {
//		Car lCar = new LuxoryCar();
//		lCar.assemble();
//		lCar.roadTest();
//		lCar.drive();
		
		Car lcar = CarFactory.createCar(CarType.MODEL_LUXORY);
		lcar.drive();
	}
}
