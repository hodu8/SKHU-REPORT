/*
 * ���ϸ� : MyLinkedListTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.27.
 * ���� : ���������� �ܼ� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ������ ����ϴ� ����̹� Ŭ����
 */

package lab6_1;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("lab6_1 : ������\n");
		MyLinkedList list = new MyLinkedList();
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
	}
}