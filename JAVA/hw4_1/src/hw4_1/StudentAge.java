/*
작성자 : 박찬우
작성일 : 2018.03.26.
주제 : 하한 ~ 상한 범위의 여러 학생 나이를 입력받아 각 연령의 학생이 몇명씩인가를 세는 프로그램
 */

package hw4_1;
import java.util.Scanner;
public class StudentAge {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); // 입력을 위한  Scanner 메소드 정의
		System.out.println("hw4_1 : 박찬우\n"); // 과제코드 및 작성자명 출력
		System.out.print("나이 하한 입력 : ");
		int min = input.nextInt();
		// 사용자로부터 나이 하한을 입력받아 변수 min에 저장
		System.out.print("나이 상한 입력 : ");
		int max = input.nextInt();
		// 사용자로부터 나이 상한을 입력받아 변수 max에 저장
		System.out.print("학생 수 입력 : ");
		int student = input.nextInt();
		// 사용자로부터 학생 수를 입력받아 변수 student에 저장
		int[] arr = new int[student]; // 학생들의 나이를 저장할, 크기가 student인 정수형 배열 arr 선언
		int num = 0; // 나이별 학생 수를 체크할 변수 num 선언 및 0으로 초기화
		
		for (int i=0; i<student; i++){ // 0부터 사용자가 입력한 (student-1)까지 반복
			System.out.print("\n나이 입력 : ");
			int age = input.nextInt();
			// 사용자로부터 나이를 입력받아 변수 age에 저장
			if (age>=min && age<=max){
				arr[i]=age;
			} // 만약 하한~상한 사이의 수라면 arr의 i번째 요소에 age를 저장
			else {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				i--;
			} // 만약 입력한 수가 범위를 벗어났으면, 오류메시지를 출력하고 i를 -1 시킴
		}
		System.out.println("나이/학생 수");
		for (int j=min; j<=max; j++){ // 하한부터 상한까지 반복함
			for (int k=0; k<student; k++){ // 0부터 사용자가 입력한 (student-1)까지 반복
				if (arr[k] == j){
					num++;
				} // 만약 arr의 k번째 요소가 j와 같다면 num을 1 증가시킴
			}
			System.out.println(j + "  " + num); // j(하한~상한 사이의 숫자)와 num(나이 별 학생 수)를 출력
			num=0; // 반복문을 다시 돌기 위해 num을 0으로 초기화시킴
		}
	}
}
