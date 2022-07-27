package entities;

public class Fruit {
	// 자식 클래스에서 사용가능 + 가튼 패키지
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}

}
