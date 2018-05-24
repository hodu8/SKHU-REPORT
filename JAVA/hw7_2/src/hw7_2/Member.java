/*
 *  주제 : 회원 추상 클래스
 *  작성일 : 2018.05.24.
 *  작성자 : 박찬우
 */

package hw7_2;

public abstract class Member {
	int age = 0; // 나이 필드
	public Member(int age) {
		this.age = age;
	} // 나이를 매개변수로 받아 초기화 하는 생성자
	public int getAge() {
		return age;
	} // 나이 getter
	public abstract int getPayment(); // 회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
} 
