package 연습용;

import java.util.Scanner;

public class 연습용 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%m", num);
		
		scanner.close();
	}

}
