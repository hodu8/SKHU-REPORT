package lab14_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_3: ������\n");

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
			System.out.println("�ְ� �ӵ� �ʰ�");
			myCar.stop();
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}

		// �ڵ��� ���� ���
		System.out.println(myCar);
	}
}

class Car {
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException {  // ����
		if(speed + value > MAX_SPEED)
			throw new SpeedUpException();
		speed += value;
	}

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