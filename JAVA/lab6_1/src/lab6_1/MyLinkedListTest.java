/*
 * 파일명 : MyLinkedListTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.09.27.
 * 주제 : 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 사용하는 드라이버 클래스
 */

package lab6_1;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("lab6_1 : 박찬우\n");
		MyLinkedList list = new MyLinkedList();
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
	}
}