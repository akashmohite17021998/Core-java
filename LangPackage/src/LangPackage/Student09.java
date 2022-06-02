package LangPackage;

public class Student09 {
	String name;
	int rollno;
	Student09(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String[] args) {
		Student09 s1 = new Student09("Durga", 101);
		Student09 s2 = new Student09("Ravi", 102);
		Student09 s3 = new Student09("Durga", 101);
		Student09 s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));
		System.out.println(s1.equals(null));
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student09) {
			
			Student09 s1 = (Student09)obj;
			
			if(name.equals(s1.name) && rollno == s1.rollno) {
				return true;
			}
			
			else {
				return false;
			}
		}
		return false;
		
		
	}

}
