/*
�ۼ��� : ������
�ۼ��� : 2018.03.19.
���� : ����ڷκ��� �ݾ��� �Է� �޾� �޷��� ȯ�� �� ���� ��ȭ ���
 */

package hw2_1;

import java.util.Scanner;

public class hw2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int dol=1060; // int�� ��� dol(�޷�) ���� �� 1060���� �ʱ�ȭ
		System.out.println("hw2_1: ������\n"); // ���� �ڵ� �� �ۼ��ڸ� ���
		Scanner input = new Scanner(System.in); // Scanner�� ���� input�� Ű���� �Է��� ����  Scanner ��ü�� �����Ͽ� ����
		System.out.println("500�� ���� �Է� : ");
		int a = input.nextInt();
		// ���� a�� ����ڷκ��� �Է¹��� 500���� ������ ����
		System.out.println("100�� ���� �Է� : ");
		int b = input.nextInt();
		// ���� b�� ����ڷκ��� �Է¹��� 100���� ������ ����
		System.out.println("50�� ���� �Է� : ");
		int c = input.nextInt();
		// ���� c�� ����ڷκ��� �Է¹��� 50���� ������ ����
		System.out.println("10�� ���� �Է� : ");
		int d = input.nextInt();
		// ���� d�� ����ڷκ��� �Է¹��� 10���� ������ ����

		System.out.println("���� �Ѿ� = " + (a*500 + b*100 + c*50 + d*10));
		System.out.println("�޷� �׼� = " + (a*500 + b*100 + c*50 + d*10)/dol);
		System.out.println("���� ��ȭ = " + (a*500 + b*100 + c*50 + d*10)%dol);
		//����ڷκ��� �Է¹��� �ݾ��� ����Ͽ� ���� �Ѿ�, �޷� �׼�, ���� ��ȭ ��� �� ���
	}

}
