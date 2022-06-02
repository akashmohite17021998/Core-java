package FunctionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> nameAndGpa = students -> {
		Map<String, Double> m = new HashMap<>();
		students.forEach(student -> {
			if(PredicateStudentExample.p2.test(student)) {
				m.put(student.getName(), student.getGpa());
			}
		});
		return m;
	};
	
	public static void main(String[] args) {
		System.out.println(nameAndGpa.apply(StudentDataBase.getAllStudents()));
	}

}
