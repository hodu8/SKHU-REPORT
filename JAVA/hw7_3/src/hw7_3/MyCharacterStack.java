/*
 * 파일명 : MyCharacterStack.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.28.
 * 설명 : 연결리스트를 이용하여 구현한 문자 스택 클래스
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