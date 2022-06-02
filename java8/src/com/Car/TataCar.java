package com.Car;

public class TataCar implements Car {

	@Override
	public <T, V, K> K bookCar(CalculateCarPrice<T, V, K> calculateCarPrice) {
		String arg1 = "MH";
		Integer arg2 = 100;
		return calculateCarPrice.calculate(arg1, arg2);
	}

}
