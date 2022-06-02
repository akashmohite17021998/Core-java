	package streams2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaces.StudentDataBase;

public class StreamsMapExample2 {

	public static List<String> namesList(){
		List<String> nameList = StudentDataBase.getAllStudents().stream()	//Stream<Student>
				//Student as an input -> Student name
				.map((student -> student.getName()))	//Stream<String>
				.map((name -> name.toUpperCase()))		//Stream<String> -> upper case operation on each input
				.collect(Collectors.toList());			//List<String>
		return nameList;
	}
	
	public static Set<String> namesSet(){
		Set<String> nameList = StudentDataBase.getAllStudents().stream()	//Stream<Student>
				//Student as an input -> Student name
				.map((student -> student.getName()))	//Stream<String>
				.map((name -> name.toUpperCase()))		//Stream<String> -> upper case operation on each input
				.collect(Collectors.toSet());			//List<String>
		return nameList;
	}
	
	public static void main(String[] args) {
		System.out.println(namesList());
		System.out.println(namesSet());
	}
}
