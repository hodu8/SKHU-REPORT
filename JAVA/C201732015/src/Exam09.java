public class Exam09 {

	static String reverse(String path) {
		// 구현할 부분
		String str = "";
		for (int i = path.length()-1; i >= 0; i--)
            str += path.charAt(i);
		return str;
	}
	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			System.out.println(reverse(s));
	}
}