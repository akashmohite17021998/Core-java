package LangPackage;

public class Student10 {
	String name;
	int rollno;
	Student10(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String[] args) {
		Student10 s1 = new Student10("Durga", 101);
		Student10 s2 = new Student10("Ravi", 102);
		Student10 s3 = new Student10("Durga", 101);
		Student10 s4 = s1;
		Student10 s5 = new Student10("Ravi", 102);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));
		System.out.println(s1.equals(null));
		System.out.println(s5.equals(s2));
	}
	
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if(obj instanceof Student10) {
		
			Student10 st1 = (Student10)obj;
			
			if(name.equals(st1.name) && rollno == st1.rollno) {
				return true;
			}
			else {
				return false;
			}
			
		}
		else {
		return false;
		}
	}

}
