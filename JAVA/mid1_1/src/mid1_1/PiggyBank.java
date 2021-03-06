/*
 * 주제 : 돼지저금통 클래스를 정의하고 이용하는 프로그램
 * 작성자 : 박찬우
 * 작성일 : 2018.05.08.
 */
package mid1_1;

public class PiggyBank {
	// (1) 2개의 private 필드 :
	//    500원 개수(정수형)와 100원 개수(정수형)
	private int ohbaeck = 0;
	private int baeck = 0;
	// (2) 500원 개수, 100원 개수를 매개변수로 받아
	//    초기화 하는 생성자
	public PiggyBank(int ohbaeck, int baeck){
		this.ohbaeck = ohbaeck;
		this.baeck = baeck;
	}
	// (3) add() - 500원 개수, 100원 개수를 매개변수로 받아
	//     저금하는 메소드
	public void add(int ohbaeck, int baeck){
		this.ohbaeck += ohbaeck;
		this.baeck += baeck;
	}
	// (4) open() -돼지저금통을 열어 저금액을 리턴하는 메소드
	//     저금통을 열고 나면 동전 개수는 모두 0이 된다.
	public int open(){
		int money = (ohbaeck*500) + (baeck*100);
		ohbaeck = 0;
		baeck = 0;
		return money;
	}
}