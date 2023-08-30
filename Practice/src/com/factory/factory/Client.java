package com.factory.factory;

import com.factory.car.Car;
import com.factory.client.CarFactory;
import com.factory.client.CarType;

public class Client {

	public static void main(String[] args) {
		Car car = CarFactory.getCar(CarType.MODEL_Luxury);
		
		car.drive();
	}
}
