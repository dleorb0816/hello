package object_test;

public class Ticket {
	int num;
	String mname;
	int price;
	String seat;
	String time;
	
	public Ticket() {};
	
	public Ticket(int num, String mname, int price, String seat, String time) {
		this.num = num;
		this.mname = mname;
		this.price = price;
		this.seat = seat;
		this.time = time;
	}


	public int getPrice() {
		return price;
	}

	public void ticketInfo() {
		System.out.println("Ƽ�Ϲ�ȣ : " + num);
		System.out.println("��ȭ�� : " + mname);
		System.out.println("Ƽ�ϰ��� : " + price);
		System.out.println("�¼���ȣ : " + seat);
		System.out.println("�󿵽ð� : " + time);
	}
	

	
	
}
