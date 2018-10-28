/*
 * ���ϸ� : MyCharacterStackTest.java
 * �ۼ��� : ������
 * �ۼ��� : 2018.10.28.
 * ���� : ������ �̿��Ͽ� ������ ��ȣ�� �˻��ϴ� ���α׷�
 */

package hw7_3;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_3 : ������\n");
		System.out.print("���� �Է� : ");
		String s = input.nextLine();
		
		
		MyCharacterStack stack = new MyCharacterStack();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '<')
				stack.push(s.charAt(i));
			if (s.charAt(i) == ')')
				if (stack.isEmpty() == true) {
					System.out.println("�߸��� ��ȣ �����Դϴ�.");
					break;
				}
				else if (stack.pop() != '(') {
					System.out.println("�߸��� ��ȣ �����Դϴ�.");
					break;
				}
			if (s.charAt(i) == '>')
				if (stack.isEmpty() == true) {
					System.out.println("�߸��� ��ȣ �����Դϴ�.");
					break;
				}
				else if (stack.pop() != '<') {
					System.out.println("�߸��� ��ȣ �����Դϴ�.");
					break;
				}
			if (i == s.length()-1)
				System.out.println("�ùٸ� ��ȣ �����Դϴ�.");
		}
	}
}