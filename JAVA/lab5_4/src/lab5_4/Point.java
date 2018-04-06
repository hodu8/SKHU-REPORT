/*
 * ���ϸ�: Point.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ������
 * ����:  x ��ǥ�� ���� 1���� ���� ǥ���ϴ� Point Ŭ������ ����
 */

package lab5_4;

public class Point {
	double x=0; // x��ǥ�� ������ double�� ���� x���� �� 0���� �ʱ�ȭ
	void move(double offset) {
		x+=offset; // x��ǥ�� �Ű������� ���� offset���� ����
	}
	void move() {
		x++; // x��ǥ�� 1�� �߰�
	}
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
	double distance(Point dis) {
		return Math.abs(x-dis.x); // x�� dis.x�� �� ���� ������ ��ȯ
	}
}