package instance_of;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature {
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {

		Creature c1 = new Creature();
		Object c2 = c1;
		Cat c3 = new Cat();
		Serializable c4 = (Serializable) c3;
		// a instanceof b 는 a가 b의 객체가 맞으면 true 아니면 false
		System.out.println(c1 instanceof Object); // Object의 객체 뭐든지가능
		System.out.println(c1 instanceof Serializable);
		System.out.println(c1 instanceof Creature);
		System.out.println(c1 instanceof Cat);

	}

}
