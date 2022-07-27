package 기본생성자;

public class Person {

	private String name;
	
	public Person() {
		// 기본생성자
	}

	// 매개변수 있는 생성자
	public Person(String name) {
		System.out.println("person객체 생성됨!");
		this.name = name;
	}

	@Override
	public String toString() {
		return "헬로우";
	}
}
