/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.03.
 * ���� : ��� ���ϱ�
 */

package lab1_4;
import java.util.Scanner;

public class Average {
	public static double getAverage(int[] arr){
		double sum = 0;
		for (int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_4 : ������\n");
		System.out.print("���� ���� �Է� : ");
		int n = scan.nextInt();
		int [] array = new int[n];
		System.out.print(n + "���� ���� �Է� : ");
		for (int i=0; i<n; i++){
			array[i] = scan.nextInt();
		}
		System.out.println("��� = " + getAverage(array));
	}
}
