import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		
		
		System.out.print("1~99사이의 정수를 입력하시오>>>");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=1 && n <=99)
		{
			int n10 = n/10; //10의 자리
			int n1 = n%10;	//1의 자리
			
			int cnt = 0;
			
			if((n10 %3 == 0) && (n10 != 0)) {
				cnt++;
			}
			
			if((n1 %3 == 0) && (n1 != 0)) {
				cnt++;
			}
			
			if(cnt == 1)
			{
				System.out.println("박수짝");
			}
			
			if(cnt == 2)
			{
				System.out.println("박수짝짝");
			}
			
			else
			{
				System.out.println("없음");
			}
		}
		else
		{
			System.out.println("1~99까지의 수만 입력하세요");
		}
	}
}
