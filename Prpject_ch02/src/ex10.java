import java.util.Scanner;
public class ex10 {

	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r = sc.nextDouble();
		
	

		
		System.out.print("점 입력>>");
		Scanner sc1 = new Scanner(System.in);
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		//두점사이 거리구하기
		
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
			System.out.println("점 ("+ x2 + "," + y2 +")는 원 안에 있다.");
		}
		else if(r<dist) {
			System.out.println("점 ("+ x2 + "," + y2 +")는 원 밖에 있다.");
		}
	}
}
