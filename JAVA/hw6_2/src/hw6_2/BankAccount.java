package hw6_2;

public class BankAccount {
	private int accountnum = 0;
	private String accountname;
	private int balance = 0;
	// ���¹�ȣ, �����ָ�, �ܾ� �ʵ� ����
	public BankAccount(int accnum, String accname, int b) {
		accountnum = accnum;
		accountname = accname;
		if (b<0)
			balance = 0;
		else 
			balance = b;
	} // ���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor - �ܾ��� �����̸� 0���� �ʱ�ȭ
	public BankAccount (int accnum, String accname) {
		this(accnum, accname, 0);
	} //  ���¹�ȣ, �����ָ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor - ���� constructor�� ȣ���Ͽ� �ʱ�ȭ
	public int getAccountNumber() {
		return accountnum;
	} // ���¹�ȣ�� ��ȯ�ϴ� getter
	public String getAccountName() {
		return accountname;
	} // �����ָ��� ��ȯ�ϴ� getter
	public void setAccountName(String accname) {
		accountname = accname;
	} // �����ָ��� �Ű������� �޾� accountname�� �����ϴ� setter
	public int getBalance() {
		return balance;
	} // �ܾ��� ��ȯ�ϴ� getter
	public void deposit(int money) {
		balance += money;
	} // �Ա��� �ݾ��� �Ű������� �޾� balance�� ����
	public void withdraw(int money) {
		if (balance - money < 0)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance -= money;
	} // ����� �ݾ��� �Ű������� �޾� balance���� ����, �ܾ� ������ ����� �̷������ �ʰ� ���� �޽��� ���
	public void sendMoney(BankAccount account, int money) {
		if (balance - money < 0)
			System.out.println("�ܾ��� �����մϴ�.");
		else {
			balance -= money;
			account.balance += money;
		} // �ٸ� ������� ��ü�� �۱ݾ��� �Ű������� �޾� �� ���·κ��� �ٸ� ���·� �۱�, �� ������ �ܾ� ������ �۱��� �̷������ �ʰ� ���� �޽��� ���
	}
}
