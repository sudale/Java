package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		long time = timeOperations(arrayList);

		System.out.println("측정 시간 : " + time + "ms");

	}

	private static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list.add(i); // 일반적인 작업은 어레이리스트가 더 빠름
		}
		return System.currentTimeMillis() - start; // 수행시간
	}

}
