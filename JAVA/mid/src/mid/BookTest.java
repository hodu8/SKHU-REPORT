package mid;
public class BookTest {
	public static void main(String[] args) {
		System.out.println("mid: ������");
		// (1) 2���� Book ��ü ���� - book1�� "Java", 20000, book2�� "Database", 30000���� �ʱ�ȭ
		Book book1 = new Book("Java", 20000);
		Book book2 = new Book("Database", 30000);
		// book1, book2�� ���� ���� �۾��� �����ϴ� midExam() �޼ҵ� ȣ��
		midExam(book1);
		midExam(book2);
	}

	private static void midExam(Book book) {

		// (2) �Ű������� ���� book�� ������ ���, ���� ���
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
		// (3) book ������ 1000�� �λ�
		book.raisePrice(1000);
		// (4) book�� ���� ���
		System.out.println(book.getPrice());
		// (5) book ������ 50% �λ�
		book.raisePrice(book.getPrice()/2);
		// (6) book�� ���� ���
		System.out.println(book.getPrice());
	}
}