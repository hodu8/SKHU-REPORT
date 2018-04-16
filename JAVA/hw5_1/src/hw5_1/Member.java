/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.16.
 * 파일 내용 : 회원을 나타내는 클래스
 */
package hw5_1;

public class Member {
	int mrank = 0; // 회원의 등급을 저장할 변수 mrank 선언 및 0으로 초기화
	int point = 0; // 회원의 포인트를 저장할 변수 point 선언 및 0으로 초기화
	void memberRank (int rank) {
		mrank = rank;
	} // 등급을 뜻하는 매개변수 rank를 받아 mrank에 저장함
	void memberPoint () {
		if (mrank == 1)
			point+=100;
		// 만약 mrank가 1이면 point에 100을 더한값을 저장한다
		else if (mrank == 2)
			point+=50;
		// 만약 mrank가 2이면 point에 50을 더한값을 저장한다
		else if (mrank == 3)
			point+=40;
		// 만약 mrank가 3이면 point에 40을 더한값을 저장한다
		else
			point+=10;
		// 만약 그 이외라면 point에 10을 더한값을 저장한다
	}
	double discountPercent () {
		if (point>=100)
			return 0.2;
		// 만약 point가 100 이상이라면 0.2를 반환
		else
			return 0.1;
		// 그 이외라면 0.1을 반환
	}
}
