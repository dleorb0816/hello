import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		
		
		
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단워 원)>>");
		int c = a.nextInt();
		double b = c/1216.0;
		
		//double b = (int)(b *100)/100.0;
		
		System.out.println( c + "원은 $" +(float)b + "입니다.");
		
		a.close();

	}

}
