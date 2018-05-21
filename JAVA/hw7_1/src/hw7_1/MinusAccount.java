/*
 * ���� : ���̳ʽ����� ���� Ŭ����
 * �ۼ��� : 2018.05.20.
 * �ۼ��� : ������
 */

package hw7_1;

public class MinusAccount extends BankAccount{ // BankAccount�� ���
	private int limit = 0; // int�� private �ʵ� �����ѵ� ����
	public MinusAccount (int id, int balance, int limit){
		super(id, balance);
		this.limit = limit;
	} // ���¹�ȣ, �ܾ�, �����ѵ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public MinusAccount (int id, int limit){
		super(id, 0);
		this.limit = limit;
	} // ���¹�ȣ, �����ѵ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������ - �ܾ��� 0���� �ʱ�ȭ
	@Override
	public void withdraw (int amount){
		if (getBalance()-amount < -(limit))
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");
		else {
			super.withdraw(amount);
		}
	} // ��� �޼ҵ� �������̵� - �����ѵ� �ʰ��� ��� �������� �ʰ� �����޽��� ���
	public int getLimit() {
		return limit;
	} // ���� �ѵ� getter
}