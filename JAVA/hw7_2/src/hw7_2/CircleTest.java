/*
 * 주제 : 원을 다루는 프로그램
 * 작성일 : 2018.05.21.
 * 작성자 : 박찬우
 */

package hw7_2;

public class CircleTest {

	public static void main(String[] args){
		System.out.println("hw7_2 : 박찬우\n");
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));
		// Circle 객체 생성
		
		System.out.println(c2.sameCenter(c1));    // c2와 c1의 중심 점의 x, y좌표가 같은지 비교
		System.out.println(c2.sameCenter(c3));    // c2와 c3의 중심 점의 x, y좌표가 같은지 비교

		printCircle(c2); // c2의 반지름, 중심의 x, y좌표를 출력
	}

	// (1) 매개변수로 받은 원 c의 반지름, 중심의 x, y좌표를
	//     출력하는 메소드
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}
}
