/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.25.
 * ���� : 2�� �̻��� �����带 ���� �����Ű�� ���α׷�
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
		System.out.println("Ȱ������ ������ �� = " + Thread.activeCount());
	}
}