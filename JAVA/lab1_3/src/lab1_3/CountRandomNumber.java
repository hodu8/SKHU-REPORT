/*
 * �ۼ��� : 2018.08.30.
 * �ۼ��� : ������
 * ���� : ���� �ѹ�
 */

package lab1_3;

public class CountRandomNumber {

	public static void main(String[] args) {
		System.out.println("lab1_3 : ������\n");
		int arr [] = new int[10];
		for (int i=0; i<10; i++){
			int randomNum = (int)((Math.random()*4)+1);
			arr[i] = randomNum;
		}
		System.out.print("���� �ѹ� = ");
		for (int j=0; j<10; j++)
			System.out.print(" " + arr[j]);
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for (int k=0; k<10; k++){
			if (arr[k] == 1)
				one++;
			else if (arr[k] == 2)
				two++;
			else if (arr[k] == 3)
				three++;
			else
				four++;
		}
		System.out.println("\n1�� ���� = " + one);
		System.out.println("2�� ���� = " + two);
		System.out.println("3�� ���� = " + three);
		System.out.println("4�� ���� = " + four);
	}

}
