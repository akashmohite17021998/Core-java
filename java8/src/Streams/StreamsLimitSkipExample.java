package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> list) {
		return list.stream()
				//6
				//7
				//8
				//9
				//10
				.limit(3) //6, 7, 8
				.reduce((a, b) -> a+b);	
	}
	
	public static Optional<Integer> skip(List<Integer> limit){
		return limit.stream()
				.skip(3) // 8, 9, 10
				.reduce((a, b) -> a+b);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
		
		Optional<Integer> optionalLimit = limit(list);
		System.out.println("Addition of first 5 elements : " + optionalLimit);
		if(optionalLimit.isPresent()) {
			System.out.println("Addition of first 5 elements with optional : " + optionalLimit.get());
		}else {
			System.out.println("List is empty.");
		}
			
			
			Optional<Integer> optionalSkip = skip(list);
			System.out.println("Addition of list elemets by skiping first 2 elements of list : " + optionalSkip);
			if(optionalSkip.isPresent()) {
				System.out.println("Addition of list elemets by skiping first 2 elements of list : " + optionalSkip.get());
			}
			else {
				System.out.println("List is empty.");
			}
			
	
	
}
}
