/*
 * ���� : �� Ŭ����
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw9_1;

public class Dog implements Speakable{ // Speakable�� ����
	int age; // ���� �ʵ�
	public Dog (int age) {
		this.age = age;
	} // ���̸� �Ű������� �ް� �ʱ�ȭ�ϴ� ������
	public int getAge() {
		return age;
	} // ���� getter
	public void setAge(int age) {
		this.age = age;
	} // ���� setter
	@Override
	public void speak() {
		for (int i = 0; i < age; i++) {
			System.out.print("��");
		} // speak�޼ҵ� �������̵�
	}
}
