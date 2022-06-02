package Lambda;

import java.util.function.Consumer;

public class lambdaVariable1 {

	public static void main(String[] args) {
		int i = 10;
		Consumer<Integer> consumer = (i1) -> {        //We can not pass Local variable 'i' inside lambda as parameter.
//			i++;									  //We can not reassign Local variable 'i' inside lambda expression.
			System.out.println(i + i1);				  //But we can use local variable inside lambda expression.
		};
		
//		i = 20;										  //Even if we reassign local variable "i" outside the lambda expression then we can not use this local variable inside lambda expression.
		
		consumer.accept(20);
	}
}
