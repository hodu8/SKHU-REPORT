/*
작성자 : 박찬우
작성일 : 2018.03.19.
주제 : 사용자로부터 금액을 입력 받아 달러로 환전 및 남은 한화 계산
 */

package hw2_1;

import java.util.Scanner;

public class hw2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int dol=1060; // int형 상수 dol(달러) 선언 및 1060으로 초기화
		System.out.println("hw2_1: 박찬우\n"); // 과제 코드 및 작성자명 출력
		Scanner input = new Scanner(System.in); // Scanner형 변수 input에 키보드 입력을 위한  Scanner 객체를 생성하여 지정
		System.out.println("500원 갯수 입력 : ");
		int a = input.nextInt();
		// 변수 a에 사용자로부터 입력받은 500원의 갯수를 저장
		System.out.println("100원 갯수 입력 : ");
		int b = input.nextInt();
		// 변수 b에 사용자로부터 입력받은 100원의 갯수를 저장
		System.out.println("50원 갯수 입력 : ");
		int c = input.nextInt();
		// 변수 c에 사용자로부터 입력받은 50원의 갯수를 저장
		System.out.println("10원 갯수 입력 : ");
		int d = input.nextInt();
		// 변수 d에 사용자로부터 입력받은 10원의 갯수를 저장

		System.out.println("저금 총액 = " + (a*500 + b*100 + c*50 + d*10));
		System.out.println("달러 액수 = " + (a*500 + b*100 + c*50 + d*10)/dol);
		System.out.println("남은 한화 = " + (a*500 + b*100 + c*50 + d*10)%dol);
		//사용자로부터 입력받은 금액을 계산하여 저금 총액, 달러 액수, 남은 한화 계산 및 출력
	}

}
