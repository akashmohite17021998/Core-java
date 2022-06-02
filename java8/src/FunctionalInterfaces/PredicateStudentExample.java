package FunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {	//Predicate contains one abstract test method and three default and, or, negate methods
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	
	public static void filterStudentsByGradeLevel() {
		
		System.out.println("filterStudentsByGradeLevel : ");
		
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach( (s) -> {
			if(p1.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudentsByGpa() {
		
		System.out.println("filterStudentsByGpa : ");
		
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach( (s) -> {
			if(p2.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudents() {
		
		System.out.println("filterStudents : ");
		
		List<Student> l = StudentDataBase.getAllStudents();
		l.forEach((s) -> {
			if(p1.and(p2).test(s)) {
				System.out.println(s);
			}
		});
		
	}
	
	public static void main(String[] args) {
//		filterStudentsByGradeLevel();
//		filterStudentsByGpa();
		filterStudents();
	}

}
