import java.util.Scanner;
public class ex9 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
	

		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		Scanner sc1 = new Scanner(System.in);
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();

		
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
		
		if(dist<r1+r2) {
			System.out.println("�ο��� ���� ��ģ��.");
		}
		else if(dist>r1+r2) {
			System.out.println("�ο��� ���� ��ġ�� �ʴ´�");
		}
	}
}
