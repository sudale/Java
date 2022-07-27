package timer2;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("하이!");

	}
}

class Task extends TimerTask {
	@Override
	public void run() {

		System.out.println("헬로우");

	}
}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();
		// task를 1000ms(1초) 간격으로 반복
		timer.scheduleAtFixedRate(new Task(), 0, 1000);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS);

	}

}
