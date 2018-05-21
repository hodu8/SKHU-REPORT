/*
 * 주제 : 은행계좌 클래스를 상속하는 일반계좌, 마이너스통장계좌 클래스를 사용하는 프로그램
 * 작성일 : 2018.05.20.
 * 작성자 : 박찬우
 */

package hw7_1;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : 박찬우\n");
		Scanner scan = new Scanner(System.in);
		NormalAccount acc1 = new NormalAccount(11, 1000);
		NormalAccount acc2 = new NormalAccount(22);
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);
		MinusAccount acc4 = new MinusAccount(44, 500);
		// 일반 계좌 2개, 마이너스통장 계좌 2개 생성
		
		System.out.println("최대 출금가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getLimit()));
		// 4개 계좌의 최대 출금 가능액 각각 출력
		
		System.out.print("\n출금액 입력 : ");
		int wamount = scan.nextInt();
		// 사용자로부터 입력받은 출금액을 wamount(withdraw_amount)에 저장

		acc1.withdraw(wamount);
		acc2.withdraw(wamount);
		acc3.withdraw(wamount);
		acc4.withdraw(wamount);
		// 4개의 계좌에서 각각 출금 수행
		
		System.out.print("\n입금액 입력 : ");
		int damount = scan.nextInt();
		// 사용자로부터 입력받은 입금액을 damount(deposit_amount)에 저장
		
		acc1.deposit(damount);
		acc2.deposit(damount);
		acc3.deposit(damount);
		acc4.deposit(damount);
		// 4개 계좌에 각각 입금 수행
		
		System.out.println("\n최대 출금가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getLimit()));
		//4개 계좌의 최대 출금 가능액 각각 출력
	}

}
