package LangPackage;

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
		System.out.println(s1.equals("Durga"));
		System.out.println(s1.equals(null));
	}
	
	public boolean equals(Object obj) {
		try {
			
			String n1 = this.name;
			int r1 = this.rollno;
			Student07 s1 = (Student07)obj;
			String n2 = s1.name;
			int r2 = s1.rollno;
			
			if(n1.equals(n2) && r1 == r2) {
				return true;
			}
			else {
				return false; 
			}
			
		}
		catch(ClassCastException e) { return false;}
		catch(NullPointerException e) {return false;}
	}

}
