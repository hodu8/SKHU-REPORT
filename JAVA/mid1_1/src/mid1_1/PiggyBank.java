/*
 * ���� : ���������� Ŭ������ �����ϰ� �̿��ϴ� ���α׷�
 * �ۼ��� : ������
 * �ۼ��� : 2018.05.08.
 */
package mid1_1;

public class PiggyBank {
	// (1) 2���� private �ʵ� :
	//    500�� ����(������)�� 100�� ����(������)
	private int ohbaeck = 0;
	private int baeck = 0;
	// (2) 500�� ����, 100�� ������ �Ű������� �޾�
	//    �ʱ�ȭ �ϴ� ������
	public PiggyBank(int ohbaeck, int baeck){
		this.ohbaeck = ohbaeck;
		this.baeck = baeck;
	}
	// (3) add() - 500�� ����, 100�� ������ �Ű������� �޾�
	//     �����ϴ� �޼ҵ�
	public void add(int ohbaeck, int baeck){
		this.ohbaeck += ohbaeck;
		this.baeck += baeck;
	}
	// (4) open() -������������ ���� ���ݾ��� �����ϴ� �޼ҵ�
	//     �������� ���� ���� ���� ������ ��� 0�� �ȴ�.
	public int open(){
		int money = (ohbaeck*500) + (baeck*100);
		ohbaeck = 0;
		baeck = 0;
		return money;
	}
}