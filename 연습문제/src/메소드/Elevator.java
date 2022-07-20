package 메소드;

public class Elevator {

	public static void main(String[] args) {
		
		int f1 = 13;
		int f2 = 7;
		int f3 = 10;
		
		System.out.printf("%d층 -> %s 엘레베이터\n", f1, guide(f1));
		System.out.printf("%d층 -> %s 엘레베이터\n", f2, guide(f2));
		System.out.printf("%d층 -> %s 엘레베이터\n", f3, guide(f3));

	}

	private static String guide(int f) {
		String guide;
		if (f>=11) {
			guide = "고층 엘레베이터";
		} else {
			guide = "저층 엘레베이터";
		}
		return guide;
	}

}
