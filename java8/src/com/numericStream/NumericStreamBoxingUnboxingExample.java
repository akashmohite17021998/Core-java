package com.numericStream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

	public static List<Integer> boxing() {
		
		return IntStream.rangeClosed(1, 10) //IntStream of 10 elements.
		//int
		.boxed()
		//Integer
		.collect(Collectors.toList());
		
	}
	
	

	public static int unBoxing(List<Integer> list) { //Wrapper to primitive
		return list.stream() //Wrapper Integer value
				.mapToInt(Integer::intValue).sum(); //intStream(intValue of wrapper class)
	}
	
	public static void main(String[] args) {
		System.out.println("Boxing : " + boxing());
		System.out.println("Unboxing : " + unBoxing(boxing()));
	}
	
}
