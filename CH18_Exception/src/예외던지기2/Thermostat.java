package 예외던지기2;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 이 메소드를 부를때 처리
	public void setTemperature(double temperature) throws Exception  {

		setMachineTemperature(temperature);

		System.out.println("온도 세팅 : " + temperature);

	}

	private void setMachineTemperature(double temperature) throws Exception {
		if (temperature < 0 || temperature > 35) {
			// 코드로 직접 예외 객체 생성
			throw new Exception("온도가 비정상 입니다");

		}

	}
}