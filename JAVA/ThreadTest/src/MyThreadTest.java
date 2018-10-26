/*
 * 작성자 : 박찬우
 * 작성일 : 2018.10.25.
 * 설명 : 2개 이상의 쓰레드를 만들어서 실행시키는 프로그램
 */

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run(){
		for(int i = 0; i < 5; i++) {
			System.out.print(getName() + i + " ");
		}
	}
}
public class MyThreadTest {
	public static void main(String[] args) {

		Thread t1 = new MyThread("A"); 
		Thread t2 = new MyThread("B");
		t1.start();
		t2.start();
		System.out.println("활동중인 스레드 수 = " + Thread.activeCount());
	}
}