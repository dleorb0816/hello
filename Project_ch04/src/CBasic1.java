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
		
		System.out.println("��ǰ�̸�:" + camera.getname());
		System.out.println("��ǰ ����:" + camera.getprice());
		System.out.println("��� ����:" + camera.numberOfstock);
		System.out.println("�ȸ� ����:" + camera.sold);
		
		System.out.println("\n");
	
		camera1.setName("cannon");
		camera1.setPrice(500000);
		camera1.setnumberOfstock(10);
		camera1.setSold(60);

		
		System.out.println("��ǰ�̸�:" + camera1.getname());
		System.out.println("��ǰ ����:" + camera1.getprice());
		System.out.println("��� ����:" + camera1.numberOfstock);
		System.out.println("�ȸ� ����:" + camera1.sold);
		System.out.println("\n");
		
		camera2.setName("olypus");
		camera2.setPrice(600000);
		camera2.setnumberOfstock(40);
		camera2.setSold(100);

		
		System.out.println("��ǰ�̸�:" + camera2.getname());
		System.out.println("��ǰ ����:" + camera2.getprice());
		System.out.println("��� ����:" + camera2.numberOfstock);
		System.out.println("�ȸ� ����:" + camera2.sold);
		
		
}
}
