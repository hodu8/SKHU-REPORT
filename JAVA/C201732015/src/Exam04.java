public class Exam04 {

	public static void doSomething(String s) {
		// ������ �κ�
		for (int i = 0; i < s.length(); i++) {
			System.out.print("(" + s.charAt(i) + ") ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a) 
			doSomething(s);
	}
}