package 런타임예외;

public class App {

	public static void main(String[] args) {
		// 런타임 예외는 처리를 안해도 에러가 발생하지 않음 예
//		try {
//			System.out.println(5 / 0);
//
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다");
//		}

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(35);

		} catch (Exception e) {
			e.printStackTrace(); // 예외발생시 빨간색 코드들
			System.out.println(e.getMessage()); // 에러 메세지만 출력
		}

	}

}
