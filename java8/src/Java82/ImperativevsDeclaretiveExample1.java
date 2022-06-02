package Java82;

import java.util.stream.IntStream;

public class ImperativevsDeclaretiveExample1 {
	
	public static void main(String[] args) {
		
		/**
		 * Imperative style of programming
		 */
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("Sum using imperative approach: " + sum);
		
		
		/**
		 * Declarative style of programming
		 */
		
		int sum1 = IntStream.rangeClosed(0, 100).sum();
		System.out.println("Sum using declarative approach: " + sum1);
		
	}

}
