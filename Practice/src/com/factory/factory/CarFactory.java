package com.factory.factory;

import com.factory.car.BudgetCar;
import com.factory.car.Car;
import com.factory.car.CarType;
import com.factory.car.LuxeryCar;
import com.factory.car.SportsCar;

public class CarFactory {

	public static Car getCar(String type) {
		
		Car car = null;
		if(type.equalsIgnoreCase(CarType.BUDGET)) {
			car = new BudgetCar();
		}
		else if(type.equalsIgnoreCase(CarType.SPORTS)) {
			car = new SportsCar();
		}
		else if(type.equalsIgnoreCase(CarType.LUXERY)) {
			car = new LuxeryCar();
		}
		else {
			throw new IllegalArgumentException("Invalid car type.");
		}
		
		car.assemble();
		car.roadTest();
		
		return car;
		
	}
	
}
