/*
 * ���ϸ� : PostfixTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.28.
 * ���� : ������ �̿��Ͽ� ����ǥ�� ������ ����� ����ϴ� ���α׷�
 */

package hw7_4;
import java.util.Stack;
import java.util.Scanner;

public class PostfixTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_4 : ������\n");
		Stack <Double> stack = new Stack <Double>();
		double result = 0;
		System.out.print("����ǥ����� �Է� : ");
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
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				result = opr1 + opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("��� = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '-') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				result = opr1 - opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("��� = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '*') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				result = opr1 * opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("��� = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) == '/') {
				if (stack.isEmpty() == false)
					opr2 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false)
					opr1 = stack.pop();
				else {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				if (stack.isEmpty() == false) {
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
				result = opr1 / opr2;
				stack.push(result);
				if (i == s.length-1)
					System.out.println("��� = " + stack.pop());
				continue;
			}
			if (s[i].charAt(0) != '+' || s[i].charAt(0) != '-' || s[i].charAt(0) != '*' || s[i].charAt(0) != '/' || s[i].charAt(0) != ' ') {
				n = Double.parseDouble(s[i]);
				stack.push(n);
			}
		}
	}
}