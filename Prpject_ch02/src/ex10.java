import java.util.Scanner;
public class ex10 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r = sc.nextDouble();
		
	

		
		System.out.print("�� �Է�>>");
		Scanner sc1 = new Scanner(System.in);
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		//�������� �Ÿ����ϱ�
		
		double dist = 0;
		double dist1 = 0;
		
		if((x1>x2) && (y1>y2)) {
		
		dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		System.out.println(dist);
		}
		
		else if((x1<x2) && (y1<y2)) {
			
			dist1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			
			System.out.println(dist1);
			}
		
		if(r>dist) {
			System.out.println("�� ("+ x2 + "," + y2 +")�� �� �ȿ� �ִ�.");
		}
		else if(r<dist) {
			System.out.println("�� ("+ x2 + "," + y2 +")�� �� �ۿ� �ִ�.");
		}
	}
}
