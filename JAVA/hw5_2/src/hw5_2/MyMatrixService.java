/*
 * ���ϸ� : MyMatrixService.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.26.
 * ���� : 2���� ���� �迭�� ǥ���� ����� ���� ���Ͽ� ����ϴ� ���α׷�
 */

package hw5_2;

public class MyMatrixService {
	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
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
	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
	public static void print(int[][] m) { // m = matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}
}