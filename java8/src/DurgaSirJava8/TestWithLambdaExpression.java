package DurgaSirJava8;

public class TestWithLambdaExpression {

	public static void main(String[] args) {
		Random r = () -> System.out.println("m1() method implementation by using lambda expression.");
		r.m1();
	}
	
}
