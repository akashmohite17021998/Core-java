package LangPackage2;

public class Student07 {
	
	String name;
	int rollno;
	
	Student07(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Student07 s1 = new Student07("Durga", 101);
		Student07 s2 = new Student07("Ravi", 102);
		Student07 s3 = new Student07("Durga", 101);
		Student07 s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
