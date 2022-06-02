package com.Car;

public class Test1 {
	static CalculateCarPrice<String, Integer, Double> calculateCarPrice = (t, v) -> {
		if ("MH".equals(t))
			return Double.valueOf(v + 5);
		else if ("DH".equals(t))
			return Double.valueOf(v + 10);
		else
			return Double.valueOf(0);
	};

	public static void main(String[] args) {

		Double calculate = calculateCarPrice.calculate("MH", 100);
		System.out.println(calculate);

		Car car = new TataCar();
		double price = car.bookCar(calculateCarPrice);
		System.out.println(price);

	}

}
