package Streams_Terminal;

import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBook));
	}
	
	public static double avg() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNoteBook));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(avg());
	}
	
}
