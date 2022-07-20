package application;

public class Cat {

	private String name;
	private int id;
	// 스테틱 상수는 final앞에 static붙음 객체 생성 없이 사용
	public static final String FOOD = "고양이 사료";
	// 스테틱 변수는 공유해서 값을 사용가능 초기값 0
	private static int count = 0;

	public Cat(String name) {
		this.name = name;
		count++;
		id = count;
	}

	public int getId() {
		return id;
	}

	// 스테틱 메소드는 인스턴스 변수는 사용할수 없다
	// 스테틱 벼수는 사용가능
	public static int getCount() {
		// name = "이름";
		return count;

	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "Cat [고양이아이디 : " + id + ", 이름: " + name + "]";
	}

}
