import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		final int unit[]  = {50000,10000,1000,500,100,50,10,1};
		
		System.out.print("금액을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
	
		
		int ea[] = new int[unit.length];//8
		
		for(int i=0;i<unit.length;i++) {
			if(unit[i]<=money) {
				ea[i]= money/unit[i];
				money = money%unit[i];
			}
			if(ea[i]>0)
			System.out.println(unit[i]+"원짜리" + ea[i] + "개");
		}
		

	}
}