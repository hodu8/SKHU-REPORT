/*
 * 파일명 : MyDoublyLinkedListTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.11.
 * 설명 : MyDoublyLinkedList 클래스를 사용하는 드라이버 클래스
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
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:삭제 8:왕북출력 9:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("정수를 입력하세요 : ");
				number = input.nextInt();
				list.addFirst(number);
				break;
			case 4:
				System.out.print("정수를 입력하세요 : ");
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
				System.out.print("정수를 입력하세요 : ");
				number = input.nextInt();
				System.out.println(list.remove(number));
				break;
			case 8:
				list.printList();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("올바른 메뉴를 입력해주세요");
			}
		} while(menu != 9);
	}
}
