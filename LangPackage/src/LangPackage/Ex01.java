package LangPackage;

public class Ex01 {
	
	String name;
	int rollno;
	
	Ex01(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Ex01 s1 = new Ex01("Durga", 101);
		Ex01 s2 = new Ex01("Ravi", 102);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		
	}

}
