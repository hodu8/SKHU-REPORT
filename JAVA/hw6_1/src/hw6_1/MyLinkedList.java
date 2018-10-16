/*
 * 파일명 : MyLinkedList.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.03.
 * 설명 : 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스
 */

package hw6_1;

public class MyLinkedList {
	class Node{
		int data;
		Node link;
		Node(int n) {
			data = n;
		}
	}
	private Node head = null;

	public void addFirst (int n) {
		Node t = new Node(n);
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
	public int size() {
		Node t = head;
		int count = 0;
		while(t != null) {
			t = t.link;
			count++;
		}
		return count;
	}
	public void addLast(int n) {
		Node newNode = new Node(n);
		Node t = head;
		while(t != null) {
			if (t.link == null){
				break;
			}
			t = t.link;
		}
		if ( t == null ) {
			newNode.link = head;
			head = newNode;
		}
		else { 
			newNode.link = t.link;
			t.link = newNode;
		}
	}
	public int removeFirst() {
		int number = head.data;
		head = head.link;
		return number;
	}
	public int removeLast() {
		Node pre = head;
		Node temp = head.link;
		while(temp.link != null) {
			pre = temp;
			temp = temp.link;
		}
		int number = pre.link.data;
		pre.link = null;
		return number;
	}
}