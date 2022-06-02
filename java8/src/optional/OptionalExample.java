package optional;

import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		
//		Student student = null;
		
		if(student!=null) {
			return student.getName();
		}
		else {
			return null;
		}
	}
	
	public static Optional<String> getStudentNameOptional() {
//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		else {
			return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
//		if(getStudentName()!=null) {
//			System.out.println(getStudentName().length());
//		}
//		else {
//			System.out.println("Student not found.");
//		}
		
		if(getStudentNameOptional().isPresent()) {
			System.out.println("Length of the student name is : " + getStudentNameOptional().get().length());
		}
		else {
			System.out.println("Name not found.");
		}
	}
	
}
