package LangPackage2;

public class Student02 {
	
	String name;
	int rollno;
	
	Student02(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Student02 s1 = new Student02("Durga", 101);
		Student02 s2 = new Student02("Ravi", 102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
	
	public String toString() {
		return "This is student with the name: " + name + " and roll no. " + rollno;
	}

}
