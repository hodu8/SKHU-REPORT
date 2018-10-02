/*
 * 파일명 : MyArrayList.java
 * 작성자 : 박찬우
 * 작성일 : 2018.09.10.
 * 설명 : 정수 리스트를 관리하는 MyArrayList
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