/*
 * ���� : Person, Dog Ŭ������ �����ϴ� ���α׷�
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		System.out.println("hw9_1 : ������\n");
		Speakable[] s = new Speakable[4]; // ũ�Ⱑ 4�� Speakble �迭�� ����
		s[0] = new Person("������");
		s[1] = new Person("ȫ�浿");
		s[2] = new Dog(2);
		s[3] = new Dog(5);
		// Person ��ü 2��, Dog ��ü 2���� �����Ͽ� �迭�� ����
		
		for (int i=0; i < 4; i++) {
			s[i].speak();
			if (s[i] instanceof Person) {
				System.out.println(((Person)s[i]).getName() + "�Դϴ�.");
			}
			System.out.println("\n");
		} // �ݺ����� �̿��Ͽ� ��� �迭 ���� ��ü�� ���� speak()�� ȣ���ϰ�,
		  // ���� �迭 ���Ұ� ����̸� �߰��� �̸��� ��ȸ(getName() ȣ��)�Ͽ� ���
	}
}