package java8practice;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class DistinctExample {
	
	public static List<String> PrintStudentActivitiesCount(){							//List<String>
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()	//Here we got Student object
				.map(student -> student.getActivities())										//here we convert Student object to List<String>
				.flatMap(s -> s.stream())												//So thats why we don't need to use flatMap method
//				.distinct() //distinct means it takes stream which contains duplicates and gives unique stream uncommon stream
//				.sorted()	//sorted method sorts the stream by default natural sorting order
//				.count();
				.collect(Collectors.toList());
		return studentActivities;
	}

	public static void main(String[] args) {
//		List<String> stringList = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
//		.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
//		System.out.println(stringList);
//		stringList.forEach(System.out::println);
		System.out.println(PrintStudentActivitiesCount());
		
	}
}
