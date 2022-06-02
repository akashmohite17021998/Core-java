package java8;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Interf4 i = s -> s.length();
		
		System.out.println(i.m4("Hello"));
		System.out.println(i.m4("With lambda expression"));
	
	}

}

@FunctionalInterface
interface Interf4 {
	public abstract int m4(String s);
}