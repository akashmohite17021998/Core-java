package MethodReferance;

import java.util.function.Predicate;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		System.out.println(p.test(StudentDataBase.studentSupplier.get()));
	}
}
