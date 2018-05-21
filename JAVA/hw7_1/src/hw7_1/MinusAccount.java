/*
 * 주제 : 마이너스통장 계좌 클래스
 * 작성일 : 2018.05.20.
 * 작성자 : 박찬우
 */

package hw7_1;

public class MinusAccount extends BankAccount{ // BankAccount를 상속
	private int limit = 0; // int형 private 필드 대출한도 선언
	public MinusAccount (int id, int balance, int limit){
		super(id, balance);
		this.limit = limit;
	} // 계좌번호, 잔액, 대출한도를 매개변수로 받아 초기화하는 생성자
	public MinusAccount (int id, int limit){
		super(id, 0);
		this.limit = limit;
	} // 계좌번호, 대출한도를 매개변수로 받아 초기화하는 생성자 - 잔액은 0으로 초기화
	@Override
	public void withdraw (int amount){
		if (getBalance()-amount < -(limit))
			System.out.println("계좌 " + id + ": 잔액 부족으로 출금 실패");
		else {
			super.withdraw(amount);
		}
	} // 출금 메소드 오버라이드 - 대출한도 초과시 출금 수행하지 않고 오류메시지 출력
	public int getLimit() {
		return limit;
	} // 대출 한도 getter
}
