package lambda_example;



public class App {

	public static void main(String[] args) {
		
		Test test = () -> System.out.println("테스트");
		test.run();
		
	}

}
