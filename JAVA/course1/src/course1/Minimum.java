/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.04.
 * ���� : �ּҰ� �˻��� ��ȯ
 */
package course1;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("course1 : ������\n");
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
		System.out.println("\n\n�ּڰ� = " + min);
		System.out.println("�ּڰ� �ε��� = " + index + "\n");
		temp = array[0];
		array[0] = array[index];
		array[index] = temp;
		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
	}
}
