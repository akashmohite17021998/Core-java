package LangPackage;

public class Ex04 {
	int i;
	Ex04(int i){
		this.i=i;
	}
	
	public int hashCode() {
		return i;
	}
	public static void main(String[] args) {
		Ex04 t1 = new Ex04(10);
		Ex04 t2 = new Ex04(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}
