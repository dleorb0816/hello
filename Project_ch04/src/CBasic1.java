//goods
public class CBasic1 {
	//String name;
	//int price;
	//int numberOfstock;
	//int sold;
	
	public static void main(String[] args) {
		Goods camera= new Goods();
		Goods camera1= new Goods();
		Goods camera2 = new Goods();
		
		System.out.println("상품이름:" + camera.getname());
		System.out.println("상품 가격:" + camera.getprice());
		System.out.println("재고 수량:" + camera.numberOfstock);
		System.out.println("팔린 수량:" + camera.sold);
		
		System.out.println("\n");
	
		camera1.setName("cannon");
		camera1.setPrice(500000);
		camera1.setnumberOfstock(10);
		camera1.setSold(60);

		
		System.out.println("상품이름:" + camera1.getname());
		System.out.println("상품 가격:" + camera1.getprice());
		System.out.println("재고 수량:" + camera1.numberOfstock);
		System.out.println("팔린 수량:" + camera1.sold);
		System.out.println("\n");
		
		camera2.setName("olypus");
		camera2.setPrice(600000);
		camera2.setnumberOfstock(40);
		camera2.setSold(100);

		
		System.out.println("상품이름:" + camera2.getname());
		System.out.println("상품 가격:" + camera2.getprice());
		System.out.println("재고 수량:" + camera2.numberOfstock);
		System.out.println("팔린 수량:" + camera2.sold);
		
		
}
}
