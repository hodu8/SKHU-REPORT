package lab15_1;

//MyPair 객체를 생성하고 이용하는 프로그램
public class MyPairTest {
	public static void main(String[] args) {
		System.out.println("lab15_1: 박찬우\n");

		// 문자열을 주/종 원소로 갖는 MyPair 객체 pair를 생성
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");
		
		MyPair<String> studentPair = new MyPair<String>("kim", "park");
		
		MyPair<Integer> integerPair = new MyPair<Integer>(11, 22);

		// 주 원소를 변수에 저장 후 출력
		String master = pair.getMaster();
		System.out.println(master + "팀\n");

		// pair를 출력
		System.out.println(pair);

		// pair의 주/종 원소를 교환
		pair.swap();


		// pair를 출력
		System.out.println(pair);
		System.out.println();
		System.out.println(studentPair);
		studentPair.swap();
		System.out.println(studentPair);
		System.out.println();
		System.out.println(integerPair);
		integerPair.swap();
		System.out.println(integerPair);
	}
}


//String형 주/종 원소를 저장하는 클래스
class MyPair <T>{
	private T master; // 주 원소
	private T slave; // 종 원소

	public MyPair(T master, T slave) { // 생성자
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  주/종 원소를 교환하는 메소드


		// ... (가)
		T temp = this.master;
		this.master = slave;
		this.slave = temp;
	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "주=" + master + " 종=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}