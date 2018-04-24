package hw6_2;

public class BankAccount {
	private int accountnum = 0;
	private String accountname;
	private int balance = 0;
	// 계좌번호, 예금주명, 잔액 필드 설정
	public BankAccount(int accnum, String accname, int b) {
		accountnum = accnum;
		accountname = accname;
		if (b<0)
			balance = 0;
		else 
			balance = b;
	} // 계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor - 잔액이 음수이면 0으로 초기화
	public BankAccount (int accnum, String accname) {
		this(accnum, accname, 0);
	} //  계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor - 위의 constructor를 호출하여 초기화
	public int getAccountNumber() {
		return accountnum;
	} // 계좌번호를 반환하는 getter
	public String getAccountName() {
		return accountname;
	} // 예금주명을 반환하는 getter
	public void setAccountName(String accname) {
		accountname = accname;
	} // 예금주명을 매개변수로 받아 accountname에 저장하는 setter
	public int getBalance() {
		return balance;
	} // 잔액을 반환하는 getter
	public void deposit(int money) {
		balance += money;
	} // 입금할 금액을 매개변수로 받아 balance에 더함
	public void withdraw(int money) {
		if (balance - money < 0)
			System.out.println("잔액이 부족합니다.");
		else
			balance -= money;
	} // 출금할 금액을 매개변수로 받아 balance에서 차감, 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력
	public void sendMoney(BankAccount account, int money) {
		if (balance - money < 0)
			System.out.println("잔액이 부족합니다.");
		else {
			balance -= money;
			account.balance += money;
		} // 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금, 내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력
	}
}
