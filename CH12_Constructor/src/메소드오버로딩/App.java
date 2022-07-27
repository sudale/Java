package 메소드오버로딩;

public class App {

	public static void main(String[] args) {
		// 매소드 오버로딩 매소드의 이름은 같지만 매개변수가 다를때
		Person person = new Person();
		
		person.greet();
		person.greet("펭수");
		person.greet(190);
		person.greet("라이언", 199);

	}

}
