/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.06.
 * ���� : Ŭ���� �ۼ�, ��ü ������ ���
 */

package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab1_5 : ������");
		Circle circle1 = new Circle();
		circle1.setRadius(2);
		Circle circle2 = new Circle((int)(Math.random()*4)+1);
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(circle1.getArea());
		System.out.println(circle2.getArea());
	}

}
