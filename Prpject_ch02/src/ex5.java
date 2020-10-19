import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		
		/*
		System.out.print("정수 3개를 입력>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(((a+b)< c) || ((a+c)<b) || ((b+c)<a) )
		{
			System.out.println("삼각형이 안됩니다");
		}
		
		else
			System.out.println("삼각형이 됩니다.");

	}
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력>>");
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		int a3= sc.nextInt();

		if((a1+a2<a3) || (a1+a3<a2) || (a2+a3<a1))
			System.out.println("삼각형이 안됩니다");
		else 
			System.out.println("삼각형이 됩니다");
}
}
