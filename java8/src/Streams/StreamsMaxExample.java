package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxExample {
	
	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream()
				//6 -> y
				//7 -> y
				//8 -> y
				//9 -> y
				//10 -> y
				// x variable holds the max value for each element in the iteration
				.reduce(0, (a, b) -> (a>b) ? a : b );
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream()
				//6 -> y
				//7 -> y
				//8 -> y
				//9 -> y
				//10 -> y
				// x variable holds the max value for each element in the iteration
				.reduce((a, b) -> (a>b) ? a : b );
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
		
//		List<Integer> integerList = new ArrayList<>();
		
		System.out.println("Max value is : " + findMaxValue(integerList));
		
		Optional<Integer> optional = findMaxValueOptional(integerList);
		
		System.out.println("Optional max is : " + optional);
		
		if(optional.isPresent()) {
			System.out.println("Max value with optional is : " + optional.get());
		}
		else {
			System.out.println("Input list is empty");
		}
		
	}

}
