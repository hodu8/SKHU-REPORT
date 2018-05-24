/*
 * 주제 : 개 클래스
 * 작성일 : 2018.05.24.
 * 작성자 : 박찬우
 */

package hw9_1;

public class Dog implements Speakable{ // Speakable을 구현
	int age; // 나이 필드
	public Dog (int age) {
		this.age = age;
	} // 나이를 매개변수로 받고 초기화하는 생성자
	public int getAge() {
		return age;
	} // 나이 getter
	public void setAge(int age) {
		this.age = age;
	} // 나이 setter
	@Override
	public void speak() {
		for (int i = 0; i < age; i++) {
			System.out.print("멍");
		} // speak메소드 오버라이딩
	}
}
