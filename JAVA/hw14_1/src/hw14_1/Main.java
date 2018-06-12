/*
 * ���� : ���ӷ��� �Է¹޾� �ڵ����� �����ϴ� ���α׷�
 * �ۼ��� : ������
 * �ۼ��� : 2018.06.11.
 */

package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: ������\n");

		// �ӵ��� 50�� �ڵ��� �����Ͽ� �ڵ��� ���� ���
		Car myCar = new Car(50);
		System.out.println(myCar);
		try {
			// ���ӷ��� �Է¹޾� �ڵ��� ����
			Scanner scan = new Scanner(System.in);
			System.out.print("���ӷ� �Է�: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} catch (SpeedUpException e) {
			System.out.println("�ִ� �ӵ� �ʰ��� ���� �Ұ����Ͽ� �ڵ����� ����ϴ�.");
			myCar.stop();
		} catch (InputMismatchException e) {
			System.out.println("���ӷ� �Է� ������ ���� �Ұ����մϴ�.");
		} finally {
			// �ڵ����� ���� ���� ���� ���
			System.out.println(myCar); // � ���ܰ� �߻��ϵ� �ݵ�� ���
		}
	}
}
/* main() �޼ҵ�
      �ڵ��� ���ӷ� �Է��� �� ������ �ƴ� ��(���� ��� aaa)�� �Է��Ͽ� ���ܰ� �߻��ϴ� ��� ���ܸ� ��Ƽ� ������ ���� ó��
       -- ���� �߻� ��Ǹ� �˸��� �ڵ����� �״�� ��

      �ڵ��� ���� �������� SpeedUpException ���� �߻��� ���ܸ� ��Ƽ� ������ ���� ó��
       -- ���� �߻� ����� �˸��� �ڵ����� ����

      �ڵ��� ���� �������� TooSmallExceptoin ���� �߻��� ���ܸ� ��Ƽ� ó������ ���� ������ �����ϵ��� ó��

      ���� �߻� ���ο� ��� ���� �ڵ����� ���� ���� ������ ����ϵ��� �Ѵ�.
 */

class Car {
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // ����
		if(speed + value > MAX_SPEED) {
			throw new SpeedUpException();
		}
		else if (value <= 0) {
			throw new TooSmallException(value);
		}
		else
			speed += value;
	}
	/* speedUp �޼ҵ�
	      �ڵ��� ���ӽ� �ִ� �ӵ��� �ʰ��ϴ� ��� ����� ���� ����(SpeedUpException)�� �߻���Ų��.
   	      �ڵ��� ���ӽ� ���ӷ��� 0 ������ ��� ����� ���� ����(TooSmallException)�� �߻���Ų��.(���� ������ �Ű������� ���ӷ�) */

	public void speedDown(int value) {  // ����
		speed -= value;
	}

	public void stop() { // ����
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception {
}

/* TooSmallException Ŭ���� ����
������(���ӷ�)�� �Ű������� �޴� �����ڸ� �� ��
- �� �����ڴ� �θ� ������ ȣ���� ���� ���ӷ��� ���̾ ���� �̴����� ���� �޽����� �����Ѵ�. */

class TooSmallException extends Exception {
	public TooSmallException(int value) {
		super("���� �̴� " + value);
	}
}