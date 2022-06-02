package FunctionalInterfaces;

public class FunctionExample1 {
	
	public static String performConcat(String s) {
		return FunctionExample.function2.apply(s);
	}

	public static void main(String[] args) {
		String result = performConcat("hello");
		System.out.println("result is : " + result);
	}
}
