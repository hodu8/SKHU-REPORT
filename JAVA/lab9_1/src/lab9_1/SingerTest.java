package lab9_1;

//Singer 인터페이스
interface Singer {
	void sing(); // 노래함
}
//Singer를 구현한 Person 클래스
class Person implements Singer {
	public void sing() {
		System.out.println("도레미파솔라시도");
	}
}
//(1) Singer를 구현한 Dog 클래스 - 멍멍 이라고 노래함
class Dog implements Singer {
	public void sing() {
		System.out.println("멍멍");
	}
}
//MicSystem 클래스
class MicSystem {
	// Singer를 매개변수로 받아 마이크 테스트 하는 메소드
	public void micTest(Singer singer) {
		System.out.println("마이크 테스트. 노래 시작합니다.");
		singer.sing();
	}
}
//Singer 인터페이스를 테스트하는 클래스
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_1: 박찬우\n");

		// 마이크 시스템 객체를 생성
		MicSystem mic = new MicSystem();

		// Person 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Person());
		// (2) Dog 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Dog());
		// (3) 야옹 이라고 노래하는 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Singer() {
			@Override
			public void sing() {
				System.out.println("야옹");
			}
		});
		// 4. 삐약삐약이라고 노래하는 메소드를 람다식으로 마이크 테스트 매개변수로 전달
		mic.micTest(() -> System.out.println("삐약삐약"));
	}
}