/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.16.
 * 파일 내용 : 	  (1) 회원 5명을 생성 - 회원 배열을 사용할 것
			  (2) 회원 5명의 등급을 1, 2, 3, 4, 5로 지정 
			  (3) 회원 5명에게 포인트 지급 
			  (4) 회원 5명에게 포인트 지급 
			  (5) 회원 5명의 할인률을 조회하여 출력
 */

package hw5_1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw5_1 : 박찬우");
		Member [] mem = new Member[5]; // 크기가 5인 회원 배열을 생성
		for (int i=0; i<5; i++)
			mem[i] = new Member();
		// 반복문을 이용하여 회원 배열에 5명의 회원을 생성하여 지정
		for (int j=0; j<5; j++)
			mem[j].memberRank(j+1);
		// 반복문을 이용하여 회원 5명의 등급을 1, 2, 3, 4, 5로 지정
		for (int k=0; k<5; k++)
			mem[k].memberPoint();
		// 반복문을 이용하여 회원 5명에게 포인트 지급
		for (int p=0; p<5; p++)
			mem[p].memberPoint();
		// 반복문을 이용하여 회원 5명에게 포인트 지급
		for (int l=0; l<5; l++)
			System.out.println(mem[l].discountPercent());
		// 회원 5명의 할인률을 조회하여 출력
	}
}
