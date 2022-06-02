package parallelstream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class parallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities(){	
		
		long startTime = System.currentTimeMillis();
		
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
	 
	 long endTime = System.currentTimeMillis();
	 System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime));
		return studentActivities;
	}
	
	public static List<String> parallelPrintStudentActivities(){	
	
		long startTime = System.currentTimeMillis();
		
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
	 
	 long endTime = System.currentTimeMillis();
	 
	 System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime));
	 
		return studentActivities;
	}
	
	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}
	
}
