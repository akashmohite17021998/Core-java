package Streams_Terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {
		List<String> listName = StudentDataBase.getAllStudents().stream()
									.collect(Collectors.mapping(Student::getName, Collectors.toList()));//mapping toList
		
		System.out.println(listName);
		
		Set<String> setName = StudentDataBase.getAllStudents().stream()
								.collect(Collectors.mapping(Student::getName, Collectors.toSet()));//mapping toSet
		System.out.println(setName);
		
		List<String> listName1 = StudentDataBase.getAllStudents().stream()
									.map(Student::getName)
									.collect(Collectors.toList());
		System.out.println(listName1);
	}
	
}
