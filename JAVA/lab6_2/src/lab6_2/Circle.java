package lab6_2;

public class Circle {
	private double r = 0;
	public Circle () {
		r = 1.0; 
	}
	public Circle (double radius) {
		r = radius;
	}
	public double getRadius () {
		return r;
	}
	public void setRadius (double rad) {
		r = rad;
	}
	public double cirArea () {
		return r*r*Math.PI;
	}
}