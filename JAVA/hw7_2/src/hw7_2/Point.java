/*
 * 주제 : 점을 표현하는 클래스
 * 작성일 : 2018.05.21.
 * 작성자 : 박찬우
 */

package hw7_2;

public class Point {
	private int x; // x 좌표
	private int y; // y 좌표

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} // x와 y를 매개변수로 받아 초기화하는 생성자
	
	public int getX() {
		return x;
	} // x좌표 getter
	public int getY() {
		return y;
	} // y좌표 getter
}

