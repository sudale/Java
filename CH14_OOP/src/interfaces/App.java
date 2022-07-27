package interfaces;

public class App {

	public static void main(String[] args) {
		// object 클래스는 모든 클래스의 부모클래스
		Describable[] objs = { new Person(), new Computer() };

		for (Describable obj: objs) {
			System.out.println(obj.getDescription());
		}

	}

}
