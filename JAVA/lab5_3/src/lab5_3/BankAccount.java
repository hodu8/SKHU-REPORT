/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.06.
 * 파일 내용 : 은행 계좌를 나타내는 클래스
 */

package lab5_3;

public class BankAccount {
	int balance = 0; // 잔액을 나타내는 변수 balance 선언 및 0으로 초기화

	void deposit(int dep) { // int형 dep를 매개변수로 받는 void형 메소드 deposit 정의
		balance += dep; // balance에 dep를 더한 값을 저장
	}
	int getBalance() { // int형 메소드 getBalance 정의
		return balance; // balacne를 반환
	}
	void withdraw(int money) { // int형 money를 매개변수로 받는 void형 메소드 withdraw 정의 
		balance-=money; // balance에 money를 뺀 값을 저장 
	}
}
