package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		
		return integerList.stream().reduce(1, (a, b) -> a*b);
		
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a*b);
	}
	
	public static Optional<Student> getHighestGpaStudent(){
		
		return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> (s1.getGpa() < s2.getGpa()) ? s2 : s1);
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList( 1, 3, 5, 7);
		System.out.println(integerList);
		List<Integer> integerList1 = new ArrayList<>();
		System.out.println(performMultiplication(integerList));
		
		Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integerList1);
		if(result1.isPresent()) {
		System.out.println(result1.get());
		
		}
		
		Optional<Student> optionalStudent = getHighestGpaStudent();
		if(optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}
	}
}
