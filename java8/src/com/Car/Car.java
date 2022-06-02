package com.Car;

public interface Car {

	<T super String,V,K> K bookCar(CalculateCarPrice<? extends, V, K> c);
	
}
