/*
 * 주제 : 과정지도 기말고사
 * 작성자 : 박찬우
 * 작성일 : 2018.06.21.
 */

public class SwStudent extends Student{
	private int java;
	public SwStudent(int math, int java) {
		super(math);
		this.java = java;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	@Override
	public String toString() {
		return "math = " + Integer.toString(getMath()) + " java = " + Integer.toString(java);
	}
	@Override
	public boolean isPass() {
		if (getMath() >= 60 && java >= 60)
			return true;
		else
			return false;
	}
}
