/*
 * ���� : ���� �ٷ�� ���α׷�
 * �ۼ��� : 2018.05.21.
 * �ۼ��� : ������
 */

package hw7_2;

public class CircleTest {

	public static void main(String[] args){
		System.out.println("hw7_2 : ������\n");
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));
		// Circle ��ü ����
		
		System.out.println(c2.sameCenter(c1));    // c2�� c1�� �߽� ���� x, y��ǥ�� ������ ��
		System.out.println(c2.sameCenter(c3));    // c2�� c3�� �߽� ���� x, y��ǥ�� ������ ��

		printCircle(c2); // c2�� ������, �߽��� x, y��ǥ�� ���
	}

	// (1) �Ű������� ���� �� c�� ������, �߽��� x, y��ǥ��
	//     ����ϴ� �޼ҵ�
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}
}
