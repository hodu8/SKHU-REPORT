/*
 * 파일명 : MyDoublyLinkedListTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.04.
 * 설명 : MyDoublyLinkedList 클래스를 사용하는 드라이버 클래스
 */

package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : 박찬우\n");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list.toString());
		list.printList();
	}

}
