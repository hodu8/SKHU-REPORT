package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_2 : ������\n ");
		Scanner input = new Scanner(System.in);
		MyLinkedStack stack = new MyLinkedStack();
		int menu = 0;
		int sum = 0;
		int number = 0;

		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:�հ� 5:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.print("�������� �ϳ� �Է��ϼ��� : ");
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
