package 조건문;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("옵션을 선택 > ");
		int 옵션 = scanner.nextInt();
		scanner.close();

		switch (옵션) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕 ?");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다");
			break;
		default:
			System.out.println("잘못된 옵션입니다");
			break;
			
		}
		
	}

}
