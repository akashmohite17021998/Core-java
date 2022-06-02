package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinExample {

	public static int minValue(List<Integer> list) {
		
		return list.stream()
				.reduce(0, (a, b) -> (a<b) ? a : b);
	}
	
	public static Optional<Integer> minValueWithOptional(List<Integer> list) {
		
		return list.stream()
				.reduce((a, b) -> (a<b) ? a : b);
	}
	
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Min value of list without optional : " + minValue(list));
		
		Optional<Integer> optional = minValueWithOptional(list);
		
		System.out.println("Min value of list with optional : " + optional);
		
		if(optional.isPresent()) {
			System.out.println("Min value of list with optional : " + optional.get());
		}else {
			System.out.println("Input list is empty.");
		}
	}
	
}
