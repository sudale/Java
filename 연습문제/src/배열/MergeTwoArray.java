package 배열;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] events = { 0, 2, 4, 6, 8 };
		int[] odds = { 1, 3, 5, 7, 9 };

		int[] result = merge(events, odds);

		System.out.print("결과 :");
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}

	private static int[] merge(int[] events, int[] odds) {
		int[] mergeArr = new int[events.length+odds.length];
		
		for (int i=0; i<events.length;i++) {
			mergeArr[2*i] = events[i];
			mergeArr[2*i+1] = odds[i];
		}
		return mergeArr;
	}

}
