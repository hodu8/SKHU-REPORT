/*
 * 파일명 : MyLinkedStack.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.27.
 * 설명 : 정수 자료를 저장하기 위해, 단순 연결리스트로 구현한 정수 스택 클래스
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
