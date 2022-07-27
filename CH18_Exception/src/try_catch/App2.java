package try_catch;

import java.util.Scanner;

public class App2 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();

	}

	/**
	 * 스캐너로 숫자를 입력받아서 리턴함
	 * 
	 * @return 입력받은 정수
	 */
	private static int getNumber() {

		int number = 0;
		boolean isNumber = false;

		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine(); // 문자열 입력(엔터키 전까지\n)

			try {
				number = Integer.parseInt(line); // 예외 발생 코드
				isNumber = true;
			} catch (NumberFormatException e) {
				// 숫자 변환 예외 발생시 캐치문 실행
				System.out.println("숫자 입력이 아닙니다");
			}

		} while (!isNumber);

		return number;
	}
}
