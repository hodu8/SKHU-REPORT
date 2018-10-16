/*
 * 파일명 : MyDoublyLinkedList.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.04.
 * 설명 : 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스
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
	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
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