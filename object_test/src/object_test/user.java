package object_test;

public class user {
	int id;
	int pw;
	String name;
	String phone;
	int money;
	Ticket ticket;	//����ڶ� Ƽ���� �������ش�.
	
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
		System.out.println("<������ Ƽ�� Ȯ��>");
		ticket.ticketInfo();
	}
	
	public void checkMoney() {
		System.out.println("<�ܵ� Ȯ��>");
		System.out.println("���� �ݾ� :" + money);
	}
	
}
