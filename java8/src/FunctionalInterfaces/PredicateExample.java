package FunctionalInterfaces;

import java.util.function.*;

public class PredicateExample {
	
	static Predicate<Integer> p = (i) -> i%2 == 0;
	
	static Predicate<Integer> p1 = (i) -> i%5 == 0;
	
	public static void predicateAnd() {
		 System.out.println("Predicate and result is : " + p.and(p1).test(10));
		 System.out.println("Predicate and result is : " + p.and(p1).test(9));
			
	}
	
	public static void predicateOr() {
		
		System.out.println("Presdicate or result is : " + p.or(p1).test(10));
		System.out.println("Presdicate or result is : " + p.or(p1).test(8));
	}
	
	public static void predicateNegate() {
		
		System.out.println("Presdicate negate result is : " + p.or(p1).negate().test(10));
		
	}
	
	public static void main(String[] args) {

		predicateAnd();
		predicateOr();
		predicateNegate();
		
	}	
}
