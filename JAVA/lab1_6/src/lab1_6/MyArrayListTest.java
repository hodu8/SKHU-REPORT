/*
 * ���ϸ� : MyArrayListTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.10.
 * ���� : ���� ����Ʈ�� ����ϴ� MyArrayListTest
 */

package lab1_6;

public class MyArrayListTest {

	public static void main(String[] args) {
		System.out.println("lab1_6 : ������\n");
		
		MyArrayList list = new MyArrayList();
		
		System.out.println(list.toString());
		list.add(2);
		list.add(-3);
		list.add(0);
		
		System.out.println(list.toString());
	}
}
