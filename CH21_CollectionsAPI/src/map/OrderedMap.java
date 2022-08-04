package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet 순서없음, 순서있음(입력된 순서대로), 정렬됨
		// HashMap, LinkedHashMap, TreeMap 

		Map<Integer, String> months2 = new HashMap<Integer, String>();
		System.out.println();
		months2.put(1, "1월");
		months2.put(9, "9월");
		months2.put(3, "3월");
		months2.put(6, "6월");

		months2.forEach((k, v) -> System.out.println(k + ": " + v));

		Map<Integer, String> months3 = new LinkedHashMap<Integer, String>();
		System.out.println();
		months3.put(1, "1월");
		months3.put(9, "9월");
		months3.put(3, "3월");
		months3.put(6, "6월");

		months3.forEach((k, v) -> System.out.println(k + ": " + v));

		Map<Integer, String> months4 = new TreeMap<Integer, String>();
		System.out.println();
		months4.put(1, "1월");
		months4.put(9, "9월");
		months4.put(3, "3월");
		months4.put(6, "6월");

		months4.forEach((k, v) -> System.out.println(k + ": " + v));

	}

}
