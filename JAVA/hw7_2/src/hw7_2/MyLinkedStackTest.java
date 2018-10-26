package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_2 : 박찬우\n ");
		Scanner input = new Scanner(System.in);
		MyLinkedStack stack = new MyLinkedStack();
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
				if(stack.isEmpty() == true)
					System.out.println(sum);
				while (stack.isEmpty() != true) {
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
