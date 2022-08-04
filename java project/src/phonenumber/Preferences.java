package phonenumber;

import java.util.Scanner;

public class Preferences {

	Scanner scanner = new Scanner(System.in);
	Auto auto = new Auto();
	Semi_Auto semi_auto = new Semi_Auto();
	Semi_Auto2 semi_auto2 = new Semi_Auto2();
	boolean isRunning = true;

	public void run() {
		while (isRunning) {
			Set();
		}
		scanner.close();
	}

	public void Set() {

		System.out.println("1. 자동 : 랜덤으로 번호 생성");
		System.out.println("2. 반자동 : 뒷자리 선택후 중간자리 자동으로 생성");
		System.out.println("3. 반자동 : 중간자리 선택후 뒷자리 랜덤으로 생성");
		System.out.println("4. 종료");
		System.out.println();
		System.out.print("원하는 방법을 선택하세요 : ");

		int option = scanner.nextInt();
//		scanner.nextLine();

		switch (option) {
		case 1:
			System.out.println("1. 자동 : 랜덤으로 번호 생성");
			System.out.println();
			auto.num1();
			break;
		case 2:
			System.out.println("2. 반자동 : 뒷자리 선택후 중간자리 자동으로 생성");
			System.out.println();
			semi_auto.num2();
			break;
		case 3:
			System.out.println("3. 반자동 : 중간자리 선택후 뒷자리 랜덤으로 생성");
			System.out.println();
			semi_auto2.num3();
			break;
		case 4:
			System.out.println("4. 종료");
			System.out.println("프로그램을 종료합니다!");
			isRunning = false;
			break;
		default:
			System.out.println("잘못된 입력입니다!");
		}
	}

}
