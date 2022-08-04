package phonenumber;

import java.util.Scanner;

public class Semi_Auto {

	static Scanner scanner = new Scanner(System.in);
	static String Semi_AutoArr;
	static int Semi_AutoNum[] = new int[4];

	public static String nNo1() {
		return (int) (Math.random() * 8999) + 1000 + "";
	}

	public static String nNo2() {

		System.out.println("원하는 숫자를 입력하세요 : ");
		System.out.print("==> ");

		Semi_AutoArr = scanner.next();
		return Semi_AutoArr;
	}

	public void num2() {
		System.out.println("전화번호 생성이 완료되었습니다.");
		for (int i = 0; i < 10; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.println("010 - " + nNo1() + " - " + nNo2());
		}

	}

}
