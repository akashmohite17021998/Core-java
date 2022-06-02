package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class BiPredicateExample {
	
	BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
	
	BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> consumer = s -> {
		if(biPredicate.test(s.getGradeLevel(), s.getGpa())) {
			biConsumer.accept(s.getName(), s.getActivities());
		}
	};
	
	public void getNameAndActivities(List<Student> l) {
		l.forEach(consumer);
	}


	public static void main(String[] args) {
		
		List<Student> l = StudentDataBase.getAllStudents();
		new BiPredicateExample().getNameAndActivities(l);
		
	}
	
}
