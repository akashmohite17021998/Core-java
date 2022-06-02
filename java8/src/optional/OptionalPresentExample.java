package optional;

import java.util.Optional;

public class OptionalPresentExample {
	
	public static void main(String[] args) {
		
		//isPresent()
//		Optional<String> optional = Optional.ofNullable("Hello optional");
		Optional<String> optional = Optional.ofNullable(null);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//ifPresent()
//		optional.ifPresent((s) -> System.out.println(s));//ifPresent method tells about if the objects present inside optional then it will print that objects otherwise it will not return anything.
		System.out.println(optional.get());
	}
}
