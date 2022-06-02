package Streams_Terminal;

import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsJoiningExample {

	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
	}
	
	public static void main(String[] args) {
//		System.out.println("No argument : " + joining_1());
//		System.out.println("With delimiter : " + joining_2());
		System.out.println("With delimiter, prefix and suffix : " + joining_3());
		
	}
}
