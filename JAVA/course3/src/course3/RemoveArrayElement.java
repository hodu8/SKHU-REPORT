/*
 * ���� : �迭�� ������ ���� ����Ʈ�κ��� ����ڰ� ���ϴ� ���Ҹ� �����ϴ� ���α׷�
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.18.
 */

package course3;
import java.util.Scanner;

public class RemoveArrayElement {

	public static void main(String[] args) {
		System.out.println("course3 : ������ ");

		// ũ�Ⱑ 15�� �迭 list�� ���̰� numberOfElements�� ���� ����Ʈ�� ������
		int[] list = {3, -6, 11, -5, 22, 11, 0, 9, 7, 2, 0, 0, 0, 0, 0};
		int numberOfElements = 10;

		// numberOfElements���� ���Ҹ� ���� ����Ʈ�� ���
		System.out.print("���� �� ����Ʈ = ");
		printList(list, numberOfElements);

		// ������ ��(element)�� �Է¹���
		Scanner input = new Scanner(System.in);
		System.out.print("������ �� �Է�: ");
		int element = input.nextInt();

		// (1) list���� element�� ����
		// �̶�, ������ ���� �������� �� ���� ���Ҹ� �����ϰ�, �������� �ʴ� ���� ��� ���� ����
		for (int i = 0; i < numberOfElements; i++) {
			if(list[i] == element) {
				for (int j = i; j < numberOfElements; j++) {
					list[j] = list[j+1];
				}
				numberOfElements--;
				System.out.println("���� ����");
				break;
			}
			else if(i+1 == numberOfElements)
				System.out.println("���� ����. �������� �ʴ� ���Դϴ�.");
		}



		// ���� ����� numberOfElements���� ���Ҹ� ���� ����Ʈ�� ���
		System.out.print("���� �� ����Ʈ = ");
		printList(list, numberOfElements);
	}

	// �迭 array�� ����� numberOfElements ���� ���Ҹ� ���
	// �迭�� ���̿� ����� ���Ҽ��� ���� �ٸ� �� ����
	private static void printList(int[] array, int numberOfElements) {
		for(int i = 0; i < numberOfElements; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}