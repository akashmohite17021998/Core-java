package com.Generics;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Gen<String> g1 = new Gen<String>("Durga");
		g1.show();
		System.out.println(g1.getGen());
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getGen());
		
		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.show();									//The method used in this statement has print method 
		System.out.println(g3.getGen());			//But in this statment used method don't have print method and simply returns ob so we need to use print method in this statement.
	}

}

class Gen<T>{
	T ob;
	
	Gen(T ob){							//Simple constructer.
		this.ob = ob;
	}
	
	public T getGen() {					//Simple get method which returns ob.
		return ob;
	}
	
	public void show() {				//Simple show method which prints type of ob.
		System.out.println("The type of ob: " + ob.getClass().getName());
	}
	
}