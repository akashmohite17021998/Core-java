package com.numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("The sum is : " + sum);
		
		System.out.println();
		
		OptionalInt max = IntStream.rangeClosed(1, 50).max(); //max() returns the OptionalInt
		
		System.out.println("The max is : " + max);
		
		OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
		
		System.out.println((optionalInt.isPresent()) ? optionalInt.getAsInt() : 0); 
		
		OptionalLong optionalLong = LongStream.rangeClosed(1, 50).min();
		System.out.println((optionalLong.isPresent()) ? optionalLong.getAsLong() : 0); //min() returns the OptionalLong
		
		System.out.println();
		System.out.println("The min is : " + LongStream.rangeClosed(1, 50).min());
		System.out.println("The max is : " + IntStream.rangeClosed(1, 50).max().getAsInt());
		System.out.println("The min is : " + LongStream.rangeClosed(1, 50).min().getAsLong());
		
		
		System.out.println();
		System.out.println("The min is : " + LongStream.rangeClosed(0, 0).min());
		System.out.println("The max is : " + IntStream.rangeClosed(0, 0).max().getAsInt());
		System.out.println("The min is : " + LongStream.rangeClosed(0, 0).min().getAsLong());
		
		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
		System.out.println((optionalDouble.isPresent()) ? optionalDouble.getAsDouble() : 0);
		
	}
	
}
