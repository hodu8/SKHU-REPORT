/*
 * 파일명: Point.java
 * 작성일: 2018.4.5
 * 작성자: 박찬우
 * 내용:  x 좌표를 갖는 1차원 점을 표현하는 Point 클래스를 정의
 */

package lab5_4;

public class Point {
	double x=0; // x좌표를 저장할 double형 변수 x선언 및 0으로 초기화
	void move(double offset) {
		x+=offset; // x좌표에 매개변수로 받은 offset값을 더함
	}
	void move() {
		x++; // x좌표에 1을 추가
	}
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
	double distance(Point dis) {
		return Math.abs(x-dis.x); // x에 dis.x를 뺀 값의 절댓값을 반환
	}
}