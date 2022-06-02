package streams2;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsFlatMapExample2 {

	public static List<String> printStudentActivities(){
		
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()	//Stream<Student>
		.map(Student::getActivities)	//Stream<List<String>>
		.flatMap(List::stream)			//Stream<String>
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		return studentActivities;
	}
	
	public static long getStudentActivitiesCount() {
		
		long studentActivitiesCount = StudentDataBase.getAllStudents().stream()	//Stream<Student>
		.map(Student::getActivities)	//Stream<List<String>>
		.flatMap(List::stream)			//Stream<String>
		.distinct()						//Stream<String> -> with distinct function performed
		.count();						//return type is long
		return studentActivitiesCount;
	}
	
	public static void main(String[] args) {
		System.out.println("printStudentActivities : " + printStudentActivities());
		System.out.println("getStudentActivitiesCount : " + getStudentActivitiesCount());
	}
}
