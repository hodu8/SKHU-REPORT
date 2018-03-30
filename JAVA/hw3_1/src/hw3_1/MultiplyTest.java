/*
�ۼ��� : ������
�ۼ��� : 2018.03.20.
���� : �����ϰ� �־����� �� ���� ���� ����� ����ڷκ��� �Է¹޾� �����, �����, ����, �հ� ���θ� ���
 */

package hw3_1;

import java.util.Scanner;
import java.util.Random;

public class MultiplyTest {

	public static void main(String[] args) {

		Random generator = new Random(); // ���� ������ ���� ���� �޼ҵ� ����
		Scanner input = new Scanner(System.in); // �Է��� ����  Scanner �޼ҵ� ����
		int score = 0; // ������ �����ϱ� ���� ���� score ����
		int correct = 0; // ���� ������ �����ϱ� ���� ���� correct ����
		int incorrect = 0; // Ʋ�� ������ �����ϱ� ���� ���� incorrect ����
		String result2 = ""; // �հ�, ���հ� ���θ� �����ϱ� ���� ���� result2 ����
		System.out.println("hw3_1 : ������\n"); // �����ڵ� �� �ۼ��ڸ� ���

		System.out.println("���� ������ ���� �Է��ϼ��� (����Ϸ��� 0�� �Է�).\n"); // �ȳ��� ���

		for (int i = 0; i<5; i++) {
			// �ݺ��� ����, 5�� �ݺ�

			int num1 = generator.nextInt(9)+1; // num1�� 1~9������ ������ ����
			int num2 = generator.nextInt(9)+1; // num2�� 1~9������ ������ ����

			System.out.println(num1 + "*" + num2 + "= ? "); // ������ ������ ������ ���
			int result = input.nextInt(); // result�� ����ڰ� �Է��� ������ ���� ����

			if ( result == 0 ) {
				System.out.println("���\n");
				continue;
				// ���� result�� 0�̸� "���"�� ����ϰ� �ݺ����� �ٽ� ����
			}

			if ( num1 * num2 == result) {
				System.out.println("�����Դϴ�.\n");
				correct += 1;
				score += 20;
				// ���� result�� �����̶�� "�����Դϴ�."�� ����ϰ� correct�� 1 ��½�Ű��, score�� 20�� ����
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.\n");
				if ( score-10 >= 0 ){
					score -= 10;
				}
				incorrect += 1;
				// �ƴ϶�� "Ʋ�Ƚ��ϴ�."�� ����ϰ� score�� ������ ���� �ʴ´ٸ� score���� 10�� ����, incorrect�� 1 ���
			}
		}

		if ( score >= 50 ) {
			result2 = "�հ�";
			// ���� score�� 50 �̻��̶�� result2�� �հ��� ����
		} else
			result2 = "���հ�";
			// �ƴ϶�� result2�� ���հ��� ����
		System.out.println("����� " + correct + " ����� " + incorrect + " ���� " + score + " --> " + result2);
		// �����, �����, ����, �հ�, ���հ� ����� ���
	}
}