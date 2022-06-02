package FunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {	  // Consumer contains one abstract accept method and one default andThen method
	
	static Consumer<Student> c2 = (student) -> System.out.println(student);			
	static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
	
	public static void printStudents() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);
	}
	
	public static void printNameAndActivities() {
		
		System.out.println("printNameAndActivities : ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3.andThen(c4));
		
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		
		System.out.println("printNameAndActivitiesUsingCondition : ");
		
		Consumer<Student> c5 = student -> {
//			System.out.println(student.getName());
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {		//andThen() method
				c3.andThen(c4).accept(student);								// why .accept(student) inserted
			}
		};
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c5);
		
	}
	
	public static void main(String[] args) {
		
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		
		c1.accept("java8");
		
//		printStudents();
//		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}

}
