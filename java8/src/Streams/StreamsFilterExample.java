package Streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudents(){
		
		return StudentDataBase.getAllStudents().stream()
		.filter(s -> s.getGender().equals("female"))
		.filter(s -> s.getGpa()>=3.9)
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
//		System.out.println(filterStudents());
		filterStudents().forEach(System.out::println);
	}

}
