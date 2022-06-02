package Streams;

import java.util.List;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatch(List<Student> student) {
		return student.stream()
				.allMatch(s -> s.getGpa()>=3.5);
	}
	
	public static boolean anyMatch(List<Student> student) {
		return student.stream().anyMatch(s -> s.getGpa()>=4.0);
	}
	
	public static boolean noneMatch(List<Student> student) {
		return student.stream().noneMatch(s -> s.getGpa()>=4.0);
	}
	
	public static void main(String[] args) {
		List<Student> student = StudentDataBase.getAllStudents();
		System.out.println(allMatch(student));
		System.out.println(anyMatch(student));
		System.out.println(noneMatch(student));
	}
	
}
