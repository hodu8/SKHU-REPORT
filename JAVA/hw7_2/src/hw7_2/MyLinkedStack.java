package hw7_2;

public class MyLinkedStack {
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}
	private Node top = null;
	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
	public void push(int n) {
		Node newNode = new Node(n);
		top.link = newNode;
		top = top.link;
	}
	public int pop() {
		int temp = top.data;
		top = null;
		return temp;
	}
	public int peek() {
		return top.data;
	}
}
