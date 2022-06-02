package FunctionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {
	
	
	Function<Student, String> c = student -> {
		
		return student.getName();
		
	};
	
	QuadFunction<Student, String, Integer, Map> c2 = (student, s, t) -> {
		
		return new HashMap<>();
		
	};
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (lists, predicates) -> {
		Map<String, Double> m = new HashMap<>();
		
		Consumer<Student> c = student -> {
			if(predicates.test(student)) {
				m.put(student.getName(), student.getGpa());
			}
		};
		
		lists.forEach(c);
		return m;
	};
	
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
	}
}
