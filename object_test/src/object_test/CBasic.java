package object_test;

public class CBasic {
	public static void main(String[] args) {
		user u1 = new user(1, 0, "ȫ�浿", "010-1111-1111", 20000);
		user u2 = new user(2, 111, "�̸���", "010-2222-2222", 50000);
		user u3 = new user(3, 222, "������", "010-3333-3333", 60000);
		
		Ticket t1 = new Ticket(10,"��Ÿ����",10000,"5�� g�� 1","5��");
		Ticket t2 = new Ticket(11,"��Ÿ����2 ��������",6000,"2�� h�� 3","9�� 30��");
		Ticket t3 = new Ticket(12,"��ŷ",12000,"4�� g�� 1","7�� 40��");
		
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
