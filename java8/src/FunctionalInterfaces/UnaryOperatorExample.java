package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> unary = s -> s.concat("Default");    //Input and output are of same type
	
	public static void main(String[] args) {
		System.out.println(unary.apply("hello"));
	}
}
