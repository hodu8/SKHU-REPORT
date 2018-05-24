/*
 * 주제 : Member, HourlyMember, RegularMember를 이용하는 클래스
 * 작성일 : 2018.05.24.
 * 작성자 : 박찬우
 */

package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_2 : 박찬우\n");
		double ageAvg = 0; // 나이의 평균을 구할 변수 ageAvg(ageAverage)
		int paymentSum = 0; // 회비의 합을 구할 paymentSum
		Member []members = new Member[4]; // 크기가 4인 Member 배열을 생성
		members[0] = new HourlyMember(22, 2);
		members[1] = new HourlyMember(33, 3);
		members[2] = new RegularMember(44);
		members[3] = new RegularMember(55);
		// 다음 4명 생성하여 위의 회원 배열에 저장
		
		for (int i=0; i<4; i++) {
			ageAvg += members[i].getAge();
		}
		System.out.println("나이평균 = " + ageAvg/4);
		// 회원의 나이 평균을 구해 출력
		for (int i=0; i<4; i++) {
			paymentSum += members[i].getPayment();
		}
		System.out.println("회비 합 = " + paymentSum);
		// 회원의 회비 합을 구해 출력
	}
}