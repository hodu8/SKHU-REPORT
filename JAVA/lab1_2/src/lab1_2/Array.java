package lab1_2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_2 : 박찬우\n");
		int [] arr = new int[10];
		System.out.print("정수값 10개 입력 : ");
		for(int i=0; i<10; i++){
			int n = scan.nextInt();
			arr[i] = n;
		}
		System.out.print("검색할 정수값 입력 : ");
		int n = scan.nextInt();
		for(int j=0; j<10; j++){
			if(arr[j] == n){
				System.out.println("인덱스 = " + j);
				break;
			}
			else if(j==9)
				System.out.println("-1");
		}
	}
}
