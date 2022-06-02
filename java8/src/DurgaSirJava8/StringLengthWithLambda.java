package DurgaSirJava8;

public class StringLengthWithLambda {

	public static void main(String[] args) {
		StringLengthI i = s -> System.out.println(s.length());
		i.m1("ironman");
		i.m1("thor");
	}
}
