package this생성자;

public class App {

	public static void main(String[] args) {
		
		// 아무런 생성자가 없을때는 기본생성자 자동사용가능 그러나 생성자가 있으면 있는것을 사용
		Person p1 = new Person();
		Person p2 = new Person("길동");
		Person p3 = new Person("펭수",20);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
