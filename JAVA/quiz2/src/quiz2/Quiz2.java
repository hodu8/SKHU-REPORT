/*
�ۼ��� : ������
�ۼ��� : 2018.03.20.
���� : ���׿����ڸ� ����Ͽ� ���̱ⱸ�� �̿밡�ɿ��� �Ǻ�
 */
package quiz2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("quiz2 : ������\n");

		System.out.println("�̸� �Է� : ");
		String name = input.nextLine();
		System.out.println("���� �Է� : ");
		int age = input.nextInt();
		System.out.println("Ű �Է� : ");
		double height = input.nextDouble();
		String	result = (age>=13&&height>=130) ? (name + "����,\n����" + age + "��, Ű" + height + "�̹Ƿ�\n�̿� �����մϴ�.") : ("������ �����ʾ� �̿� �Ұ����մϴ�.");
		System.out.println(result);
	}

}
