/*
[lab4_1] 정수 배열
---------------------------------------------------------
다음과 같은 프로그램을 작성하시오.

(1) 사용자로부터 배열 길이(size)를 입력받음
(2) 길이가 size인 배열을 생성
(3) 사용자로부터 size 개의 정수값을 입력받아 배열에 저장
(4) 배열의 원소를 순서대로 모두 출력
(5) 배열의 원소를 순서대로 모두 출력

- 실행 예:
lab4_1: 홍길동

배열 길이 입력: 5

5개의 정수 입력: 12 13 14 15 -16

배열 = 12 13 14 15 -16
배열 = 12 13 14 15 -16
 */

package lab4_1;
import java.util.Scanner;
public class intArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("lab4_1 : 박찬우");

		System.out.println("배열 길이 입력 : ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.println("5개의 정수 입력 : ");
		for (int i=0; i<5; i++){
			int n = input.nextInt();
			arr[i] = n;
		}
		
		System.out.print("배열 = ");
		for (int j=0;j<5;j++){
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		
		System.out.print("배열 = ");
		for (int k=0;k<5;k++){
			System.out.print(arr[k] + " ");
		}
	}
}
