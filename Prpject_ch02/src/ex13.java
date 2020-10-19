import java.util.Scanner;
public class ex13 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두번째 원의 중심과 반지름 입력>>");
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
			System.out.println("두원은 겹치기 않는다");
		}
		else if(dist<r) {
			System.out.println("두원은 서로 겹친다");
		}


	}
}
