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
		System.out.println("티켓번호 : " + num);
		System.out.println("영화명 : " + mname);
		System.out.println("티켓가격 : " + price);
		System.out.println("좌석번호 : " + seat);
		System.out.println("상영시간 : " + time);
	}
	

	
	
}
