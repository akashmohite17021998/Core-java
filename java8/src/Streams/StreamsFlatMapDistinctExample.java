package Streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsFlatMapDistinctExample {

	public static List<List<String>> PrintStudentActivitiesList(){							//List<String>
		List<List<String>> studentActivities = StudentDataBase.getAllStudents().stream() //Here we got Student object
				.map(Student::getActivities)							//here we convert Student object to List<String>
				.collect(Collectors.toList());							//So thats why we don't need to use flatMap method
		return studentActivities;
	}
	
	/**.flatMap(List::stream) here List::Stream we use for the List if we use Set instead of List than use Set::stream
	 * 
	 * @return
	 */
	
	public static List<String> PrintStudentActivities(){	
		
		Function<Student, Stream<String>> list= l ->{
			return l.getActivities().stream().map(st -> st.concat(" 1 "));
		};
		//List<String>
	 List<String>   studentActivities = StudentDataBase.getAllStudents().stream()	//Here we got Student object
				.map(Student::getActivities).flatMap(l -> l.stream())								//here we convert Student object to List<String>
				.flatMap(st -> Stream.of(st.concat(" 1 ")))												//So thats why we don't need to use flatMap method
				.distinct() //distinct means it takes stream which contains duplicates and gives unique stream uncommon stream
				.sorted()	//sorted method sorts the stream by default natural sorting order
				.collect(Collectors.toList());
		return studentActivities;
	}
	
	public static long PrintStudentActivitiesCount(){							//List<String>
		long studentActivities = StudentDataBase.getAllStudents().stream()	//Here we got Student object
				.map(Student::getActivities)										//here we convert Student object to List<String>
				.flatMap(List::stream)												//So thats why we don't need to use flatMap method
				.distinct() //distinct means it takes stream which contains duplicates and gives unique stream uncommon stream
				.sorted()	//sorted method sorts the stream by default natural sorting order
				.count();
		return studentActivities;
	}
	
	public static void main(String[] args) {
//		System.out.println(PrintStudentActivitiesList());
		System.out.println(PrintStudentActivities());
		System.out.println(PrintStudentActivitiesCount());
	}
}
