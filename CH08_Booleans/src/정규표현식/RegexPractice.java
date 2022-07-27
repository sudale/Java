package 정규표현식;

import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {

		System.out.println("Cat".matches("cat"));
		System.out.println("Cat".toLowerCase().matches("cat"));
		// [aA] a또는A가능, [a-z] 소문자 a~z까지 가능
		System.out.println("Cat".matches("[Cc]at"));
		System.out.println("Cat".toLowerCase().matches("[a-dA-D]at"));
		// [^c] c만 제외하고 가능
		System.out.println("Cat".matches("[^C]at"));
		// \w => 한개의 문자또는 숫자 => 문자열 "\\w"
		System.out.println("c23".matches("\\w\\w\\w"));
		// 횟수 n개 {n], 한개이상 +
		System.out.println("a".matches("\\w+"));
		// 전화번호 (02|051|010)-\\d{3,4}-\\d{4}
		System.out.println("010-3007-4718".matches("(02|051|010)-\\d{3,4}-\\d{4}"));

		String regex = "(02|051|010)-\\d{3,4}-\\d{4}"; // 정규표현식(전화번호 매치)
		String phoneNumber = "010-3007-4718";
		boolean result = Pattern.matches(regex, phoneNumber);

		if (result) {
			System.out.println("올바른 전화번호 형식입니다");
		} else {
			System.out.println("올바르지 않은 전화번호 형식입니다");
		}

		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "angel@naver.com";
		
		result = Pattern.matches(regex, email);
		if (result) {
			System.out.println("정규식과 일치합니다. 올바른 이메일 형식입니다");
		} else {
			System.out.println("정규식과 불일치합니다. 올바른 이메일 형식이 아닙니다");
		}
	}

}
