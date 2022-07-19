package 생성자;

public class Person {

	private String name;
	private double height;

	// 기본 생성자는 생략가능
	public Person() {
		// 기본 생성자 생성자는 public 클래스명
		System.out.println("한 사람을 생성!");
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
