package LangPackage2;

public class Test05 {
	
	int i;
	
	Test05(int i){
		this.i = i;
	}
	
	public int hashCode() {
		return i;
	}
	public static void main(String[] args) {
		Test05 t1 = new Test05(10);
		Test05 t2 = new Test05(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}
