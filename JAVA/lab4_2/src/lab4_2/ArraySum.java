/*
작성일 : 2018.03.27.
작성자 : 박찬우
주제 : 배열 원소의 합을 구하는 프로그램
 */
package lab4_2;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("lab4_2 : 박찬우");
		System.out.print("\n정수의 개수 입력 : ");
		int num = input.nextInt();
		// 사용자로부터 입력받은 정수의 개수를 변수 num에 저장
		int arr[] = new int[num]; // 크기가 num인 정수형 배열 arr 선언
		
		for ( int i = 0; i<num; i++ ){
			System.out.print("정수 입력 : ");
			int n = input.nextInt();
			// 사용자로부터 num개 만큼의 정수를 입력받음
			arr[i] = n; // arr의 i번째 요소에 n을 저장
		}
		System.out.println("\n" + sum(arr)); // sum메소드에 매개변수로 arr을 보내 호출한 다음 출력
	}
	private static int sum (int[] array){
		int sum = 0; // 정수들의 합을 저장할 변수 sum 선언 및 0으로 초기화
		
		for ( int x : array){ // x가 array의 요소들로 순서대로 반복함
			sum+=x; // sum에 array의 원소들인 x를 더함
		}
		return sum; // sum을 반환
	}
}
