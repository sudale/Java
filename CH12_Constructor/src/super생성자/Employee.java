package super생성자;

public class Employee extends Person {

	public Employee() {
		super("익명"); //상속받은 부모클래스의 생성자 (생략됨)
		System.out.println("Employee 생성자!");
	}
}
