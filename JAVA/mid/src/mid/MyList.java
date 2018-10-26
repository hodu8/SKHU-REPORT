package mid;

public class MyList {

	// ����Ʈ ��� ������ ǥ���ϴ� Ŭ����
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}

	// ����Ʈ�� �� �� ���Ҹ� ����Ű�� �ν��Ͻ� ����
	private Node head = null;

	// (4) item�� ����Ʈ�� �� �տ� �����ϴ� �޼ҵ�
	public void addFirst(int item) {
		Node newNode = new Node(item);
		newNode.link = head;
		head = newNode;
	}

	// (5) ����Ʈ�� ���� ���� �����ϴ� �޼ҵ�(�� �޼ҵ� ���� ��¹� ����)
	public int getSum() {
		int sum = 0;
		Node n = head;
		while (n != null) {
			sum += n.data;
			n = n.link;
		}
		return sum;
	}
}