/*
 * ���ϸ� : MyArrayStackTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.27.
 * ���� : MyArrayStack Ŭ������ ����ϴ� ����̹� Ŭ����
 */

package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : ������\n ");
		Scanner input = new Scanner(System.in);
		MyArrayStack stack = new MyArrayStack(5);
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