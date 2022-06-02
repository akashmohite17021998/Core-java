package java8;

public class SingleTonClass {

	private static SingleTonClass INSTANCE = null;
	
	private SingleTonClass() {
		
	}
	
	public static SingleTonClass getSingleTonClass() {
		if(INSTANCE == null) {
			return new SingleTonClass();
		}
		else {
			return INSTANCE;
		}
	}
}
