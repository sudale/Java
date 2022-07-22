package 배열;

public class TopScoreStudent {

	public static void main(String[] args) {

		String[] names = { "Elena", "Suzie", "john", "Emily", "Nead", "Kate", "Alex", "Daniel", "Hamilton" };
		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 54 };

		int i = topIndex(scores);

		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);

	}

	private static int topIndex(int[] scores) {
		int top = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > scores[top]) {
				top = i;
			}
		}
		return top;
	}
}
