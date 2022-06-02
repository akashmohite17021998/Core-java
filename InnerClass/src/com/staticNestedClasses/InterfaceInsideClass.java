package com.staticNestedClasses;

public class InterfaceInsideClass {

	interface Vehicle{
		public int getNoOfVehicle();
	}
	
	class Bus implements Vehicle{
		public int getNoOfVehicle() {
			return 6;
		}
	}
	
	class Auto implements Vehicle{
		public int getNoOfVehicle() {
			return 3;
		}
	}
}
