package EX06;

public class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public void show() {
	System.out.println("���� ������ ū���� ("+ x + "," + y + ")" + radius);	
	}
	
	int getRadius() {
		return radius;
	}
}
