/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.12.
 * 주제 : 학생 객체를 생성하고 학생 학번을 적절히 지정하고 학생 객체의 학번을 조회하여 출력하는 프로그램
 */

package lab6_1;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab6_1 : 박찬우");
		Student s = new Student(); // Student 객체 s를 생성
		s.setNum(201732015); // setNum 메소드에 학번을 매개변수로 보냄
		System.out.println((s.getNum())); // getNum 메소드를 호출해 학번 출력
	}
}
