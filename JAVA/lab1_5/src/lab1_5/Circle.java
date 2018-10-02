/*
 * 작성자 : 박찬우
 * 작성일 : 2018.09.06.
 * 주제 : 클래스 작성, 객체 생성과 사용
 */

package lab1_5;

class Circle {
	private int radius;
	public Circle () {
		radius = 1;
	}
	public Circle (int radius) {
		this.radius = radius;
	}
	public int getRadius () {
		return radius;
	}
	public void setRadius (int radius) {
		this.radius = radius;
	}
	public double getArea () {
		return radius*radius*3.14;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
