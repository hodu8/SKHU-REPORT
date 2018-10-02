/*
 * 파일명 : MyMatrixService.java
 * 작성자 : 박찬우
 * 작성일 : 2018.09.26.
 * 설명 : 2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램
 */

package hw5_2;

public class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
	public static int[][] multiply(int [][]a, int [][]b) {
		int aColLen = a[0].length; // aColLen = aColumnLength
		int rColLen = b[0].length; // rColLen = resultColumnLength
		int rRowLen = a.length; // rRowLen = resultRowLength
		int[][] result = new int[rRowLen][rColLen];
		for(int i = 0; i < rRowLen; i++) {
			for(int j = 0; j < rColLen; j++) {
				for(int k = 0; k < aColLen; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] m) { // m = matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}
}