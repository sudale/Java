package 멀티스레드2;

public class App {

	private int value = 0;

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				value++; //1000번++
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start(); // 쓰레드 실행
		t2.start(); // 쓰레드 실행

		System.out.println("Value: " + value);

		t1.join(); // 메인쓰레드가 t1쓰레드의 동작마칠때까지 기다림
		t2.join();

		System.out.println("Value: " + value);
	}

	public static void main(String[] args) throws InterruptedException {
		new App().run();
	}

}
