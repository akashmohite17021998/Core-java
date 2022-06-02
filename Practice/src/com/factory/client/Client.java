package com.factory.client;

import com.factory.car.Car;
import com.factory.car.CarType;
import com.factory.factory.CarFactory;

public class Client {

	public static void main(String[] args) {
		Car car = CarFactory.getCar(CarType.BUDGET);
		car.drive();
	}
}
