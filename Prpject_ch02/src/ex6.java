import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		
		
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>>");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=1 && n <=99)
		{
			int n10 = n/10; //10�� �ڸ�
			int n1 = n%10;	//1�� �ڸ�
			
			int cnt = 0;
			
			if((n10 %3 == 0) && (n10 != 0)) {
				cnt++;
			}
			
			if((n1 %3 == 0) && (n1 != 0)) {
				cnt++;
			}
			
			if(cnt == 1)
			{
				System.out.println("�ڼ�¦");
			}
			
			if(cnt == 2)
			{
				System.out.println("�ڼ�¦¦");
			}
			
			else
			{
				System.out.println("����");
			}
		}
		else
		{
			System.out.println("1~99������ ���� �Է��ϼ���");
		}
	}
}
