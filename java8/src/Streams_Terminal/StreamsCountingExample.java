package Streams_Terminal;

import java.util.stream.Collectors;

import FunctionalInterfaces.StudentDataBase;

public class StreamsCountingExample {

	public static Long count() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.counting()); //counting method returns the Collector
//				.count(); //count() method returns the long
	}
	
	public static long countFiltered() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa()>=3.9)
				.collect(Collectors.counting()); //counting method returns the Collector
				//.count(); //count() method returns the long
	}
	
	public static void main(String[] args) {
		System.out.println(count());
		System.out.println(countFiltered());
	}
	
}
