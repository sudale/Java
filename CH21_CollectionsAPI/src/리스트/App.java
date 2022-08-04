package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> list1 = new LinkedList<Integer>();

		list1.add(5);
		list1.add(7);
		list1.add(8);

		displayList(list1);
		System.out.println();

		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		list2.add(9);
		list2.add(10);

		displayList(list2);

	}

	private static void displayList(List<Integer> numbers) {
		for (Integer n : numbers) {
			System.out.println(n);
		}

	}

}
