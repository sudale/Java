package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> numbers = new ArrayList<Double>();

		double total = 0;
		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");

			String input = scanner.nextLine();

			input = input.trim(); // 공백삭제

			if (input.equalsIgnoreCase("q")) {
				break;
			}

			try {
				double value = Double.parseDouble(input); // 실수로 변환
				numbers.add(value);
//				total += value;
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다");
				continue;
			}
		}
		scanner.close();
		System.out.println();

		Collections.sort(numbers);

		if (numbers.size() > 0) {
			System.out.println("입력된 숫자 : ");
			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);
				total += number;
			}
			System.out.println();
			System.out.printf("평균값 : %.2f", total / numbers.size());
		} else {
			System.out.println("숫자가 입력되지 않음!");
		}

	}
}
