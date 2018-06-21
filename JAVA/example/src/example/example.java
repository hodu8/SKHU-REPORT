package example;

public class Car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class SportsCar extends Car {
	boolean turbo;
	public void setTurbo(boolean flag) {
		turbo = flag;
	}
}
public class example {
	public static void main(String[] args) {
		SportsCar s = new SportsCar(); // 자식 클래스 객체 생성
		s.speed = 10;
		s.setSpeed(60);
		s.turbo = false;
		s.setTurbo(true);
	}
}
