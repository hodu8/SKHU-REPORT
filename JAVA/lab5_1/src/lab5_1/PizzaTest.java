package lab5_1;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza piz = new Pizza();
		piz.brand="도미노";
		piz.diameter=3.14;
		piz.price=5000;
		System.out.println("브랜드 = " + piz.brand + "\n지름 = " + piz.diameter + "\n가격 = " + piz.price);
	}

}
