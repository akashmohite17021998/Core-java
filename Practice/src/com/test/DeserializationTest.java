package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dp.Singleton;

public class DeserializationTest {
	
	public static void doSerializaton(Singleton s) {
		try {
		FileOutputStream fos = new FileOutputStream("data.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Object doDeserializaton() throws IOException, ClassNotFoundException {
		
		Object s = null;
		try {
		FileInputStream fos = new FileInputStream("data.ser");
		ObjectInputStream oos = new ObjectInputStream(fos);
		s = (Object)oos.readObject();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		return s;
		
	}

	public static void main(String[] args) throws IOException , FileNotFoundException, ClassNotFoundException{
		
		Singleton s = Singleton.getInstance();
		
		doSerializaton(s);
		
		Singleton s1 = (Singleton)doDeserializaton();
		
		System.out.println(s.hashCode() + "===========" + s1.hashCode());
	}
}
