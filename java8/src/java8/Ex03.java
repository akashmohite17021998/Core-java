package java8;

public class Ex03 {
	public static void main(String[] args) {
		Interf3 i = (a, b) -> System.out.println("The sum by lambda expression is: " + (a+b));
		i.m3(10, 20);
		i.m3(100, 200);
	}

}

@FunctionalInterface
interface Interf3{
	public abstract void m3(int a, int b);
}