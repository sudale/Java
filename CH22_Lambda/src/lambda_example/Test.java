package lambda_example;

// 람다식은 함수형 인터페이스 필요
@FunctionalInterface
public interface Test {
	void run(); // 추상메서드 1개일때 함수형 인터페이스가 됨
}
