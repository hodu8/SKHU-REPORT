/*
�ۼ��� : ������
�ۼ��� : 2018.03.26.
���� : ���� ~ ���� ������ ���� �л� ���̸� �Է¹޾� �� ������ �л��� ����ΰ��� ���� ���α׷�
 */

package hw4_1;
import java.util.Scanner;
public class StudentAge {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); // �Է��� ����  Scanner �޼ҵ� ����
		System.out.println("hw4_1 : ������\n"); // �����ڵ� �� �ۼ��ڸ� ���
		System.out.print("���� ���� �Է� : ");
		int min = input.nextInt();
		// ����ڷκ��� ���� ������ �Է¹޾� ���� min�� ����
		System.out.print("���� ���� �Է� : ");
		int max = input.nextInt();
		// ����ڷκ��� ���� ������ �Է¹޾� ���� max�� ����
		System.out.print("�л� �� �Է� : ");
		int student = input.nextInt();
		// ����ڷκ��� �л� ���� �Է¹޾� ���� student�� ����
		int[] arr = new int[student]; // �л����� ���̸� ������, ũ�Ⱑ student�� ������ �迭 arr ����
		int num = 0; // ���̺� �л� ���� üũ�� ���� num ���� �� 0���� �ʱ�ȭ
		
		for (int i=0; i<student; i++){ // 0���� ����ڰ� �Է��� (student-1)���� �ݺ�
			System.out.print("\n���� �Է� : ");
			int age = input.nextInt();
			// ����ڷκ��� ���̸� �Է¹޾� ���� age�� ����
			if (age>=min && age<=max){
				arr[i]=age;
			} // ���� ����~���� ������ ����� arr�� i��° ��ҿ� age�� ����
			else {
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���.");
				i--;
			} // ���� �Է��� ���� ������ �������, �����޽����� ����ϰ� i�� -1 ��Ŵ
		}
		System.out.println("����/�л� ��");
		for (int j=min; j<=max; j++){ // ���Ѻ��� ���ѱ��� �ݺ���
			for (int k=0; k<student; k++){ // 0���� ����ڰ� �Է��� (student-1)���� �ݺ�
				if (arr[k] == j){
					num++;
				} // ���� arr�� k��° ��Ұ� j�� ���ٸ� num�� 1 ������Ŵ
			}
			System.out.println(j + "  " + num); // j(����~���� ������ ����)�� num(���� �� �л� ��)�� ���
			num=0; // �ݺ����� �ٽ� ���� ���� num�� 0���� �ʱ�ȭ��Ŵ
		}
	}
}
