package DurgaSirJava8;

public class AdditionWithoutLambda {

	public static void main(String[] args) {
		
		WithoutLambdaInterf i = new Demo1();
		i.add(10, 20);
		i.add(100, 200);
		
	}
}

class Demo1 implements WithoutLambdaInterf{
	
	public void add(int a, int b) {
		
		System.out.println("The addition of a and b is : " + (a+b));
		
	}
}