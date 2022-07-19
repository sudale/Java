package application;

public class 문자열메소드2 {

	public static void main(String[] args) {
		// substring (시작인덱스번호)
		String text = "apple";
		String newText = text.substring(3);
		System.out.println(newText);
		newText = text.substring(1, 4);
		System.out.println(newText);

		// indextOf(문자) 문자열의 특정 문자의 인덱스 번호 리턴
		String myText = "abcdefgh";
		System.out.println(myText.indexOf('c'));
		System.out.println(myText.indexOf('g'));
	}

}
