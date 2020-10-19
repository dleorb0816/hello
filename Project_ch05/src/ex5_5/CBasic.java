package ex5_5;

public class CBasic extends MethodOverridingEx {

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}



}
