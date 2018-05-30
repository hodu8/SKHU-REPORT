/*
 * 주제 : 인터페이스와 무명 클래스
 * 작성일 : 2018.05.30.
 * 작성자 : 박찬우
 */

package hw9_2;

class Student {
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	boolean test(Student s);
}

public class Main {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s);
		System.out.println(result);
	}

	public static void main(String... args) {
		System.out.println("hw9_2: 박찬우\n");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;

//		class PassTester implements Tester {
//			@Override
//			public boolean test(Student s) {
//				return s.score >= 60;
//			}
//		}
		Tester PassTester = new Tester() {
			public boolean test (Student s) {
				return s.score >= 60;
			}
		}; // score가 60이상이면 true를 반환 아니면 false를 반환하는 PassTester 무명클래스
//		class AdultTester implements Tester {
//			@Override
//			public boolean test(Student s) {
//				return s.age >= 20;
//			}
//		}
		Tester AdultTester = new Tester() {
			public boolean test (Student s) {
				return s.age >= 20;
			}
		}; // age가 20 이상이면 true를 반환 아니면 false를 반환하는 AdultTester 무명클래스

		check(kim, PassTester);
		
		check(kim, AdultTester);
	}
}