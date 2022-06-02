package MethodReferance;

import java.util.function.Consumer;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class ConsumerMethodReferanceExample {

	static Consumer<Student> c1 = s -> System.out.println(s);
	
	/**
	 * method reference - ClassName::MethodName
	 */
	static Consumer<Student> c2 = System.out::println;
	
	static Consumer<Student> c3 = Student::printStudentActivities;
	
	public static void main(String[] args) {
//		StudentDataBase.getAllStudents().forEach(c1);
//		System.out.println("");
//		System.out.println("Now print method with method reference.");
//		System.out.println("");
//		StudentDataBase.getAllStudents().forEach(c2);
		
		StudentDataBase.getAllStudents().forEach(c3);
	}
}
