package Streams;

import FunctionalInterfaces.Student;
import FunctionalInterfaces.StudentDataBase;

public class StreamMapReduceExample {
	
	public static int noOfNoteBook() {
		return StudentDataBase.getAllStudents().stream()
		.filter(s -> s.getGender().equals("female"))
		.filter(s -> s.getGradeLevel()>=3)
		.map(Student::getNoteBook)
		.reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		System.out.println(noOfNoteBook());
	}

}
