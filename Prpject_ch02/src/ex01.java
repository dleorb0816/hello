import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		
		
		
		Scanner a = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(�ܿ� ��)>>");
		int c = a.nextInt();
		double b = c/1216.0;
		
		//double b = (int)(b *100)/100.0;
		
		System.out.println( c + "���� $" +(float)b + "�Դϴ�.");
		
		a.close();

	}

}
