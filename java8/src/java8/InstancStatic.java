package java8;

public class InstancStatic {

	static int i = 10;
	
	int j = 20;
	
	public int m1() {
		return j;
	}
	
	public static void main(String[] args) {
		InstancStatic is = new InstancStatic();
//		System.out.println(is.j);
		System.out.println(is.j);
	}
}
