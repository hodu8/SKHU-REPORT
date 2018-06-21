/*
 * 주제 : 과정지도 기말고사
 * 작성자 : 박찬우
 * 작성일 : 2018.06.21.
 */

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("final: 박찬우\n");
		Student[] s = new Student[4];
		s[0] = new Student(60);
		s[1] = new Student(50);
		s[2] = new SwStudent(60, 70);
		s[3] = new SwStudent(60, 50);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString() + " --> " + s[i].isPass());
		}
	}

}
