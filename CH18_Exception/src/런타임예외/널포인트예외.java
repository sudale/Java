package 런타임예외;

import java.util.Scanner;

public class 널포인트예외 {

	public static void main(String[] args) {

		Scanner scanner = null; // 객체를 만들지 않고 널 입력
		
		scanner.nextLine();
		
		scanner.close();
	}
}
