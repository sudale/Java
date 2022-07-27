package 예외던지기2;

public class App {

	public static void main(String[] args) {
		// throw 예외처리는 불러와서 처리함
		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(60);

		} catch (Exception e) {
			e.printStackTrace(); // 예외발생시 빨간색 코드들
			System.out.println(e.getMessage()); // 에러 메세지만 출력
		}

	}

}
