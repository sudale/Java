package 기본생성자;

public class App {

	public static void main(String[] args) {
		
		// 아무런 생성자가 없을때는 기본생성자 자동사용가능 그러나 생성자가 있으면 있는것을 사용
		Person p = new Person();
		Person p1 = new Person();
		System.out.println(p);

	}

}
