/*
 * ���� : Member�� ����ϴ� �ð��� ȸ�� Ŭ����
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw7_2;

public class HourlyMember extends Member { // Member�� ���
	int hour; // ���ð� �ʵ�
	public HourlyMember (int age, int hour) {
		super(age);
		this.hour = hour;
	} // ����, ���ð��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	@Override
	public int getPayment() {
		return hour*100;
	} // ���ð��� ȸ�� 100�� ���� ���� ��ȯ
}