/*
 *  ���� : �Ϲݰ��� Ŭ����
 *  �ۼ��� : 2018.05.20.
 *  �ۼ��� : ������
 */

package hw7_1;

public class NormalAccount extends BankAccount { // BankAccount�� ���
	public NormalAccount(int id, int balance){
		super(id, balance);
	} // ���¹�ȣ�� �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public NormalAccount (int id){
		super(id, 0);
	} // ���¹�ȣ�� �Ű������� �޾� �ʱ�ȭ�ϴ� ������ - �ܾ��� 0���� �ʱ�ȭ
	@Override
	public void withdraw (int amount){
		if (getBalance()-amount < 0)
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");
		else {
			super.withdraw(amount);
		} // ��� �޼ҵ� �������̵� - �ܾ׺����� ��� �������� �ʰ� �����޽��� ���
	}
}
