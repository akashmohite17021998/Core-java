package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.singleton.singleton.Singleton;
import com.singleton.singleton.Singleton2;
import com.singleton.singleton.Singleton3;

public class SingletonClassSeralizationAndDeseralizationTest3 {
	
	public static void doSeralization(Object s) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(s);	//Internally calls writeReplace() method which is private method. we can control on seralization by writing the writeReplace() method inside the call object which we want to serialize but this method we can't say override method.
			oos.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object doDeseralization() {
		
		Object s = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			s = (Object)ois.readObject();	//Internally calls readResolve() method which is private method. we can control on seralization by writing the writeReplace() method inside the call object which we want to serialize but this method we can't say override method.
 		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return s;
	}

	public static void main(String[] args) {
		
//		//get Singleton java object
//		Singleton2 s1 = Singleton2.getINSTANCE();
//		
//		doSeralization(s1); //Serialization
//		System.out.println("=======================================================================");
//		Singleton2 s2 = (Singleton2)doDeseralization();
//		Singleton2 s3 = (Singleton2)doDeseralization();
//		
//		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
		
		
		//get Singleton java object
		Singleton3 s1 = Singleton3.getINSTANCE();
				
		doSeralization(s1); //Serialization
		System.out.println("=======================================================================");
		Singleton3 s2 = (Singleton3)doDeseralization();
		Singleton3 s3 = (Singleton3)doDeseralization();
				
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
		
		
	}//main
}//class
