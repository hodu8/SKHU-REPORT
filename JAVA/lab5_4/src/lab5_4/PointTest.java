/*
 * ���ϸ�: PointTest.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ������
 * ����:  ���� ǥ���ϴ� Point Ŭ���� ��ü�� �����ϰ� �̿��ϴ� ���α׷�
 */

package lab5_4;

public class PointTest {

	public static void main(String[] args) {
		System.out.println("lab5_4: ������");
		Point p1 = new Point();
		Point p2 = new Point();
		// Point ��ü p1, p2�� ����
		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);
		// p1�� 4.5  ��ŭ �̵�, p2�� -1.0��ŭ �̵�, p1�� 1.0��ŭ �ٽ� �� �� �̵�
		p1.move();
		// p1�� �̵�(�Ű����� ����)
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		// p1, p2�� �Ӽ��� ���
		System.out.println(p1.distance(p2));
		// p1�� p2�� �Ÿ��� ���
	}

}
