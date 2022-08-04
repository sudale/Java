package arrayList;

import java.util.ArrayList;

public class Iterating {
	public static void main(String[] args) {
		// 가장많이 쓰는 자료 컬렉션 타입
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(7);
		list.add(9);
		list.add(123);

		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);

			System.out.println(i + ":" + n);
		}

		System.out.println();

		list.forEach(System.out::println);

		System.out.println();
		// 람다식
		list.forEach(e -> {
			System.out.println(e);
		});
	}
}
