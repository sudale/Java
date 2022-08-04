package 멀티쓰레드작업;

public class App {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> longTask());
		//longTask(); // 긴 작업
		thread.start();
		System.out.println("메인스레드 동작");

	}

	private static void longTask() {
		long t = System.currentTimeMillis();
		long end = t + 3000; // 3초 더하기

		while (true) {
			if (System.currentTimeMillis() == end) {
				System.out.println("긴 작업 종료");
				break; // 3초정도 대기하다가 빠져나감
			}
		}

	}

}
