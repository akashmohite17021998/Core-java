package FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result is : " + maxBy.apply(4, 5));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result is : " + minBy.apply(4, 5));
	}
}
