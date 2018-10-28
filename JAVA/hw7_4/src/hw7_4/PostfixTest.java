/*
 * 파일명 : PostfixTest.java
 * 작성자 : 박찬우
 * 작성일 : 2018.10.28.
 * 설명 : 스택을 이용하여 후위표기 수식의 결과를 계산하는 프로그램
 */

package hw7_4;
import java.util.Stack;
import java.util.Scanner;

public class PostfixTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_4 : 박찬우\n");
		Stack <Double> stack = new Stack <Double>();
		double result = 0;
		System.out.print("후위표기수식 입력 : ");
		String str = input.nextLine();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			double opr1 = 0;
			double opr2 = 0;
			double n = 0;
			if (s[i].charAt(0) == '+') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				result = opr1 + opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("결과 = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '-') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				result = opr1 - opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("결과 = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '*') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				result = opr1 * opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("결과 = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '/') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("잘못된 수식입니다.");
					break;
				}
				result = opr1 / opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("결과 = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) != '+' || s[i].charAt(0) != '-' || s[i].charAt(0) != '*' || s[i].charAt(0) != '/' || s[i].charAt(0) != ' ') {
				n = Double.parseDouble(s[i]);
				stack.push(n);
			}
		}
	}
}