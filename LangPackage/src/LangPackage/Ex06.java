package LangPackage;

public class Ex06 {
	String name;
	int rollno;
	Ex06(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		
		Ex06 s1 = new Ex06("Durga", 101);
		Ex06 s2 = new Ex06("Ravi", 102);
		Ex06 s3 = new Ex06("Durga", 101);
		Ex06 s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	}

}
