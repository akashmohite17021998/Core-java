package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> consumer = s -> {
		if(p1.and(p2).test(s)) {
			biConsumer.accept(s.getName(), s.getActivities());
		}
	};
	
	public void printNameAndActivities(List<Student> l) {
		l.forEach(consumer);									//forEach() method
	}
	
	public static void main(String[] args) {
		List<Student> l = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(l);
	}

}
