package java8;

public class Ex05 {
	public static void main(String[] args) {
		Interf5 i = x -> x*x;
		System.out.println(i.m5(2));
		System.out.println(i.m5(4));
		System.out.println(i.m5(8));
	}

}

interface Interf5 {
	public abstract int m5(int x);
}