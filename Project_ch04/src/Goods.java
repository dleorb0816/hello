
public class Goods {
	String name;
	int price;
	int numberOfstock;
	int sold;
	
	
	Goods(){
		name = "Nikon";
		price = 400000;
		numberOfstock = 30;
		sold = 50;
	}
	void setName(String s) {
		name = s;
	}
	
	void setPrice(int a) {
		price = a;
	}
	
	void setnumberOfstock(int a) {
		numberOfstock = a;
	}
	
	void setSold(int a) {
		sold = a;
	}
	
	String getname() {
		return name;
	}
	
	int getprice() {
		return price;
	}
		
	int getnumberOfstock() {
		return numberOfstock;
	}
	
	int getSold() {
		return sold;
	}
		
}


