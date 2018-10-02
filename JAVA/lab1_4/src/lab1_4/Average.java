/*
 * 작성자 : 박찬우
 * 작성일 : 2018.09.03.
 * 주제 : 평균 구하기
 */

package lab1_4;
import java.util.Scanner;

public class Average {
	public static double getAverage(int[] arr){
		double sum = 0;
		for (int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_4 : 박찬우\n");
		System.out.print("정수 개수 입력 : ");
		int n = scan.nextInt();
		int [] array = new int[n];
		System.out.print(n + "개의 정수 입력 : ");
		for (int i=0; i<n; i++){
			array[i] = scan.nextInt();
		}
		System.out.println("평균 = " + getAverage(array));
	}
}
