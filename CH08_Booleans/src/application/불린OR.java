package application;

public class 불린OR {

	public static void main(String[] args) {

		boolean isRaining = true; // 비가오는가?
		boolean mightRaing = false; // 비가올수도있는가?
		boolean takeUmbrella = false; // 우산을쓴다?

		takeUmbrella = isRaining || mightRaing;

		System.out.println(takeUmbrella);

	}

}
