/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.16.
 * ���� ���� : 	  (1) ȸ�� 5���� ���� - ȸ�� �迭�� ����� ��
			  (2) ȸ�� 5���� ����� 1, 2, 3, 4, 5�� ���� 
			  (3) ȸ�� 5���� ����Ʈ ���� 
			  (4) ȸ�� 5���� ����Ʈ ���� 
			  (5) ȸ�� 5���� ���η��� ��ȸ�Ͽ� ���
 */

package hw5_1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw5_1 : ������");
		Member [] mem = new Member[5]; // ũ�Ⱑ 5�� ȸ�� �迭�� ����
		for (int i=0; i<5; i++)
			mem[i] = new Member();
		// �ݺ����� �̿��Ͽ� ȸ�� �迭�� 5���� ȸ���� �����Ͽ� ����
		for (int j=0; j<5; j++)
			mem[j].memberRank(j+1);
		// �ݺ����� �̿��Ͽ� ȸ�� 5���� ����� 1, 2, 3, 4, 5�� ����
		for (int k=0; k<5; k++)
			mem[k].memberPoint();
		// �ݺ����� �̿��Ͽ� ȸ�� 5���� ����Ʈ ����
		for (int p=0; p<5; p++)
			mem[p].memberPoint();
		// �ݺ����� �̿��Ͽ� ȸ�� 5���� ����Ʈ ����
		for (int l=0; l<5; l++)
			System.out.println(mem[l].discountPercent());
		// ȸ�� 5���� ���η��� ��ȸ�Ͽ� ���
	}
}
