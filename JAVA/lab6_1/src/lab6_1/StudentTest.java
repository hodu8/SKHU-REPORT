/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.12.
 * ���� : �л� ��ü�� �����ϰ� �л� �й��� ������ �����ϰ� �л� ��ü�� �й��� ��ȸ�Ͽ� ����ϴ� ���α׷�
 */

package lab6_1;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab6_1 : ������");
		Student s = new Student(); // Student ��ü s�� ����
		s.setNum(201732015); // setNum �޼ҵ忡 �й��� �Ű������� ����
		System.out.println((s.getNum())); // getNum �޼ҵ带 ȣ���� �й� ���
	}
}