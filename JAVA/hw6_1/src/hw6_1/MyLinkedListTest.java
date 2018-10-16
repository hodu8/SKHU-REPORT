/*
 * ���ϸ� : MyLinkedListTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.03.
 * ���� : MyLinkedList Ŭ������ ����ϴ� ����̹� Ŭ����
 */

package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1 : ������\n");
		Scanner input = new Scanner(System.in);
		int menu = 0;
		int n = 0;
		MyLinkedList list = new MyLinkedList();
		do {
			System.out.print(" 1:��ü��ȸ  2:������ȸ  3:�Ǿջ���  4:�ǵڻ���  5:�Ǿջ���  6:�ǵڻ���  7:���� ----> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("������ �Է� : ");
				n = input.nextInt();
				list.addFirst(n);
				break;
			case 4:
				System.out.print("������ �Է� : ");
				n = input.nextInt();   
				list.addLast(n);
				break;
			case 5:
				System.out.println(list.removeFirst());
				break;
			case 6:
				System.out.println(list.removeLast());
				break;
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ���� : �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}
}