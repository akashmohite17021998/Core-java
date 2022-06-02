package Java82;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Result of the comparator is: " + comparator.compare(2, 10));
		
		Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);
		
		System.out.println("Result of the comparator using lambda is: " + comparator1.compare(2, 10));
		
	}

}
