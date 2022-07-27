package 예외던지기;

public class App {

	public static void main(String[] args) throws Exception {
		// throw 예외처리는 불러와서 처리함
		Thermostat stat = new Thermostat();

		stat.setTemperature(6);

	}

}
