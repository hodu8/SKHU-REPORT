/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.06.
 * ���� ���� : ���¿� �Ա�, ���, �ܾ� ��ȸ�� �ϴ� ���α׷�
 */

package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab5_3 : ������\n");
		BankAccount Bank = new BankAccount(); // ������� ��ü�� �ϳ� ����
		Bank.deposit(2000); // ���¿� 2000���� �Ա�
		Bank.deposit(3000); // ���¿� 3000���� �Ա�
		System.out.println(Bank.balance); // ������ �ܾ� �ʵ带 ���
		
		System.out.println(Bank.getBalance()); // ���¸� �ܾ���ȸ�Ͽ� �ܾ��� �˾Ƴ��� ���
		Bank.withdraw(1000); // ���¿��� 1000���� ���
		System.out.println(Bank.getBalance()); // ���¸� �ܾ���ȸ�Ͽ� �ܾ��� �˾Ƴ��� ���
	}
}
