package ex4_8;

public class StaticMember {

	public static void main(String[] args) {
		CurrencyConverter c = new CurrencyConverter();
		c.setRate(1121);
		System.out.println("�鸸���� " + c.toDollar(1000000) +"�޷� �Դϴ�.");
		System.out.println("�鸸���� " + c.toKWR(100) +"�� �Դϴ�.");
	}

}
