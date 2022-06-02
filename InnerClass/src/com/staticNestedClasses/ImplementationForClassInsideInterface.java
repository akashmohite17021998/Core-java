package com.staticNestedClasses;

import com.staticNestedClasses.ClassInsideInterface.DefaultVehicle;

public class ImplementationForClassInsideInterface {

	public static void main(String[] args) {
		
		ClassInsideInterface.DefaultVehicle o = new ClassInsideInterface.DefaultVehicle();
		System.out.println(o.getNoOfWheels());
		
		DefaultVehicle i = new DefaultVehicle();
		System.out.println(i.getNoOfWheels());
		
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
	}
}
