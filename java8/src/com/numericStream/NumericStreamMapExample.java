package com.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static List<Integer> mapToObj() {
		
		return IntStream.rangeClosed(1, 10) //intStream
				//i is passed from the intStream
			.mapToObj(i -> new Integer(i))
			.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 10) //intStream
				//i is passed from the intStream
			.mapToLong(i -> i)//Convert intStream to longStream
			.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 10)//intStream
				//i is passed from the intStream
			.mapToDouble(i -> i)//Convert intStream to DoubleStream
			.sum();
	}
	
	public static void main(String[] args) {
		System.out.println(mapToObj());
		System.out.println(mapToLong());
		System.out.println(mapToDouble());
	}
}
