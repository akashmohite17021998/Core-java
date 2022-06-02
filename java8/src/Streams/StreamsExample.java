
package Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsExample {
	
	public static void main(String[] args) {
		
		Predicate<Student> studentPredicate = s -> s.getGpa()>=3.9;
		Predicate<Student> studentGpaPredicate = s -> s.getGradeLevel()>=3;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(studentPredicate)
				.filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
		
		List<Student> studentList = StudentDataBase.getAllStudents().stream()
				.filter(studentPredicate).collect(Collectors.toList());
		System.out.println(studentList);
	}

}
