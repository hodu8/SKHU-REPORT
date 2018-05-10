package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab7_2 : ¹ÚÂù¿ì\n");
		UnderGraduate student1 = new UnderGraduate(11, 1.5);
		GraduateStudent student2 = new GraduateStudent(222, 1.5);
		
		System.out.println(student1.getId() + " " + student1.getScore() + " " + student1.warning());
		System.out.println(student2.getId() + " " + student2.getScore() + " " + student2.warning());
	}
}
