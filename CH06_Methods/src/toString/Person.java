package toString;

public class Person {
	// 인스턴스 변수에 직접 접근이 되면 안됨 (get,set 메소드이용)
	private String name;
	private int age;

	// 셋 메소드는 필드변수의 값에 입력받은 값을 넣어준다
	public void setName(String name) {
		// this는 클래스로 만든 객체(인스턴스)
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// 객체의 정보를 리턴
		return " 이름 : " + name + ", 나이 : " + age;
	}
}
