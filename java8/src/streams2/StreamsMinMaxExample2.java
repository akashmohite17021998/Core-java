package streams2;

import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample2 {

	public static int findMaxValue(List<Integer> integerList) {
		
		return integerList.stream().reduce(1, (a, b) -> a>b ? a:b);
		
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
		System.out.println(findMaxValue(integerList));
	}
}
