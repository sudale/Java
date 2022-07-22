package 배열;

public class Factorial {

	public static void main(String[] args) {

//		int number = Integer.parseInt(args[0]);

		printFactorial(4);

	}

	private static void printFactorial(int number) {
		int result = 1;
		System.out.printf("%d! = ", number);
		for (int i = number; i > 0; i--) {
			System.out.printf("%d", i);
			result *= i;
			if (i != 1) {
				System.out.printf(" x ");
			}
		}
		System.out.printf(" = %d\n", result);
	}

}
