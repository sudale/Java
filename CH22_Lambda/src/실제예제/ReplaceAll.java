package 실제예제;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// replacetAll 각각의 아이템의 연산 결과로 대체한다
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			public Integer apply(Integer n) {
//				return n * n; // 원래 숫자의 제곱으로 리턴
//			}
//		});
		numbers.replaceAll(n -> n * n);
		numbers.forEach(x -> System.out.println(x));

		List<String> friends = new ArrayList<String>();

		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");

		friends.replaceAll(s -> "안녕~ " + s);
		friends.forEach(t -> System.out.println(t));
	}

}
