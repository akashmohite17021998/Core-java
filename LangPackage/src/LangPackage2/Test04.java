package LangPackage2;

public class Test04 {
	int i;
	Test04(int i){
		this.i = i;
	}
	public static void main(String[] args) {
		Test04 t1 = new Test04(10);
		Test04 t2 = new Test04(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}
