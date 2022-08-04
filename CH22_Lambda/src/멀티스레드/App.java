package 멀티스레드;

public class App {

	public static void main(String[] args) {

//		Runnable runnable = new Runnable() {
//			public void run() {
//
//			}
//		};
		Runnable runnable = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(500); //0.5초대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start(); // 쓰레드 실행
		t2.start(); // 쓰레드 실행

		System.out.println("메인 종료!");

	}

}
