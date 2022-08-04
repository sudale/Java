package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		ArrayList<Double> doubles = new ArrayList<Double>();

		doubles.add(7.38);
		doubles.add(1.28);
		doubles.add(12.25);
		doubles.add(5.16);
		doubles.add(3.38);

		Collections.sort(doubles); // 정렬

		for (Double d : doubles) {
			System.out.println(d);
		}

//		doubles.forEach(System.out::println);

		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		Collections.sort(people);

		for (Person p : people) {
			System.out.println(p);
		}
	}

}
