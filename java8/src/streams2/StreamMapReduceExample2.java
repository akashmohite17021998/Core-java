package streams2;

import FunctionalInterfaces.StudentDataBase;

public class StreamMapReduceExample2 {

	public static int noOfNoteBooks(){
		int noteBook = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel()>=3)
				.filter(student -> student.getGender().equals("female"))
		.map(student -> student.getNoteBook())
		.reduce(0, (a, b) -> a+b);
		
		return noteBook;
	}
	
	public static void main(String[] args) {
		
		System.out.println("noOfNoteBooks : " + noOfNoteBooks());
		
	}
}
