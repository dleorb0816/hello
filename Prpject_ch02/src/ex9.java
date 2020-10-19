import java.util.Scanner;
public class ex9 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
	

		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
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
			System.out.println("두원은 서로 겹친다.");
		}
		else if(dist>r1+r2) {
			System.out.println("두원은 서로 겹치지 않는다");
		}
	}
}
