package com.factory.client;

import com.factory.car.BudgetCar;
import com.factory.car.Car;
import com.factory.car.LuxuryCar;
import com.factory.car.SportsCar;

public class CarFactory {

	public static Car getCar(String name) {
		
		Car car = null;
		
		if(name.equalsIgnoreCase(CarType.MODEL_Luxury)) {
			car = new LuxuryCar();
		}else if(name.equalsIgnoreCase(CarType.MODEL_SPORTS)) {
			car = new SportsCar();
		}else if(name.equalsIgnoreCase(CarType.MODEL_BUDGET)) {
			car = new BudgetCar();
		}
		
		car.assemble();
		car.roadTest();
		return car;
	}
}
