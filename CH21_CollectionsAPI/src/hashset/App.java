package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		//set은 순서가 없고 중복되지 않음
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지")); //contains 오렌지가 있는가?
		
		for(String f : fruits) {
			System.out.println(f);
		}

	}

}
