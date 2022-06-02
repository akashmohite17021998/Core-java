package DurgaSirJava8;

public class Test {

	public static void main(String[] args) {
		Random r = new Demo();
		r.m1();
	}
}

class Demo implements Random{
	public void m1() {
		System.out.println("m1() method implementation.");
	}
}
