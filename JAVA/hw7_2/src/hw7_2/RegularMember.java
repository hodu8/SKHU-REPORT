/*
 * 주제 : Member를 상속하는 정회원 클래스
 * 작성일 : 2018.05.24.
 * 작성자 : 박찬우
 */

package hw7_2;

public class RegularMember extends Member { // Member를 상속
	public RegularMember(int age) {
		super(age);
	} // 나이를 매개변수로 받아 초기화하는 생성자
	@Override
	public int getPayment() {
		return 1000;
	} // 1000을 반환
}
