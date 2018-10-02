/*
 * ���ϸ� : MyLinkedList.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.27.
 * ���� : ���������� �ܼ� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ����
 */

package lab6_1;

public class MyLinkedList {
	private class Node{
		int data;
		Node link;
		Node(int x) {
			data = x;
		}
	}
	private Node head = null;
	public void addFirst (int x) {
		Node t = new Node(x);
		t.link = head;
		head = t;
	}
	@Override
	public String toString() {
		String list = " ";
		Node l = head;
		while(l != null) {
			list += (l.data + " ");
			l = l.link;
		}
		return "list =" + list;
	}
}