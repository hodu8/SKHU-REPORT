/*
 * 주제 : 과정지도 기말고사
 * 작성자 : 박찬우
 * 작성일 : 2018.06.21.
 */

public class Student {
	private int math;
	public Student (int math){
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "math = " + Integer.toString(math);
	}
	public boolean isPass() {
		if (math >= 60)
			return true;
		else
			return false;
	}
}