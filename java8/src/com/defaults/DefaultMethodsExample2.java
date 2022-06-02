package com.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class DefaultMethodsExample2 {

	static Consumer<Student> studentConsumer = student -> System.out.println(student);
	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	
	static Comparator<Student> gradComparator = Comparator.comparingInt(Student::getGradeLevel);
	
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	
	public static void sortByName(List<Student> studentList) {
		
		System.out.println("After sort.");
		
		studentList.sort(nameComparator);
		
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGpa(List<Student> studentList) {
		
		System.out.println("After Gpa sort.");
		
		studentList.sort(nameComparator);
		
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		
		System.out.println("After comparatorChaining");
		
		studentList.sort(gradComparator.thenComparing(nameComparator).thenComparing(gpaComparator));
		
		studentList.forEach(studentConsumer);
	}
	
	public static void sortWithNullFirstValues(List<Student> studentList) {
		
		System.out.println("Before sortWithNullFirstValues.");
		
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
		
		studentList.sort(studentComparator);
		
		studentList.forEach(studentConsumer);
		
	}
	
	public static void sortWithNullLastValues(List<Student> studentList) {
		
		System.out.println("Before sortWithNullLastValues.");
		
		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
		
		studentList.sort(studentComparator);
		
		studentList.forEach(studentConsumer);
		
	}
	
	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		System.out.println("Before sort.");
		
		studentList.forEach(studentConsumer);
		
//		sortByName(studentList);
//		
//		sortByGpa(studentList);
//		
//		comparatorChaining(studentList);
		
		sortWithNullFirstValues(studentList);
		
		sortWithNullLastValues(studentList);
		
		DefaultMethodsExample2 d = new DefaultMethodsExample2();
	}
}
