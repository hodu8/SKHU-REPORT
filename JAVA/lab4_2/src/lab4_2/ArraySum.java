/*
�ۼ��� : 2018.03.27.
�ۼ��� : ������
���� : �迭 ������ ���� ���ϴ� ���α׷�
 */
package lab4_2;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("lab4_2 : ������");
		System.out.print("\n������ ���� �Է� : ");
		int num = input.nextInt();
		// ����ڷκ��� �Է¹��� ������ ������ ���� num�� ����
		int arr[] = new int[num]; // ũ�Ⱑ num�� ������ �迭 arr ����
		
		for ( int i = 0; i<num; i++ ){
			System.out.print("���� �Է� : ");
			int n = input.nextInt();
			// ����ڷκ��� num�� ��ŭ�� ������ �Է¹���
			arr[i] = n; // arr�� i��° ��ҿ� n�� ����
		}
		System.out.println("\n" + sum(arr)); // sum�޼ҵ忡 �Ű������� arr�� ���� ȣ���� ���� ���
	}
	private static int sum (int[] array){
		int sum = 0; // �������� ���� ������ ���� sum ���� �� 0���� �ʱ�ȭ
		
		for ( int x : array){ // x�� array�� ��ҵ�� ������� �ݺ���
			sum+=x; // sum�� array�� ���ҵ��� x�� ����
		}
		return sum; // sum�� ��ȯ
	}
}
