/*
 * ���ϸ� : MyDoublyLinkedListTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.11.
 * ���� : MyDoublyLinkedList Ŭ������ ����ϴ� ����̹� Ŭ����
 */

package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu = 0;
		int number = 0;
		MyDoublyLinkedList list = new MyDoublyLinkedList();

		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("������ �Է��ϼ��� : ");
				number = input.nextInt();
				list.addFirst(number);
				break;
			case 4:
				System.out.print("������ �Է��ϼ��� : ");
				number = input.nextInt();
				list.addLast(number);
				break;
			case 5:
				System.out.println(list.removeFirst());
				break;
			case 6:
				System.out.println(list.removeLast());
				break;
			case 7:
				System.out.print("������ �Է��ϼ��� : ");
				number = input.nextInt();
				System.out.println(list.remove(number));
				break;
			case 8:
				list.printList();
				break;
			case 9:
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ùٸ� �޴��� �Է����ּ���");
			}
		} while(menu != 9);
	}
}
