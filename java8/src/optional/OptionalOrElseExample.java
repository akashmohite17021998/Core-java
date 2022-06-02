package optional;

import java.util.Map;
import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class OptionalOrElseExample {

	//orElse()
	public static String optionalOrElse() {
//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); 
		Optional<Student> studentOptional = Optional.ofNullable(null); //if the object present in the Optional then the only map method will be executed and orElse method will not executed and if null present in the Optional then the orElse() method will be executed and map() method will not be executed.
		
		return studentOptional.map(Student::getName).orElse("Default");
	}
	
	//orElseGet
	public static String optionalOrElseGet() {
//		Optional<Student> studentOptional1 = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional1 = Optional.ofNullable(null); //if the object present in the Optional then the only map method will be executed and orElseGet method will not executed and if null present in the Optional object then the orElseGet() method will be executed and map() method will not be executed.

		return studentOptional1.map(Student::getName).orElseGet(() -> "Default");
	}
	
	//orElseThrow
	public static String optionalOrElseThrow() {
//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available."));
	}
	
	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}
}
