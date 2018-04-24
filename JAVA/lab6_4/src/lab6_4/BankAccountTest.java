package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab6_4 : ¹ÚÂù¿ì");
		System.out.println(BankAccount.getAccountCount());
		System.out.println(BankAccount.MIN);
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		System.out.println(BankAccount.getAccountCount());
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}
}
