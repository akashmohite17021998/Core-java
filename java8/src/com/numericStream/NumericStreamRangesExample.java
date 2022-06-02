package com.numericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
	
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 50);
		IntStream intStreamClosed = IntStream.rangeClosed(1, 50);
		System.out.println("Range count : " + intStream.count());
		IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));
		System.out.println();
		System.out.println();
		System.out.println("Range closed count : " + intStreamClosed.count());
		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
		System.out.println();
		System.out.println();
		
		LongStream longStream = LongStream.range(1, 50);
		LongStream longStreamClosed = LongStream.rangeClosed(1, 50);
		System.out.println("Long stream range count : " + longStream.count());
		LongStream.range(1, 50).forEach(value -> System.out.print(value + ","));
		System.out.println();
		System.out.println();
		System.out.println("Long stream range closed count : " + longStreamClosed);
		LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
		
		System.out.println();
		System.out.println();
		DoubleStream doubleStream = IntStream.range(1, 50).asDoubleStream();
		DoubleStream doubleStreamClosed = IntStream.rangeClosed(1, 50).asDoubleStream();
		System.out.println("Double stream range count : " + doubleStream.count());
		IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
		System.out.println("Double stream range closed count : " + doubleStreamClosed);
		IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
		
	}

}
