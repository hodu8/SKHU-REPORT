/*
 * ���� : ������� Ŭ������ ����ϴ� �Ϲݰ���, ���̳ʽ�������� Ŭ������ ����ϴ� ���α׷�
 * �ۼ��� : 2018.05.20.
 * �ۼ��� : ������
 */

package hw7_1;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : ������\n");
		Scanner scan = new Scanner(System.in);
		NormalAccount acc1 = new NormalAccount(11, 1000);
		NormalAccount acc2 = new NormalAccount(22);
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);
		MinusAccount acc4 = new MinusAccount(44, 500);
		// �Ϲ� ���� 2��, ���̳ʽ����� ���� 2�� ����
		
		System.out.println("�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getLimit()));
		// 4�� ������ �ִ� ��� ���ɾ� ���� ���
		
		System.out.print("\n��ݾ� �Է� : ");
		int wamount = scan.nextInt();
		// ����ڷκ��� �Է¹��� ��ݾ��� wamount(withdraw_amount)�� ����

		acc1.withdraw(wamount);
		acc2.withdraw(wamount);
		acc3.withdraw(wamount);
		acc4.withdraw(wamount);
		// 4���� ���¿��� ���� ��� ����
		
		System.out.print("\n�Աݾ� �Է� : ");
		int damount = scan.nextInt();
		// ����ڷκ��� �Է¹��� �Աݾ��� damount(deposit_amount)�� ����
		
		acc1.deposit(damount);
		acc2.deposit(damount);
		acc3.deposit(damount);
		acc4.deposit(damount);
		// 4�� ���¿� ���� �Ա� ����
		
		System.out.println("\n�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getLimit()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getLimit()));
		//4�� ������ �ִ� ��� ���ɾ� ���� ���
	}

}
