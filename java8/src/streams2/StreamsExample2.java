package streams2;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamsExample2 {

	public static void main(String[] args) {
		
		Predicate<Student> studentGradelevelPredicate = student -> student.getGradeLevel()>=3;
		
		Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;
		
		Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
				.peek((student -> System.out.println(student)))
										.filter(studentGradelevelPredicate)
										.peek((student -> System.out.println("After 1st filter" + student)))
										.filter(studentGpaPredicate)
										.peek((student -> System.out.println("After 2st filter" + student)))
										.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map);
		
		
	}
}
