/*
 * ���� : �������̽��� ���� Ŭ����
 * �ۼ��� : 2018.05.30.
 * �ۼ��� : ������
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
		System.out.println("hw9_2: ������\n");

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
		}; // score�� 60�̻��̸� true�� ��ȯ �ƴϸ� false�� ��ȯ�ϴ� PassTester ����Ŭ����
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
		}; // age�� 20 �̻��̸� true�� ��ȯ �ƴϸ� false�� ��ȯ�ϴ� AdultTester ����Ŭ����

		check(kim, PassTester);
		
		check(kim, AdultTester);
	}
}