package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsExampleWithPeek {
	
	public static void main(String[] args) {
		
		Map<String, List<String>> studentmap = StudentDataBase.getAllStudents().stream()
												.filter(s -> s.getGradeLevel()>=3)
												.peek(s -> System.out.println("After 1st filter : " + s))
												.filter(s -> s.getGpa()>=3.9)
												.peek(s -> System.out.println("After 2nd filter : " + s))
												.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentmap);
		
	}

}
