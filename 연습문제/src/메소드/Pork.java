package 메소드;

public class Pork {

	public static void main(String[] args) {

		double result = calculateCalory(3);

		System.out.println("삼겹살 3인분: " + result + "kcal");
	}

	private static double calculateCalory(int cal) {
		return 180 * 5.179 * cal;
	}

}
