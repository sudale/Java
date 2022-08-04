package 계층;

public class Creature {

	private String name;

	public Creature(String name) {
		this.name = name;
	}

	public void feed() {
		System.out.println("생물 피드");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
