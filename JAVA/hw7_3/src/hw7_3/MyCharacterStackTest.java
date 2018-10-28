/*
 * 파일명 : MyCharacterStackTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.28.
 * 설명 : 스택을 이용하여 수식의 괄호를 검사하는 프로그램
 */

package hw7_3;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_3 : 박찬우\n");
		System.out.print("수식 입력 : ");
		String s = input.nextLine();
		
		
		MyCharacterStack stack = new MyCharacterStack();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '<')
				stack.push(s.charAt(i));
			if (s.charAt(i) == ')')
				if (stack.isEmpty() == true) {
					System.out.println("잘못된 괄호 수식입니다.");
					break;
				}
				else if (stack.pop() != '(') {
					System.out.println("잘못된 괄호 수식입니다.");
					break;
				}
			if (s.charAt(i) == '>')
				if (stack.isEmpty() == true) {
					System.out.println("잘못된 괄호 수식입니다.");
					break;
				}
				else if (stack.pop() != '<') {
					System.out.println("잘못된 괄호 수식입니다.");
					break;
				}
			if (i == s.length()-1)
				System.out.println("올바른 괄호 수식입니다.");
		}
	}
}