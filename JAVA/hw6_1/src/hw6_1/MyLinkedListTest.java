/*
 * 파일명 : MyLinkedListTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.03.
 * 설명 : MyLinkedList 클래스를 사용하는 드라이버 클래스
 */

package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1 : 박찬우\n");
		Scanner input = new Scanner(System.in);
		int menu = 0;
		int n = 0;
		MyLinkedList list = new MyLinkedList();
		do {
			System.out.print(" 1:전체조회  2:길이조회  3:맨앞삽입  4:맨뒤삽입  5:맨앞삭제  6:맨뒤삭제  7:종료 ----> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("정수값 입력 : ");
				n = input.nextInt();
				list.addFirst(n);
				break;
			case 4:
				System.out.print("정수값 입력 : ");
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
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류 : 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}