/*
�ۼ��� : 2018.03.27.
�ۼ��� : ������
���� : ����ڰ� ���ϴ� ������ �������� �Է¹޾� ��հ� �̻��� ���� ��� ����ϴ� ���α׷�
 */

package quiz3;
import java.util.Scanner;
public class OverAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("quiz3 : ������");

		System.out.printf("\n���� ���� �Է� : ");
		int n = input.nextInt();
		// ����ڷκ��� ���� ������ �Է¹޾� ���� n�� ����
		int arr[] = new int[n]; // ũ�Ⱑ n�� ������ �迭 arr ����
		double average = 0; // �Ǽ��� ���� average ���� �� 0���� �ʱ�ȭ
		
		for (int i = 0;i<n;i++){
			System.out.printf(n + "���� ���� �Է� : ");
			int num = input.nextInt();
			// ����ڷκ��� n���� ������ �Է¹޾� ���� num�� ����
			arr[i] = num; //arr�� i��° ��ҿ� ����ڷκ��� �Է¹��� num�� ����
			average += num; // average�� num�� ����
		}
		System.out.println("\n��� = " + average/n); // ��� ���
		System.out.print("\n��� �̻��� �� = ");
		for (int j = 0;j<n;j++){
			if (arr[j]>=average/n){
				System.out.println(arr[j]);
				// ���� arr�� j��° ��Ұ� ��� �̻��̶�� ���
			}
		}
	}
}
