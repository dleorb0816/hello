import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		
		System.out.print("금액을 입력하시오>>");
		Scanner a = new Scanner(System.in);
		
		int money = a.nextInt();
		int m1, m2,m3,m4,m5,m6,m7;
		
		m1 = money/50000;
		money = money%50000;
		System.out.println("오만원권: " + m1 + "매");
		//System.out.println(money);
		
		m2 = money/10000;
		money = money%10000;
		System.out.println("만원권: " + m2 + "매");
		//System.out.println(money);
		
		m3 = money/1000;
		money = money%1000;
		System.out.println("천원권: " + m3 + "매");
		//System.out.println(money);

		m4 = money/500;
		money = money%500;
		System.out.println("오백원: " + m4 + "개");
		
		m5 = money/100;
		money = money%100;
		System.out.println("백원: " + m5 + "개");
		
		m6 = money/50;
		money = money%50;
		System.out.println("오십원: " + m6 + "개");
		
		m7 = money/10;
		money = money%10;
		System.out.println("십원: " + m7 + "개");
		a.close();
	}

}
