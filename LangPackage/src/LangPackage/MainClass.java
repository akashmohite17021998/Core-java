package LangPackage;

import java.util.HashSet;
//import java.util.LinkedHashSet;

public class MainClass {
	
	public static void main(String[] args) {
		
		Employee11 e1 = new Employee11("Durga", 101, "Durga@123");
		Employee11 e2 = new Employee11("Natraj", 102, "Natraj@123");
		Employee11 e3 = new Employee11("Nagarjuna", 103, "Nagarjuna@123");
		Employee11 e4 = new Employee11("Ravi", 104, "Ravi@123");
		Employee11 e5 = new Employee11("Kavi", 105, "Kavi@123");
		Employee11 e6 = new Employee11("Rama", 106, "Kavi@123");
		Employee11 e7 = new Employee11("Sujit", 107, "Sujit@123");
		Employee11 e8 = new Employee11("Omkar", 108, "Omkar@123");
		Employee11 e9 = new Employee11("Pankaj", 109, "Pankaj@123");
		Employee11 e10 = new Employee11("Pranav", 110, "Pranav@123");
		
		HashSet<Employee11> h= new HashSet<>();
	
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		h.add(e6);
		h.add(e7);
		h.add(e8);
		h.add(e9);
		h.add(e10);
		
		h.stream().forEach(e -> System.out.println(e.getName() + " " +e.getUsername()));
	}

}
