/*
 * 주제 : 가속량을 입력받아 자동차를 가속하는 프로그램
 * 작성자 : 박찬우
 * 작성일 : 2018.06.11.
 */

package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: 박찬우\n");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);
		try {
			// 가속량을 입력받아 자동차 가속
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} catch (SpeedUpException e) {
			System.out.println("최대 속도 초과로 가속 불가능하여 자동차를 멈춥니다.");
			myCar.stop();
		} catch (InputMismatchException e) {
			System.out.println("가속량 입력 오류로 가속 불가능합니다.");
		} finally {
			// 자동차의 최종 상태 정보 출력
			System.out.println(myCar); // 어떤 예외가 발생하든 반드시 출력
		}
	}
}
/* main() 메소드
      자동차 가속량 입력할 때 정수가 아닌 값(예를 들어 aaa)을 입력하여 예외가 발생하는 경우 예외를 잡아서 다음과 같이 처리
       -- 예외 발생 사실만 알리고 자동차는 그대로 둠

      자동차 가속 과정에서 SpeedUpException 예외 발생시 예외를 잡아서 다음과 같이 처리
       -- 예외 발생 사실을 알리고 자동차를 멈춤

      자동차 가속 과정에서 TooSmallExceptoin 예외 발생시 예외를 잡아서 처리하지 말고 상위로 전달하도록 처리

      예외 발생 여부와 상관 없이 자동차의 최종 상태 정보를 출력하도록 한다.
 */

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // 가속
		if(speed + value > MAX_SPEED) {
			throw new SpeedUpException();
		}
		else if (value <= 0) {
			throw new TooSmallException(value);
		}
		else
			speed += value;
	}
	/* speedUp 메소드
	      자동차 가속시 최대 속도를 초과하는 경우 사용자 정의 예외(SpeedUpException)를 발생시킨다.
   	      자동차 가속시 가속량이 0 이하인 경우 사용자 정의 예외(TooSmallException)를 발생시킨다.(예외 생성시 매개변수는 가속량) */

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception {
}

/* TooSmallException 클래스 정의
정수값(가속량)을 매개변수로 받는 생성자를 둘 것
- 이 생성자는 부모 생성자 호출을 통해 가속량이 얼마이어서 기준 미달임을 예외 메시지로 지정한다. */

class TooSmallException extends Exception {
	public TooSmallException(int value) {
		super("기준 미달 " + value);
	}
}