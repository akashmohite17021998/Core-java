package FunctionalInterfaces;

import java.util.List;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	public static void nameAndActivities() {
		
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
		
		List<Student> list = StudentDataBase.getAllStudents();
		
		list.forEach((Student -> biConsumer.accept(Student.getName(), Student.getActivities())));
		
	}
	
	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a : " + a + " b : " + b);
		};
		
		biConsumer.accept("java7", "java8");
		
		BiConsumer<Integer, Integer> biconsumer1 = (a, b) -> {
			System.out.println("The multiplication of a and b is : " + (a*b));
		};
		
		BiConsumer<Integer, Integer> biconsumer2 = (a, b) -> {
			System.out.println("The division of a and b is : " + (a/b));
		};
		
		BiConsumer<Integer, Integer> biconsumer3 = (a, b) -> {
			System.out.println("The addition of a and b is : " + (a+b));
		};
		
		BiConsumer<Integer, Integer> biconsumer4 = (a, b) -> {
			System.out.println("The substraction of a and b is : " + (a-b));
		};
		
		biconsumer1.andThen(biconsumer2).andThen(biconsumer3).andThen(biconsumer4).accept(20, 10);
		
		nameAndActivities();
		
	}

}
