/*
 * ���� : Member�� ����ϴ� ��ȸ�� Ŭ����
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw7_2;

public class RegularMember extends Member { // Member�� ���
	public RegularMember(int age) {
		super(age);
	} // ���̸� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	@Override
	public int getPayment() {
		return 1000;
	} // 1000�� ��ȯ
}
