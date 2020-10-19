package EX06;

import java.util.Scanner;



public class CircleManager {
	void run() {
		Scanner scanner = new Scanner(System.in);
		Circle c []=new Circle[3];
		
		for(int i=0; i<c.length;i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		int max=0;
		
		for(int i=0;i<c.length;i++) 
			if((c[i].getRadius())>(c[max].getRadius())) {
				max = i;
			}
		
		c[max].show();
		scanner.close();
	}
}
