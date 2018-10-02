/*
 * ���ϸ� : MyArrayList.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.09.10.
 * ���� : ���� ����Ʈ�� �����ϴ� MyArrayList
 */

package lab1_6;

public class MyArrayList {
	private int[] array;
	private int number;
	
	public MyArrayList() {
		array = new int[10];
		number = 0;
	}
	public boolean add (int n) {
		if(number<10) {
			array[number] = n;
			number++;
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i=0; i<number; i++)
			s += array[i] + " ";
		return "list = " + s;
	}
}