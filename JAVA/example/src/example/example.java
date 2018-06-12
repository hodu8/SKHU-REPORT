package example;

public class example {
	public static void main(String[] args) {
		System.out.println("A");
		f();
		System.out.println("B");
	}
	public static void f() {
		try {
			System.out.println("C");
			System.out.println(6/0);
			System.out.println("D");
		} catch (NumberFormatException e) {
			System.out.println("E");
		} finally {
			System.out.println("F");
		}
		System.out.println("G");
	}
}