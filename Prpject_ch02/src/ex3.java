import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner a = new Scanner(System.in);
		
		int money = a.nextInt();
		int m1, m2,m3,m4,m5,m6,m7;
		
		m1 = money/50000;
		money = money%50000;
		System.out.println("��������: " + m1 + "��");
		//System.out.println(money);
		
		m2 = money/10000;
		money = money%10000;
		System.out.println("������: " + m2 + "��");
		//System.out.println(money);
		
		m3 = money/1000;
		money = money%1000;
		System.out.println("õ����: " + m3 + "��");
		//System.out.println(money);

		m4 = money/500;
		money = money%500;
		System.out.println("�����: " + m4 + "��");
		
		m5 = money/100;
		money = money%100;
		System.out.println("���: " + m5 + "��");
		
		m6 = money/50;
		money = money%50;
		System.out.println("���ʿ�: " + m6 + "��");
		
		m7 = money/10;
		money = money%10;
		System.out.println("�ʿ�: " + m7 + "��");
		a.close();
	}

}
