import java.util.Scanner;
public class ex13 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double x2 = sc1.nextDouble();
		double y2 = sc1.nextDouble();

		
		double dist=0;
		double dist1 = 0;

		
		if((x1>x2) && (y1>y2)) {
			dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			System.out.println(dist);
			System.out.println(dist1);
			
		}
		else if((x2>x1) && (y2>y1)) {
			dist1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println(dist);
			System.out.println(dist1);
		}

		if(dist>r) {
			System.out.println("�ο��� ��ġ�� �ʴ´�");
		}
		else if(dist<r) {
			System.out.println("�ο��� ���� ��ģ��");
		}


	}
}
