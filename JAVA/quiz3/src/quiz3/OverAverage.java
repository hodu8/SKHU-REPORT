/*
작성일 : 2018.03.27.
작성자 : 박찬우
주제 : 사용자가 원하는 개수의 정수값을 입력받아 평균값 이상인 값을 모두 출력하는 프로그램
 */

package quiz3;
import java.util.Scanner;
public class OverAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("quiz3 : 박찬우");

		System.out.printf("\n정수 개수 입력 : ");
		int n = input.nextInt();
		// 사용자로부터 정수 개수를 입력받아 변수 n에 저장
		int arr[] = new int[n]; // 크기가 n인 정수형 배열 arr 선언
		double average = 0; // 실수형 변수 average 선언 및 0으로 초기화
		
		for (int i = 0;i<n;i++){
			System.out.printf(n + "개의 정수 입력 : ");
			int num = input.nextInt();
			// 사용자로부터 n개의 정수를 입력받아 변수 num에 저장
			arr[i] = num; //arr의 i번째 요소에 사용자로부터 입력받은 num을 저장
			average += num; // average에 num을 더함
		}
		System.out.println("\n평균 = " + average/n); // 평균 출력
		System.out.print("\n평균 이상인 값 = ");
		for (int j = 0;j<n;j++){
			if (arr[j]>=average/n){
				System.out.println(arr[j]);
				// 만약 arr의 j번째 요소가 평균 이상이라면 출력
			}
		}
	}
}
