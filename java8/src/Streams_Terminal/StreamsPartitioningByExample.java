package Streams_Terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void partitioningBy_1() {
		
		Predicate<Student> p = s-> s.getGpa()>=3.8;
		
		Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(p));
		System.out.println(partitioningMap);
	}
	
	public static void partitioningBy_2() {
		
		Predicate<Student> p = s-> s.getGpa()>=3.8;
		
		Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(p, Collectors.toSet()));
		System.out.println(partitioningMap);
	}
	
	public static void main(String[] args) {
//		partitioningBy_1();
		partitioningBy_2();
	}
}
