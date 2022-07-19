package 연습용;

import java.util.Scanner;

public class 연습용2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean accessOk = false;

		System.out.print("나이를 입력하시오 : ");
		int age = scanner.nextInt();

		for (int i = 0; i <= 3; i++) {
			if ((age >= 20) && (age < 30)) {
				System.out.print("20대입니다");
				System.out.println("20대라서 행복합니다!");
				accessOk = true;
				break;
			} else {
				System.out.println("20대가 아닙니다");
			}

		}
		if (!accessOk ) {
			System.out.println("접속거부");
		}
		scanner.close();
	}

}
