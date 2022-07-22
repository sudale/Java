package 배열;

public class DailyUser {

	public static void main(String[] args) {

		int[] users = { 581, 512, 527, 495, 423, 141, 236 };

		double totalUsers = sum(users);
		System.out.printf("총 사용자: %.0f명\n" ,totalUsers);

		double dailyUser = average(totalUsers, users.length);
		System.out.printf("하루 평균 사용자: %.2f명" ,dailyUser);

	}

	private static double sum(int[] users) {
		double sum = 0;
		for(int i=0;i<users.length;i++) {
			sum = sum+users[i];
		}
		return sum;

	}

	private static double average(double sum, int length) {

		return sum / length;
	}

}
