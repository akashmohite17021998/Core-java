package LangPackage;
import java.lang.reflect.*;
public class Student11 {
	public static void main(String[] args) {
		int count = 0;
		Object o = new String("Durga");
		Class c = o.getClass();
		System.out.println(c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("The methods information: ");
		for(Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The total methods present in " + c.getName() + " is " + count);
	}

}
