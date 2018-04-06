/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.06.
 * 파일 내용 : 계좌에 입금, 출금, 잔액 조회를 하는 프로그램
 */

package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab5_3 : 박찬우\n");
		BankAccount Bank = new BankAccount(); // 은행계좌 객체를 하나 생성
		Bank.deposit(2000); // 계좌에 2000원을 입금
		Bank.deposit(3000); // 계좌에 3000원을 입금
		System.out.println(Bank.balance); // 계좌의 잔액 필드를 출력
		
		System.out.println(Bank.getBalance()); // 계좌를 잔액조회하여 잔액을 알아내어 출력
		Bank.withdraw(1000); // 계좌에서 1000원을 출금
		System.out.println(Bank.getBalance()); // 계좌를 잔액조회하여 잔액을 알아내어 출력
	}
}
