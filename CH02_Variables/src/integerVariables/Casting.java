package integerVariables;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형 변환
		// 자동 형 변환
		byte a = 32;

		short b = a;

		int c = b;

		long d = c;
		// int x = d; 더 큰타입을 작은타입에 넣을순 없다

		float e = 1.12f; // 실수의 기본 타입은 더블이기 때문에 f를 붙임
		double f = e;
		
		// 명시적 변환 ( 원할때 )
		long g = 1000000;
		int h = (int) g;
		
		short i = (short) h;
		System.out.println(i); // 명시적 변환시 큰타입에서 변환시 손실 가능성
	}

}
