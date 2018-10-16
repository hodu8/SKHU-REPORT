/*
 * 파일명 : MyDoublyLinkedList.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.11.
 * 설명 : 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스
 */

package hw6_2;

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
			System.out.print(" )\n");
		}
	}
	public int size() {
		Node t = head;
		int count = 0;
		while(t != null) {
			t = t.rlink;
			count++;
		}
		return count;
	}
	public void addLast(int n) {
		Node newNode = new Node(n);
		Node t = head;
		while(t != null) {
			if (t.rlink == null){
				break;
			}
			t = t.rlink;
		}
		if ( t == null ) {
			newNode.rlink = head;
			head = newNode;
		}
		else { 
			newNode.rlink = t.rlink;
			t.rlink = newNode;
		}
	}
	public int removeFirst() {
		int number = head.data;
		head = head.rlink;
		return number;
	}
	public int removeLast() {
		Node pre = head;
		Node temp = head.rlink;
		while (temp.rlink != null) {
			pre = temp;
			temp = temp.rlink;
		}
		int number = pre.rlink.data;
		pre.rlink = null;
		return number;
	}
	public boolean remove(int n) {
		Node t = head;
		if (head.data == n) {
			head = head.rlink;
			return true;
		}
		while(t != null) {
			if (t.rlink == null)
				break;
			if (t.rlink.data == n) {
				if (t.rlink.rlink != null)
					t.rlink = t.rlink.rlink;
				else
					t.rlink = null;
				return true;
			}
			else
				t = t.rlink;
		}
		return false;
	}
}