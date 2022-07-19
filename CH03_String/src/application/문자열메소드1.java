package application;

public class 문자열메소드1 {

	public static void main(String[] args) {
		// charAt(인덱스번호) : 인덱스 번호에 해당 문자가 리턴
		String text = "ABCDEF";

		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.charAt(4));
		System.out.println(text.charAt(5));

		// 문자열 알파벳순 비교
		String word1 = "banana";
		String word2 = "apple";
		// compareTo 는 문자열들을 비교해서 큰순서 - 작은순서를 숫자로 리턴
		System.out.println(word1.compareTo(word2));

		// contains(문자열) 문자열이 포함하고 있는지 확인
		text = "오늘 점심은 돈까스다";
		System.out.println(text.contains("돈까스다"));
		System.out.println(text.contains("돈까스네"));

		// concat 문자열 합치기
		System.out.println(word1.concat(word2));
		// StringBuilder 를 사용해 합침
		String finalString = new StringBuilder().append(word1).append(word2).toString();
		System.out.println(finalString);
		// String.format("",) : printf("%s", 변수) 대신 출력하지 않고 문자열 형식을 만듬
		String formatString = String.format("%s %s", word1, word2);
		System.out.println(formatString);
		System.out.printf("%s %s", word1, word2);
	}

}
