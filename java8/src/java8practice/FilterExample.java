package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("spring", "node", "mkyoung");
		List<String> list1 = list.stream().filter(s -> !s.equals("mkyoung")).collect(Collectors.toList());
		list1.forEach(System.out::println);
		
	}

}
