import java.util.Scanner;
public class ex4 {


	public static void main(String[] args) {
		
	/*
		System.out.print("정수 3개를 입력>>");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a>b && a<c || b<a && b>c) {
			System.out.println(a);
		}
		
		else if( b>a && b<c || b<a && b>c) {
			System.out.println(b);
		}
		
		else
			System.out.println(c);

	}
	*/
	
		//강사님 버전
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력>>");
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		int a3= sc.nextInt();

		int middle = 0;
		//a2<a1<a3 or a3<a1<a2
		if((a1>=a2 && a1<=a3) || (a1>=a3 && a1<=a2) )
		
			middle = a1;
		
		else if((a2>=a1 && a2<=a3) || (a2>=a3 && a2<=a1) )
		
			middle = a2;
		
		else if((a3>=a1 && a3<=a2) || (a3>=a2 && a3<=a1) )
		
			middle = a3;
		
		System.out.println("중간값은?" + middle);
		sc.close();
		
}

}