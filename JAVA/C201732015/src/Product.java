import java.util.Comparator;

public class Product {
	int id; String name;
	int price;
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return ("{" + this.id + ", " + this.name + ", " + this.price + "}");
	}
	
}

class ProductComparator implements Comparator <Product> {
	@Override
	public int compare(Product p1, Product p2) {
		int p = p1.price - p2.price;
		int n = p1.name.compareTo(p2.name);
		if (n != 0)
			return n;
		if (p != 0)
			return p;
		return p1.id - p2.id;
	}
	
}