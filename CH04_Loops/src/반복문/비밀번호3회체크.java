package 반복문;

import java.util.Scanner;

public class 비밀번호3회체크 {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있느 기회를준다
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져나옴
		// 패스워드 3회 틀릴시 '접속거부'

		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
//		String password = scanner.nextLine();
		boolean accessOK = false;

		String password = "";

		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			} else {
				System.out.println("틀린비밀번호");
			}
		}

		if (!accessOK) {
			System.out.println("접속거부");
		}
		scanner.close();
	}

}
