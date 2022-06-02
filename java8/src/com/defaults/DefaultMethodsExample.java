package com.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterfaces.Student;

public class DefaultMethodsExample {
	
	static Consumer<Student> studentConsumer = student -> System.out.println(student);
	
	public static void sortByName(List<Student> studentList) {
		
		System.out.println("After sort.");
		
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		
		studentList.sort(nameComparator);
		
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		
		/**
		 * sort the list names in alphabetical order.
		 */
		
		List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");
		
		/**
		 * Prior java 8
		 */
		
//		Collections.sort(stringList);
//		
//		System.out.println("Sorted list using Collections.sort() : " + stringList);
		
		/**
		 * java 8
		 */
		
		stringList.sort(Comparator.naturalOrder());
		
		System.out.println("Sorted list using List.sort() : " + stringList);
		
		stringList.sort(Comparator.reverseOrder());
		
		System.out.println("Sorted list using Collections.sort() reverse : " + stringList);
		
		
	}
}
