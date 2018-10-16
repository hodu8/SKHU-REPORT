/*
 * ���ϸ� : MyDoublyLinkedList.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.04.
 * ���� : ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ����
 */
package lab6_2;

public class MyDoublyLinkedList {
	private class Node {
		int data;
		Node rlink;
		Node llink;
		Node(int n) {
			data = n;
		}
	}
	private Node head = null;
	public void addFirst(int n) {
		Node t = new Node(n);
		if (head == null) {
			head = t;
		}
		else {
		t.rlink = head;
		head.llink = t;
		head = t;
		}
	}
	@Override
	public String toString() {
		String list = "";
		Node l = head;
		while(l != null) {
			list += l.data + " ";
			l = l.rlink;
		}
		return "list = " + list;
	}
	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("(");
			Node temp = head;
			
			while(temp.rlink != null) {
				System.out.print(" " + temp.data);
				temp = temp.rlink;
			}
			System.out.print(" " + temp.data);
			System.out.print(" )");
			System.out.print("(");
			while(temp != null) {
				System.out.print(" " + temp.data);
				temp = temp.llink;
			}
			System.out.print(" )");
		}
	}
}