package ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import FunctionalInterfaces.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> studentSupplier = ()  -> new Student();//Student::new;
	
	static Function<String, Student> studentFunction = (s)  -> new Student();
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("ABC"));
	}
}
