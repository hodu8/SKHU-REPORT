package mid;

public class Book {
	private String title;
	private int price = 0;
	public Book (String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public void raisePrice(int price) {
		this.price += price;
	}
}
