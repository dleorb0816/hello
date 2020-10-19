package ex4_8;

public class StaticMember {

	public static void main(String[] args) {
		CurrencyConverter c = new CurrencyConverter();
		c.setRate(1121);
		System.out.println("백만원은 " + c.toDollar(1000000) +"달러 입니다.");
		System.out.println("백만원은 " + c.toKWR(100) +"원 입니다.");
	}

}
