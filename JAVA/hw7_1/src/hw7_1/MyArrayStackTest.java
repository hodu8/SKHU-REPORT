/*
 * 파일명 : MyArrayStackTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.27.
 * 설명 : MyArrayStack 클래스를 사용하는 드라이버 클래스
 */

package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : 박찬우\n ");
		Scanner input = new Scanner(System.in);
		MyArrayStack stack = new MyArrayStack(5);
		int menu = 0;
		int sum = 0;
		int number = 0;

		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:합계 5:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.print("정수값을 하나 입력하세요 : ");
				number = input.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println(stack.peek());
				break;
			case 4:
				if(stack.isEmpty() == true) {
					System.out.println(sum);
					break;
				}
				while (stack.isEmpty() != true) {
					sum += stack.pop();
				}
				System.out.println(sum);
				sum = 0;
				break;
			case 5:
				break;
			}
		} while(menu != 5);
	}
}