package 실제예제;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// 특정 타입을 검사해서 boolean 참,거짓으로 리턴한다
		Predicate<String> p1 = new Predicate<String>() {
			public boolean test(String s) {
				return s.length() < 4; // 문자열의 길이가 4미만이면 참
			}
		};

		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));

		Predicate<String> p2 = s -> s.length() < 4;
		
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘셋"));

	}

}
