package streams2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamReduce2 {

	public static int performMultiplication(List<Integer> list) {
		
		return list.stream()
				//1
				//3
				//5
				//7
				//a=1, b=1(from stream) => result 1 is returned
				//a=1, b=3(from stream) => result 3 is returned
				//a=3, b=5(from stream) => result 15 is returned
				//a=15, b=7(from stream) => result 105 is returned
		.reduce(1, (a, b) -> a*b);
		
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> list) {
		
		return list.stream()
				//1
				//3
				//5
				//7
				//a=1, b=1(from stream) => result 1 is returned
				//a=1, b=3(from stream) => result 3 is returned
				//a=3, b=5(from stream) => result 15 is returned
				//a=15, b=7(from stream) => result 105 is returned
		.reduce((a, b) -> a*b);
		
	}
	
	public static Optional<Student> getHishestGpaStudentIf(){
		return StudentDataBase.getAllStudents().stream()
		.reduce((s1, s2) -> {
			if(s1.getGpa()>s2.getGpa()) {
				return s1;
			}else {
				return s2;
			}
		});
	}
	
	public static Optional<Student> getHishestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
		.reduce((s1, s2) -> (s1.getGpa()>s2.getGpa())? s1:s2);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 3, 5, 7);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println(performMultiplication(list));
		
		Optional<Integer> optional = performMultiplicationWithoutIdentity(list);
		
		System.out.println(optional.isPresent());
		
		System.out.println(optional.get());
		
		Optional<Integer> optional1 = performMultiplicationWithoutIdentity(list1);
		
		System.out.println(optional1.isPresent());
		
		if(optional1.isPresent()) {
			System.out.println(optional1.get());
		}
		
		Optional<Student> studentIf = getHishestGpaStudentIf();
		if(studentIf.isPresent())
			System.out.println(studentIf.get());
		
	}
}
