package timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//class Task2 implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("헬로우");
//		
//	}
//}

public class App2 {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println("헬로우");

			}
		}, 0, 1, TimeUnit.SECONDS);

	}

}
