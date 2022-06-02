package DurgaSirJava8;

public class StringLenghtWithoutLambda {

	public static void main(String[] args) {
		StringLengthI i = new Demo2();
		i.m1("batman");
		i.m1("superman");
	}
}

class Demo2 implements StringLengthI{
	public void m1(String s) {
		System.out.println(s.length());
	}
}