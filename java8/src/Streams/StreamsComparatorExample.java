package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentByName(){
		
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentsByGpa(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGpaDescending(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList()); //reversed() method used
	}
	
	public static void main(String[] args) {
		System.out.println("Students sorted by name : ");
		System.out.println(sortStudentByName());
		System.out.println("Students sorted by GPA : ");
		System.out.println(sortStudentsByGpa());
		System.out.println("Students sorted by Descending GPA : ");
		System.out.println(sortStudentByGpaDescending());
	}
}
