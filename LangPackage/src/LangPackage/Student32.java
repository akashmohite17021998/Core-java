package LangPackage;

public final class Student32 {
	private int i;
	Student32(int i){
		this.i = i;
	}
	public static void main(String[] args) {
		Student32 s1 = new Student32(10);
		Student32 s2 = s1.modify(100);
		Student32 s3 = s1.modify(10);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}
	
	public Student32 modify(int i) {
		if(this.i == i) {
			return this;
		}
		else {
			return (new Student32(i));
		}
	}

}
