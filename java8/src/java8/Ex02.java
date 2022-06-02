package java8;

public class Ex02 {
	public static void main(String[] args) {
		Interf2 i = new Demo();
		i.m2(10, 50);
	}

}

class Demo implements Interf2{
	public void m2(int a, int b) {
		System.out.println("The sum is: " + (a+b));
	}
}

interface Interf2{
	public abstract void m2(int a, int b);
}