package com.test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dp3.SingletonNew;

public class SerializationTest {

	public static void doSerialization(SingletonNew s) {
		
		try {
			FileOutputStream fos = new FileOutputStream("file.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static SingletonNew doDeSerialization() {
		
		SingletonNew s = null;
		
		try {
			FileInputStream fos = new FileInputStream("file.ser");
			ObjectInputStream oos = new ObjectInputStream(fos);
			s = (SingletonNew)oos.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		SingletonNew s = SingletonNew.getInstance();
		
		doSerialization(s);
		
		SingletonNew s1 = doDeSerialization();
		System.out.println(s.hashCode() + " " + s1.hashCode());
	}
	
}
