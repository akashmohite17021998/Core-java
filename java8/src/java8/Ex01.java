package java8;

public class Ex01 {
	public static void main(String[] args) {
		interf i = () -> {
			System.out.println("Hello");
		};
		i.m1();
	}
	

}

@FunctionalInterface
interface interf{
	public abstract void m1();
}