package LangPackage2;

public class Test06 {
	
	int i;
	
	Test06(int i){
		this.i = i;
	}
	
	public String toString() {
		return i + "";
	}
	
	public static void main(String[] args) {
		Test06 t1 = new Test06(10);
		Test06 t2 = new Test06(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}
