package DurgaSirJava8;

public class AdditionWithLambda {

	public static void main(String[] args) {
		WithoutLambdaInterf i = (a, b) -> System.out.println("The addition of a and b with lambda is : " + (a + b));
		i.add(10, 20);
		i.add(100, 200);
	}
}
