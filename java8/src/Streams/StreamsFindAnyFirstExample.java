package Streams;

import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa()>= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa()>= 4.1)
				.findFirst();
	}
	
	public static void main(String[] args) {
		Optional<Student> optionalStudent = findAnyStudent();
		if(optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}else {
			System.out.println("Student not found !");
		}
		
		Optional<Student> optionalStudent1 = findFirstStudent();
		if(optionalStudent1.isPresent()) {
			System.out.println(optionalStudent1.get());
		}else {
			System.out.println("Student not found !");
		}
	}
}
