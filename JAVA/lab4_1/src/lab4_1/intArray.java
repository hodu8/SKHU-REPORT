/*
[lab4_1] ���� �迭
---------------------------------------------------------
������ ���� ���α׷��� �ۼ��Ͻÿ�.

(1) ����ڷκ��� �迭 ����(size)�� �Է¹���
(2) ���̰� size�� �迭�� ����
(3) ����ڷκ��� size ���� �������� �Է¹޾� �迭�� ����
(4) �迭�� ���Ҹ� ������� ��� ���
(5) �迭�� ���Ҹ� ������� ��� ���

- ���� ��:
lab4_1: ȫ�浿

�迭 ���� �Է�: 5

5���� ���� �Է�: 12 13 14 15 -16

�迭 = 12 13 14 15 -16
�迭 = 12 13 14 15 -16
 */

package lab4_1;
import java.util.Scanner;
public class intArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("lab4_1 : ������");

		System.out.println("�迭 ���� �Է� : ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.println("5���� ���� �Է� : ");
		for (int i=0; i<5; i++){
			int n = input.nextInt();
			arr[i] = n;
		}
		
		System.out.print("�迭 = ");
		for (int j=0;j<5;j++){
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		
		System.out.print("�迭 = ");
		for (int k=0;k<5;k++){
			System.out.print(arr[k] + " ");
		}
	}
}
