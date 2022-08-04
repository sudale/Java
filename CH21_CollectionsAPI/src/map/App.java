package map;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 순서가 있는게 아니라 키 값으로 인덱스 대체
		HashMap<Integer, String> people = new HashMap<Integer, String>();

		// map은 입력시 put(키,값)을 사용
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); // 덮어쓰기
		people.put(10, "수지");

		// 값을 불러오기 (키 필요)
		System.out.println(people.get(4));

		String person = people.get(10);
		System.out.println(person);

		System.out.println();

		// 람다식 출력
		people.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});

		for (Integer i : people.keySet()) {
			System.out.println("값은 : " + i);
		}
		for (String s : people.values()) {
			System.out.println("값은 : " + s);
		}
		for (var entry : people.entrySet()) {
			var key = entry.getKey();
			var value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

}
