package 다형성;

public class Tiger extends Cat {
	@Override
	public void vocal() {
		System.out.println("어흥~!");
	}
	@Override
	public String toString() {
		
		return "호랑이";
	}
}
