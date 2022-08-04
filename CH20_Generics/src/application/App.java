package application;

import 계층.Cat;
import 계층.Mammal;
import 컬렉션.Wrapper;

public class App {

	public static void main(String[] args) {

		Wrapper<Cat> wrapper = new Wrapper<Cat>();

		Cat cat = new Cat("마틸다");
		wrapper.set(cat);
		Cat cat2 = wrapper.get();
		System.out.println(cat2);

		// 제네릭 타입은 객체를 만들때 그 타입을 결정
		Wrapper<Mammal> wrapper2 = new Wrapper<Mammal>();

		Mammal mammal = new Mammal("포유류");
		wrapper2.set(mammal);
		Mammal mammal2 = wrapper2.get();
		System.out.println(mammal2);

	}

}
