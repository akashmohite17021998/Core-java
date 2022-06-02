package parallelstream;

import java.util.stream.IntStream;

public class SumClient {

	
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		IntStream.rangeClosed(1, 1000) //without parallel stream result is 500500
		.parallel()	//with parallel stream result is 456035, 481894, 472913, 491666
		.forEach(sum::performSum);
		
		System.out.println(sum.getTotal());
	}
}
