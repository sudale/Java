package phonenumber;

public class Auto {

	public static String nNo1() {
		return (int) (Math.random() * 8999) + 1000 + "";
	}

	public static String nNo2() {
		return (int) (Math.random() * 8999) + 1000 + "";
	}

	public void num1() {
		System.out.println("전화번호 생성이 완료되었습니다.");
		for (int i = 0; i < 10; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.println("010 - " + nNo1() + " - " + nNo2());
		}
	}
}
