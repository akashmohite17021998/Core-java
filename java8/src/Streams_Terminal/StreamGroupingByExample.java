package Streams_Terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents().stream()
												.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(genderMap);
	}
	
	public static void groupingStudentsByGpa() {
		Map<String, List<Student>> gpaList = StudentDataBase.getAllStudents().stream()
												.collect(Collectors.groupingBy(s -> (s.getGpa()>=3.8) ? "Outstanding" : "Averege"));
		System.out.println(gpaList);
	}
	
	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMapMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy((s -> (s.getGpa()>=3.8) ? "OutStanding" : "Average"))));
		System.out.println(studentMapMap);
	}
	
	public static void twoLevelGrouping_2() {
		Map<Integer, Integer> studentMapMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBook)));
		System.out.println(studentMapMap);
	}
	
	public static void threeLevelGrouping_3() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		System.out.println(studentLinkedHashMap);
	}
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMapOptional);
	}
	
	public static void calculateTopGpa1() {
		Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println(studentMapOptional);
	}
	
	public static void calculateLeastGpa1() {
		Map<Integer, Student> studentMapOptiona2 = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println(studentMapOptiona2);
	}
	

	public static void main(String[] args) {
//		groupStudentsByGender();
//		groupingStudentsByGpa();
//		twoLevelGrouping_1();
//		twoLevelGrouping_2();
//		threeLevelGrouping_3();
//		calculateTopGpa();
//		calculateTopGpa1();
		calculateLeastGpa1();
	}
}
