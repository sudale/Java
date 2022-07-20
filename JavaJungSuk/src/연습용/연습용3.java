package 연습용;

public class 연습용3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 1;
		int sum = 0;
		int num = 0;

		for (int i = 1; sum <= 100; i++, s = -s) {

			num = s * i;
			sum += num;
		}
		System.out.println(sum);
	}

}
