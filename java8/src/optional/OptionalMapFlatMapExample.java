package optional;

import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;
import data.Bike;

public class OptionalMapFlatMapExample {

	//filter()
	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		studentOptional.filter(student -> student.getGpa()>=3.0).ifPresent(name -> System.out.println(name));
	}
	
	//map()
	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.map(Student::getName).ifPresent(s -> System.out.println(s));
	}
	
	//flatMap()
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDataBase.studentSupplier.get());//Optional<Student>
		
		Optional<String> name = studentOptional
				.filter(s -> s.getGpa()>=3.5)//Optional<Student<Optional<Bike>>>
		.flatMap(Student::getBike)//Optional<Bike>
		.map(Bike::getName);//Bike
		
		name.ifPresent(s -> System.out.println(s));
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
	}
}
