package Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList(){
		
		List<String> namesList = StudentDataBase.getAllStudents().stream() // Here we got Student object
				.map(Student::getName)								//here we convert Student object to String of name
				.map(String::toUpperCase)							//So thats why we don't need to use flatMap method
				.collect(Collectors.toList());
		
		return namesList;
	}
	
	public static Set<String> namesSet(){
		
		Set<String> namesSet = StudentDataBase.getAllStudents().stream()
				.map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
		return namesSet;
	}
	
	public static Map<String, List<String>> namesMap(){
		
		Map<String, List<String>> namesMap = StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGradeLevel()>=3).collect(Collectors.toMap(Student::getName, Student::getActivities));
		return namesMap;
	}
	
	public static void main(String[] args) {
		
		System.out.println(namesList());
		System.out.println(namesSet());
		System.out.println(namesMap());
	}
}
