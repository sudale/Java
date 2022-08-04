package 실제예제;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class RemoveIf {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);

		numbers.removeIf(n -> n < 6); // 6보다 작은 숫자 검사해서 참이면 삭제

		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.println(n);

			}
		});
		numbers.forEach(n -> System.out.println(n)); // 반복문에 람다식으로 출력

	}

}
