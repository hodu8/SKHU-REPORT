/*
�ۼ��� : ������
�ۼ��� : 2018.04.02.
���� : ���������� ������ �̵� ��ο� ��ǥ�� ã�Ҵ°��� �˾ƺ��� ���α׷�
 */

package hw4_2;

public final class RandomWalk {

	public static void main(String[] args) {

		boolean tile[][] = new boolean[5][5]; // boolean�� 2���� �迭 tile ����
		int x=0; // ��ǥ�� x���� ������ ���� x ����
		int y=0; // ��ǥ�� y���� ������ ���� y ����
		int xg=(int)(Math.random()*5); // ��ǥ ������ x��ǥ�� ������ ���� xg(xgoal) ����
		int yg=(int)(Math.random()*5); // ��ǥ ������ y��ǥ�� ������ ���� yg(ygoal) ����
		int steps=0; // �� �õ� Ƚ���� ������ ���� steps ���� �� 0���� �ʱ�ȭ

		System.out.println("hw4_2 : ������");
		System.out.println("\n��� = (0,0)");
		System.out.println("��ǥ = (" + yg + "," + xg + ")");
		System.out.print("�̵� ��� = ");

		for (steps=0; steps<20 ; steps++) {
			int dir=(int)(Math.random()*4); // �̵� ������ ������ ���� dir ����
			if (dir == 0 && x<4)
				x++;
			// ���� dir�� 0�̰� x�� 4���� �۴ٸ� x�� 1�� ����
			else if (dir == 1 && x>0)
				x--;
			// ���� dir�� 1�̰� x�� 0���� ũ�ٸ� x�� 1�� ��
			else if (dir == 2 && y<4 )
				y++;
			// ���� dir�� 2�̰� y�� 4���� �۴ٸ� y�� 1�� ����
			else if (dir == 3 && y>0)
				y--;
			// ���� dir�� 3�̰� y�� 0���� ũ�ٸ� y�� 1�� ��

			tile[y][x]=true; // (y,x) ��ǥ�� true ���� ����
			System.out.print("(" + y + "," + x + ")"); // �̵� ��� ���

			if (x == xg && y == yg)
				break;
			// ���� x,y�� xg,yg�� ��ġ�Ѵٸ� �ݺ��� �����
		}

		System.out.println("\n------");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i == 0 && j == 0)
					System.out.print("S");
				// ���� i�� j�� 0�̶�� S(���� ����)�� ǥ��
				else if (i == yg && j == xg)
					System.out.print("G");
				// ���� i�� yg�̰� j�� xg��� G(��ǥ ����)�� ǥ��
				else if (tile[i][j] == true)
					System.out.print("#");
				// ���� (i,y)��ǥ�� true���̶�� #�� ǥ��
				else
					System.out.print(".");
				// ���������� �������� ���� �ڸ���� .�� ǥ��
			}
			System.out.println(); // �ݺ����� �ѹ��� �������� �� �ٲ�
		}
		System.out.println("------");

		if (x == xg && y == yg) {
			System.out.println("����");
			System.out.println("�� �õ� Ƚ�� = " + (steps+1));
			// ���� ���������� ��ǥ ������ �����ߴٸ� "����"�� ����ϰ� �� �õ� Ƚ���� 1�� ���� ���� ���
		}
		else
			System.out.println("����");
		// ���� ���������� ��ǥ ������ �������� ���ߴٸ� "����"�� ���
	}
}
