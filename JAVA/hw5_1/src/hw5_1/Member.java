/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.16.
 * ���� ���� : ȸ���� ��Ÿ���� Ŭ����
 */
package hw5_1;

public class Member {
	int mrank = 0; // ȸ���� ����� ������ ���� mrank ���� �� 0���� �ʱ�ȭ
	int point = 0; // ȸ���� ����Ʈ�� ������ ���� point ���� �� 0���� �ʱ�ȭ
	void memberRank (int rank) {
		mrank = rank;
	} // ����� ���ϴ� �Ű����� rank�� �޾� mrank�� ������
	void memberPoint () {
		if (mrank == 1)
			point+=100;
		// ���� mrank�� 1�̸� point�� 100�� ���Ѱ��� �����Ѵ�
		else if (mrank == 2)
			point+=50;
		// ���� mrank�� 2�̸� point�� 50�� ���Ѱ��� �����Ѵ�
		else if (mrank == 3)
			point+=40;
		// ���� mrank�� 3�̸� point�� 40�� ���Ѱ��� �����Ѵ�
		else
			point+=10;
		// ���� �� �̿ܶ�� point�� 10�� ���Ѱ��� �����Ѵ�
	}
	double discountPercent () {
		if (point>=100)
			return 0.2;
		// ���� point�� 100 �̻��̶�� 0.2�� ��ȯ
		else
			return 0.1;
		// �� �̿ܶ�� 0.1�� ��ȯ
	}
}
