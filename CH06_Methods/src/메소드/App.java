package 메소드;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "길동";
		p1.sayHello();
		Person p2 = new Person();
		p2.name = "펭수";
		p2.sayHello();

		p1.name = "길순";
		p1.sayHello();

	}

}
