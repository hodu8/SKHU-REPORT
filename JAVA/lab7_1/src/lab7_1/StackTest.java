/*
 * ���ϸ� : StackTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.11.
 * ���� : java.util ��Ű���� Stack Ŭ������ �̿��ϴ� ���α׷�
 */

package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1 : ������\n ");
		Scanner input = new Scanner(System.in);
		Stack <Integer> stack = new Stack <Integer> ();
		int menu = 0;
		int sum = 0;
		int number = 0;
		
		do {
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:�հ� 5:���� ---> ");
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
