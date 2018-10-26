/*
 * ���ϸ� : MyLinkedStack.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.27.
 * ���� : ���� �ڷḦ �����ϱ� ����, �ܼ� ���Ḯ��Ʈ�� ������ ���� ���� Ŭ����
 */

package hw7_2;

public class MyLinkedStack {
	private class Node {
		int data;
		Node link;
	}
	private Node top = null;
	
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(int n) {
		Node newNode = new Node();
		newNode.data = n;
		newNode.link = top;
		top = newNode;
	}
	public int pop() {
		if(isEmpty())
			throw new IndexOutOfBoundsException();
		else {
			int n = top.data;
			top = top.link;
			return n;
		}
	}
	public int peek() {
		if(isEmpty())
			throw new IndexOutOfBoundsException();
		else
			return top.data;
	}
}
