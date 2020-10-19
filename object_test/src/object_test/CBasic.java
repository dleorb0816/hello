package object_test;

public class CBasic {
	public static void main(String[] args) {
		user u1 = new user(1, 0, "홍길동", "010-1111-1111", 20000);
		user u2 = new user(2, 111, "이몽룡", "010-2222-2222", 50000);
		user u3 = new user(3, 222, "성춘향", "010-3333-3333", 60000);
		
		Ticket t1 = new Ticket(10,"스타워즈",10000,"5관 g열 1","5시");
		Ticket t2 = new Ticket(11,"스타워즈2 조조할인",6000,"2관 h열 3","9시 30분");
		Ticket t3 = new Ticket(12,"더킹",12000,"4관 g열 1","7시 40분");
		
		u1.checkMoney();
		u1.buy(t1);
		u1.checkTicket();
		u1.checkMoney();
		
		System.out.println("++++++++++++++++++++++++++++");
		u2.checkMoney();
		u2.buy(t2);
		u2.checkTicket();
		u2.checkMoney();
		
		System.out.println("++++++++++++++++++++++++++++");
		
		u3.checkMoney();
		u3.buy(t3);
		u3.checkTicket();
		u3.checkMoney();
		
		
	}
}
