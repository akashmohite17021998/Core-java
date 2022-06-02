package Lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
	static int i = 10;
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (j) -> {
			i++;
			System.out.println(i+j);
		};
		
		i++;
		
		consumer.accept(4);
	}

}
