/*
 * ���ϸ� : MyCharacterStack.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.28.
 * ���� : ���Ḯ��Ʈ�� �̿��Ͽ� ������ ���� ���� Ŭ����
 */

package hw7_3;

public class MyCharacterStack {
	private class Node {
		char data;
		Node link;
	}
	private Node top = null;
	
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(char c) {
		Node newNode = new Node();
		newNode.data = c;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if(isEmpty())
			throw new IndexOutOfBoundsException();
		else {
			char c = top.data;
			top = top.link;
			return c;
		}
	}
	public char peek() {
		if(isEmpty())
			throw new IndexOutOfBoundsException();
		else
			return top.data;
	}
}