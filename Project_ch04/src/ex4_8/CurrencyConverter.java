package ex4_8;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) 
	{
		return won/rate;
	}
	
	public static double toKWR(double dollar) 
	{
		return dollar*rate;
	}
	
	public static void setRate(double r) 
	{
		rate = r;	//환율 설정
	}
}
