package interfaces_Inheritance;

public interface DefaultRunnable extends Runnable {
	void displayDetails();
	//인터페이스에서도 디폴트 메서드는 만들수 있다
	default void hello() {
		System.out.println("헬로우");
	}
}
