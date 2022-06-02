package LangPackage;

public class Student08 {
	String name;
	int rollno;
	
	Student08(String name, int roll){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Student08 s1 = new Student08("Durga", 101);
		Student08 s2 = new Student08("Ravi", 102);
		Student08 s3 = new Student08("Durga", 101);
		Student08 s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));
		System.out.println(s1.equals(null));
	}
	
	public boolean equals(Object obj) {
		try {
			Student08 st1 = (Student08)obj;
			if(name.equals(st1.name) && rollno == st1.rollno) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(NullPointerException e) {
			return false;
		}
		catch(ClassCastException e) {
			return false;
		}
	}

}
