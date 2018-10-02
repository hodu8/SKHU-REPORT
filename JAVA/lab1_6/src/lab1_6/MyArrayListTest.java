/*
 * 파일명 : MyArrayListTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.09.10.
 * 설명 : 정수 리스트를 사용하는 MyArrayListTest
 */

package lab1_6;

public class MyArrayListTest {

	public static void main(String[] args) {
		System.out.println("lab1_6 : 박찬우\n");
		
		MyArrayList list = new MyArrayList();
		
		System.out.println(list.toString());
		list.add(2);
		list.add(-3);
		list.add(0);
		
		System.out.println(list.toString());
	}
}
