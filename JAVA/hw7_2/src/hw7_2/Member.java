/*
 *  ���� : ȸ�� �߻� Ŭ����
 *  �ۼ��� : 2018.05.24.
 *  �ۼ��� : ������
 */

package hw7_2;

public abstract class Member {
	int age = 0; // ���� �ʵ�
	public Member(int age) {
		this.age = age;
	} // ���̸� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public int getAge() {
		return age;
	} // ���� getter
	public abstract int getPayment(); // ȸ�� ��ȸ�ϴ� �޼ҵ�(�Ű������� ����, int���� �����ϴ� abstract method)
} 
