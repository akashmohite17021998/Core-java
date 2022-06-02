package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static Optional<String> ofNullable(){
		
//		Optional<String> stringOptional = Optional.ofNullable("Hello");
		Optional<String> stringOptional = Optional.ofNullable(null); //it returns the Optional.empty on the console if the ofNullable() method contains the null
		
		return stringOptional;
	}
	
	public static Optional<String> of(){
		
//		Optional<String> stringOptional = Optional.of("Hello");
		Optional<String> stringOptional = Optional.of(null);  //it returns the NullPointerException if the of() method contains the null
		
		return stringOptional;
	}
	
	public static Optional<String> empty(){
		
		Optional<String> stringOptional = Optional.empty();  
		return stringOptional;
	}
	
	public static void main(String[] args) {
//		System.out.println(ofNullable().isPresent());
//		System.out.println(of());
		System.out.println(empty());
	}
	
}
