package MethodReferance;

import java.util.function.Function;

public class FunctionMethodReferanceExample {

	static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
	
	static Function<String, String> toUpperCaseMethodReferance = String::toUpperCase;
	
	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("hello"));
		System.out.println(toUpperCaseMethodReferance.apply("java8"));
	}
}
