package ds;

class Mobile {
	String brand;
	double price;
	int cam;

	public Mobile(String brand, double price, int cam) {
		super();
		this.brand = brand;
		this.price = price;
		this.cam = cam;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", cam=" + cam + "]";
	}

}

class Book {
	String title;
	double price;
	String author;

	public Book(String title, double price, String author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + author + "]";
	}
}

class Cart 
{
	private static Object[] arr1 = new Object[4];
	private static int index = 0;

	public static void addProduct(Object ref) {

		if (index < arr1.length) 
		{
			arr1[index++] = ref;
			System.out.println("product added to cart");
		} 
		else
			System.out.println("cart is full");
	}

	public static void showCart() {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != null)
				System.out.println(arr1[i]);
			else
				return;
		}
	}

}

public class Mainclass2 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", 1323.1, 16);
		Book b1 = new Book("T1", 112, "Author1");
		
		Cart.addProduct(b1);
		Cart.addProduct(m1);
		Cart.addProduct(b1);
		Cart.addProduct(m1);
		Cart.addProduct(b1);
		Cart.showCart();
	}
}
