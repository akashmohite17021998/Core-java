package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> studentsupplier = () -> new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
		System.out.println(studentsupplier.get());
		
		Supplier<List<Student>> listsupplier = () -> StudentDataBase.getAllStudents();
		System.out.println(listsupplier.get());
	}
}
