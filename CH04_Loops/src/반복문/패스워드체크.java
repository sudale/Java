package 반복문;

import java.util.Scanner;

public class 패스워드체크 {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드를 설정한 패스워드와 비교
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);
		String password = "";

		do {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			if (!password.equals(USER_PASSWORD)) {
				System.out.println("접속 불가");
			}
		} while (!password.equals(USER_PASSWORD)); // 같지 않을때 !<--

		scanner.close();
	}

}
