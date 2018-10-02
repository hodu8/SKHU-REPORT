/*
 * 파일명 : MyArrayList.java
 * 작성자 : 박찬우
 * 작성일 : 2018.09.19.
 * 설명 : 정수 리스트를 관리하는 MyArrayList 클래스
 */

package hw5_1;

public class MyArrayList <T> {
	private int[] array;
	private int number;

	public MyArrayList() {
		array = new int[10];
		number = 0;
	}

	public boolean add(int n) {
		if (number < array.length) {
			array[number] = n;
			number++;
			return true;
		}
		else {
			int[] arrayCopy = new int[array.length*2];
			for (int i = 0; i < array.length; i++) {
				arrayCopy[i] = array[i];
			}
			array = arrayCopy;
			array[number] = n;
			number++;
			return true;
		}
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < number; i++)
			s.append(array[i] + " ");
		return "list = " + s;
	}

	public int get(int index) {
		if(index < number) {
			return array[index];
		}
		else
			throw new IndexOutOfBoundsException();
	}

	public int size() {
		return number;
	}

	public void add(int index, int element) {
		if(index < number) {
			int temp = array[index];
			array[index] = element;
			number++;
			for (int i = number; i > index+1; i--) {
				array[i] = array[i-1];
			}
			array[index+1] = temp;
		}
		else
			throw new IndexOutOfBoundsException();
	}
	public int remove(int index) {
		int element = array[index];
		if (index < number) {
			for (int i = 0; i < number; i++) {
				if(array[i] == array[index]) {
					for (int j = i; j < number; j++) {
						array[j] = array[j+1];
					}
					number--;
				}
			}
		}
		else
			throw new IndexOutOfBoundsException();
		return element;
	}
}