package 싱크로나이즈;

public class App {

	private int value = 0;

	// 쓰레드 하나만 접근가능
	private synchronized void incremment() {
		value++;
	}

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				incremment();
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(() -> System.out.println("헬로우"));
		t1.start(); // 쓰레드 실행
		t2.start();
		t3.start();
		t4.start();

		System.out.println("Value: " + value);

		t1.join(); // 메인쓰레드가 t1쓰레드의 동작마칠때까지 기다림
		t2.join();
		t3.join();

		System.out.println("Value: " + value);
	}

	public static void main(String[] args) throws InterruptedException {
		new App().run();
	}

}
