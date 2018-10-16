/*
 * 파일명 : StackTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.11.
 * 설명 : java.util 패키지의 Stack 클래스를 이용하는 프로그램
 */

package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1 : 박찬우\n ");
		Scanner input = new Scanner(System.in);
		Stack <Integer> stack = new Stack <Integer> ();
		int menu = 0;
		int sum = 0;
		int number = 0;
		
		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:합계 5:종료 ---> ");
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
				if(stack.empty() == true)
					System.out.println(sum);
				while (stack.empty() != true) {
					sum += stack.pop();
				}
				System.out.println(sum);
				break;
			case 5:
				break;
			}
		} while(menu != 5);
	}
}
