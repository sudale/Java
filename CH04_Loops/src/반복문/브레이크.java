package 반복문;

public class 브레이크 {

	public static void main(String[] args) {
		// break 반복문에서 빠져나오기
		int count = 0;
		
		while (true) {
			System.out.println("헬로우 "+ count);
			if (count ==5) {
				break;
			}
			System.out.println("How are you");
			
			count++;
		}
		System.out.println("Program finished");
	}

}
