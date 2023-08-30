package defaults;

import java.util.List;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class DefaultMethodsExample2 {

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
	}
}
