/*
 ���ϸ� : InputTest.java
 �ۼ��� : ������
 �ۼ��� : 2018.03.15
 ���� ���� : ���ø�, �α���, ��� ����� �Է¹޾� ���
 */
package lab2_1;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab2_1: ������\n");
		Scanner input = new Scanner(System.in);
		// Scanner�� ���� input�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����
		System.out.println("���ø� �Է�: ");
		// ���ø��� �Է��϶�� �ȳ����� ���
		String city = input.nextLine(); 
		// String�� ���� city�� �����ϰ�, �� ���� ���ø��� �Է¹޾� city�� ���� - nextLine() �޼ҵ�
		System.out.println("�α� �Է�: ");
		// �α��� �Է��϶�� �ȳ����� ���
		int population = input.nextInt();
		// int�� ���� population�� �����ϰ�, �α��� �Է¹޾� population�� ���� - nextInt() �޼ҵ�
		System.out.println("��� ��� �Է�: ");
		// ��� ����� �Է��϶��  �Է��϶�� �ȳ����� ���
		double averageDegree = input.nextDouble();
		// double�� ���� averageDegree�� �����ϰ�, ��� ����� �Է¹޾� averageDegree�� ���� - nextDouble() �޼ҵ�
		System.out.println("\n���ø� = "+ city );
		System.out.println("�α� = " + population + "��");
		System.out.println("��� ��� = " + averageDegree);
		// ���ø�, �α���, ��� ����� ���
	}
}