/*
 파일명 : InputTest.java
 작성자 : 박찬우
 작성일 : 2018.03.15
 파일 내용 : 도시명, 인구수, 평균 기온을 입력받아 출력
 */
package lab2_1;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab2_1: 박찬우\n");
		Scanner input = new Scanner(System.in);
		// Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		System.out.println("도시명 입력: ");
		// 도시명을 입력하라는 안내문을 출력
		String city = input.nextLine(); 
		// String형 변수 city를 선언하고, 한 줄의 도시명을 입력받아 city에 지정 - nextLine() 메소드
		System.out.println("인구 입력: ");
		// 인구를 입력하라는 안내문을 출력
		int population = input.nextInt();
		// int형 변수 population를 선언하고, 인구를 입력받아 population에 지정 - nextInt() 메소드
		System.out.println("평균 기온 입력: ");
		// 평균 기온을 입력하라는  입력하라는 안내문을 출력
		double averageDegree = input.nextDouble();
		// double형 변수 averageDegree를 선언하고, 평균 기온을 입력받아 averageDegree에 지정 - nextDouble() 메소드
		System.out.println("\n도시명 = "+ city );
		System.out.println("인구 = " + population + "만");
		System.out.println("평균 기온 = " + averageDegree);
		// 도시명, 인구수, 평균 기온을 출력
	}
}