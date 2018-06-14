/*
 * 주제 : 특정 단어를 특정 횟수만큼 반복하여 출력하는 스레드를 2개 생성하여 실행하는 프로그램
 * 작성일 : 2018 .06.14.
 * 작성자 : 박찬우
 */

package hw16_1;

//단어와 반복횟수 정보를 갖는 클래스 WordClass
class WordClass {
	private String word; // 단어
	private int number; // 반복횟수

	// 단어와 반복횟수를 매개변수로 받아 초기화하는 생성자
	public WordClass(String word, int number) {
		this.word = word;
		this.number = number;
	}
	// 단어 getter
	public String getWord() {
		return word;
	}
	// 반복횟수 getter
	public int getNumber() {
		return number;
	}

	// 단어를 반복횟수만큼 한 줄에 출력하는 메소드
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.print(word + " ");
		}
	}
}

//(1) 클래스 Runnable 정의 - WordClass를 상속받고, Runnable을 구현함
class WordRunnable  extends WordClass implements Runnable {
	// (2) 단어와 반복횟수를 매개변수로 받아 초기화하는 생성자
	public WordRunnable(String word, int number) {
		super(word, number);
	}
	// (3) 기타 반드시 필요한 메소드
	@Override
	public void run() {
		// word를 number만큼 반복 출력
		print();
	}

}

public class WordRunnableTest {
	public static void main(String[] args) {
		System.out.println("hw16_1: 박찬우\n");
		// (4) aaa를 5번 출력하는 스레드 t1과 BB를 10번 출력하는 스레드 t2 생성
		Thread t1 = new Thread(new WordRunnable("aaa", 5));
		Thread t2 = new Thread(new WordRunnable("BB", 10));
		// (5) 스레드 t1과 t2를 시작시킴
		t1.start();
		t2.start();
	}
}