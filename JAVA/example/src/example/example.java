package example;

import java.math.BigDecimal;

public class example {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 2.345;
		double z = x+y;
		System.out.println(z);
		
		BigDecimal b1 = new BigDecimal("3.0");
		BigDecimal b2 = new BigDecimal("2.345");
		System.out.println(b1.add(b2));
	}
}
