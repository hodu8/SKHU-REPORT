/*
 * 파일명 : MyArrayStack.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.27.
 * 설명 : 정수 자료를 저장하기 위해, 순차 자료구조로 구현한 정수 스택 클래스
 */

package hw7_1;

public class MyArrayStack {
	private int top;
	private int stackSize;
	private int[] array;
	public MyArrayStack() {
		top = -1;
		stackSize = 5;
		array = new int[5];
	}
	public MyArrayStack(int n) {
		top = -1;
		stackSize = n;
		array = new int[n];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == stackSize-1;
	}
	public void push(int n) {
		if (isFull())
			throw new IndexOutOfBoundsException();
		else
			array[++top] = n;
	}
	public int pop() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();
		else
			return array[top--];
	}
	public int peek() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();
		else
			return array[top];
	}
}
