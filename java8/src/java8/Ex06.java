package java8;

public class Ex06 {
	public static void main(String[] args) {
		Interf6 i = new Test6();
		System.out.println(i.m6(2));
		System.out.println(i.m6(4));
		System.out.println(i.m6(6));
	}

}

interface Interf6 {
	public abstract int m6(int x);
}

class Test6 implements Interf6{
	public int m6(int x) {
		return x*x;
	}
}