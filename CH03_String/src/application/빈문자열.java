package application;

public class 빈문자열 {

	public static void main(String[] args) {
		// blank vs empty : 공백을 제외하려면 isBlank를 사용
		String myText = "          \n";
		System.out.println("빈문자열 확인: " + myText.isEmpty()); //빈문자열만 확인
		System.out.println("빈문자열 확인: " + myText.isBlank()); //공백제외하고 빈문자열 확인

		// 문자열.replace(A,B) 메소드 A=>B
		myText = "아침밥을 맛있게 먹었다";
		System.out.println(myText.replace("아침", "저녁"));
		
		// 공백 제거 strip
		String name = "  제인";
		System.out.printf("'%s'", name);
		System.out.printf("'%s'", name.strip());
	}

}
