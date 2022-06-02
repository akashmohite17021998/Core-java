package com.nt.factory.factory;

import com.nt.factory.comps.BudgetCar;
import com.nt.factory.comps.Car;
import com.nt.factory.comps.LuxoryCar;
import com.nt.factory.comps.SportsCar;

public class CarFactory {

	public static Car createCar(String type) {
		Car car = null;
		
		if(type.equalsIgnoreCase(CarType.MODEL_BUDGET))
			car = new BudgetCar();
		
		else if(type.equalsIgnoreCase(CarType.MODEL_LUXORY))
			car = new LuxoryCar();
		
		else if(type.equalsIgnoreCase(CarType.MODEL_SPORTS))
			car = new SportsCar();
		
		car.assemble();
		car.roadTest();
		
		return car;
	}
}
