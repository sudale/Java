package static_innerClass;

public class Person {
	class Head {
		public void print() {
			System.out.println("Head");
		}
	}
	static class Body{
		public void print() {
			System.out.println("Body");
		}
	}
	public void print() {
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
		
	}
}
