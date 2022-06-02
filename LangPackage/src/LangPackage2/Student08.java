package LangPackage2;

public class Student08 {
	
	String name;
	int rollno;
	
	Student08(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int rollno1 = this.rollno;
			Student08 s = (Student08)obj;
			String name2 = s.name;
			int rollno2 = s.rollno;
			
			if(name1.equals(name2) && rollno1 == rollno2) {
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

}
