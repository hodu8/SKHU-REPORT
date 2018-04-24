package lab6_4;

public class BankAccount {
	private int accountNumber = 0;
	private int balance = 0;
	private static int accountCount = 0;
	public BankAccount () {
		balance = 0;
		accountCount += 1;
		accountNumber = accountCount;
	}
	public static final int MIN = 100;
	public String toString() {
		return "°èÁÂ¹øÈ£ = " + accountNumber + " ÀÜ¾× = " + balance;
	}
	public static int getAccountCount () {
		return accountCount;
	}
}
