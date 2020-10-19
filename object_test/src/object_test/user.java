package object_test;

public class user {
	int id;
	int pw;
	String name;
	String phone;
	int money;
	Ticket ticket;	//사용자랑 티켓을 연결해준다.
	
	public user() {};
	
	public user(int id, int pw, String name, String phone, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	
	public void buy(Ticket ticket) {
		this.ticket = ticket;
		this.money = this.money-ticket.getPrice(); 
	}
	
	public void checkTicket() {
		System.out.println("<구매한 티켓 확인>");
		ticket.ticketInfo();
	}
	
	public void checkMoney() {
		System.out.println("<잔돈 확인>");
		System.out.println("현재 금액 :" + money);
	}
	
}
