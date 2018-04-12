/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.12.
 */

package lab6_1;

public class Student {
	private int snum; // 학번을 의미하는 정수형 변수 snum 선언

	public int getNum () {
		return snum; // snum을 반환
	}
	public void setNum (int sn) { // 학번을 의미하는 정수형 매개변수 sn을 받아옴
		snum=sn; // snum에 sn을 저장
	}
}