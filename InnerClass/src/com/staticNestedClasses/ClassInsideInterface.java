package com.staticNestedClasses;

interface ClassInsideInterface {

	public int getNoOfWheels();
	
	class DefaultVehicle implements ClassInsideInterface{
		
		public int getNoOfWheels() {
			
			return 4;
		}
	}
}

class Bus implements ClassInsideInterface{
	public int getNoOfWheels() {
		return 6;
	}
}