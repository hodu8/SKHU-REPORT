/*
 * 작성자 : 박찬우
 * 작성일 : 2018.09.04.
 * 주제 : 최소값 검색과 교환
 */
package course1;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("course1 : 박찬우\n");
		int min = 101;
		int index = 0;
		int temp = 0;
		int [] array = new int [10];
		for (int i = 0; i<10; i++){
			int randomNum = (int)((Math.random()*101));
			array[i] = randomNum;
		}
		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		for (int i = 0; i<array.length; i++){
			if(array[i]<min){
				min = array[i];
				index = i;
			}
		}
		System.out.println("\n\n최솟값 = " + min);
		System.out.println("최솟값 인덱스 = " + index + "\n");
		temp = array[0];
		array[0] = array[index];
		array[index] = temp;
		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
	}
}
