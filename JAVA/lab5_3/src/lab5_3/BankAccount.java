/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.06.
 * ���� ���� : ���� ���¸� ��Ÿ���� Ŭ����
 */

package lab5_3;

public class BankAccount {
	int balance = 0; // �ܾ��� ��Ÿ���� ���� balance ���� �� 0���� �ʱ�ȭ

	void deposit(int dep) { // int�� dep�� �Ű������� �޴� void�� �޼ҵ� deposit ����
		balance += dep; // balance�� dep�� ���� ���� ����
	}
	int getBalance() { // int�� �޼ҵ� getBalance ����
		return balance; // balacne�� ��ȯ
	}
	void withdraw(int money) { // int�� money�� �Ű������� �޴� void�� �޼ҵ� withdraw ���� 
		balance-=money; // balance�� money�� �� ���� ���� 
	}
}
