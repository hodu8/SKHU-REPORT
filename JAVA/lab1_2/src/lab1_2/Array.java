package lab1_2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_2 : ������\n");
		int [] arr = new int[10];
		System.out.print("������ 10�� �Է� : ");
		for(int i=0; i<10; i++){
			int n = scan.nextInt();
			arr[i] = n;
		}
		System.out.print("�˻��� ������ �Է� : ");
		int n = scan.nextInt();
		for(int j=0; j<10; j++){
			if(arr[j] == n){
				System.out.println("�ε��� = " + j);
				break;
			}
			else if(j==9)
				System.out.println("-1");
		}
	}
}
