/*
 * ���ϸ� : MyDoublyLinkedListTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.04.
 * ���� : MyDoublyLinkedList Ŭ������ ����ϴ� ����̹� Ŭ����
 */

package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : ������\n");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list.toString());
		list.printList();
	}

}
