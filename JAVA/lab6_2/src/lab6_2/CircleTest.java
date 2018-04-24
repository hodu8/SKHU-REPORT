package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : ¹ÚÂù¿ì");
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.5);

		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		System.out.println(c1.cirArea());
		System.out.println(c2.cirArea());

		c1.setRadius(c2.getRadius());

		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		System.out.println(c1.cirArea());
		System.out.println(c2.cirArea());

		c2.setRadius(1.5);

		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	}

}
