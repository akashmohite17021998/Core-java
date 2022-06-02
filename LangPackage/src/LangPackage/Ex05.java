package LangPackage;

public class Ex05 {
	
	int i;
	
	Ex05(int i){
		this.i=i;
	}
	
	public String toString() {
		return i + "";
	}
	
	public static void main(String[] args) {
		Ex05 t1 = new Ex05(10);
		Ex05 t2 = new Ex05(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}
