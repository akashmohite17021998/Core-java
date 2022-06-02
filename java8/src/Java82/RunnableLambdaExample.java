package Java82;

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		/**
		 * Prior java 8
		 */
		
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Inside runnable 1");
			}
		};
		new Thread(runnable).start();
		
		/**
		 * java 8
		 */
		
		Runnable runnablelambda = () -> {
			System.out.println("Inside runnable 2");
		};
		
		new Thread(runnablelambda).start();
		
		Runnable runnablelambda1 = () -> System.out.println("Inside runnable 3");
		
		new Thread(runnablelambda1).start();
		
		new Thread(() -> System.out.println("Inside runnable 4")).start();
	}

}
