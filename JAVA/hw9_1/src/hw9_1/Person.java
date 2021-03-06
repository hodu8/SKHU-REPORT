/*
 * 주제 : 사람 클래스
 * 작성일 : 2018.05.24.
 * 작성자 : 박찬우
 */

package hw9_1;

public class Person implements Speakable{ // Speakable을 구현
	String name; // 이름 필드
	public Person(String name) {
		this.name = name;
	} // 이름을 매개변수로 받고 초기화하는 생성자
	public String getName() {
		return name;
	} // 이름 getter
	public void setName(String name) {
		this.name = name;
	} // 이름 setter
	@Override
	public void speak() {
		System.out.println("안녕하세요");
	} // speak메소드 오버라이딩
}