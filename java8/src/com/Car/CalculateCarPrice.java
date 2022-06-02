package com.Car;

@FunctionalInterface
public interface CalculateCarPrice<? extends T, V, K> {

	K  calculate(T<? extends T> t, V v);

}
