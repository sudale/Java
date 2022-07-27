package this생성자;

public class Person {

	private String name;
	private int age;

	public Person() {
		this("익명", 0);
	}

	// 매개변수 있는 생성자
	public Person(String name) {
//		System.out.println("person객체 생성됨!");
//		this.name = name;
		this(name, 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [이름 = " + name + ", 나이 = " + age + "]";
	}

}
