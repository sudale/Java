package 클래스;

public class CylinderTest {

	public static void main(String[] args) {

		Cylinder c = new Cylinder();

		c.radius = 4;
		c.height = 5;

		System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());

	}

}

class Cylinder {

	int height;
	int radius;

	public Object getVolume() {

		return radius * radius * Math.PI * height;
	}

	public Object getArea() {
		double circleArea = Math.PI * radius * radius;
		double rectangleArea = height * 2 * Math.PI * radius;
		return 2 * circleArea + rectangleArea;
	}

}
