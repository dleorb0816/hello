
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		
		if(num <10 || num >99)
		{
			System.out.println("10~99���� �Է�!");
			a.close();
			return;
		}
		
		int num_10;
		int num_01;
		
		
		if(num % 11 ==0 ) {
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}


	}

}
