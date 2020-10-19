
public class Goods2 {
	// 1.멤버변수
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	// 생성자 - 멤버변수 초기값 할당,
	Goods2(String n, int p, int nStack, int s) {
		this.name = n;
		this.price = p;
		this.numberOfStock = nStack;
		this.sold = s;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumberOfStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}

}
