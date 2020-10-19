import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	/*
		System.out.print("정수를 입력하시오>>");
		Scanner sc = new Scanner(System.in);

		for(int i=sc.nextInt(); i>=1; i--) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		 /* for(int i = 5; i>=1; i--){

			   for(int j = 1; j<=i; j++){

			    System.out.print("★");

			   }

			   System.out.println();

			  }*/
		System.out.print("정수를 입력하시오>>");
		Scanner sc=new Scanner(System.in);
		for(int i =sc.nextInt(); i>=1; i--) {
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}