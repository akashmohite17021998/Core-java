package streams2;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsFilterExample2 {

	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream()
		.filter(student -> student.getGender().equalsIgnoreCase("female"))
		.filter(student -> student.getGpa()>=3.9)
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);	
	}
}
