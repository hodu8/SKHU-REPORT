/*
 * ���� : Member, HourlyMember, RegularMember�� �̿��ϴ� Ŭ����
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_2 : ������\n");
		double ageAvg = 0; // ������ ����� ���� ���� ageAvg(ageAverage)
		int paymentSum = 0; // ȸ���� ���� ���� paymentSum
		Member []members = new Member[4]; // ũ�Ⱑ 4�� Member �迭�� ����
		members[0] = new HourlyMember(22, 2);
		members[1] = new HourlyMember(33, 3);
		members[2] = new RegularMember(44);
		members[3] = new RegularMember(55);
		// ���� 4�� �����Ͽ� ���� ȸ�� �迭�� ����
		
		for (int i=0; i<4; i++) {
			ageAvg += members[i].getAge();
		}
		System.out.println("������� = " + ageAvg/4);
		// ȸ���� ���� ����� ���� ���
		for (int i=0; i<4; i++) {
			paymentSum += members[i].getPayment();
		}
		System.out.println("ȸ�� �� = " + paymentSum);
		// ȸ���� ȸ�� ���� ���� ���
	}
}