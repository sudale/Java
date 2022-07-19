package 게터와세터;

public class Person {
	// 인스턴스 변수에 직접 접근이 되면 안됨 (get,set 메소드이용)
	private String name;
	private int age;

	// 셋 메소드는 필드변수의 값에 입력받은 값을 넣어준다
	void setName(String name) {
		// this는 클래스로 만든 객체(인스턴스)
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}
}
