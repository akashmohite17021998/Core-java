package com.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dp2.SingletonWithDoubleNullCheck;

public class SerializableTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		SingletonWithDoubleNullCheck s = SingletonWithDoubleNullCheck.getInstance();
		
		try {
			FileOutputStream fos = new FileOutputStream("data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		Object o = null;
		
		try {
			FileInputStream fis = new FileInputStream("data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Object)ois.readObject();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(s.hashCode() + " " + o.hashCode());
	}
	
}
