package EX05;

import java.util.Scanner;

public class CircleManager {
	void run() {
		Scanner scanner = new Scanner(System.in);
		Circle c []=new Circle[3];//3���� circle��ü ����
		
		for(int i=0; i<c.length;i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
		scanner.close();
	}
}
