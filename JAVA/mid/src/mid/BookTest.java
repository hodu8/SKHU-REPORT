package mid;
public class BookTest {
	public static void main(String[] args) {
		System.out.println("mid: 박찬우");
		// (1) 2개의 Book 객체 생성 - book1은 "Java", 20000, book2는 "Database", 30000으로 초기화
		Book book1 = new Book("Java", 20000);
		Book book2 = new Book("Database", 30000);
		// book1, book2에 대해 여러 작업을 수행하는 midExam() 메소드 호출
		midExam(book1);
		midExam(book2);
	}

	private static void midExam(Book book) {

		// (2) 매개변수로 받은 book의 도서명 출력, 가격 출력
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
		// (3) book 가격을 1000원 인상
		book.raisePrice(1000);
		// (4) book의 가격 출력
		System.out.println(book.getPrice());
		// (5) book 가격을 50% 인상
		book.raisePrice(book.getPrice()/2);
		// (6) book의 가격 출력
		System.out.println(book.getPrice());
	}
}