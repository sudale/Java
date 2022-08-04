package lambda_example;

interface Runner {
	void execute();
}

public class App2 {

	public static void main(String[] args) {
		Runner run1 = new Runner() {
			public void execute() {
				System.out.println("헬로우!");
				System.out.println("하이!");
				System.out.println("람다식!");
			}
		};
		run1.execute();

		Runner run = () -> 
			System.out.println("하이!");

		
		run.execute();

		System.out.println(run instanceof Runner); //Runner의 객체인가?
		System.out.println(run.getClass()); //객체의 클래스는?
	}

}
