package arrayList;

public class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// 비교기준 (이름)
		return name.compareTo(o.name);
	}

}
